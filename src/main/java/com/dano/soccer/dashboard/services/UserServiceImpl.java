package com.dano.soccer.dashboard.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dano.soccer.dashboard.dao.IUserDao;
import com.dano.soccer.dashboard.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;

	@Override
	@Transactional(readOnly=true)
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

}
