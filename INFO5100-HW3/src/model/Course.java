/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JANFAN
 */

public class Course {
    public enum WEEKDAY{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY 
    }
    public enum HOUR{
        am1,//0000-0300
        am2,//0400-0700
        am3,//0800-1100
        pm1,//1200-1500
        pm2,//1600-1900
        pm3//1800-2300
        
    }
    public enum YEAR{
        Y2023,
        Y2024,
        Y2025,
    }
    private String professorName;
    private String cName;
    private String cCode;
    private String cTopic;
    private String cDescription;
    private boolean isFall;
    private List<Student>waitList;
    private List<Student>studentList;
    private List<WEEKDAY>weekdays;
    private HOUR hours;
    private YEAR years;

    public Course() {
        waitList=new ArrayList<>();
        studentList=new ArrayList<>();
        weekdays=new ArrayList<>();
        //hours=new ArrayList<>();
        //years=new ArrayList<>();
    }
    
    

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcTopic() {
        return cTopic;
    }

    public void setcTopic(String cTopic) {
        this.cTopic = cTopic;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public boolean isIsFall() {
        return isFall;
    }

    public void setIsFall(boolean isFall) {
        this.isFall = isFall;
    }

    public List<Student> getWaitList() {
        return waitList;
    }

    public void setWaitList(List<Student> waitList) {
        this.waitList = waitList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<WEEKDAY> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(List<WEEKDAY> weekdays) {
        this.weekdays = weekdays;
    }

    public String getHour() {
        if(null==hours){
            return "20:00-23:00";
        }else switch (hours) {
            case am1:
                return "00:00-3:00";
            case am2:
                return "4:00-7:00";
            case am3:
                return "8:00-11:00";
            case pm1:
                return "12:00-15:00";
            case pm2:
                return "16:00-19:00";
            default:
                return "20:00-23:00";
        }
        
    }

    public HOUR getHours() {
        return hours;
    }
    
    
    public String getSemester(){
        if(isFall){
            return "Fall"+years.toString();
        }else
            return "Spring"+years.toString();
    }

    public void setHours(HOUR hours) {
        this.hours = hours;
    }
    
    public String getYear(){
        if(null==years){
            return "2023";
        }else switch (years) {
            case Y2023:
                return "2023";
            case Y2024:
                return "2024";
            case Y2025:
                return "2025";
            default:
                return "2023";
        }
    }
    
    public YEAR getYears() {
        return years;
    }

    public void setYears(YEAR years) {
        this.years = years;
    }
    @Override
    public String toString(){
    return cCode;}
    
    
}
