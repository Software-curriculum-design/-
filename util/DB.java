package net.wms.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	//���ݿ��ַ
	private String Driver_name =
			"jdbc:mysql://localhost:3306/stock_manager?characterEncoding=utf8";
	//���ݿ��û���
	private String USER = "root";
	//���ݿ�����
	private String PASS = "325427";
	//���ݿ�����
	public static Connection con;
	//���췽��
	public DB(){
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ����
			con = 
			DriverManager.getConnection(
			Driver_name, USER, PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��ȡ����
	public static Connection getConnection(){
		if(con == null){
			new DB();
		}
		return con;
	}
}
