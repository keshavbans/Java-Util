import java.util.Arrays;

public class Arrays_binarySearch_v2_Pass{
	public static void main (String args[]) {
		int[] ar = {2,4,6,8,10};
		int search = 8;
		int pos = Arrays.binarySearch(ar, 2,4, search);
		assert(pos == 4);
	}
}
