/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author JANFAN
 */
public class Student extends Person {
    private int studentID;
    private String sUsername;
    private String sPassword;
    private List<Course> courseHistory;//store history courses and score
    private double GPA;
    private boolean isGraduate;
    private List<Course>currentCourses;
    private List<String>passwordHistory;

    public Student() {
        courseHistory=new ArrayList<>();
        currentCourses=new ArrayList<>();
        passwordHistory=new ArrayList<>();
        GPA=0.0;
        isGraduate=false;
                
    }

    public Student(String sUsername, String sPassword) {
        this.sUsername = sUsername;
        this.sPassword = sPassword;
        courseHistory=new ArrayList<>();
        currentCourses=new ArrayList<>();
        passwordHistory=new ArrayList<>();
        GPA=0.0;
        isGraduate=false;
    }
    
    
    
    
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public List<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(List<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public boolean isIsGraduate() {
        return isGraduate;
    }

    public void setIsGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    public List<Course> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(List<Course> currentCourses) {
        this.currentCourses = currentCourses;
    }

    public List<String> getPasswordHistory() {
        return passwordHistory;
    }

    public void setPasswordHistory(List<String> passwordHistory) {
        this.passwordHistory = passwordHistory;
    }
    
    @Override
    public ImageIcon getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    
    
    
}
