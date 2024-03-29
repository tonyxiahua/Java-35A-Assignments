package lab2;

//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: June 6
//Submit Date: June 10

public class Student extends Grade implements Inter {
	private int SID;
	private int scores[] = new int[5];

	// constructor
	Student() {
	}

	Student(int SID, int[] scores) {
		this.SID = SID;
		this.scores = scores;
	}

	// write public get and set methods for
	// SID and scores
	// getter and
	// setter----------------------------------------------------------------------------------------------------------
	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public int[] getScores() {
		return scores;
	}

	public int getSingleScore(int i) {
		return scores[i];
	}

	public void setScores(int[] scores) {
		for (int i = 0; i < this.scores.length; i++) {
			this.scores[i] = scores[i];
		}
	}
	
	public void printSID() {
		System.out.println(SID);
	}

	public void printScores() {
		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println("");
	}

	public void printAll() {
		if (SID != 0) {
			System.out.printf("Student id %d\nLab 1 through 5 scores \n%03d %03d %03d %03d %03d\n\n", SID, scores[0],
					scores[1], scores[2], scores[3], scores[4]);
		}
	}

	public int SIDForScores(int ID) {
		if (ID == SID) {
			return 1;
		}
		return 0;
	}

	public void findlow(Grade[] a) {
	}

	public void findhigh(Grade[] a) {
	}

	public void findavg(Grade[] a) {
	}
}
