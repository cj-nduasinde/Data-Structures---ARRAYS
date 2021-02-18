

	import java.util.Random;
	public class MaximumNumber {
	  static int arr[];

	  // Method to find maximum in arr[]
	  static int largest() {
	    int i;

	    // Initialize maximum element
	    int max = arr[0];
	    // Traverse array elements from second and
	    // compare every element with current max
	    for (i = 1; i < arr.length; i++)
	      if (arr[i] > max)
	        max = arr[i];

	    return max;
	  }

	  // Driver method
	  public static void main(String[] args) {
	    Random rand = new Random();
	    arr = new int[100];
	    for (int i = 0; i < 100; i++){
	      arr[i] = rand.nextInt();
	    }
	    System.out.println("Largest in given array is " + largest());
	  }
	}
	


