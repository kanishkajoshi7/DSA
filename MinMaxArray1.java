class GFG {
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int[] arr){
        Pair minmax = new Pair();
        int length = arr.length;
        if(length==1){
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }
        if(arr[0]>arr[1]){
            minmax.min=arr[1];
            minmax.max=arr[0];
        }else{
            minmax.min=arr[0];
            minmax.max=arr[1];
        }
        for(int i=2;i<length;i++){
            if(arr[i]<minmax.min){
                minmax.min=arr[i];
            }else if(arr[i]>minmax.max){
                minmax.max=arr[i];
            }
        }
        return minmax;
    }
	public static void main (String[] args) {
		int arr[] = {1000, 11, 445};
        int arr_size = 6;
        Pair minmax = getMinMax(arr);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
	}
}
