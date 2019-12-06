package com.bridgelabz.designpattern.facadepattern;

import java.sql.Connection;
public class HelperFacade {
	public static void generateReport(DBType dbtype,reportType report,String tableName) {
		Connection con=null;
	switch(dbtype) {
    case MYSQL:
    	    con=MySqlHelper.getMySqlDBConnectopn();
    	    MySqlHelper MySqlHelper=new MySqlHelper();
               
    	    switch(report) {
    	      case HTML:
    		         con= MySqlHelper.generateMySqlHTMLReport(tableName, con);
    		         System.out.println("generating html report for sql");
    		         break;
    	      case PDF:
    	    	     con=MySqlHelper.generateMySqlPDFReport(tableName, con);
    	    	     System.out.println("generating pdf report for sql");
    	    	     break;
    	    }
    	    break;
    case ORACLE:
    	    con=OracleHelper.getOracleConnection();
    	    OracleHelper oracleHelper=new OracleHelper();
    	    switch(report) {
    	    case HTML:
    	           con=oracleHelper.generateOracleHTMLReport(tableName, con);
    	           System.out.println("generating html report for oracle");
    	           break;
    	    case PDF:
    	    	   con=oracleHelper.generateOraclePDFReport(tableName, con);
    	    	   System.out.println("generating pdf report for oracle");
    	           
    	    }
    	    	     
    	}
    }
   

public static enum DBType{
	MYSQL,ORACLE;
  }
public static enum reportType{
	PDF,HTML;
  }
}

