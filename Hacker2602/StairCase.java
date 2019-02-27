package Hacker2602;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<n-j) System.out.print(" ");
				else System.out.print("#");
			}
			
			System.out.println("");
		}
	}
	
}
