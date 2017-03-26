import java.util.Arrays;

public class Arrays_binarySearch_v3_Fail{
	public static void main (String args[]) {
		char[] ar = {'a','b','c','d','e'};
		char search = 'c';
		int pos = Arrays.binarySearch(ar, search);
		assert(pos == 1);
	}
}
