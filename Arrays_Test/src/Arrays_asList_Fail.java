import java.util.Arrays;
import java.util.List;

public class Arrays_asList_Fail{
	public static void main (String args[]) {
		
		Integer ar[] = new Integer[] {1, 2, 3};
		List<Integer> l1 = Arrays.asList(ar);
		Integer check = l1.get(1);
		assert(check == 3);
		System.out.println(check);
	}
}
