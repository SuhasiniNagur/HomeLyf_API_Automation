package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	
	/*@DataProvider(name="Data")
	public String[][] getAllData() throws IOException{
		
		String path = System.getProperty("user.dir")+"//ExcelData/APITestData.xlsx";
		
		XLUtility xl = new XLUtility(path);
		
		int rownum=xl.getRowCount("Sheet1");
		int colcount=xl.getCellCount("Sheet1", 1);
		
		String apidata[][]=new String[rownum][colcount];
		
		for(int i=0;i<=rownum;i++) {
			
			for(int j=0;j<colcount;j++) {
				apidata[i-1][j]=xl.getCellData("Sheet1", i, j);
			}
		}
		
		return apidata;
		
	}*/
	
	
	@DataProvider(name="Data")
	public String[][] getAllData() throws IOException {
	    String path = System.getProperty("user.dir") + ".//ExcelData/APITestData.xlsx";
	    XLUtility xl = new XLUtility(path);
	    
	    int rownum = xl.getRowCount("Sheet1");
	    int colcount = xl.getCellCount("Sheet1", 1);
	    
	    String apidata[][] = new String[rownum][colcount];
	    
	    for (int i = 1; i <= rownum; i++) {  // Start from 1, not 0
	        for (int j = 0; j < colcount; j++) {
	            apidata[i - 1][j] = xl.getCellData("Sheet1", i, j);
	        }
	    }
	    
	    return apidata;
	}
	
	@DataProvider(name="email")
	public String[] getUserNames() throws IOException {
		
        String path = System.getProperty("user.dir")+"//ExcelData/APITestData.xlsx";
		
		XLUtility xl = new XLUtility(path);
		
		int rownum=xl.getRowCount("Sheet1");
		
		String[] apidata=new String[rownum];
		
		for(int i=0;i<=rownum;i++) {
			
			apidata[i-1]=xl.getCellData("Sheet1", i,1);
		}
		return apidata;
		
	}
	
	@DataProvider(name="userData")
	public String[][] getUserData() throws IOException {
	    String path = System.getProperty("user.dir") + "//ExcelData/APITestData.xlsx";
	    XLUtility xl = new XLUtility(path);
	    
	    int rownum = xl.getRowCount("Sheet1");
	    
	    String[][] apidata = new String[rownum][2]; // Assuming you have two columns for email and password
	    
	    for (int i = 0; i < rownum; i++) {
	        apidata[i][0] = xl.getCellData("Sheet1", i + 1, 1); // Assuming email is in the first column (index 0)
	        apidata[i][1] = xl.getCellData("Sheet1", i + 1, 3); // Assuming password is in the second column (index 1)
	    }
	    
	    return apidata;
	}

	
	
}
