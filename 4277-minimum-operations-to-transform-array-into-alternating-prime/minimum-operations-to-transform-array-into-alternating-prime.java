class Solution {
    public int minOperations(int[] nums) {
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++){
            int curr1 = nums[i];
            int curr2 = nums[i];

            if(i % 2 == 0){
                while(!isPrime(curr1)){
                    curr1++;
                    count1++;
                }
            } else {
                while(isPrime(curr1)){
                    curr1++;
                    count1++;
                }
            }

            if(i % 2 != 0){
                while(!isPrime(curr2)){
                    curr2++;
                    count2++;
                }
            } else {
                while(isPrime(curr2)){
                    curr2++;
                    count2++;
                }
            }
        }

        return count1;
    }

    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
