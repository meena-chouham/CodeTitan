import java.util.*;

public class q2 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> mapCharToWord = new HashMap<>();
        Map<String, Character> mapWordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (mapCharToWord.containsKey(ch)) {
                if (!mapCharToWord.get(ch).equals(word)) return false;
            } else {
                if (mapWordToChar.containsKey(word)) return false;
                mapCharToWord.put(ch, word);
                mapWordToChar.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s)); // true
    }
}
