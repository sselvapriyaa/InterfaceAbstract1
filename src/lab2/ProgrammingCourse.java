/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Gladwin xxx
 */
public interface ProgrammingCourse {
     
    public abstract String getcourseName();
    public abstract void setcourseName(String courseName);
    public abstract String getcourseNumber();
    public abstract void setcourseNumber(String courseNumber);
    public abstract double getCredits();
    public abstract void setCredits(double credits);
    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);

   
}
