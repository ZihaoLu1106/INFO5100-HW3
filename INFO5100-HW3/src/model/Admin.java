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

    
    
    
}
