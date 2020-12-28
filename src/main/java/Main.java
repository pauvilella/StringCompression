import java.util.*;

public class Main {
    String input = "aabcccccaaa";

    String compressString(String sentence) {
        StringBuilder compressed = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            int j = i;
            int count = 0;
            while (j < sentence.length() && sentence.charAt(j) == letter) {
                count++;
                j++;
            }
            i = j - 1;
            compressed.append(letter);
            compressed.append(count);
        }

        if (compressed.length() < sentence.length()) {
            return compressed.toString();
        }

        return sentence;
    }

    public static void main(String[] args) {
        Main program = new Main();
        String result = program.compressString(program.input);
        System.out.println(result);
    }
}
