class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans,max,min,i;
        ans=arr[n-1]-arr[0];
        
        for(i=1;i<n;i++){
            if(arr[i]>=k){
                max=Math.max(arr[n-1]-k,arr[i-1]+k);
                min=Math.min(arr[0]+k,arr[i]-k);
                ans=Math.min(ans,(max-min));
            }
        }
        return ans;
    }
}
