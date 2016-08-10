//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 10
package lab2;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int SID;
	private int scores[] = new int[5];

	// Default Constructor
	public Student() {
	}
	// =========================================

	// Getter and Setter
	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public int getScores(int i) {
		return scores[i];
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	// =========================================

	// Record the scores
	public void recordScores(int[] scores) {
		for (int i = 0; i < 5; i++) {
			this.scores[i] = scores[i];
		}
	}
	// =========================================

	// print values of SID and Scores
	public static void printInfo(Student stu) {
		System.out.printf("%d", stu.getSID());
		for (int i = 0; i < 5; i++) {
			System.out.printf("%4d", stu.getScores(i));
		}
		System.out.println();
	}
	// Write public methods for SID and scores add methods to print values of
	// instance variables
	// =========================================
}