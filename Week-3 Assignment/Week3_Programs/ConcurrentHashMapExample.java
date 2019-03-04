package Week3_Programs;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
	ConcurrentMap<Integer, String> customer=new ConcurrentHashMap<Integer, String>();
	Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			customer.put(sc.nextInt(), sc.next());
			}
		for(Map.Entry<Integer, String> entry:customer.entrySet() ) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
