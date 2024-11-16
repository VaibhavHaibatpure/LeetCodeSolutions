class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        int max=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0)
            sum+=customers[i];
           
            int m=0;
            for(int j=i;j<minutes+i && i<=customers.length-minutes;j++){
                if(grumpy[j]==1)
                    m+=customers[j];
                    //System.out.println(grumpy[j]+" -- >"+customers[j]);
            }
                //System.out.println("====");
            if(max<m)
                max=m;
            

        }
        return sum+max;
    }
}