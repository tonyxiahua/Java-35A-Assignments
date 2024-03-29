package lab2;

//Hua Xia
//CIS 35A 
//Assignment 6
//Due Date: May 30
//Submit Date: June 10

// This is read file from assignment 5
import java.io.*;
import java.util.*;

public class FileIO {
	static Grade[] readFile(String filename, Grade[] stu) {
		int counter = 0;
		int stuNum = 0;
		String data[] = new String[6];
		int xx[] = new int[5];
		// declare student array
		for (int i = 0; i < 40; i++) {
			stu[i] = new Student();
		}
		// read file
		try {
			FileReader file = new FileReader(filename);
			BufferedReader getline = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				counter++;
				// System.out.println(counter);
				String line = getline.readLine();
				if (line == null) {
					eof = true;
				} else {
					// System.out.println(line);
					// ignore first line
					if (counter == 1) {
					} else {
						// string token
						int dataNum = 0;
						StringTokenizer st = new StringTokenizer(line);
						// store the token into a string array data
						while (st.hasMoreTokens()) {
							data[dataNum] = st.nextToken();
							dataNum++;
						}
						// change ID string to int
						int x = Integer.parseInt(data[0]);
						// change Scores string array to int array
						for (int i = 0; i < 5; i++) {
							xx[i] = Integer.parseInt(data[(i + 1)]);
						}
						// call setter array of Student and sign ID and array of
						// Scores
						stu[stuNum].setSID(x);
						stu[stuNum].setScores(xx);
						stuNum++;
					}
				}
			}
			getline.close();
		} catch (Exception e) {
			System.out.println("Error " + e.toString());
		}
		return stu;
	}
}
