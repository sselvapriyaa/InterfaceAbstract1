/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Gladwin
 */
public class Startup 
{ 
    public static void main(String args[]){
    ProgrammingCourse course1=new AdvancedJavaCourse("Java","101");
    ProgrammingCourse course2=new IntroJavaCourse("Programmingconcepts","102");
    ProgrammingCourse course3=new IntroToProgrammingCourse("BasicProgramming","103");
        System.out.println(course1.getcourseName());
        System.out.println(course1.getcourseNumber());
        System.out.println(course2.getcourseName());
        System.out.println(course2.getcourseNumber());
        System.out.println(course3.getcourseName());
        System.out.println(course3.getcourseNumber());
          

}
}

