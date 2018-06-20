package edu.depaul.cdm.se450.ramirez.Decorator.Without_Implementation;

public class Main {

    public static void main ( String[] args ){

        Grades historyExam = new Grades();

        Test johnDoe = new Test();
        johnDoe.setTotalPoints(100.0); //100.0 total points for exams, and 10.0 for quizes
        johnDoe.deductPoints(10.0);
        johnDoe.applyCurve(2.0);

        historyExam.grades.put("John Doe", johnDoe.getTotalPoints());
        System.out.println("The following grades has been entered into history exam grades for John Doe: " + johnDoe.getTotalPoints());

    }
}
