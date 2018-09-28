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
	offline : (boolean) false,
	
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
	
	removeData : function() {
		remove all data in <record-section>
	},
	
	paintSorterBar : function() {
		LOOP sorter IN sorters
			paint <sorter-column-tab>
		END LOOP
	},
	
	paintGridColumns : function() {
		LOOP column IN columns 
			paint <column-header>
			paint <filter-cell>
			paint <column-value-cell>
		END LOOP
	},
	
	paintRecords : function() {
		removeData();
		LOOP record IN store.data 
			paint <record-section>
		END LOOP
	},
	
	
	
	/**
	 * All functions which will handle events for buttons on the grid
	 * They would be defined here
	 * 
	 * All functions which are written in grid-template
	 * 
	 * The definition of those functions would be provided later
	 */
	
	downloadGridData : function() {
		store.downloadGridData(this); // pass the grid object to store functions
	},
	
	applyFilter : function() {
		if (offline) {
			/*
			 * Here Offline Filter would come
			 * We will take this up later
			 */
		} else {
			remove all from filters[]
			make filters.size = 0;
			Loop Column column IN columns
				If column.isFiltered
					Filter filter = column.filter;
					filters.add(filter)
				End if
			END Loop
			store.load(this); // pass the grid object to store functions
		}
	},
	
	resetFilter : function() {
		remove all from filters[]
		make filters.size = 0;
		Loop Column column IN columns
			If column.isFiltered
				column.isFiltered = false
			End if
		END Loop
	},
	
	toggleRemoteLoad : function(onlineOfflineBtn) {
		if onlineOfflineBtn = 'ONLINE'
			offline = false;
		else
			offline = true
	},
	
	removeColumnFromSorterList : function(sorterId) {
		Sorter sorter = sorters.get(sorterId);
		remove sorter from sorters[]
	},
	
	applySorter : function() {
		if (offline) {
			/*
			 * Here Offline Sorter would come
			 * We will take this up later
			 */
		} else {
			store.load(this); // pass the grid object to store functions
		}
	},
	
	resetSorter : function() {
		remove all from sorters[]
		make sorters.size = 0;
		paintSorterBar();
	},
	
	selectionColumnSelectUnselectAll : function(checkboxObject) {
		if checkboxObject = 'CHECKED'
			select all checkboxes in the grid in the records
		else
			unselect all checkboxes in the grid in the records
	},
	
	removeFilterFromColumn : function(columnId) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		column.isFiltered = false;
		filter.nullifyFilterProperties();
	},
	
	
	hideColumn : function(columnId) {
		Column column = columns.get(columnId)
		column.hidden = true;
		hide column on UI
	},
	
	sortColumn : function(columnId, order) {
		Column column = columns.get(columnId)
		Sorter sorter = new Sorter('newUniqueSorterId', column.mapping, column.headerName, order)
		sorters.add(sorter)
		paintSorterBar();
	},
	
	columnFilteredTextChanged : function(columnId, textbox) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.stringValue = textbox.value
		if (filter.stringValue != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	columnFilteredToggleTextCase : function(columnId, toggleButton) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		if toggleButton = 'CS'
			filter.textCaseSensitiveSearch = true
		else
			filter.textCaseSensitiveSearch = false
	},
	
	columnFilteredGreaterNumberChanged : function(columnId, textbox) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.greaterThan = textbox.value
		if (filter.greaterThan != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	columnFilteredEqualNumberChanged : function(columnId, textbox) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.equalTo = textbox.value
		if (filter.equalTo != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	columnFilteredLowerNumberChanged : function(columnId, textbox) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.lessThan = textbox.value
		if (filter.lessThan != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	columnFilteredBeforeDateChanged : function(columnId, datepicker) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.beforeDate = datepicker.date
		filter.beforeDateMillis = datepicker.date.getTimeInMilliseconds()
		if (filter.beforeDateMillis != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	columnFilteredOnDateChanged : function(columnId, datepicker) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.onDate = datepicker.date
		filter.onDateMillis = datepicker.date.getTimeInMilliseconds()
		if (filter.onDateMillis != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	columnFilteredAfterDateChanged : function(columnId, datepicker) {
		Column column = columns.get(columnId)
		Filter filter = column.filter;
		filter.afterDate = datepicker.date
		filter.afterDateMillis = datepicker.date.getTimeInMilliseconds()
		if (filter.afterDateMillis != null or blank)
			column.isFiltered = true
		else
			column.isFiltered = false
	},
	
	selectionButtonCheckedUnchecked : function(recordId, checkbox) {
		Record record = store.data.get(recordId)
		record.selectionModelCheck = checkbox.checked
	},
	
	selectionButtonMouseOver : function(recordId) {
		Record record = store.data.get(recordId)
		if selectionColumn.eventHandler == null
			{
				default code for mouse over -> right now it should do nothing
			}
		else {
			call selectionColumn.eventHandler.mouseOverEvent(record);
		}
	},
	
	selectionButtonMouseClicked : function(recordId) {
		Record record = store.data.get(recordId)
		if selectionColumn.eventHandler == null
			{
				default code for mouse over -> right now it should do nothing
			}
		else {
			call selectionColumn.eventHandler.mouseClickEvent(record);
		}
	},
	
	defaultSelectionColumnRenderer : function(recordId) {
		Record record = store.data.getRecord(recordId);
		if selectionColumn.attachMapping
			{value = record.getProperty(selectionColumn.mapping)} // TRUE = Checked | FALSE = Unchecked
		else 
			{value = FALSE = Unchecked}
		
		if selectionColumn.renderer == null 
			{
				return simple html code to create checkbox on UI with checked/unchecked based on {value}
			}
		else
			{
				call selectionColumn.renderer.renderSelectionColumn(record)
			}
	},
	
	columnClicked : function(recordId, columnId) {
		Record record = store.data.get(recordId);
		Column column = columns.get(columnId)
		if column.eventHandler == null
			{
				default code for mouse over -> right now it should do nothing
			}
		else {
			call column.eventHandler.clickEvent(record, column);
		}
	},
	
	columnMouseOver : function(recordId, columnId) {
		Record record = store.data.get(recordId);
		Column column = columns.get(columnId)
		if column.eventHandler == null
			{
				default code for mouse over -> right now it should do nothing
			}
		else {
			call column.eventHandler.mouseOverEvent(record, column);
		}
	},
	
	columnMouseClicked : function(recordId, columnId) {
		Record record = store.data.get(recordId);
		Column column = columns.get(columnId)
		if column.eventHandler == null
			{
				default code for mouse over -> right now it should do nothing
			}
		else {
			call column.eventHandler.mouseClickEvent(record, column);
		}
	},
	
	defaultColumnValueRenderer : function(recordId, columnId) {
		Record record = store.data.get(recordId);
		Column column = columns.get(columnId)
		if column.renderer == null
			{
				return simple <span> code for record.property[column.mapping]
			}
		else {
			call column.renderer.renderColumn(record, column);
		}
	},
	
	actionButtonClicked : function(recordId, buttonId) {
		Record record = store.data.get(recordId);
		ActionButton button = actionColumn.buttons.get(buttonId)
		if button.eventHandler == null
			{
				default code for click -> right now it should do nothing
			}
		else {
			call button.eventHandler.clickEvent(record, button);
		}
	},
	
	actionButtonMouseOver : function(recordId, buttonId) {
		Record record = store.data.get(recordId);
		ActionButton button = actionColumn.buttons.get(buttonId)
		if button.eventHandler == null
			{
				default code for mouse over -> right now it should do nothing
			}
		else {
			call button.eventHandler.mouseOverEvent(record, button);
		}
	},
	
	actionButtonMouseClicked : function(recordId, buttonId) {
		Record record = store.data.get(recordId);
		ActionButton button = actionColumn.buttons.get(buttonId)
		if button.eventHandler == null
			{
				default code for mouse click -> right now it should do nothing
			}
		else {
			call button.eventHandler.mouseClickEvent(record, button);
		}
	},
	
	defaultActionButtonRenderer : function(recordId, buttonId) {
		Record record = store.data.get(recordId);
		ActionButton button = actionColumn.buttons.get(buttonId)
		if button.renderer == null
			{
				return simple <button> code for Text = button.label & class = button.btnclass
			}
		else {
			call button.renderer.renderActionButton(record, button);
		}
	},
	
	refreshGridData : function() {
		show confirmation pop-up message = 'Are you sure you want to reload grid data';
		if confirm = 'YES'
			if (offline) {
				/*
				 * Here Offline Refresh would come
				 * We will take this up later
				 */
			} else {
				store.load(this); // pass the grid object to store functions
			}
		else 
			do nothing
	},
	
	loadPreviousPage : function() {
		paginator.navigatePreviousPage();
		if (offline) {
			/*
			 * Here Offline would come
			 * We will take this up later
			 */
		} else {
			store.load(this); // pass the grid object to store functions
		}
	},
	
	loadNextPage : function() {
		paginator.navigateNextPage();
		if (offline) {
			/*
			 * Here Offline would come
			 * We will take this up later
			 */
		} else {
			store.load(this); // pass the grid object to store functions
		}
	},
	
	loadPage : function(goToPageTextBox) {
		paginator.navigateToPage(goToPageTextBox.value);
		if (offline) {
			/*
			 * Here Offline would come
			 * We will take this up later
			 */
		} else {
			store.load(this); // pass the grid object to store functions
		}
	},
	
	toggleShowHide : function(columnId, checkboxObject) {
		Column column = columns.get(columnId);
		if checkboxObject.checked
			column.shouldHide = true
		else
			column.shouldHide = false
		
	},
	
	applyShowHide : function() {
		Loop Column column IN columns
			if column.shouldHide
				column.shouldHide = false;
				column.hidden = true;
			else
				column.hidden = false;
		END Loop
		paintGridColumns();
	},
	
	getColumnWithColumnId : function(columnId) {
		return columns.get(columnId);
	},
	
	filterSelectedNotSelectedToggle : function(columnId, filterOptionId, checkboxObject) {
		Column column = columns.get(columnId);
		FilterOption filterOption = column.filterOptions.get(filterOptionId);
		Filter filter = column.filter;
		if checkboxObject.checked {
			filterOption.isSelected = true;
			filter.listValue.add(filterOption.value);
		} else {
			filterOption.isSelected = false;
			filter.listValue.remove(filterOption.value);
		}
		if (filter.listValue.size() > 0)
			column.isFiltered = true
		else
			column.isFiltered = false
	}
	/**
	 * All Getter Setter comes now
	 */
}