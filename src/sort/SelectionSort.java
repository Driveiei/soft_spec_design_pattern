package sort;
import java.util.Comparator;

public class SelectionSort {

	

	
//	public static void sort(int[] a) {
//		// i divides array into two parts: already-sorted, not sorted
//		for (int i = 0; i < a.length - 1; i++) {
//			int minPos = i;
//
//			// loop to find index containing a minimum value
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[j] < a[minPos]) {
//					minPos = j;
//				}
//			}
//			// swap minPos and i so that data in minPos index will
//			// be the already-sorted part
//			int temp = a[minPos];
//			a[minPos] = a[i];
//			a[i] = temp;
//		}
//	}
	
	public static void sort(Object[] a,Comparator comp) {
		// i divides array into two parts: already-sorted, not sorted
		for (int i = 0; i < a.length - 1; i++) {
			int minPos = i;

			// loop to find index containing a minimum value
			for (int j = i + 1; j < a.length; j++) {
				if (comp.compare(a[j],a[minPos]) < 0) {
					minPos = j;
				}
			}
			// swap minPos and i so that data in minPos index will
			// be the already-sorted part
			Object temp = a[minPos];
			a[minPos] = a[i];
			a[i] = temp;
		}
	}
	

}
