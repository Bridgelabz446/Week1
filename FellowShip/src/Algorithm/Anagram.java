package Algorithm;

import java.util.Arrays;

public class Anagram {
	public static boolean CheckAnagram( String str, String str1)
	{
		char [] ch=str.toCharArray();
		char [] ch1=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1)) {
			return true;
		}else {
			return false;
		}
		 
		}

	
	}

