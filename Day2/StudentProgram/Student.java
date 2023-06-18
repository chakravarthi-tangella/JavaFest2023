public class Student
{
	public static void main(String... args)
	{
		int marks1 = 50;
		int marks2 = 60;
		int marks3 = 70;

		int totalMarks = marks1+marks2+marks3;

		float averageMarks = (float) totalMarks/3;

		System.out.println("Total Marks of the student are : " + totalMarks);
		System.out.println("Average Marks of the student are : " + averageMarks);
	}
}
