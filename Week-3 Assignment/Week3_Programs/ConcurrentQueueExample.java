package Week3_Programs;

import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueExample {

	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> queue1=new ConcurrentLinkedQueue<Integer>();
		Scanner sc=new Scanner(System.in);
		/*queue1.add(10);
		queue1.add(20);
		queue1.add(30);
		queue1.add(40);
		ConcurrentLinkedQueue<Integer> queue2=new ConcurrentLinkedQueue<Integer>(queue1);
		queue2.add(50);
		
		System.out.println(queue1);
		System.out.println(queue2);*/
		
		for(int i=0;i<5;i++) {
			queue1.add(sc.nextInt());
		}
		queue1.add(sc.nextInt());
		System.out.println(queue1);
	}
	
}
