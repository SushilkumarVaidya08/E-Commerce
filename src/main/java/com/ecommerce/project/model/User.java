package com.ecommerce.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userId;
private String name;
private String email;
@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
private Address address;
public int getUserId() {
return userId;
}
public void setUserId(int userId) {
this.userId = userId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
}

