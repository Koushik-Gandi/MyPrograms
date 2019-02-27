package Hacker2602;

import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String[] args) {
		int n;
		float count=0,count1=0,count2=0;
		int[] arr=new int[100];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>=1)
				count++;
			else if(arr[i]<=-1)
				count1++;
			else count2++;
		}
		
		System.out.printf("%6f\n",count/n);
		System.out.printf("%6f\n",count1/n);
		System.out.printf("%6f\n",count2/n);
	}
	
}
