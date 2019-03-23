package com.jackrutorial.model;

public class User {
 private Integer id;
 private String firstname;
 private String lastname;
 private String address;
 
 public User() {
  super();
 }
 
 public User(Integer id) {
  super();
  this.id = id;
 }

 public Integer getId() {
  return id;
 }
 public void setId(Integer id) {
  this.id = id;
 }
 public String getFirstname() {
  return firstname;
 }
 public void setFirstname(String firstname) {
  this.firstname = firstname;
 }
 public String getLastname() {
  return lastname;
 }
 public void setLastname(String lastname) {
  this.lastname = lastname;
 }
 public String getAddress() {
  return address;
 }
 public void setAddress(String address) {
  this.address = address;
 }
}