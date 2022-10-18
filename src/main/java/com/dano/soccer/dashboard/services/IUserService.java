package com.dano.soccer.dashboard.services;

import java.util.List;

import com.dano.soccer.dashboard.entity.User;

public interface IUserService {
	public List<User> findAll();
}
