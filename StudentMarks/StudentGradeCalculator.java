import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Name   : " + name);
        System.out.println("Total  : " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade  : " + grade);

        sc.close();
    }
}
