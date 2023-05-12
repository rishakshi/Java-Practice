package dataStructures.dynamicProgramming;

public class LCSubstring {

	public static int findLCSubstring(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		int[][] dp = new int[m + 1][n + 1];
		
		int max = 1;

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = 0;
				}
				
				max = Math.max(max, dp[i][j]);
			}
		}

		return max;

	} 

	public static void main(String[] args) {
		String s1 = "ABCDHG";
		String s2 = "ACDFEF";
		int lcs = findLCSubstring(s1, s2);
		System.out.println("Length of LCSubstring is " + lcs);
	}

}

