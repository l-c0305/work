package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DealDao {

	public void Index(String name)
    {
		ArrayList<String> list = new ArrayList<String>();
	try{
   		Connection con;
   		PreparedStatement pst;
   		ResultSet rs;
//   		Statement st;
   		// 1. ��������
   		Class.forName("com.mysql.jdbc.Driver");
   		// 2. ��������
   		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC","root","123456");
//   		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC","root","123456");
   		// 3. �������
   		//�м����� ��Ҫ������ֵ
   		String sql;
		sql = "INSERT INTO t_user VALUES (?, '12', '12', '123')";
//   		sql = "Select * from t_user where gender=?"; 
   		pst = con.prepareStatement(sql);
		pst.setString(1,name);
		
//		pst.setString(4,content);
 
   		// 4. ִ�����
   		pst.executeUpdate();
   		// 5. �������
//   		while(rs.next())  //�����ҵ������ݴ洢��list��
//   		{
//   			list.add(rs.getString(2));
//   			System.out.print(rs.getString(2));
//   		}
   		// 6. �ͷ���Դ
   		//rs.close();
   		pst.close();
   		con.close();
   	}
   	catch(Exception e){      //�׳�����
   		e.printStackTrace();
   	}
//	 return list;
	
}
	 
}

