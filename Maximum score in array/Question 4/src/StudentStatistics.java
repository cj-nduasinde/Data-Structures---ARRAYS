
public class StudentStatistics {
	
		
	    public float AverageScore(Student[] arr, int n)
	    {
	        float sum;
	        sum = 0;
	        for (int i = 0; i <= n - 1; i++)
	            sum = sum + arr[i].score;
	        return sum/n;
	    }
	    
	    public void Display(Student[] arr, int n)
	    {
		 for (int i = 0; i < n; i++)
		 {
			 System.out.printf("%1$s %2$s %3$s", arr[i].id, arr[i].name, arr[i].score);
		     System.out.println();
		 }
	    }

	    public float  MaximumScore(Student[] arr, int n) {

		    float max = arr[0].score;
		    for (int i = 1; i < n; i++) {
		      if (arr[i].score > max)
		        max = arr[i].score;
		    }
		    return max;
}
		  

	
	
	
}


