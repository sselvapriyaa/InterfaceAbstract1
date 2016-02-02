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
public class Startup {
    public static void main(String args[]){
    
ProgrammingCourse course1=new AdvancedJavaCourse("JavaProgramming","101");
ProgrammingCourse course2=new IntroJavaCourse("Programmingconcepts","102");
ProgrammingCourse course3=new IntroToProgrammingCourse("BasicProgramming","103");


        System.out.println(course1.getCourseName());
        System.out.println(course1.getCourseNumber());
        System.out.println(course2.getCourseName());
        System.out.println(course2.getCourseNumber());
        System.out.println(course3.getCourseName());
        System.out.println(course3.getCourseNumber());
          
        
        }
}