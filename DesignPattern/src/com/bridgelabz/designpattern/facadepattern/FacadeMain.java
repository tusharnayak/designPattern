package com.bridgelabz.designpattern.facadepattern;
public class FacadeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySqlHelper sql=new MySqlHelper();
		String employeeTable="connected";
		OracleHelper oracle=new OracleHelper();
		HelperFacade.generateReport(HelperFacade.DBType.MYSQL, HelperFacade.reportType.HTML,employeeTable);
		HelperFacade.generateReport(HelperFacade.DBType.ORACLE, HelperFacade.reportType.PDF,employeeTable);
		
	}

}
