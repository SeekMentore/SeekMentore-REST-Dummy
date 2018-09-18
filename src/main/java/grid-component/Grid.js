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
 * Grid Definition
 */
var Grid = {
	id : (string) '',
	title : (string) '',
	htmlDomElementId : (string) '',
	hasSelectionColumn : (boolean) false,
	selectionColumn : (SelectionColumn) null,
	hasActionColumn	: (boolean) false,
	actionColumn : (ActionColumn) null,
	isPagingCapable : (boolean) false,
	paginator : (Paginator) null,
	isSortingCapable : (boolean) false,
	sorters : (list of <Sorter>) []<Sorter>, 
	isFilterCapable : (boolean) false,
	filters : (list of <Filter>) []<Filter>, 
	columns : (list of <Column>) []<Column>,
	store : (Store) null,
	
	Grid : constructor(id, title, htmlDomElementId, hasSelectionColumn, selectionColumn, hasActionColumn, actionColumn, isPagingCapable, paginator, isSortingCapable, sorters, isFilterCapable, filters, columns) {
		/*
		 * If id, title, htmlDomElementId, hasSelectionColumn, selectionColumn, hasActionColumn, actionColumn, isPagingCapable, paginator, isSortingCapable, sorter, isFilterCapable, filter, columns are Not Null
		 * set values to class variables
		 */
	},
	
	createGrid : function() {
		/*
		 * function to create grid on UI
		 * 
		 * 1) Print the Title on the Grid
		 * 2) If isPagingCapable = true - Paint the Paging Toolbar with values
		 * 3) If isSortingCapable = true - Paint the Sorter Toolbar
		 * 4) If isFilterCapable = true - Paint the Filter Toolbar and Filter Buttons
		 * 5) If hasSelectionColumn = true - Paint the Selection Column
		 * 6) If hasActionColumn = true - Paint the Action Column
		 * 7) Iterate and paint all Columns
		 * 8) If column has filterable true paint the Filter column
		 * 9) If column.datatype = list, paint the Filter using filterOptions in column
		 */
	},
	
	init : function() {
		/*
		 * Init all values
		 */
		paginator.init();
	},
	
	loadData : function() {
		/*
		 * Step 1 - Check Store.isStatic
		 * Step 2 - If True call paintData() else call loadDynamicData
		 */
	},
	
	loadDynamicData : function() {
		
	},
	
	removeData : function() {
		/*
		 * Remove all the records before painting new records 
		 */
		// In grid-template this will remove everything from <record-section>
	},
	
	paintData : function() {
		removeData();
		// In grid-template <record-section> this section will be painted now
		// The logic on how to paint the section is written in grid-template.html
	},
	
	loadNextPage : function() {
		paginator.getNextPage();
		loadData();
	},
	
	loadPreviousPage : function() {
		paginator.getPreviousPage();
		loadData();
	},
	
	loadPage : function(pageNum) {
		paginator.goToPage(pageNum);
		loadData();
	},
	
	/**
	 * All functions which will handle events for buttons on the grid
	 * They would be defined here
	 * 
	 * All functions which are written in grid-template
	 * 
	 * The definition of those functions would be provided later
	 */
	
	/**
	 * All Getter Setter comes now
	 */
}