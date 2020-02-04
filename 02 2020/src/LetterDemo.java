import java.util.Stack;

public class LetterDemo {
        public String reverseOnlyLetters(String S) {
            Stack<Character> letters;
            letters = new Stack();
            for (char c: S.toCharArray())
                if (Character.isLetter(c))
                    letters.push(c);

            StringBuilder ans = new StringBuilder();
            for (char c: S.toCharArray()) {
                if (Character.isLetter(c))
                    ans.append(letters.pop());
                else
                    ans.append(c);
            }

            return ans.toString();
        }
}

