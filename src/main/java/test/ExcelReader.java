package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.utils.FileUtils;

public class ExcelReader {
	
	private static final String FILE_PATH = "C:\\Users\\smukherjee\\SeekMentore\\Results_nirmala_session.xlsx";

    public static void main(String args[]) throws IOException {
        final List<Student> studentList = getStudentsListFromExcel();
        final StringBuilder fileContentJSON = new StringBuilder("");
        fileContentJSON.append("var NO_VALUE_HERE = 0;").append("\n");
        fileContentJSON.append("var studentDataList = [{").append("\n");
        for (int i = 0; i < studentList.size(); i++) {
        	final Student student = studentList.get(i);
        	fileContentJSON.append("	firstName : "+"\""+valueReader(student.getGivenname())+"\",").append("\n");
        	fileContentJSON.append("	lastName : "+"\""+valueReader(student.getSurname())+"\",").append("\n");
        	fileContentJSON.append("	className : "+"\""+valueReader(student.getGradeRoman())+"\",").append("\n");
        	fileContentJSON.append("	phoneNo : "+"\""+valueReader(student.getPhonenumber())+"\",").append("\n");
        	fileContentJSON.append("	address : "+"\""+valueReader(student.getAddress())+"\",").append("\n");
        	fileContentJSON.append("	visualPrefScore : "+valueReaderWithDecimalRemoval(student.getVisualPreferenceScore())+",").append("\n");
        	fileContentJSON.append("	auditoryPrefScore : "+valueReaderWithDecimalRemoval(student.getAuditoryPreferenceScore())+",").append("\n");
        	fileContentJSON.append("	tacticalPrefScore : "+valueReaderWithDecimalRemoval(student.getTactilePreferenceScore())+",").append("\n");
        	fileContentJSON.append("	marks : "+valueReaderWithDecimalRemoval(student.getMaximumScore())+",").append("\n");
        	fileContentJSON.append("	learningStyle : "+"\""+valueReader(student.getPreferredLearningStyle())+"\",").append("\n");
        	fileContentJSON.append("	learningMethod : "+"\""+valueReader(student.getPreferredLearningMethod())+"\",").append("\n");
        	fileContentJSON.append("	suggestions : "+"\""+valueReader(student.getSuggestions())+"\",").append("\n");
        	fileContentJSON.append("	questions : [{").append("\n");
        	if (student.getQuestions().isEmpty()) {
        		fileContentJSON.append("	}]").append("\n");
        	} else {
        		for (int j = 0; j < student.getQuestions().size(); j++) {
        			final Question question = student.getQuestions().get(j);
        			fileContentJSON.append("		question : "+"\""+valueReader(question.getQuestion())+"\",").append("\n");
        			fileContentJSON.append("		answer : "+valueReaderWithDecimalRemoval(question.getAnswer())+",").append("\n");
        			fileContentJSON.append("		answerResponse : "+"\""+valueReader(question.getAnswerResponse())+"\",").append("\n");
        			if (j != student.getQuestions().size() - 1) {
        				fileContentJSON.append("	},{").append("\n");
        			} else {
        				fileContentJSON.append("	}]").append("\n");
        			}
        		}
        	}
        	if (i != studentList.size() - 1) {
        		fileContentJSON.append("},{").append("\n");
        	} else {
        		fileContentJSON.append("}];").append("\n");
        	}
        }
        FileUtils.generateArbitraryFile(fileContentJSON.toString().getBytes(), "C:\\Users\\smukherjee\\SeekMentore\\resultJSONList.js");
        System.out.println("Completed");
    }
    
    public static String valueReaderWithDecimalRemoval(String value) {
    	String readValue = "NO_VALUE_HERE";
    	if (null != value) {
    		if (!"null".equalsIgnoreCase(value)) {
    			value = value.trim();
    			if (value.indexOf(".") != -1) {
    				value = value.substring(0, value.indexOf("."));
    			}
    			readValue = value;
    		}
    	}
    	return readValue;
    }
    
    public static String valueReader(String value) {
    	String readValue = "";
    	if (null != value) {
    		if (!"null".equalsIgnoreCase(value)) {
    			value = value.trim();
    			readValue = value;
    		}
    	}
    	return readValue;
    }

    private static List<Student> getStudentsListFromExcel() {
        List<Student> studentList = new LinkedList<Student>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            Workbook workbook = new XSSFWorkbook(fis);
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                final String sheetName = sheet.getSheetName();
                if ("SYNOPSIS".equalsIgnoreCase(sheetName)) {
                	Iterator<Row> rowIterator = sheet.iterator();
                	while (rowIterator.hasNext()) {
                		final Student student = new Student();
                		Row row = rowIterator.next();
                		if (row.getRowNum() > 0) {
                			Iterator<Cell> cellIterator = row.cellIterator();
                			while (cellIterator.hasNext()) {
                				Cell cell = cellIterator.next();                        
                				if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                					if (cell.getColumnIndex() == 1) {
                						student.setGivenname(cell.getStringCellValue());
                					} else if (cell.getColumnIndex() == 2) {
                						student.setSurname(cell.getStringCellValue());
                					} else if (cell.getColumnIndex() == 3) {
                						student.setGender(cell.getStringCellValue());
                					} else if (cell.getColumnIndex() == 5) {
                						student.setPhonenumber(cell.getStringCellValue());
                					} else if (cell.getColumnIndex() == 6) {
                						student.setAddress(cell.getStringCellValue());
                					} else if (cell.getColumnIndex() == 11) {
                						student.setPreferredLearningStyle(cell.getStringCellValue());
                					}
                				} else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                					if (cell.getColumnIndex() == 4) {
                						student.setGrade(String.valueOf(cell.getNumericCellValue()));
                					} else if (cell.getColumnIndex() == 7) {
                						student.setVisualPreferenceScore(String.valueOf(cell.getNumericCellValue()));
                					} else if (cell.getColumnIndex() == 8) {
                						student.setAuditoryPreferenceScore(String.valueOf(cell.getNumericCellValue()));
                					} else if (cell.getColumnIndex() == 9) {
                						student.setTactilePreferenceScore(String.valueOf(cell.getNumericCellValue()));
                					} else if (cell.getColumnIndex() == 10) {
                						student.setMaximumScore(String.valueOf(cell.getNumericCellValue()));
                					}
                				}
                			}
                			studentList.add(student);
                		}
                	}
                } else if ("ANSWERSHEET".equalsIgnoreCase(sheetName)) {
                	Iterator<Row> rowIterator = sheet.iterator();
                	Map<Integer, Integer> answerSheetStudentListStudentMapping = new HashMap<Integer, Integer>();
                	while (rowIterator.hasNext()) {
                		Row row = rowIterator.next();
                		Iterator<Cell> cellIterator = row.cellIterator();
                		String question = "";
                		while (cellIterator.hasNext()) {
                			Cell cell = cellIterator.next();
                			if (0 == row.getRowNum()) {
                    			if (cell.getColumnIndex() > 1) {
                    				final String studentDataWriteUp = cell.getStringCellValue();
                    				for (int studentIndex = 0; studentIndex<studentList.size(); studentIndex++) {
                    					final Student student = studentList.get(studentIndex);
                    					final String completeMatchString = student.getGivenname()+" "+
                    													((null != student.getSurname() && !"".equals(student.getSurname().trim())) ? student.getSurname() : "") +
                    													" : Class-"+student.getGrade().substring(0, student.getGrade().indexOf("."));
                    					if (studentDataWriteUp.equals(completeMatchString)) {
                    						answerSheetStudentListStudentMapping.put(cell.getColumnIndex(), studentIndex);
                    					}
                    				}
                    			}
                    		} else if (row.getRowNum() < 25) {
                    			if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                    				if (cell.getColumnIndex() == 1) {
                    					question = cell.getStringCellValue();
                    				}                    				
                    			} else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
                    				if (cell.getColumnIndex() > 1) {
                    					final Integer studentIndex = answerSheetStudentListStudentMapping.get(cell.getColumnIndex());
                    					if (null != studentIndex) {
                    						final Student student = studentList.get(studentIndex);
                    						if (null != student) {
                    							student.addQuestion(question, String.valueOf(cell.getNumericCellValue()));
                    						}
                    					}
                    				}
                    			}
                    		}
                		}
                	}
                }
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}

class Question {
	private String question;
	private String answer;
	private String answerResponse;
	
	Question() {}
	
	@Override
    public String toString() {
        return question+ " "+answer+" "+answerResponse;
    }

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerResponse() {
		return answerResponse;
	}

	public void setAnswerResponse(String answerResponse) {
		this.answerResponse = answerResponse;
	}
}

class Student {
	
    private String givenname;
    private String surname;
    private String gender;
    private String grade;
    private String gradeRoman;
    private String phonenumber;
    private String address;
    private String visualPreferenceScore;
    private String auditoryPreferenceScore;
    private String tactilePreferenceScore;
    private String maximumScore;
    private String preferredLearningStyle;
    private String preferredLearningMethod;
    private String suggestions = "Teach yourself new methods to learn.  Adapt new learning styles. Develop new personal study habits, following the instructions in the leaflet provided to you during session. This will help you to educate yourself in different subjects and field.";
    private List<Question> questions;
    
    public Student(){
    	questions = new LinkedList<Question>();
    }
    
	@Override
    public String toString() {
        return givenname+ " "+surname+" "+gender+ " "+grade+ " "+phonenumber+" "+address+ " "+visualPreferenceScore+ " "+auditoryPreferenceScore+" "+tactilePreferenceScore+ " "+maximumScore+ " "+preferredLearningStyle;
    }

	public String getGivenname() {
		return givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		setGradeRoman(this.grade);
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVisualPreferenceScore() {
		return visualPreferenceScore;
	}

	public void setVisualPreferenceScore(String visualPreferenceScore) {
		this.visualPreferenceScore = visualPreferenceScore;
	}

	public String getAuditoryPreferenceScore() {
		return auditoryPreferenceScore;
	}

	public void setAuditoryPreferenceScore(String auditoryPreferenceScore) {
		this.auditoryPreferenceScore = auditoryPreferenceScore;
	}

	public String getTactilePreferenceScore() {
		return tactilePreferenceScore;
	}

	public void setTactilePreferenceScore(String tactilePreferenceScore) {
		this.tactilePreferenceScore = tactilePreferenceScore;
	}

	public String getMaximumScore() {
		return maximumScore;
	}

	public void setMaximumScore(String maximumScore) {
		this.maximumScore = maximumScore;
	}

	public String getPreferredLearningStyle() {
		return preferredLearningStyle;
	}

	public void setPreferredLearningStyle(String preferredLearningStyle) {
		this.preferredLearningStyle = preferredLearningStyle;
		setPreferredLearningMethod();
	}
	
	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public void addQuestion(String question, String answer) {
		Question q = new Question();
		q.setQuestion(question);
		q.setAnswer(answer);
		if (Integer.valueOf(answer.substring(0, answer.indexOf("."))) == 1) {
			q.setAnswerResponse("SELDOM");
		} else if (Integer.valueOf(answer.substring(0, answer.indexOf("."))) == 3) {
			q.setAnswerResponse("SOMETIMES");
		} else if (Integer.valueOf(answer.substring(0, answer.indexOf("."))) == 5) {
			q.setAnswerResponse("OFTEN");
		} 
		this.questions.add(q);
	}

	public String getGradeRoman() {
		return gradeRoman;
	}

	public void setGradeRoman(String grade) {
		if (Integer.valueOf(grade.substring(0, grade.indexOf("."))) == 9) {
			this.gradeRoman = "IX";
		} else if (Integer.valueOf(grade.substring(0, grade.indexOf("."))) == 7) {
			this.gradeRoman = "VII";
		} else if (Integer.valueOf(grade.substring(0, grade.indexOf("."))) == 11) {
			this.gradeRoman = "XI";
		} 
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public String getPreferredLearningMethod() {
		return preferredLearningMethod;
	}

	public void setPreferredLearningMethod() {
		if (this.preferredLearningStyle.equals("Auditory")) {
			this.preferredLearningMethod = "Sit in rows from where you can hear leactures well. Read aloud the notes to yourself again and again. Record the Lessons on phone/Tablet/Tape recorder/Laptop etc eg. History notes, Shakespeare dialogues, Poems etc., Listen those recorded lectures as Songs.";
		} else if (this.preferredLearningStyle.equals("Visual")) {
			this.preferredLearningMethod = "Use different colour pens to write, Highlighters will be a good choice while you go through the books. Colourful charts can be used for marking different important points on book or on notebooks. Try to sit in rows near to teacher, so that Teacher's face is visible when they deliver lectures. Try to imagine whatever you are reading or learning, Creating colourful pictures in your mind will help you to learn better.";
		} else if (this.preferredLearningStyle.equals("Tactile")) {
			this.preferredLearningMethod = "Practice on paper whatever you have to learn, Writing again n again will help you to learn better. Participation in school projects, in cultural and sports events will help you to grow better. Keep Lecture notes for sure.";
		}
	}
}

