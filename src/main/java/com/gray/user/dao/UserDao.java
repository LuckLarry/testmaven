package com.gray.user.dao;

import java.util.List;

public interface UserDao<User> {
	List<User> selectId(String username);  
}
