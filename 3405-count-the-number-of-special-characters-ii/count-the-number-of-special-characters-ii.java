class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> alpha = new HashSet<>();
        Set<Character> counted = new HashSet<>();
        Set<Character> invalid = new HashSet<>();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);

            if (Character.isUpperCase(curr)) {
                char lowChar = Character.toLowerCase(curr);

                if (alpha.contains(lowChar) && !counted.contains(lowChar) && !invalid.contains(lowChar)) {
                    count++;
                    counted.add(lowChar);
                }
            } else {
                char upperChar = Character.toUpperCase(curr);

                if (alpha.contains(upperChar)) {
                    invalid.add(curr);

                    if (counted.contains(curr)) {
                        count--;
                        counted.remove(curr);
                    }
                }
            }

            alpha.add(curr);
        }

        return count;
    }
}