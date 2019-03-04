package Week3_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetElementHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> element=new HashMap<Integer, String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			element.put(sc.nextInt(), sc.next());
		}
		for(Map.Entry set:element.entrySet())
		System.out.println(set.getKey()+" "+set.getValue());
		
		
		System.out.println("value is :"+element.get(sc.nextInt()));
	}
	
}
