package test1;

public class test3 {
	public static class Solution{
		public static int solution(int number) {
			// 입력 값이 0 이하이면 0을 return
			if (number <= 0) {
				return 0;
			}
        
			int sum = 0;
        
			while (number > 0) {
				sum += number % 10; // 마지막 자릿수 더하기(나머지를 더한다.)
				number /= 10; // 마지막 자릿수 제거(10을 나눈몫을 구하기때문에 뒷자리수 하나가 사라진다.)
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		int number = 123456789;
		System.out.println(Solution.solution(number)); // 45
		int number1 = -123456789;
		System.out.println(Solution.solution(number1)); // 0
	}
}
