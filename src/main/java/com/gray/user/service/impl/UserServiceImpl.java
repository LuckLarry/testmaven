package com.gray.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gray.user.dao.UserDao;
import com.gray.user.entity.User;
import com.gray.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao<User> userDao;
	@Override
	public boolean doUserLogin(User user) {
		List<User> list = userDao.selectId(user.getUsername());
		if(list.size()==0){
			return false;
		}else{
			if(list.get(0).getPassword().equals(user.getPassword())){
				return true;
			}else{
				return false;
			}
		}
	}

}
