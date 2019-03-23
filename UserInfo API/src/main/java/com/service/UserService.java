package com.jackrutorial.service;

import java.util.List;

import com.jackrutorial.model.User;

public interface UserService {

public List listAllUser();
 
 public void addUser(User user);
 
 public void updateUser(User user);
 
 public void delete(User user);
 
 public User findUserById(User user);
}
