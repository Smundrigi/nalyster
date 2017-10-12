package com.elle.ProjectManager.logic;

/**
 * ITableConstants
 * This interface stores all the table constants
 * @author Carlos Igreja
 * @since June 10, 2015
 * @version 1.0.0
 */
public interface ITableConstants {

    public static final String TASKS_TABLE_NAME = "issues";
    public static final String REF_TABLE_NAME = "references";
    public static final String ACCESSLEVEL_TABLE_NAME = "accessLevels";
//    public static final String TASKFILES_TABLE_NAME = "issue_files";
//    public static final String TASKNOTES_TABLE_NAME = "issue_notes";
    
    // column header name constants
    public static final String SYMBOL_COLUMN_NAME = "Symbol";
    
    // column width percent constants
    public static final float[] COL_WIDTH_PER_TASKS = {50, 70, 175, 80, 85, 88, 30, 55, 90,90,0,0,0};
    public static final float[] COL_WIDTH_PER_REPORTS = {55, 60, 70, 115, 60, 95, 275, 200, 325};
    public static final float[] COL_WIDTH_PER_REFERENCES = {100, 0, 240, 420, 120,120, 0,0,0, 0, 0, 0,0};
   
//    public static final float[] COL_WIDTH_PER_ARCHIVE = {60, 60, 115, 845, 105};
    
    // search fields for the comboBox for each table
    public static final String[] TASKS_SEARCH_FIELDS = {"programmer", "app", "title", "description", "dateOpened", "dateClosed", "rk", "version"};
    public static final String[] REFERENCES_SEARCH_FIELDS = {"programmer","title", "description", "dateOpened"};
 //   public static final String[] TASKFILES_SEARCH_FIELDS = {"submitter"};
    public static final String[] TASKS_SEARCH_FIELDS_OTHERS = {"app","programmer","title", "description", "dateOpened", "dateClosed", "rk", "version"};
//    public static final String[] TASKNOTES_SEARCH_FIELDS = {"submitter"};
    
    // batch edit combobox selections for each table
    public static final String[] TASKS_BATCHEDIT_CB_FIELDS = {"programmer", "rk","dateOpened", "dateClosed", "version"};
//    public static final String[] TASKFILES_BATCHEDIT_CB_FIELDS = {"submitter", "date", "path", "notes"};
    public static final String[] REFERENCES_BATCHEDIT_CB_FIELDS = {"programmer", "dateOpened"};
//    public static final String[] TASKNOTES_BATCHEDIT_CB_FIELDS = {"submitter", "status_notes", "date"};
}
