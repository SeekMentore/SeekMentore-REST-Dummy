/**
 * All the JS Definitions below are just for purpose of PseudoCode
 * They are not executable and cannot be instantiated as Objects
 * This is just to explain how the Objects and their definitions look
 * 
 * Note - Every Definition will have all its setter and getters even though
 * they are not defined below
 * 
 * All properties have there Data type defined
 * Some properties are of types which we are creating now 
 * 
 * All functions are just defined as pseudo code with the functionality they are
 * intended to
 * 
 * Constructors are written just to signify the Object Instantiation procedures they are not
 * actual constructors 
 * 
 * If there is a property of list in the class then the class will have functions for 
 * 1) addingMemberToList
 * 1) addingMemberToListAtAnyIndex
 * 2) removingMemberFromList
 * 3) retrievingMemberFromList
 * 
 * for eg:-
 * 
 * if a class has property myList : (list of <object>)[]<object>
 * then it will have function
 * 
 * addObjectToMyList(Object) {
 * 		will add this object to list @ last
 * }
 * 
 * addingMemberToListAtAnyIndex(Object, index) {
 * 		will add this object to list @ index
 * }
 * 
 * removingMemberFromList(Object) {
 * 		will remove this object from list
 * }
 * 
 * retrievingMemberFromList(id) {
 * 		return object with this id else return null
 * }
 */

/**
 * Paginator Definition
 */
var Paginator = {
	id : (string) '',
	numberOfRecordsPerPage : (int) GridConstants.DEFAULT_NUMBER_OF_RECORDS_PER_PAGE, // Should come from Constants file
	currentPage : (int) -1,
	startRecordNumber : (int) -1,
	totalPages : (int) -1,
	
	Paginator : constructor(id, numberOfRecordsPerPage) {
		/*
		 * If numberOfRecordsPerPage is Not Null
		 * set its value to class variable
		 */
	},
	
	init : function() {
		/*
		 * Whenver you change currentPage also set the startRecordNumber
		 */
		currentPage = 1;
		computeStartRecordNumber();
	},
	
	computeStartRecordNumber : function() {
		startRecordNumber = ((currentPage - 1) * numberOfRecordsPerPage) + 1,
	},
		
	navigateNextPage : function() {
		/*
		 * Check if the currentPage is not the last Page
		 * If true Increment the currentPage 
		 */
		computeStartRecordNumber();
	},
	
	navigatePreviousPage : function() {
		/*
		 * Check if the currentPage is not the first Page
		 * If true Decrement the currentPage
		 */
		computeStartRecordNumber();
	},
	
	navigateToPage : function(pageNum) {
		/*
		 * Check if pageNum is between 1 & totalPages
		 * If true set currentPage to pageNum 
		 */
		computeStartRecordNumber();
	}
	
	/**
	 * All Getter Setter comes now
	 */
}