class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int len=nums.length-k+1;
        int arr[]=new int[len];

        
        if ( k == 1) {
            return nums; 
        }

        for(int i=0;i<=nums.length-k;i++){
            int max=0;
            boolean cons=true;
            for(int j=i+1;j<k+i;j++){
                if(nums[j-1]!=nums[j]-1){
                    cons=false;
                    max=-1;
                    break;
                }
                if(max<nums[j] ){
                    //System.out.println(max+" nums[j] "+nums[j]);
                    max=nums[j];
                }
                

            }
            
            arr[i]=max;
        }
        return arr;
    }
}