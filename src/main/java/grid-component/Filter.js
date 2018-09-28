/**
 * All the JS Definitions below are just for purpose of PseudoCode
 * They are not executable and cannot be instantiated as Objects
 * This is just to explain how the Objects and their definitions look
 * 
 * Note - Every Definition will have all its setter and getters even though
 * they are not defined below
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
 * Filter Definition
 */
var Filter = {
	id : (string) '',
	type : (listed values {number | string | date | list}) 'string',
	mapping : (string) '',
	columnId : (string) '',
	lessThan : (int) '',
	equalTo : (int) '',
	greaterThan : (int) '',
	stringValue : (string) '',
	textCaseSensitiveSearch : (boolean) true,
	beforeDate : (Date) '',
	onDate : (Date) '',
	afterDate : (Date) '',
	beforeDateMillis : (Long) '',
	onDateMillis : (Long) '',
	afterDateMillis : (Long) '',
	listValue : (list of <string>) []<string>,

	Filter : constructor(id, type, mapping, columnId) {
		// Set values
	},
	
	nullifyFilterProperties : function() {
		if type = 'number' {
			lessThan = null;
			equalTo = null;
			greaterThan = null;
		} else if type = 'string' {
			stringValue = null;
			textCaseSensitiveSearch = true;
		} else if type = 'date' {
			beforeDate = null;
			onDate = null;
			afterDate = null;
			beforeDateMillis = null;
			onDateMillis = null;
			afterDateMillis = null;
		} else if type = 'list' {
			listValue = [] // empty list
		}
	}
	
	/**
	 * All Getter Setter comes now
	 */
}