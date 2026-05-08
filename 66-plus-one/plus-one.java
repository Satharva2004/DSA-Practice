class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length-1; i >= 0; i--){
            int sum = digits[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0){
            result.add(carry);
        }
        Collections.reverse(result);

        int[] res = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}