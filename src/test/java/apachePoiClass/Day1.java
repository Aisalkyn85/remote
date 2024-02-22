package apachePoiClass;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream("/Users/syezd/IdeaProjects/RestAssuredLibrary/src/resources/Datasheet1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("AJ");
        int numOfRows = sheet.getPhysicalNumberOfRows();
        int numOfCells = sheet.getRow(0).getLastCellNum();
        System.out.println(numOfCells);
        System.out.println(numOfRows);

        String [] arr = new String[numOfRows];
        String [] rowCulloms = new String[numOfCells];
        for(int i=0;i<numOfRows;i++){
            arr[i] = sheet.getRow(i).getCell(0).getStringCellValue();
            if(arr[i].equalsIgnoreCase("Google")){
                for(int j=0;j<numOfCells;j++){
                    rowCulloms[j] = sheet.getRow(j).getCell(0).getStringCellValue();
                    if(rowCulloms[j].equalsIgnoreCase("URL")){
                        System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rowCulloms));



    }
}