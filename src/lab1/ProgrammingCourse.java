/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Gladwin
 */
public abstract class ProgrammingCourse {
    String courseName;
    String courseNumber;
    double credits;
    String prerequisites;
    
    public abstract String getCourseName();
    public abstract void setCourseName();
    public abstract String getCourseNumber();
    public abstract void setCourseNumber();
    public abstract double getCredits();
    public abstract void setCredits();
    public abstract String getprerequisites();
    public abstract void setprerequisites();
    
}
