package com.wipro.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="emp_praveen")
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;
 private String firstName;
 private String lastName;


 public Employee(String firstName, String lastName) {
   this.firstName = firstName;
   this.lastName = lastName;
 }
 public Employee() {
 }
 public Integer getId() {
   return id;
 }
 public void setId(Integer id) {
   this.id = id;
 }
 public String getFirstName() {
   return firstName;
 }
 public void setFirstName(String firstName) {
   this.firstName = firstName;
 }
 public String getLastName() {
   return lastName;
 }
 public void setLastName(String lastName) {
   this.lastName = lastName;
 }
}
