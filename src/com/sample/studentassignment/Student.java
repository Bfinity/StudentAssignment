package com.sample.studentassignment;

/**
 * Created by BFineRocks on 9/15/14.
 */

/**
 * This class creates the template for a new student object.
 */
public class Student {
    private int identifcationNumber;
    private int numberOfCredits;
    private int numberOfPoints;
    private double gradePointAverage;

    public void setIdentifcationNumber(int identifcationNumber) {
        this.identifcationNumber = identifcationNumber;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public void calculateGradePointAverage() {
        this.gradePointAverage = numberOfPoints / numberOfCredits;
    }

    public int getIdentifcationNumber() {
        return identifcationNumber;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }
}
