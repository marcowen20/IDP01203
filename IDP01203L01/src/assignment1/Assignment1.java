package assignment1;
import java.util.*; // Import the additional libraries for the Scanner class
/**
 * === RESULT SLIP GENERATOR ===
 * By entering the exam and coursework in for a specified student, it
 * generates a result slip by determining the point value and
 * PASS/FAIL status and calculating the grade point, GPA and CGPA.
 * 
 * == Author ==
 * Name     : Marc Owen Rentap anak Dineal Gumis
 * ID       : 52051120015
 * Group    : L01
 * Course   : IDP01203 - Principles of Programming
 * Lecturer : Dr. Azizah Rahmat
 * 
 * == Note ==
 * - Users will input the exam and coursework marks out of 100%, but the
 *   total mark is calculated based on the 50% exam and 50% coursework*
 *   proportion
 * - This version is designed **only** to generate the result slip of students
 *   who are enrolled in Semester 1 of the Pre-Korea program.
 * 
 * @author Marc Owen Rentap
 */
public class Assignment1 {
    // Main class start
    public static void main(String[] args) {
        // The scanner object for input
        Scanner in = new Scanner(System.in);
        
        // Display the header -- UniKL logo, program title and author
        System.out.print(
        " _   _       _ _  ___      \n" +
        "| | | |_ __ (_) |/ / |     Result Slip Generator\n" +
        "| | | | \'_ \\| | \' /| |     Marc Owen\n" +
        "| |_| | | | | | . \\| |___  L01\n" +
        " \\___/|_| |_|_|_|\\_\\_____|\n\n");

        // Prompt for student name
        System.out.print("Student name\t: ");
        // Get student name
        String studentName = in.nextLine();
        // Prompt for student ID
        System.out.print("Student ID\t: ");
        // Get student ID
        String studentID = in.nextLine();
        // Prompt for field of study
        System.out.println("1: Computer Science  2: Animation");
        System.out.print("Field of Study\t: ");
        // Get field of study
        int fieldOfStudy = in.nextInt();
        
        // Initialize the course names and IDs
        String COURSE1NAME = "", COURSE1ID = "", COURSE2NAME = "", COURSE2ID = "",
                COURSE3NAME = "", COURSE3ID = "", COURSE4NAME = "", COURSE4ID = "",
                COURSE5NAME = "", COURSE5ID = "", COURSE6NAME = "", COURSE6ID = "", fieldOfStudyName = "";

        // Define the course credits of each course 
        Double COURSE1CREDITS = 0.0, COURSE2CREDITS = 0.0, COURSE3CREDITS = 0.0,
                COURSE4CREDITS = 0.0, COURSE5CREDITS = 0.0, COURSE6CREDITS = 0.0;
        
        // Define the name and ID of each course for display
        if (fieldOfStudy == 1) {
            COURSE1NAME = "Introduction to PC Hardware and Maintenance";
            COURSE1ID = "IDP01103";
            COURSE2NAME = "Principles of Programming";
            COURSE2ID = "IDP01203";
            COURSE3NAME = "Korean Language 1";
            COURSE3ID = "IDP06904";
            COURSE4NAME = "Korean Communication 1";
            COURSE4ID = "IDP07004";
            COURSE5NAME = "Calculus 1";
            COURSE5ID = "IDP07104";
            COURSE6NAME = "Introduction to Intercultural Communication";
            COURSE6ID = "IDP07202";
            fieldOfStudyName = "Computer Science";

            // Define the course credits of each course 
            COURSE1CREDITS = 3.0;
            COURSE2CREDITS = 3.0;
            COURSE3CREDITS = 4.0;
            COURSE4CREDITS = 4.0;
            COURSE5CREDITS = 4.0;
            COURSE6CREDITS = 2.0;
        } else if (fieldOfStudy == 2) {
            COURSE1NAME = "Introduction to PC Hardware and Maintenance";
            COURSE1ID = "IDP01103";
            COURSE2NAME = "Korean Language 1";
            COURSE2ID = "IDP06904";
            COURSE3NAME = "Korean Communication 1";
            COURSE3ID = "IDP07004";
            COURSE4NAME = "Introduction to Intercultural Communication";
            COURSE4ID = "IDP07202";
            COURSE5NAME = "Cinematic Language and Appreciation";
            COURSE5ID = "IDP07303";
            COURSE6NAME = "Basic Drawing";
            COURSE6ID = "IDP08704";
            fieldOfStudyName = "Animation";

            // Define the course credits of each course 
            COURSE1CREDITS = 3.0;
            COURSE2CREDITS = 4.0;
            COURSE3CREDITS = 4.0;
            COURSE4CREDITS = 2.0;
            COURSE5CREDITS = 3.0;
            COURSE6CREDITS = 4.0;
        }
        
        // Calculate the total credits
        Double TOTALCREDITS = COURSE1CREDITS + COURSE2CREDITS + COURSE3CREDITS +
                COURSE4CREDITS + COURSE5CREDITS + COURSE6CREDITS;
        
        // Initialize course-related variables for calculation and display
        Double course1TotalMark = 0.0, course1PointValue = 0.0, course1Coursework = 0.0, course1FinalExam = 0.0, 
                course2TotalMark = 0.0, course2PointValue = 0.0, course2Coursework = 0.0, course2FinalExam = 0.0, 
                course3TotalMark = 0.0, course3PointValue = 0.0, course3Coursework = 0.0, course3FinalExam = 0.0, 
                course4TotalMark = 0.0, course4PointValue = 0.0, course4Coursework = 0.0, course4FinalExam = 0.0, 
                course5TotalMark = 0.0, course5PointValue = 0.0, course5Coursework = 0.0, course5FinalExam = 0.0,
                course6TotalMark = 0.0, course6PointValue = 0.0, course6Coursework = 0.0, course6FinalExam = 0.0;
        String course1Grade = "", course1Status = "", course2Grade = "", course2Status = "",
                course3Grade = "", course3Status = "", course4Grade = "", course4Status = "",
                course5Grade = "", course5Status = "", course6Grade = "", course6Status = "";
        
        // Display the student information for the user to confirm in case of
        // wrongly inputted student name or student id.
        System.out.println("\n---------");
        System.out.println("Entering results for");
        System.out.println(studentName + " " + studentID);
        System.out.println(fieldOfStudyName + "\n");
        
        // Start asking for the user to input
        System.out.println("Please enter the marks out of 100%");
        
        // Initialize input variables
        String courseName = "", courseID = "";
        
        /*
        The input loop
        Loop 6 times; In each iteration, ask the user to input a coursework mark
        and exam mark. Then, assign the inputted values to the respective
        course variable. 
        */
        for (int i = 1; i <= 6; i++) {
            /*
            Determine the course name and course ID to be displayed for
            prompting. The name and id for course X is defined in the variables
            courseXName and courseXID respectively.
            */
            switch(i){
                case 1:
                    // If it is the 1st iteration, display Course 1 name and ID
                    courseName = COURSE1NAME;
                    courseID = COURSE1ID;
                    break;
                case 2:
                    // If it is the 2nd iteration, display Course 2 name and ID
                    courseName = COURSE2NAME;
                    courseID = COURSE2ID;
                    break;
                case 3:
                    // If it is the 3rd iteration, display Course 3 name and ID
                    courseName = COURSE3NAME;
                    courseID = COURSE3ID;
                    break;
                case 4:
                    // If it is the 4th iteration, display Course 4 name and ID
                    courseName = COURSE4NAME;
                    courseID = COURSE4ID;
                    break;
                case 5:
                    // If it is the 5th iteration, display Course 5 name and ID
                    courseName = COURSE5NAME;
                    courseID = COURSE5ID;
                    break;
                case 6:
                    // If it is the 6th iteration, display Course 6 name and ID
                    courseName = COURSE6NAME;
                    courseID = COURSE6ID;
            }
            
            // Display the ith course name and ID
            System.out.println(courseID + " " + courseName);
            
            // Prompt for the coursework mark of the ith course
            System.out.print("Coursework\t: ");
            // Get the coursework mark of the ith course. Adjusted for 50%-50%
            Double coursework = in.nextDouble() / 2;
            // Prompt for the exam mark of the ith course. Adjusted for 50%-50%
            System.out.print("Final exam\t: ");
            // Get the exam mark of the ith course
            Double finalExam = in.nextDouble() / 2;
            
            // Calculate the total mark of the ith course
            Double totalMark = coursework + finalExam;
            
            // Determine the PASS/FAIL status of the ith course
            String status;
            if (totalMark < 40) {
                status = "FAIL";
            } else {
                status = "PASS";
            }
            
            // Determine the grade and point value of the ith course
            String grade;
            Double pointValue;
            if (totalMark >= 80) {
                grade = "A";
                pointValue = 4.00;
            } else if (totalMark >= 75) {
                grade = "A-";
                pointValue = 3.67;
            } else if (totalMark >= 70) {
                grade = "B+";
                pointValue = 3.33;
            } else if (totalMark >= 65) {
                grade = "B";
                pointValue = 3.00; 
            } else if (totalMark >= 60) {
                grade = "B-";
                pointValue = 2.67;
            } else if (totalMark >= 55) {
                grade = "C+";
                pointValue = 2.33;
            } else if (totalMark >= 50) {
                grade = "C";
                pointValue = 2.00;
            } else if (totalMark >= 45) {
                grade = "C-";
                pointValue = 1.67;
            } else if (totalMark >= 40) {
                grade = "D";
                pointValue = 1.00;
            } else{
                grade = "F";
                pointValue = 0.00;
            }
            
            /*
            Assign the calculated total mark, grade, point value, PASS/FAIL
            status, coursework mark and exam mark of the ith course to the
            respective course-related variables.
            */
            switch(i){
                case 1:
                    /*
                    If it is the 1st iteration, assign the total mark, grade,
                    point value, PASS/FAIL status, coursework mark and final
                    exam mark to the 1st course
                    */
                    course1TotalMark = totalMark;
                    course1Grade = grade;
                    course1PointValue = pointValue;
                    course1Status = status;
                    course1Coursework = coursework;
                    course1FinalExam = finalExam;
                    break;
                case 2:
                    /*
                    If it is the 2nd iteration, assign the total mark, grade,
                    point value, PASS/FAIL status, coursework mark and final
                    exam mark to the 2nd course
                    */
                    course2TotalMark = totalMark;
                    course2Grade = grade;
                    course2PointValue = pointValue;
                    course2Status = status;
                    course2Coursework = coursework;
                    course2FinalExam = finalExam;
                    break;
                case 3:
                    /*
                    If it is the 3rd iteration, assign the total mark, grade,
                    point value, PASS/FAIL status, coursework mark and final
                    exam mark to the 3rd course
                    */
                    course3TotalMark = totalMark;
                    course3Grade = grade;
                    course3PointValue = pointValue;
                    course3Status = status;
                    course3Coursework = coursework;
                    course3FinalExam = finalExam;
                    break;
                case 4:
                    /*
                    If it is the 4th iteration, assign the total mark, grade,
                    point value, PASS/FAIL status, coursework mark and final
                    exam mark to the 4th course
                    */
                    course4TotalMark = totalMark;
                    course4Grade = grade;
                    course4PointValue = pointValue;
                    course4Status = status;
                    course4Coursework = coursework;
                    course4FinalExam = finalExam;
                    break;
                case 5:
                    /*
                    If it is the 5th iteration, assign the total mark, grade,
                    point value, PASS/FAIL status, coursework mark and final
                    exam mark to the 5th course
                    */
                    course5TotalMark = totalMark;
                    course5Grade = grade;
                    course5PointValue = pointValue;
                    course5Status = status;
                    course5Coursework = coursework;
                    course5FinalExam = finalExam;
                    break;
                case 6:
                    /*
                    If it is the 6th iteration, assign the total mark, grade,
                    point value, PASS/FAIL status, coursework mark and final
                    exam mark to the 6th course
                    */
                    course6TotalMark = totalMark;
                    course6Grade = grade;
                    course6PointValue = pointValue;
                    course6Status = status;
                    course6Coursework = coursework;
                    course6FinalExam = finalExam;
                    break;
            }
        }
        
        // Calculate the gradepoints of each course
        Double course1GradePoint = COURSE1CREDITS * course1PointValue;
        Double course2GradePoint = COURSE2CREDITS * course2PointValue;
        Double course3GradePoint = COURSE3CREDITS * course3PointValue;
        Double course4GradePoint = COURSE4CREDITS * course4PointValue;
        Double course5GradePoint = COURSE5CREDITS * course5PointValue;
        Double course6GradePoint = COURSE6CREDITS * course6PointValue;
        
        /*
        Calculate the GPA and CGPA.
        Since this is the 1st semester, CGPA is equal to GPA.
        */
        Double GPA = (course1GradePoint + course2GradePoint + course3GradePoint + course4GradePoint + course5GradePoint + course6GradePoint) / TOTALCREDITS;
        Double CGPA = GPA;
        
        // Generate the result slip
        /*
        Header
        Display the UniKL logo, campus name and the slip title
        */
        System.out.println("\n══════════════════════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println(
        "  _   _       _ _  ___                                                          \n"+
        " | | | |_ __ (_) |/ / |     Malaysian Institute of Information Technology       \n"+
        " | | | | \'_ \\| | \' /| |     Universiti Kuala Lumpur                          \n"+
        " | |_| | | | | | . \\| |___  ---                                                \n"+
        "  \\___/|_| |_|_|_|\\_\\_____| Result Slip                                      \n");
        
        /*
        Student Info
        Display the student name, student ID, program and semester
        */
        System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("Name\t\t: " + studentName);
        System.out.println("ID\t\t: " + studentID);
        System.out.println("Program\t\t: " + fieldOfStudy);
        System.out.println("Semester\t: 1");
        System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════");
        
        /*
        Table header
        Display the title of each column
        
        Abbreviations:
        CrHr = Credit Hour, C. work = Coursework, Total Pt. = Total points
        */
        System.out.println("#\tCourseID\tCrHr\tGrade\tPoints\tC.work\tFinal\tTotal\tStatus\tTotal Pt.");
        
        /*
        Table Body
        Display the calculated results of each course
        
        GradePoint is restricted to 2 decimal points to prevent repetends (infinitely
        recurring decimals.
        */

        /*
        Display the course 1 ID, Name, credits, grade, point value
        coursework, exam, status and gradepoint.
        */
        System.out.println("1\t" +
                COURSE1ID + "\t" +
                COURSE1CREDITS + "\t" +
                course1Grade + "\t" + 
                course1PointValue + "\t" +
                course1Coursework + "\t" +
                course1FinalExam + "\t" +
                course1TotalMark + "\t" +
                course1Status + "\t" +
                String.format("%.2f", course1GradePoint));
        
        /*
        Display the course 2 ID, Name, credits, grade, point value
        coursework, exam, status and gradepoint.
        */
        System.out.println("2\t" +
                COURSE2ID + "\t" +
                COURSE2CREDITS + "\t" +
                course2Grade + "\t" + 
                course2PointValue + "\t" +
                course2Coursework + "\t" +
                course2FinalExam + "\t" +
                course2TotalMark + "\t" +
                course2Status + "\t" +
                String.format("%.2f", course2GradePoint));
        
        /*
        Display the course 3 ID, Name, credits, grade, point value
        coursework, exam, status and gradepoint.
        */
        System.out.println("3\t" +
                COURSE3ID + "\t" +
                COURSE3CREDITS + "\t" +
                course3Grade + "\t" + 
                course3PointValue + "\t" +
                course3Coursework + "\t" +
                course3FinalExam + "\t" +
                course3TotalMark + "\t" +
                course3Status + "\t" +
                String.format("%.2f", course3GradePoint));
        
        /*
        Display the course 4 ID, Name, credits, grade, point value
        coursework, exam, status and gradepoint.
        */
        System.out.println("4\t" +
                COURSE4ID + "\t" +
                COURSE4CREDITS + "\t" +
                course4Grade + "\t" + 
                course4PointValue + "\t" +
                course4Coursework + "\t" +
                course4FinalExam + "\t" +
                course4TotalMark + "\t" +
                course4Status + "\t" +
                String.format("%.2f", course4GradePoint));
        
        /*
        Display the course 5 ID, Name, credits, grade, point value
        coursework, exam, status and gradepoint.
        */
        System.out.println("5\t" +
                COURSE5ID + "\t" +
                COURSE5CREDITS + "\t" +
                course5Grade + "\t" + 
                course5PointValue + "\t" +
                course5Coursework + "\t" +
                course5FinalExam + "\t" +
                course5TotalMark + "\t" +
                course5Status + "\t" +
                String.format("%.2f", course5GradePoint));
        
        /*
        Display the course 6 ID, Name, credits, grade, point value
        coursework, exam, status and gradepoint.
        */
        System.out.println("6\t" +
                COURSE6ID + "\t" +
                COURSE6CREDITS + "\t" +
                course6Grade + "\t" + 
                course6PointValue + "\t" +
                course6Coursework + "\t" +
                course6FinalExam + "\t" +
                course6TotalMark + "\t" +
                course6Status + "\t" +
                String.format("%.2f", course6GradePoint));
        
        /*
        Result
        Display the total total credits, total gradepoint, GPA and CGPA
        */
        System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════");
        Double totalGradePoint = course1GradePoint + course2GradePoint + course3GradePoint + course4GradePoint + course5GradePoint + course6GradePoint;
        System.out.println("Total\t\t\t" + TOTALCREDITS + "\t\t\t\t\t\t\t" + String.format("%.2f", totalGradePoint));
        System.out.println("GPA: " + String.format("%.2f", GPA) + "\tCGPA: " + String.format("%.2f", CGPA));
        System.out.println("══════════════════════════════════════════════════════════════════════════════════════════════════════════");
    } // End of main function
} // End of class