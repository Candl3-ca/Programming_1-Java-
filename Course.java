/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @f-sam
 */
public class Course {
    
    /* Data members */
    private String courseName;
    private int credit;
    private boolean isComplimentaryCourse;
    
    /* Default Constructor */
    public Course() {
        this.courseName = ""; // empty string
        this.credit = 0;
        this.isComplimentaryCourse = false;
    }
    
    /* Constructor with courseName ad argument */
    public Course(String courseName) {
        this.courseName = courseName;
        this.credit = 0;
        this.isComplimentaryCourse = false;
    }
    
    /* Constructor with all arguments */
    public Course(String courseName, int credit, boolean isComplimentaryCourse) {
        this.courseName = courseName;
        this.credit = credit;
        this.isComplimentaryCourse = isComplimentaryCourse;
    }
    
    /* Copy Constructor, uses getters methods */
    public Course(Course c) {
        this.courseName = c.getCourseName();
        this.credit = c.getCredit();
        this.isComplimentaryCourse = c.getIsComplimentaryCourse();
    }
    
    /* Overriding toString() method */
    @Override
    public String toString() {
        String s = "Course Name  : " + this.courseName +
                 "\nCredit       : " + this.credit +
                 "\nComplimentary: ";
        /* If-else case because we have to write Yes/No instead of true/false */
        if (this.isComplimentaryCourse)
            s = s + "Yes";
        else 
            s = s + "No";
        
        return s;
    }
    
    /* Method to verify if two courses are equal:
    they are equal if they have the same data members*/
    public boolean equals(Course c) {
        if (this.courseName.equals(c.getCourseName()) && this.credit == c.credit && this.isComplimentaryCourse == c.getIsComplimentaryCourse()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /* Getters */
    public String getCourseName() {
        return this.courseName;
    }
    public int getCredit() {
        return this.credit;
    }
    public boolean getIsComplimentaryCourse() {
        return this.isComplimentaryCourse;
    }
    
    /* Setters */
    public void setCourseName(String name) {
        this.courseName = name;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public void setIsComplimentaryCourse(boolean isComplCourse) {
        this.isComplimentaryCourse = isComplCourse;
    }
    
}
