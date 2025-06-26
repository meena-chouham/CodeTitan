public class q6 {
    public static int lengthOfLastWord(String s) {
        String word[] = s.split(" ");
        return word[word.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
