/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hworld;
import java.util.Scanner;
import java.util.stream.*;

/**
 *
 * @author user
 */
public class Hworld {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of subjects: ");
    int numSubjects = scanner.nextInt();

    int totalGrade = 0;
    int failedSubjects = 0;
    int i = 1;
    while (i <= numSubjects) { 
        System.out.print("Enter a grade for subject " + i + ": ");
        int grade = scanner.nextInt();
        totalGrade += grade;
            if (grade < 60) { 
            failedSubjects++;
            }
            
        if (grade >= 90) {
            System.out.println(grade + ", Excellent");
        } else if (grade >= 80) { 
            System.out.println(grade + ", Good");
        } else if (grade >= 70) {
            System.out.println(grade + ", Fair");
        } else {
            System.out.println(grade + ", Needs Improvement");
        }
        i++;
        }
        double averageGrade = (double) totalGrade / numSubjects;
        System.out.println("Overall Average Grade: " + averageGrade);
        System.out.println("Number of Failed Subjects: " + failedSubjects);
        scanner.close(); 
        }
    }
    

