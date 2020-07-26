package java8Features;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;

class CheckPalindrome{
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1; 
		  
        // While there are characters to compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome. 
        return true;
	}
}
public class FilterPalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strArray[] = {"abca","helloworld","amma","12321","bat","madam","aaa","bbb","cdefgh","rotor","civic","talk"};
		List<String> strList = Arrays.asList(strArray);
		List<String> palindromes = FilterPalindromes.filterPalindromes(strList,CheckPalindrome::isPalindrome);
		
		System.out.println(palindromes);
	}
	
	public static List<String> filterPalindromes(List<String> list,Predicate<String> predicate)
	{
		List<String> palindromes = new ArrayList<String>();
		for(String str : list) {
			if(predicate.test(str)) {
				palindromes.add(str);
			}
		}
		return palindromes;
		
		
	}

}
