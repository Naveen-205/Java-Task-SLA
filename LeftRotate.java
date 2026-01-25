package task;

public class LeftRotate {
	static void rev(int[] arr, int l, int r) {
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++; r--;
        }
    }
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);
        rev(arr, 0, n - 1);
    }
	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 4, 5};
	        int k = 2;
	        leftRotate(arr, k);
	        for (int x : arr)
	            System.out.print(x + " ");

	}

}
