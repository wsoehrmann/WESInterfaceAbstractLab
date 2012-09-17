package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Wesley E Soehrmann
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingClass {
    
    private String prerequisites;
    
    public String getPrerequisites() {
        return prerequisites;
    }
// since there are now prerequisites to this class I am overiding the 
  //  ProgrammingClass
    @Override
    public void setPrerequisites(String prerequisites) {
        System.out.println("There are no prerequisites to this class");
        }
        
    }

