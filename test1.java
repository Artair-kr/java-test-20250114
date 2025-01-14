package test1;

public class test1 {

    public static class Solution {
        public static int solution(int[] numList) {
            // 배열을 순차적으로 탐색하여 음수를 찾음
            for (int i = 0; i < numList.length; i++) {
                if (numList[i] < 0) {
                    return i;  // 첫 번째 음수의 인덱스를 반환
                }
            }
            return -1;  // 음수가 없으면 -1 반환
        }
    }

    public static void main(String[] args) {
        int numList[] = {12, 4, 15, 46, 38, -2, 15}; 
        System.out.println(Solution.solution(numList));
        int numList1[] = {13, 22, 53, 24, 15, 6}; 
        System.out.println(Solution.solution(numList1));
    }
}