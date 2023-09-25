package com.gradedproject.q2;
import java.util.Scanner;
public class ValueOfPowerN {
	static int powerOfX(int x,int n) {
		if(n==0) {
			return 1;
		}
		return x*powerOfX(x,n-1);
		                                                                                                                                                                                                                                                                                                                                                                                      
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base number X: ");
		int X = sc.nextInt();
		System.out.printf("Enter the power N = ");
		int N=sc.nextInt();
		int res=powerOfX(X,N);
		System.out.println("X power N is: "+res);
	}

}
