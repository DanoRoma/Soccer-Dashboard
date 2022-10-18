package com.dano.soccer.dashboard.dao;

import org.springframework.data.repository.CrudRepository;

import com.dano.soccer.dashboard.entity.User;

public interface IUserDao extends CrudRepository<User,Long>{

}
