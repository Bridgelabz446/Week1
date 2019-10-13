package Algorithm;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

public static boolean isPrime(int n){
				if(n==0||n==1){
					return false;
				}
					for(int i=2;i<n;i++){
						if(n%i==0){
							return false;
						}
					}
			return true;
			}
public static ArrayList<Integer> isPrimePallindrom(ArrayList<Integer> 
alist){
  ArrayList<Integer> blist = new ArrayList<Integer>();
				for(int i=0;i<alist.size();i++){
					int a = alist.get(i);
					int reverse=0;
					while(a>0){
						int r = a%10;
						reverse = reverse*10+r;
						a=a/10;
					}
					if(reverse==alist.get(i)){
						blist.add(reverse);
					}
					
				}
				return blist;
			

	}
public static boolean primeAnagram(Object m,Object n)
{
	String a=String.valueOf(m);
	String b=String.valueOf(n);
	char ch1[]=a.toCharArray();
	char ch2[]=b.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	if(Arrays.equals(ch1, ch2))
	{
		return true;
	}
	return false;
}
public static void binary(int[] array, int item) {
	
	int first = 0;
    int last = array.length - 1;
    while(first<=last) {
    	 
    int middle = first + (last)/2;
         while( first <= last )
         {
            if ( array[middle] < item )
              first = middle + 1;
            else if ( array[middle] == item )
            {
              System.out.println(item + " found at location " + (middle + 1) + ".");
              break;   
              
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
         }
         if ( first > last )
             System.out.println(item + " is not found.\n");
         break;
    }
    }
    
static int binarySearch(String[] arr, String x) 
{ 
    int l = 0, r = arr.length - 1; 
    while (l <= r) { 
        int m = l + (r - l) / 2; 

        int res = x.compareTo(arr[m]); 

        // Check if x is present at mid 
        if (res == 0) 
            return m; 

        // If x greater, ignore left half 
        if (res > 0) 
            l = m + 1; 

        // If x is smaller, ignore right half 
        else
            r = m - 1; 
    } 

    return -1; 
}
public static void bubbleSort(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
    	 for (int j = i+1; j < arr.length; j++) {
    		 if (arr[i] > arr[j])
             {
                 // swap temp and arr[i]
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
    	 }	
    }

    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]); 
   
    }
    
}
 
 public static void bubblesort(String[] arr,int n)  
 { 
     String temp; 

     for (int j = 0; j < n - 1; j++) 
     { 
         for (int i = j + 1; i < n; i++)  
         { 
             if (arr[j].compareTo(arr[i]) > 0) 
             { 
                 temp = arr[j]; 
                 arr[j] = arr[i]; 
                 arr[i] = temp; 
             } 
         }}
 for(int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
 }}
  
	 public static void insertionSort(int[] a){
		 int j;
		 int i;
		 for(i=1;i<a.length;i++)
		 {
		 	int temp;
		 	temp=a[i];
		 	j=i;
		 	while(j>0 && a[j-1]>temp)
		 	{
		 	a[j]=a[j-1];
		 	j=j-1;
		 	}
		 	a[j]=temp;
		 	}
		 for(i=0;i<a.length;i++) {
		 	System.out.println(a[i]+" ");}
		 	
		 }
	public static void insertionSortString(String[] a){
			String temp;
			int i;
			int j;
			for(i=1;i<a.length;i++){
				temp=a[i];
				j=i;
					while(j>0&&(a[j-1]).compareTo(temp)>0){
						a[j]=a[j-1];
					 	j=j-1;
					 	}
					 	a[j]=temp;
					 	}
					
					for(i=0;i<a.length;i++) {
					 	System.out.println(a[i]+" ");}
				}
	
	public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
	}

	
	private static boolean isPallindrome(int j) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (primeAnagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}}
	}
	
static int temperature(int tem, char t) {
	int conver;
	if (t == 'c' || t == 'C') {
		conver = (tem * 9 / 5) + 32;
	} else if (t == 'f' || t == 'F') {
		conver = (tem - 32) * 5 / 9;
	} else {
		System.out.println("Enter correct input");
		return 0;

	}
	return conver;
}
static int dayOfWeek(int d, int m, int y) {
	int y0 = y - (14 - m) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + (31 * m0) / 12) % 7;
	return d0;
}
static double monthlyPayment(double p, double y, double r) {
	double n = 12 * y;
	double r0 = r / (12 * 100);
	double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
	return payment;
}
static double sqrt(double c) {

	double t = c;
	double epsilon = 1e-15;
	while (Math.abs(t - c / t) > epsilon * t) {
		t = (c / t + t) / 2;
	}

	return t;
}/**
 * Function to convert decimal to binary d integer value to convert
*return integer array with binary digits
*/
static int[] toBinary(int d) {

	String bin = "";
	while (d != 0) {
		bin = (d % 2) + bin;
		d /= 2;
	}
	while (bin.length() % 4 != 0) {
		bin = 0 + bin;
	}
	return stringToIntArray(bin);
}

/**
* Function to convert string to int array helper function for swapnibble in
* Binary.java class
* bin String of binary no return integer array
*/
static int[] stringToIntArray(String bin) {
	int[] binary = new int[bin.length()];
	for (int i = 0; i < binary.length; i++) {
		binary[i] = bin.charAt(i) - 48;
	}
	return binary;
}

/**
* Function to convert binary to decimal
*binary the binary array to cenvert
return converted decimal no
*/
static int toDecimal(int[] binary) {
	int dec = 0, j = 0;
	for (int i = binary.length - 1; i >= 0; i--) {
		if (binary[i] == 1) {
			dec = dec + (int) Math.pow(2, j);
		}
		j++;
	}
	return dec;
}}