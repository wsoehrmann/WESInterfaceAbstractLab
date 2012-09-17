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
        AdvancedJavaCourse javaCourse = new AdvancedJavaCourse();
        javaCourse.courseName();
        javaCourse.credits();
        javaCourse.courseNumber();
        javaCourse.prerequisites();
        IntroJavaCourse introJavaCourse = new IntroJavaCourse();
        introJavaCourse.courseName();
        introJavaCourse.credits();
        introJavaCourse.courseNumber();
        introJavaCourse.prerequisites();
        IntroToProgrammingCourse introProgrammingCourse = new 
                IntroToProgrammingCourse();
        introProgrammingCourse.courseName();
        introProgrammingCourse.credits();
        introProgrammingCourse.courseNumber();
        introProgrammingCourse.prerequisites();
    }
}
