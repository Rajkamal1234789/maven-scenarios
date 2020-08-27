package ExcelUtilities;

import java.util.ArrayList;

public class TestUtil {
	
	public static ArrayList<Object[]> getDataFromExcel() throws Exception{
		
		ArrayList<Object[]>myData=new ArrayList<Object[]>();
		
		ExcelFileUtil ex=new ExcelFileUtil("F:\\formattingafter\\Maven\\TestData\\excel1.xlsx");
		
		int rowcount=ex.rowCount("raj");
		
//	public static void main(String[]args) throws Exception {
//		
//	
//		ExcelFileUtil ex=new ExcelFileUtil("F:\\formattingafter\\Maven\\TestData\\excel1.xlsx");
//		System.out.println(ex.rowCount("raj"));
		
		for(int i=1;i<=rowcount;i++) {
			
			String firstname=ex.getData("raj", i, 0);
			String lastname=ex.getData("raj", i, 1);
			String address1=ex.getData("raj", i, 2);
			String address2=ex.getData("raj", i, 3);
			String city=ex.getData("raj", i, 4);
			String state=ex.getData("raj", i, 5);
			String zipcode=ex.getData("raj", i, 6);
			String emailaddress=ex.getData("raj", i, 7);
			
			Object ob[]= {firstname,lastname,address1,address2,city,state,zipcode,emailaddress};
			myData.add(ob);
						
					
		}
		return myData;
	
}
}


