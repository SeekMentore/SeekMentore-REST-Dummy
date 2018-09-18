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
 * ActionColumn Definition
 */
var ActionColumn = {
	id : (string) '',
	buttons : (list of <ActionButton>) []<ActionButton>,
	totalButtons : (int) -1,
	
	ActionColumn : constructor(id, buttons) {
		/*
		 * If label, renderer, eventHandler are Not Null
		 * set values to class variables
		 */
	},
	
	getButtonFromButtonNumber : function(recordNumber) {
		return button using button number
	},
	
	getButtonFromButtonId : function(recordNumber) {
		return button using button number
	}
	
	/**
	 * All Getter Setter comes now
	 */
}