/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author JANFAN
 */
public class Admin {
    private List<Student>allStudent;
    private List<Professor>allProfessor;
    private List<Course>allCourse;
    




    public Admin() {
        allStudent=new ArrayList<>();
        allProfessor=new ArrayList<>();
        allCourse=new ArrayList<>();
    }
    
    
    public void addStudent(Student s){
        allStudent.add(s);
    }
    public Student getStudent(String username,String password){
        for(Student s:allStudent){
            if(s.getsUsername().equals(username)&&s.getsPassword().equals(password))
                return s;
        }
        return null;
    }
    public void addProfessor(Professor p){
        allProfessor.add(p);
    }
    public Professor getProfessor(String username,String password){
        for(Professor p:allProfessor){
            if(p.getpUsername().equals(username)&&p.getpPassword().equals(password))
                return p;
        }
        return null;
    }
    public void addCourse(Course c){
        allCourse.add(c);
    }
    public Course getCourse(String code){
        for(Course c:allCourse){
            if(c.getcCode().equals(code))
                return c;
        }
        return null;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }

    public List<Professor> getAllProfessor() {
        return allProfessor;
    }

    public void setAllProfessor(List<Professor> allProfessor) {
        this.allProfessor = allProfessor;
    }

    public List<Course> getAllCourse() {
        return allCourse;
    }

    public void setAllCourse(List<Course> allCourse) {
        this.allCourse = allCourse;
    }  
}
