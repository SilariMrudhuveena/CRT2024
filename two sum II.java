class Solution {
    public int[] twoSum(int[] num, int target)
    {
        int n=num.length;
        int i=0,j=0;
        boolean flag=false;
        for ( i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                int sum=num[i]+num[j];
                if(sum==target)
                {
                    flag=true;
                    break;
                }
            }
            if(flag==true)
            break;
             }
             return new int[]{i+1,j+1};
    }
}

