
public class Algorithm {
	public static void main(String[] args) {
		int[] data = {6, 9, 7, 11, 5, 11, 1};
		// System.out.println(max(data));
		// System.out.println(sort(data));

	 }
	
	// public static int max (int[] a) {
	// 	int max = a[0];
	// 	for (int n : a) {
	// 		if (n > max) {
	// 			max = n;
	// 		}
	// 	}
	// 	return max;
	// }
	
	// public static int[] sort (int[] data) {
	// 	int[] sorted = new int[data.length];
		
	// 	int max = 0;
	// 	int index = 0;
		
	// 	for(int n = 0; n < data.length; n++) {
	// 		if (data[n] > max) {
	// 			max = data[n];
	// 			index = n;
	// 		}
	// 	}
	// 	sorted[index] = max;
	// 	data[index] = 0;
	// 	return sorted;
		
		
	// }
	
	// public static int[] bubbleSort (int[] data) {
	// 	for (int n = 0; n < data.length; n++) {
	// 		for (int i = 0; i < data.length - 1; i++) {
	// 			if (a[i] > )
	// 		}
	// 	}
		
	// }
	
	public static void search(String[] arr, String targetValue) {
		for (String s : arr) {
			if (s.equals(targetValue)) {
				System.out.println(s);
			} else {
				System.out.println("This string does not exist");
			}
		}
	}
}
