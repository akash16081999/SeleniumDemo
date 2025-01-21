package chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindReaptedOccurances {
	
	public static void main(String[] args) {
		
		String name="nitim";
		
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			
			reverse+=name.charAt(i);
		}
		
		if(name.equals(reverse)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not an palindrome");
		}
		
		/*
		 * String s="i am new to java java programming programming";
		 * 
		 * String[] split = s.split(" ");
		 * 
		 * Map<String, Integer> maps=new HashMap<String, Integer>(); int count=1;
		 * 
		 * for(int i=0;i<split.length;i++ ) {
		 * 
		 * if(!maps.containsKey(split[i])) { maps.put(split[i], count); }else {
		 * maps.put(split[i], maps.get(split[i])+1); } }
		 * 
		 * for (String string : maps.keySet()) { System.out.println(string
		 * +" :"+maps.get(string));
		 * 
		 * }
		 */
	}

}
