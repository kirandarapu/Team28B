package Luma_Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	
	//rows count
	//cellcount
	//get the data from the excel sheet
	//set the data from the excel data
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
		
	}
	
	//get colcount
	public static int getCellcount(String xlfile,String xlsheet,int rownum) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		
		wb.close();
		fi.close();
		return cellcount;
	
	}

	
	//get the data from the excel sheet
	public static String getCelldata(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		
		try {
			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
		}catch(Exception e) {
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	//set the data to proper format (writing mode)
	
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		
		fo=new FileOutputStream(xlfile);

		wb.write(fo);
		fi.close();
		fo.close();
		
		
	}
	
	

}
