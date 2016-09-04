package com.tn.restful.service;

import com.tn.restful.domain.User;

import java.util.List;

/**
 * Created by thangnguyen-imac on 9/3/16.
 */
public interface IUserService {

    public List<User> findAll();

    public void create(User user);

    public void delete(User user);

    public User findById(Integer id);

    public void update(User user);

    boolean isUserExists(User user);

}
