class Solution {
    public char kthCharacter(int k) {
        String w = "a";
        
        // Keep generating the next string until the length of the word is at least k
        while (w.length() < k) {
            w = findNextString(w);
        }
        
        // Return the k-th character (1-based index)
        return w.charAt(k - 1);
    }

    public String findNextString(String w) {
        int n = w.length();
        StringBuilder nextWord = new StringBuilder(w);

        for (int i = 0; i < n; i++) {
            char c = w.charAt(i);
            
            // If character is 'z', wrap around to 'a'
            char nextChar = (c == 'z') ? 'a' : (char) (c + 1);
            
            nextWord.append(nextChar);
        }

        return nextWord.toString();
    }
}