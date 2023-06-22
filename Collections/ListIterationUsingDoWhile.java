import java.util.List;
import java.util.ArrayList;

public class ListIterationUsingDoWhile
{
	public static void main(String[] args)
	{
		List<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(41);
		arrayList.add(42);
		arrayList.add(43);
		arrayList.add(44);
		arrayList.add(45);

		int i = 0;

		do
		{
			System.out.println("Value at index " + i + " is : " + arrayList.get(i));
			i++;
		}
		while(i<arrayList.size());
	}
}

		
