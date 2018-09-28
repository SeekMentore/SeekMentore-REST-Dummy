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
 * Store Definition
 */
var Store = {
	id : (string) '',
	isStatic : (boolean) false, 
	restURL : (string) '',
	downloadURL : (string) '',
	data : (list of <Record>) []<Record>, // Each Object here will have a property 'id'
	staticData : [], // list of Objects that should be provided in static manner
	restData : [], // list of Objects that should be fetched in REST call
	totalRecords : (int) -1,
	extraParams : (Object) {}, 
	
	Store : constructor(id, isStatic, restURL, downloadURL) {
		/*
		 * If isStatic, restURL, downloadURL are Not Null
		 * set values to class variables
		 */
	},
	
	load : function(gridObject) {
		if isStatic
			--> convert staticData into data using convertIntoRecordData
			gridObject.paintData();
		else
			--> Make a rest call and store the response.data in restData
			$params = {
					start : null != gridObject.paginator ? gridObject.paginator.startRecordNumber : 1,
					limit : null != gridObject.paginator ? gridObject.paginator.numberOfRecordsPerPage : -1,
					otherParams : JSON_encode(extraParams),
					sorter : gridObject.isSortingCapable ? gridObject.sorter : null,
					filter : gridObject.isFilterCapable ? gridObject.filter : null
			}
			makeHttpRequest(restURL, JSON_encode($params)).subscribe(){
				--> convert restData into data using convertIntoRecordData
				gridObject.paintRecords();
			}
			error(){
				Alert Message - Common alert of Utils
			}
	},
	
	downloadGridData : function(gridObject) {
		if isStatic
			Show Alert Failure - message = 'This functionality is currently not available for Static data'
		else
			--> Make a rest call and store the response.data in restData
			$params = {}
			makeHttpRequest(restURL, JSON_encode($params)).subscribe(){
				--> The response will come as a downloaded file content of type = 'application-octet-stream'
					Get the content downloaded using an <iframe>
			}
			error(){
				Alert Message - Common alert of Utils
			}
	},
	
	convertIntoRecordData : function(objectList[]) {
		// This function will be used to convert any object list into data object
		// this data object is painted on the Grid
		Loop object in objectList
			--> Logic to create new recordId - You can create as R + index (i.e. 0 / 1 / 2 so on)
			Record record = new Record(R{index}, object);
			data.add(record);
		end loop
	},
	
	/**
	 * All Getter Setter comes now
	 */
}