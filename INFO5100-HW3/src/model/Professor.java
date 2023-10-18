/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author JANFAN
 */
public class Professor extends Person {
    private int ProfessorID;
    private List<Double>rank;
    private String pUsername;
    private String pPassword;
    private List<Course>courseList;

    public Professor() {
        rank=new ArrayList<>();
        courseList=new ArrayList<>();
    }

    public Professor(String pUsername, String pPassword) {
        this.pUsername = pUsername;
        this.pPassword = pPassword;
        rank=new ArrayList<>();
        courseList=new ArrayList<>();
    }
    

    
    public int getProfessorID() {
        return ProfessorID;
    }

    public void setProfessorID(int ProfessorID) {
        this.ProfessorID = ProfessorID;
    }

    public List<Double> getRank() {
        return rank;
    }

    public void setRank(List<Double> rank) {
        this.rank = rank;
    }

    public String getpUsername() {
        return pUsername;
    }

    public void setpUsername(String pUsername) {
        this.pUsername = pUsername;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    @Override
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

    public ImageIcon getImage() {
        return image;
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
