class Solution {
    public int[] sortArray(int[] nums) {
        return divide(nums);
    }
    public int[] divide(int[] nums){
        int[] temp = nums;
        int length = temp.length;
        if(length<2) return nums;
        int mid = length/2;
        int left[] = new int[mid];
        int right[] = new int[length-mid];
        for(int i=0;i<left.length;i++){
            left[i] = temp[i];
        }
        for(int i=mid;i<length;i++){
            right[i-mid] = temp[i];
        }
        left = divide(left);
        right = divide(right);
        
        return join(left, right);
    }
    public int[] join(int[] left, int[] right){
        int l_length = left.length;
        int r_length = right.length;
        int newArray[] = new int[l_length+r_length];
        int i=0,j=0,k=0;
        while(i<l_length&&j<r_length){
            if(left[i] <= right[j]){
                newArray[k] = left[i];
                i++;
            }
            else{
                newArray[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<l_length){
            newArray[k] = left[i];
            i++;
            k++;
        }
        while(j<r_length){
            newArray[k] = right[j];
            j++;
            k++;
        }
        return newArray;
    }
}
