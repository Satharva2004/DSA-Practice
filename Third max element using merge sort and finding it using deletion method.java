class Solution {
    public int[] merge(int[] nums){
        if (nums.length <= 1) return nums;
        int mid = nums.length/2;
        int n = nums.length;
        int left[] = new int[mid];
        int right[] = new int[n-mid];
        
        for(int i=0;i<mid;i++){
            left[i] = nums[i];
        }
        for(int i=mid;i<nums.length;i++){
            right[i-mid] = nums[i];
        }
        
        left = merge(left);
        right = merge(right);
        return join(left, right);
    }
    public int[] join(int[] left, int[] right){
        int left_l = left.length;
        int right_l = right.length;
        int newArray[] = new int[left_l+right_l];
        int i=0,j=0,k=0;
        while(i<left_l && j<right_l){
            if(left[i]>=right[j]){
                newArray[k] = left[i];
                i++;
            }
            else{
                newArray[k] = right[j];
                j++;
            }
            k++;
        }
        for(int o=i;o<left_l;o++){
            newArray[k] = left[o];
            k++;
        }
        for(int o=j;o<right_l;o++){
            newArray[k] = right[o];
            k++;
        }
        return newArray;
        
    }
    public int thirdMax(int[] nums) {
        int sorted[] = merge(nums);
        int max = sorted[0];
        int count = 1;
        for(int i=1;i<sorted.length;i++){
            if(max > sorted[i]){
                max = sorted[i];
                count++;
            }
            if(count == 3){
                return sorted[i];
            }
        }
        return sorted[0];
    }
}
