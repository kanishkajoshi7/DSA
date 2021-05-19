class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int k=-1;
        int temp;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                k++;
                temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                k=i-1;
                break;
            }
        }
        for(int i=k+1;i<n;i++){
            if(a[i]==1){
                k++;
                temp=a[i];
                a[i]=a[k];
                a[k]=temp;
               
            }
        }
    }
}
