import java.util.Scanner;

public class ScannerDemo
{
	 public static void main(String[] args)
        {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks1 value : ");
                int marks1 = sc.nextInt();
		System.out.println("Enter your marks2 value : ");
                int marks2 = sc.nextInt();
		System.out.println("Enter your marks3 value : ");
                int marks3 = sc.nextInt();

                int totalMarks = marks1 + marks2 + marks3;

                float averageMarks = (float) totalMarks/3;

                System.out.println("Marks1 are : " + marks1);
                System.out.println("Marks2 are : " + marks2);
                System.out.println("Marks3 are : " + marks3);
                System.out.println("Total Marks are : " + totalMarks);
                System.out.println("Average Marks are : " + averageMarks);
        }
}
