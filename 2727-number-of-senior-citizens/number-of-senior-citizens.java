class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i < details.length; i++){
            String person = details[i];
            if(person.charAt(11) > '6' || (person.charAt(11) == '6' && person.charAt(12) > '0')){
                count++;
            }
        }
        return count;
    }
}