public class CommandLineArgsDemo
{
	public static void main(String[] args)
	{
		int marks1 = Integer.parseInt(args[0]);
		int marks2 = Integer.parseInt(args[1]);
		int marks3 = Integer.parseInt(args[2]);

		int totalMarks = marks1 + marks2 + marks3;

		float averageMarks = (float) totalMarks/args.length;

		System.out.println("Marks1 are : " + marks1);
		System.out.println("Marks2 are : " + marks2);
		System.out.println("Marks3 are : " + marks3);
		System.out.println("Total Marks are : " + totalMarks);
		System.out.println("Average Marks are : " + averageMarks);
	}
}
