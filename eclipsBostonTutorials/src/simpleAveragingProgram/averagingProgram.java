package tutorials;
import java.util.Scanner;

public class averagingProgram {

	public static void main(String[] args) {
		// this is going to be my simple averaging program
		// create the scanner
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		System.out.println("Enter 10 numbers to be averaged: ");
		while (counter < 10) {
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/10;
		System.out.println("Your average is " + average);
	}
}
