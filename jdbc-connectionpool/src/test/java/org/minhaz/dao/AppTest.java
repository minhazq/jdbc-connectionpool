package org.minhaz.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class AppTest {
   
	public static void main (String[] args){
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@//localhost:1521/orcl.fios-router.home");
		ds.setUsername("system");
		ds.setPassword("Bangladesh1971");
		ds.setMaxIdle(5);
		
		
		Connection con = null;
		try {
			
			for(int i=0; i<20 ; i++){
				con = ds.getConnection();
				System.out.println(con+" : "+ i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
