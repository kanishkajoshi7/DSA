import java.io.*;

class GFG {
    static void swap(int[] arr){
        int k=-1;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                k++;
                temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                
            }
            
        }
    }
	public static void main (String[] args) {
	     int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
         swap(arr);
         int n = arr.length;
         for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}
}
//........................................................................OR.................................................................................


import java.io.*;

class GFG {
    static void swap(int[] arr){
     int left=0;
     int right=arr.length -1;
     while(left<=right){
         if(arr[left]<0 && arr[right]<0){
             left++;
         }else if(arr[left]>0 && arr[right]<0){
             int temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
             left++;
             right--;
         }else if(arr[left]>0 && arr[right]>0){
             right--;
         }else{
             left++;
             right--;
         }
     }
    }
	public static void main (String[] args) {
	     //int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
	     int[] arr = { -12, 11, -13, -5,
                   6, -7, 5, -3, 11 };
              
         swap(arr);
         int n = arr.length;
         for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}
}
