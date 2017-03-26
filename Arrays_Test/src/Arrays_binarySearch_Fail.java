import java.util.Arrays;

public class Arrays_binarySearch_Fail{
	public static void main (String args[]) {
		int[] ar = {2,4,6};
		int pos = Arrays.binarySearch(ar, 2);
		assert(pos == 1);
	}
}
