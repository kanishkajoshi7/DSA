int MaxR = arr[0];
        int step=  arr[0];
        int jump=1;
        int n = arr.length;
        if(n==1){
            return 0;
        }else if(arr[0]==0){
            return -1;
        }else{
            for(int i=1;i<n;i++){
              if(i==n-1){
                  return jump;
              }
              MaxR=Math.max(MaxR,arr[i]+i);   
              step--;
              if(step==0){
                  jump++;
                  if(i>=MaxR){
                      return -1;
                  }
                  step=MaxR-i;
              }
            }
            return jump;
        }
        
    }
}
