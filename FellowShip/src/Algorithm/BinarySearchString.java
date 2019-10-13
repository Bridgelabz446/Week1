package Algorithm;

public class BinarySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "contribute", "geeks", "ide", "practice"}; 
        String x = "practice"; 
	int result =Utility.binarySearch(arr,x);
		if(result ==-1)
			System.out.println("String is not found");
	
	else 
		System.out.println("String found at index ===>>> "+result);
	
	}

}