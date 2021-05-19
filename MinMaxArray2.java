import java.io.*;

class GFG {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int[] arr){
        Pair minmax = new Pair();
        int length = arr.length;
        int i=2;
        if(length%2==0){
            if(arr[0]>arr[1]){
                minmax.max=arr[0];
                minmax.min=arr[1];
            }else{
                minmax.max=arr[1];
                minmax.min=arr[0];
            }
        }else{
            minmax.max=arr[0];
            minmax.min=arr[0];
        }
        
        while(i<length-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]>minmax.max){
                    minmax.max=arr[i];
                }
                if(arr[i+1]<minmax.min){
                    minmax.min=arr[i+1];
                }
            }else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i+=2;
        }
        return minmax;
    }
	public static void main (String[] args) {
		int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
	}
}
