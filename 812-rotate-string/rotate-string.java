class Solution {
    public boolean rotateString(String s, String goal) {
        String hehe = s+s;
        return (s.length() == goal.length() && hehe.contains(goal));
    }
}