package task;
public class RotateBoth {
	static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++)
                arr[j] = arr[j + 1];
            arr[n - 1] = first;
        }
    }
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--)
                arr[j] = arr[j - 1];
            arr[0] = last;
        }
    }
	public static void main(String[] args) {
		
		 int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {1, 2, 3, 4, 5};
	        int k = 2;

	        leftRotate(arr1, k);
	        rightRotate(arr2, k);

	        System.out.print("Left Rotate: ");
	        for (int x : arr1) System.out.print(x + " ");

	        System.out.print("\nRight Rotate: ");
	        for (int x : arr2) System.out.print(x + " ");
	}

}
