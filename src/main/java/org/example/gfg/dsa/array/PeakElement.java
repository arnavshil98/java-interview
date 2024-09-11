package org.example.gfg.dsa.array;

public class PeakElement {
    public int peakElement(int[] arr,int n)
    {
        //add code here.

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return arr[0] >= arr[1] ? 0 : 1;
        }
        int index = 0;

        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[0]>=arr[1]){
                    index =  0;
                    break;
                }
            }
            else if(i<n-1){
                if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                    index =  i;
                    break;
                }
            }

            else if(i==n-1){
                if(arr[i]>=arr[i-1]){
                    index =  i;
                    break;
                }
            }else{
                index = -1;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        PeakElement element = new PeakElement();
        int[]arr = {1,9};
       int index =  element.peakElement(arr, arr.length);
        System.out.println(index);
    }
}
