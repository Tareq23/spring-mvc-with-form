package com.tareq23.DAO;

import java.util.List;

import com.tareq23.model.User;

public interface AppDAO {
	public List<User> listUser();
	public void addUser(User user);
}