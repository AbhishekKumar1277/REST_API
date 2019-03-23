package com.jackrutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jackrutorial.model.User;

import com.jackrutorial.service.UserService;

@RestController
public class UserController {
 
 @Autowired
 UserService userService;
 
 @RequestMapping(value="/user/", method = RequestMethod.GET, headers="Accept=application/json")
 public ResponseEntity<List<User>> listAllUser(){
  List<User> list = userService.listAllUser();
  
  if(list.size() == 0){
   return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
  }
  
  return new ResponseEntity<List<User>>(list, HttpStatus.OK);
 }
 
 @RequestMapping(value="/add/", method = RequestMethod.POST, headers="Accept=application/json")
 public ResponseEntity<Void> add(@RequestBody User user){
  userService.addUser(user);
  
  HttpHeaders headers = new HttpHeaders();
  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
 }
 
 @RequestMapping(value="/update/{id}", method = RequestMethod.PUT, headers="Accept=application/json")
 public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody User user){
  user.setId(id);
  userService.updateUser(user);
  
  HttpHeaders headers = new HttpHeaders();
  return new ResponseEntity<Void>(headers, HttpStatus.OK);
 }
 
 @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, headers="Accept=application/json")
 public ResponseEntity<Void> delete(@PathVariable("id") int id, @RequestBody User user){
  user.setId(id);
  userService.delete(user);
  
  HttpHeaders headers = new HttpHeaders();
  return new ResponseEntity<Void>(headers, HttpStatus.NO_CONTENT);
 }
}