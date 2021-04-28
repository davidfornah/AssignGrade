package com.sapunka;

import java.util.Scanner;
//Program to perform student mark sheet processing
public class Main {
public static void main(String[] args) {
//	create a scanner
        Scanner input = new Scanner(System.in);

//        Get number of students
        System.out.println("Please enter the number of students that took the exams: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents]; //Array scores
        int best = 0; // the best score
        String grade; // The grade

//        Reade scores and find the best  score
        for (int i = 0; i < scores.length; i++){
            System.out.println("Please enter a score: ");
            scores[i] = input.nextInt();

            if (scores[i] > best)
                best = scores[i];
        }
//        Declare and initialize the output string
        StringBuilder output = new StringBuilder();
//        Assigning and displaying grades
        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= best - 10)
                grade = "A";
            else if (scores[i] >= best - 20)
                grade = "B";
            else if (scores[i] >= best - 30)
                grade = "C";
            else if (scores[i] >= best - 40)
                grade = "D";
            else
                grade = "F";

//      Displaying the mark sheet for various students
            output.append("Student ").append(i).append(" score is ").append(scores[i]).append(" and grade is ").append(grade).append("\n");
            }

//        Display the result
        System.out.println("*****STUDENT MARK SHEET DETAILS********");
        System.out.println(output);
        System.out.println("END of sheet ..................");
    }
}
