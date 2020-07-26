package java8Features;

import java.util.*;
import java.util.function.Predicate;

public class FindStrings {

	public static void main(String[] args) {
		
		String strArray[] = {"abc","hello","hai","ant","bat","axe","aaa","bbb"};
		List<String> strList = Arrays.asList(strArray);
		List<String> resultList = filterStringList(strList,(String str) -> str.startsWith("a")&&(str.length()==3));
		
		System.out.println(resultList);
	}
	
	public static List<String> filterStringList(List<String> list, Predicate<String> predicate)
	{
		List<String> finalList = new ArrayList<>();
		 
		for(String str : list) {
			if(predicate.test(str)) {
				finalList.add(str);
			}
		}
		
		return finalList;
	}

}
