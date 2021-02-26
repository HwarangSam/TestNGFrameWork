package com.hrms.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.model.RowBlocksReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelTest {
	public static void main (String [] args) throws IOException{
		//Path of the excel file
		FileInputStream fs = new FileInputStream("DemoFile.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
//		Row row1 = sheet.getRow(1);
//		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		
//		Row row2 = sheet.getRow(1);
//		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		
//		Row row3 = sheet.getRow(1);
//		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		
		System.out.println(sheet.getRow(0).getCell(2));
		
		System.out.println();
		
		DataFormatter objDefaultFormat = new DataFormatter();
		for(Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = objDefaultFormat.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }
		}
		//can also use Iterator to loop through apparently
		
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		}
