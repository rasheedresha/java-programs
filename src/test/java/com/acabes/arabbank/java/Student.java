package com.acabes.arabbank.java;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int studentClass;
    private int totalMark;


    public Student(String studentId, String studentName, int studentClass, int totalMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass=studentClass;
        this.totalMark=totalMark;
    }

    public static char calculateGrade(int totalMark) {
        if (totalMark >= 90 && totalMark <= 100) {
            return 'A';
        } else if (totalMark >= 80 && totalMark <= 89) {
            return 'B';
        } else if (totalMark >= 70 && totalMark <= 79) {
            return 'A';
        } else if (totalMark >= 60 && totalMark <= 69) {
            return 'A';
        } else {
            return 'A';
        }
    }

    public void displayStudentInfo() {
        System.out.println("Name of the student is " + this.studentName);
        System.out.println("Id of the student is" + this.studentId);
        System.out.println("Grade of the student is " + calculateGrade (totalMark));
        System.out.println("Class of student is " + studentClass);

    }
}
class GradeCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total marks obtained (out of 100):");
        char YesOrNo;
        do {
            System.out.println("Enter the student's Id: ");
            String studentId = s.next();
            System.out.println("Enter the student's name:");
            String studentName = s.next();
            System.out.println("Enter the student's class:");
            int studentClass = s.nextInt();
            System.out.println("total marks:");
            int totalMark = s.nextInt();
            Student student=new Student(studentId, studentName,studentClass,totalMark);
            student.displayStudentInfo();

            System.out.println("Do you want to continue (y/n)?");
            YesOrNo = s.next().charAt(0);


        } while (YesOrNo == 'y' || YesOrNo == 'Y');
    }
}



