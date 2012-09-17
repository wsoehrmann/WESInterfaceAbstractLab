/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Wesley
 */
public class StartUp {

    public static void main(String[] args) {
        AdvancedJavaCourse aj = new AdvancedJavaCourse();
         aj.setCourseName("AdvancedJavaCourse");
         aj.setCredits(4);
         aj.setCourseNumber("4532343");
         aj.setPrerequisites("IntroJavaCourse");
        IntroJavaCourse ij = new IntroJavaCourse();
         aj.setCourseName("IntroJavaCourse");
         ij.setCredits(4);
         ij.setCourseNumber("49599");
        ij.setPrerequisites("IntroToProgramming");
        IntroToProgrammingCourse ip = new 
                IntroToProgrammingCourse();
        ip.setCourseName("IntroToProgramming");
        ip.setCredits(4);
        ip.setCourseNumber("5949494");
        ip.setPrerequisites("none");
    }
}
