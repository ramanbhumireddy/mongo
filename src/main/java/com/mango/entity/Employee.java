//package com.mango.entity;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Transient;
//import org.springframework.data.mongodb.core.index.Indexed;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//
//
//import lombok.Data;
//
//
//@Data
//@Document(collection = "Employee")
//public class Employee {
//	
//	@Transient
//    public static final String SEQUENCE_NAME = "users_sequence";
//
//    @Id
//    private long id;
//
//    @Indexed(unique = true)
//    private String firstName;
//    private String lastName;
//
//    @Indexed(unique = true)
//    private String emailId;
//
//}
