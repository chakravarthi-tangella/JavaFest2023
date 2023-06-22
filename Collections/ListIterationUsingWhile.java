import java.util.List;
import java.util.ArrayList;

public class ListIterationUsingWhile
{
	public static void main(String[] args)
	{
		List<Integer> arrayList = new ArrayList<>();

		arrayList.add(31);
		arrayList.add(32);
		arrayList.add(33);
		arrayList.add(34);
		arrayList.add(35);

		int i = 0;
		while(i<arrayList.size())
		{
			System.out.println("Value at index " + i + " is : " + arrayList.get(i));
			i++;
		}

	}
}

