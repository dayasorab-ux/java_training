/*
Create a class named Snpau with fields:
 - name
 - roll number
 - marks
 - cgpa
 - gmail
 - branch
Use a constructor (same name as class) and `this` to assign fields.
Store at least 5 students from different branches and print them.
*/

import java.util.ArrayList;

public class snpsu {
	public static void main(String[] args) {
		ArrayList<Snpau> students = new ArrayList<>();

		students.add(new Snpsu("dayashankar", "101", 480, 9.2, "aisha.khan@example.com", "CSE"));
		students.add(new Snpsu("charan", "102", 460, 8.6, "ravi.patel@example.com", "ECE"));
		students.add(new Snpsu("darshan", "103", 440, 8.0, "meera.singh@example.com", "ME"));
		students.add(new Snpsu("darshan", "104", 425, 7.8, "john.doe@example.com", "Civil"));
		students.add(new Snpsu("clinton", "105", 470, 8.9, "liu.wei@example.com", "IT"));

		System.out.println("Stored students (different branches):\n");
		for (Snpau s : students) {
			System.out.println(s);
			System.out.println("-----------------------------");
		}
	}
}

class snpsu {
	String name;
	String rollNumber;
	int marks;
	double cgpa;
	String gmail;
	String branch;

	public snpsu (String name, String rollNumber, int marks, double cgpa, String gmail, String branch) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.cgpa = cgpa;
		this.gmail = gmail;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" +
			   "Roll No: " + rollNumber + "\n" +
			   "Branch: " + branch + "\n" +
			   "Marks: " + marks + "\n" +
			   "CGPA: " + cgpa + "\n" +
			   "Gmail: " + gmail;
	}
}
