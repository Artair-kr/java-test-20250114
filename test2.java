package test1;

public class test2 {
	public static class Solution {
		public static int[] solution(int[] array, int[][] queries) {
			// queries의 원소는 각각 하나의 query를 나타내며, [s, e] 형태다.
			for(int i = 0; i < queries.length; i++) {
				int s = queries[i][0]; // 인덱스 첫번째
				int e = queries[i][1]; // 인덱스 끝

				for(int j = s; j <= e; j++) {
					// 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 array[index]에 1을 더한다.
					array[j] += 1;
				}
			}
			//  array를 return 한다.
			return array;
	}
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4};
		int[][] queries = {{0,1},{1,2},{2,3}};
		int[] result = Solution.solution(array, queries);
		
		for(int i = 0; i < result.length; i++) { 
			System.out.print(result[i] + " "); // 1(0+1) 3(2+1) 4(3+1) 4(3+1) 4(3+1)
			}
		}
	}
}
