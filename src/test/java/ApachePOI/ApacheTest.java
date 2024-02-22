package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ApacheTest {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/Users/syezd/IdeaProjects/RestAssuredLibrary/src/resources/Datasheet1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("AJ");
        int numOfRows = sheet.getPhysicalNumberOfRows();
        int numOfCollums = sheet.getRow(0).getLastCellNum();
        System.out.println(numOfCollums+ "  "+numOfRows);


        String [] arr = new String[numOfRows];
        String rowCullom[] = new String[numOfCollums];
        for(int i=0;i<numOfRows;i++){
          //  System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
            arr[i] = sheet.getRow(i).getCell(0).getStringCellValue();
            if(arr[i].equalsIgnoreCase("Google")){
                for(int j=0;j<numOfCollums;j++){
                  //  System.out.println(sheet.getRow(j).getCell(0).getStringCellValue());
                    rowCullom[j] = sheet.getRow(j).getCell(0).getStringCellValue();
                        if(rowCullom[j].equalsIgnoreCase("URL")){
                            System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
                        }
                }
            }

        }
        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(rowCullom));




    }
}
