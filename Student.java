/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.student;

/**
 *
 * @f-sam
 */
public class Student {
    
    /* Data members */
    private static int nextId;  // verify the visibility
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Course course1;
    private Course course2;
    
    /* Default Constructor */
    public Student() {
        /* The id is the next id, paying attention because it has to be made of 4 digits*/
        if (nextId < 10) {
            this.id = "000"+ nextId;
        }
        else if (nextId < 100) {
            this.id = "00" + nextId;
        }
        else if (nextId < 1000) {
            this.id = "0" + nextId;
        }
        else {
            this.id = "" + nextId;
        }
        /* Increasing the nextId for future students */
        nextId ++;
        if (nextId == 10000)
            nextId = 0;
        
        /* Empty strings for first name, last name and email */
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        
        /* 0 for age */
        this.age = 0;
        
        /* Courses initialised with default constructor */
        course1 = new Course();
        course2 = new Course();
    }
    
    /* Constructor with firstName and lastName */
    public Student(String firstName, String lastName) {
        /* The id is the next id, paying attention because it has to be made of 4 digits*/
        if (nextId < 10) {
            this.id = "000"+ nextId;
        }
        else if (nextId < 100) {
            this.id = "00" + nextId;
        }
        else if (nextId < 1000) {
            this.id = "0" + nextId;
        }
        else {
            this.id = "" + nextId;
        }
        /* Increasing the nextId for future students */
        nextId ++;
        
        /* Empty string for email */
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = "";
        
        /* 0 for age */
        this.age = 0;
        
        /* Courses initialised with default constructor */
        course1 = new Course();
        course2 = new Course();
    }
    
    /* Constructor with all the arguments */
    public Student(String firstName, String lastName, String email, int age, Course c1, Course c2) {
        /* The id is the next id, paying attention because it has to be made of 4 digits*/
        if (nextId < 10) {
            this.id = "000"+ nextId;
        }
        else if (nextId < 100) {
            this.id = "00" + nextId;
        }
        else if (nextId < 1000) {
            this.id = "0" + nextId;
        }
        else {
            this.id = "" + nextId;
        }
        /* Increasing the nextId for future students */
        nextId ++;
        
        this.firstName = firstName;
        this.lastName = lastName;
        /* The email is inserted also if it is not valid */
        this.email = email;
        this.age = age;
        
        /* Courses initialised with copy constructor */
        course1 = new Course(c1);
        course2 = new Course(c2);
    }
    
    /* Copy Constructor, everything is copied except the id */
    public Student(Student s) {
        /* The id is the next id, paying attention because it has to be made of 4 digits*/
        if (nextId < 10) {
            this.id = "000"+ nextId;
        }
        else if (nextId < 100) {
            this.id = "00" + nextId;
        }
        else if (nextId < 1000) {
            this.id = "0" + nextId;
        }
        else {
            this.id = "" + nextId;
        }
        /* Increasing the nextId for future students */
        nextId ++;
        
        this.firstName = s.getFirstName();
        this.lastName = s.getLastName();
        /* The email is inserted also if it is not valid */
        this.email = s.getEmail();
        this.age = s.getAge();
        
        /* Courses initialised with copy constructor */
        course1 = new Course(s.getCourse1());
        course2 = new Course(s.getCourse2());
    }
    
    /* Method to extract the email account from the email address */
    /* Implementation with loop */
    public String extractEmailAccount() {
        boolean end = false;
        String account = "";
        int i = 0;
        /* Scanning the email while @ is found */
        while (!end && i < email.length()) {
            if (email.charAt(i) == '@') {
                end = true;
            }
            else {
                account = account + email.charAt(i);
                i++;
            }
        }
        
        return account;
    }
    
    /* Method to verify if the email is correct */
    public boolean isEmailCorrect() {
        /* Useful variables */
        boolean okDot = false, okAt = false, atBegin = false;
        int i = 0;
        /* Scanning the email till the ., stop if the @ is at the beginning or at the end of email */
        while (!atBegin && !okDot && i < email.length()) {
            if (email.charAt(i) == '@') {
                /* Verifying if it is at the beginning */
                if (i == 0)
                    atBegin = true;
                /* @ Found */
                okAt = true;
                i++;
            }
            else if (email.charAt(i) == '.') {
                /* Dot found */
                okDot = true;
                i++;
            }
            else
                /* Every other character */
                i++;
        }
        
        boolean returning = true;
        /* Verifying why the loop ended */
        if (atBegin) {
            /* @ at the beginning */
            returning = false;
        }
        else if (okDot && !okAt) {
            /* Dot before @ */
            returning = false;
        }
        else if (i >= email.length()) {
            /* No dot or dot at the end of the email */
            returning = false;
        }
        else if (!okDot || !okAt) {
            /* . or @ not present */
            returning = false;
        }
        
        /* Every other case is correct */
        return returning;
        
    }
    
    /* Overriding toString */
    @Override
    public String toString() {
        String s = "Name   : " + this.firstName + " " + this.lastName +
                 "\nID     : " + this.id +
                 "\nAge    : " + this.age +
                 "\nEmail  : " + this.email +
                 "\nCourse1: " + this.course1.getCourseName() + " [" + course1.getCredit() + " credits]" +
                 "\nCourse2: " + this.course2.getCourseName() + " [" + course2.getCredit() + " credits]";
        
        return s;
    }
    
    /* Implementing equals method: two students are equal if every data member is equal to the other one */
    public boolean equals(Student s) {
        if ( (firstName.equals(s.getFirstName())) && (lastName.equals(s.getLastName())) && (email.equals(s.getEmail())) &&
              id.equals(s.getId()) && (age == s.getAge()) && course1.equals(s.getCourse1()) && course2.equals(s.getCourse2()) ) {
            return true;
        }
        else
            return false;
    }
    
    /* Getters */
    public int getNextId() {
        return nextId;
    }
    public String getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }
    public Course getCourse1() {
        return this.course1;
    }
    public Course getCourse2() {
        return this.course2;
    }
    
    /* Setters */
    public void setId(String id) {
        /* Sets the id only if it is 4 digit long */
        if (id.length() == 4) {
            this.id = id;
        }
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }  
    public void setCourse1(Course c) {
        this.course1 = c;
    }
    public void setCourse2(Course c) {
        this.course2 = c;
    }
    
}
