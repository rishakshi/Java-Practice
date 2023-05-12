package dataStructures.dynamicProgramming;

import java.util.Arrays;

public class fibonnacciSeries {
	
	public static boolean checkPrime2(int n)
	{
	    for (int i = 2; i * i <= n; i++)
	    {
	        if (n % i == 0)
	        {
	            return false;
	        }
	    }

	    return true;
	}

	// 2 * 6 = 12
	// 6 * 2 = 12

	public static boolean checkPrime(int n)
	{
	    for (int i = 2; i < n; i++)
	    {
	        if (n % i == 0)
	        {
	            return false;
	        }
	    }

	    return true;
	}
	
	public static int fibo(int n, int[] dp) {
		if(n==1 || n==0) {
			return n;
		}
		
		if(dp[n-1] != -1) {
			return dp[n-1];
		}
		
		return dp[n-1] = fibo(n-1, dp) + fibo(n-2, dp);
		
	}
	
	public static void main(String[] args) {
		
		int n = 100;
		int[] dp = new int[n+1];
		
		
		
		Arrays.fill(dp, -1);
		
		int a=0, b=1, c = 0;
		
		for(int i=2; i<=n; i++) {
			c = a+b;
			a=b;
			b=c;
		}
		
		System.out.println("C : " + c);
		
		int ans = fibo(n, dp);
		System.out.println("dp : " + ans);
		
	}

}

//fib(n) = fib(n-1) + fib(n-2)


//dp -> top down apporach

//bottom up -> space optimised
