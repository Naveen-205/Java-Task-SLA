package task;

public class ArrayException {

	public static void main(String[] args) {
		
		try {
		 int arr[] = new int[5];
		 arr[10] = 25;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds Exception");
		}

	}

}
