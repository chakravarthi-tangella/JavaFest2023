import java.util.Arrays;

public class StringsDemo
{
	public static void main(String[] args)
	{
		String name = "Hello Java!";

		// contains()
		System.out.println("does name contains Java : " + name.contains("Java"));

		//startsWith(String)
		System.out.println("Does name starts with character 'H' - " + name.startsWith("H"));

		//endsWith(String)
		System.out.println("Does name ends with character '!' - " + name.endsWith("!"));

		//equals(String)
		System.out.println("Does value of name equals to 'Hello Java!' - " + name.equals("Hello Java!"));
		//equalsIgnoreCase()
		System.out.println("Does value of name equals to 'hElLo jAVa!' by ignoring case = " + name.equalsIgnoreCase("hElLo jAVa!"));

		//trim()
		String place = "  Goa    ";
	  	System.out.println("Value of place before using trim() - " + place);
		System.out.println("Value of place after using trim() - " + place.trim());

		//split()
		String[] splitName = name.split(" ");
		System.out.println("Using split() to split name at ' ' character - " + Arrays.toString(splitName));

		//toUpperCase()
		System.out.println("Converting name to uppercase : " + name.toUpperCase());

		//toLowerCase()
                System.out.println("Converting name to lowercase : " + name.toLowerCase());

		//replace(old Char, new Char)
		System.out.println("Replacing the occurance of e with a - " + name.replace('e', 'a'));
	}

}

