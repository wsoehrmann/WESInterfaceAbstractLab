/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author wsoehrmann
 */
public abstract class ProgrammingCourse {

    // These variables are used in all the classes therefore they can by
    //put in a abstract class
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private double MIN_CREDITS = .5;
    private double MAX_CREDITS = 4.0;
    
    /**
     *
     */
    public void courseName(){
        System.out.println("Enter course Name");
    }
    public void credits(){
        
    }
    public void courseNumber(){
    }
    public void prerequisites(){
        
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
