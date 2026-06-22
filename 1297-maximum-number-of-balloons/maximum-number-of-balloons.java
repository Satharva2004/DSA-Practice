class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
        }
        
        String n = "balloon";int minBalloons = Integer.MAX_VALUE;
        for(int i = 0; i < n.length(); i++){
            if(!map.containsKey(n.charAt(i))){
                return 0;
            }
        }
        for(int i = 0; i < n.length(); i++){
            int count = map.get(n.charAt(i));
            if (n.charAt(i) == 'l' || n.charAt(i) == 'o') {
                minBalloons = Math.min(minBalloons, count / 2);
            } else {
                minBalloons = Math.min(minBalloons, count);
            }
        }
        return minBalloons;
    }
}