package com.sample.studentassignment;

/**
 * Created by BFineRocks on 9/15/14.
 */

/**
 * This class creates a new student object.
 */

public class ShowStudent {

   public static void main(String[] args){

       Student myStudent = new Student();

       myStudent.setIdentifcationNumber(1);
       myStudent.setNumberOfCredits(24);
       myStudent.setNumberOfPoints(96);
       myStudent.calculateGradePointAverage();

       System.out.println("Brandy's student ID number is: " + myStudent.getIdentifcationNumber());
       System.out.println("She currently has earned " + myStudent.getNumberOfCredits() + " credit hours.");
       System.out.println("She also current has " + myStudent.getNumberOfPoints() + " points.");
       System.out.println("Which means she has a Grade Point Average of " + myStudent.getGradePointAverage() + ".");


   }
}
