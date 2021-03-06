package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setcourseName(courseName);
        this.setcourseNumber(courseNumber);
    }

   
@Override
    public  void setcourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
     
@Override
    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
@Override
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    
   
   
    
@Override
    public String getcourseNumber() {
        return courseNumber;
    }

    
@Override
    public String getcourseName() {
        return courseName;
    }

  @Override  
        public final void setcourseName(String courseName) {
        if(courseName==null || courseName.isEmpty()) {
           System.out.println("Sorry you must provide a course name");
     
    }
       else{
           this.courseName=courseName;
       }
    }

    
   
    

    

   

    

    
}

    

   
