package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class excel1 {
  String fpath = "D:\\excel1.xls";
  File file;
  FileOutputStream fos;
  XSSFWorkbook wb;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
  
  @Test
  public void WriteToExcel() {
	  row = sheet.createRow(0);
	  cell = row.createCell(0);
	  cell.setCellValue("SAMAPTI");
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file = new File(fpath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("Testsheet");
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
  }

}
