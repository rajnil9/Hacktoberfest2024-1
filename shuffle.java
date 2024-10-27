class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int k=0;
        int j=n;
        int ans[] = new int[nums.length];
        while(j<nums.length)
        {
            ans[k]=nums[i];
            i++;
            k++;
            ans[k]=nums[j];
            k++;
            j++;
        }
        return(ans);
    }
}
