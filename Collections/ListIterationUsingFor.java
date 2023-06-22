import java.util.List;
import java.util.ArrayList;

public class ListIterationUsingFor
{
	public static void main(String[] args)
	{
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(23);
		arrayList.add(24);
		arrayList.add(25);

		for(int i=0; i<arrayList.size(); i++)
		{
			System.out.println("Value at index "+i+ " is : "+ arrayList.get(i));
		}

	}
}

