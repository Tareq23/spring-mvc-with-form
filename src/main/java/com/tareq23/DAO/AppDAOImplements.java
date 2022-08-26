package com.tareq23.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.tareq23.model.User;

public class AppDAOImplements implements AppDAO {

	
	private DataSource dataSource;
	
	
	
	public AppDAOImplements(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}


	@Override
	public List<User> listUser() {
		String query = "select * from users";
		List<User> listUser = new ArrayList<User>();
		Connection connection = null;
		
		try {
			connection = this.dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				User user = new User(rs.getString("user_name"),rs.getString("email"),rs.getString("password"));
				System.out.println(user);
				listUser.add(user);
			}
			
			rs.close();
			ps.close();
			
			return listUser;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}