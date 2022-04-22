package com.xworkz.apartment.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.xworkz.apartment.dto.ApartmentDTO;




public class ApartmentDAO {
	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		FileInputStream in = new FileInputStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}

	public static void saveApartment (ApartmentDTO dto) {
		System.out.println("create jdbc connection using properties file ");

	if (dto == null) {
	
	} else {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			Properties prop = loadPropertiesFile();

			String driverClass = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			
			connection = DriverManager.getConnection(url, username, password);

			preparedStatement = connection.prepareStatement("INSERT INTO games VALUES(?,?,?,?)");

			preparedStatement.setInt(1,dto.getApartmentNo());
			preparedStatement.setString(2,dto.getApartmentId());
			preparedStatement.setInt(3, dto.getApartmentNoOfFlats());
			preparedStatement.setDouble(4, dto.getApartmentPrice());

			preparedStatement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	
}
}





