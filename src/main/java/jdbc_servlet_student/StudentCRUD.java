package jdbc_servlet_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentCRUD {
	public Connection geConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","root");
		return connection;
		
	}
	public int saveStudent(Student student) throws Exception {
		Connection connection=geConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?,?,?");
		preparedStatement.setInt(1, student.getId());
		preparedStatement.setString(2, student.getStudent_name());
		preparedStatement.setString(3, student.getFather_name());
		preparedStatement.setString(4, student.getMother_name());
		preparedStatement.setLong(5, student.getPhone());
		preparedStatement.setString(6, student.getAddress());
		preparedStatement.setString(7, student.getEmail());
		preparedStatement.setString(8, student.getPassword());
		preparedStatement.setString(9, student.college());
		
		int count=preparedStatement.executeUpdate();
		connection.close();
		return count;
		
	}

}
