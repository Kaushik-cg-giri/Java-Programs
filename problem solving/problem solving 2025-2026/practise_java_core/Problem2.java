package practise_java_core;


import java.util.*;
import java.util.Map.Entry;

public class Problem2 {
    public static char firstNonRepeatedChar(String str) {
    	
    	int count;
    	char val = 0;
    	char[] arr = str.toCharArray();
    	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    	
    	for(Character ch :arr) {
    		map.put(ch, map.getOrDefault(ch, 0)+1);
    	}
    	
    	for(Map.Entry<Character, Integer> itr : map.entrySet()) {
    		if(itr.getValue()==1) {
    			val=itr.getKey();
    			break;
    		}
    		else
    			val='_';
    	}
    	return val;
    }

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("First non-repeated character: " + firstNonRepeatedChar(input));
    }
}

