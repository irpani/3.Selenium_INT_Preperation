package DataDrivern_Testing;

// import com.google.common.collect.Table.Cell;

/**
 * @author Zafar Hussain some useful classes and interface, which we will be
 *         using Workbook (Class) – Will handle workbook. Sheet (Interface) –
 *         Which will handle sheets Cell (Interface) – Which will handle cell
 */

/*
 * Workbook is a class in Excel which will take file as an argument and
 * getWorkbook is a predefined method which will read the workbook and will
 * return the workbook object
 * 
 * 
 * Workbook wb = Workbook.getWorkbook(src); // Workbook is loaded now we have to
 * load sheet so using workbook object (wb) we can call getSheet method which
 * will take index as an argument and will load the sheet, we can also specify
 * the sheet name also
 * 
 * Sheet s1 = wb.getSheet(0); Sheet is loaded then we have to read cell so using
 * sh1 object call getCell method which we take two arguments
 * getCell(column,row)
 */
