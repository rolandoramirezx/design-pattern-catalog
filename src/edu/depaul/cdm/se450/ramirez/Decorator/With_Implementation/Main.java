package edu.depaul.cdm.se450.ramirez.Decorator.With_Implementation;

public class Main {

    public static void main (String[] args){

        //Hashmap to hold grades
        GradeBook examOne = new GradeBook();
        examOne.gradeBookName = "exam one grades";

        Test johnDoe = new Exam();
        johnDoe = new Curve(johnDoe, 5.0); //decorating the exam with a curve of +5.0
        examOne.grades.put("John Doe", johnDoe.totalPoints());
        System.out.println("The following grade has been entered into " + examOne.gradeBookName + ": " + johnDoe.totalPoints());

        Test janeDoe = new Exam();
        janeDoe = new DeductPoints(janeDoe, 5.0); //decorating the class with a point deduction of -5.0
        examOne.grades.put("Jane Doe", janeDoe.totalPoints());
        System.out.println("The following grade has been entered into " + examOne.gradeBookName + ": " + janeDoe.totalPoints());

    }
}
