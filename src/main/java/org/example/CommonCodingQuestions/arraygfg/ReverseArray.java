package org.example.CommonCodingQuestions.arraygfg;

public class ReverseArray {

        static void printArray(int ans[], int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
        }
        public void reverse(int[] arr, int n) {
            int[] revArr = new int[n];
            for(int i=0; i<=n/2; i++){
                //exchange
                int currentVal = arr[i];
                revArr[i] = arr[(n-1)-i];
                revArr[(n-1)-i] = currentVal;
            }

            printArray(revArr, n);

        }

    public static void main(String[] args) {
            new ReverseArray().
        reverse(new int[]{1, 2, 3, 4, 5},5);
    }


}
