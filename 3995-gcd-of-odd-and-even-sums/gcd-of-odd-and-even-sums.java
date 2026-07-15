class Solution {
    public int gcdOfOddEvenSums(int n) {
        int count1 = n;
        int count2 = n;
        int sumOdd = 0;
        int sumEven = 0;
        int i = 1, j = 1;
        while(count1 != 0){
            if(i%2==0){
                sumOdd += i;
                count1--;
            }
            i++;
        }
        while(count2 != 0){
            if(j%2!=0){
                sumEven += j;
                count2--;
            }
            j++;
        }
        return findGCD(sumOdd, sumEven);

    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}