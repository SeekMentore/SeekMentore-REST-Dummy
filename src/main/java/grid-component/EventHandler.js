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
 * EventHandler Definition
 */
var EventHandler = {
	id : (string) '',
	callback_clickEvent : (function) null,
	callback_mouseOverEvent : (function) null,
	callback_mouseClickEvent : (function) null,

	EventHandler : constructor(id, callback_clickEvent, callback_mouseOverEvent, callback_mouseClickEvent) {
		// Set values
	}

	clickEvent : function({Decide params as per need}) {
		callback_clickEvent({Decide params as per need});
	},
	
	mouseOverEvent : function({Decide params as per need}) {
		callback_mouseOverEvent({Decide params as per need});
	},
	
	mouseClickEvent : function({Decide params as per need}) {
		callback_mouseClickEvent({Decide params as per need});
	},

	/**
	 * All Getter Setter comes now
	 */
}