package PrefixSums;

public class Task4_MinAvgTwoSlice {
    public int solution(int[] A) {
        double minAvg = 100000;
        int index = 0;

        if (A.length <= 2) {

            return 0;
        }

        for (int i = 0; i < A.length - 2; i++) {

            if ((A[i] + A[i + 1]) / 2.0 < minAvg) {
                minAvg = (A[i] + A[i + 1]) / 2.0;
                index = i;
            }

            if ((A[i] + A[i + 1] + A[i + 2]) / 3.0 < minAvg) {

                minAvg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                index = i;
            }
        }

        int aMax = A.length - 2;

        if ((A[aMax] + A[aMax + 1]) / 2.0 < minAvg) {

            minAvg = (A[aMax] + A[aMax + 1]) / 2.0;
            index = aMax;
        }

        return index;
    }

    public static void main(String[] args) {
        Task4_MinAvgTwoSlice task4 = new Task4_MinAvgTwoSlice();
        int[] A = { 4, 2, 2, 5, 1, 5, 8 };
        int res = task4.solution(A);
        System.out.println(res);
    }
}
