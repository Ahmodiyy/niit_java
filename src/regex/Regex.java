package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static void acceptVowel(){
        Pattern pattern = Pattern.compile("[aeiou]"); // input consonant letter
        Matcher matcher = pattern.matcher("a");
        System.out.println("accept vowel letter: " +matcher.matches());
    }
    static void acceptConsonant(){
        Pattern pattern = Pattern.compile("[^aeiou]"); // input consonant letter
        Matcher matcher = pattern.matcher("c");
        System.out.println("accept consonant letter: " + matcher.matches());


    }
    static void acceptAlphabet(){
        Pattern pattern = Pattern.compile("[A-Za-z]"); // input consonant letter
        Matcher matcher = pattern.matcher("C");
        System.out.println("accept alphabet: " + matcher.matches());
    }

    static void acceptUnion(){
        Pattern pattern = Pattern.compile("[b-e[n-q]]"); // input consonant letter
        Matcher matcher = pattern.matcher("m");
        System.out.println("accept union letter: " + matcher.matches());
    }

    static void acceptException(){
        Pattern pattern = Pattern.compile("[a-z&&[^bcd]]"); // input consonant letter
        Matcher failMatcher = pattern.matcher("d");
        Matcher passMatcher = pattern.matcher("m");
        System.out.println("accept union letter: " + failMatcher.matches());
        System.out.println("accept union letter: " + passMatcher.matches());
    }
    static void acceptKnowledge(){
        Pattern pattern = Pattern.compile("[a-z&&[abc]]"); // input consonant letter
        Matcher failMatcher = pattern.matcher("e");
        Matcher passMatcher = pattern.matcher("a");
        System.out.println("accept union letter: " + failMatcher.matches());
        System.out.println("accept union letter: " + passMatcher.matches());
    }
    static void acceptEndingWithAt(){
        Pattern pattern = Pattern.compile("[abc]at"); // input consonant letter
        Matcher failMatcher = pattern.matcher("d");
        Matcher passMatcher = pattern.matcher("cat");
        System.out.println("accept union letter: " + failMatcher.matches());
        System.out.println("accept union letter: " + passMatcher.matches());
    }
    static void acceptQuantifierQuestion(){
        Pattern pattern = Pattern.compile("[0-9]{11}"); // input consonant letter
        Matcher failMatcher = pattern.matcher("0000000000088888888888");
        Matcher passMatcher = pattern.matcher("09094459999");
        System.out.println("accept union letter: " + failMatcher.matches());
        System.out.println("accept union letter: " + passMatcher.matches());
    }
    public static void main(String[] args) {
//        acceptVowel();
//        acceptConsonant();
//        acceptAlphabet();
//        acceptUnion();
  //      acceptException();
    //    acceptKnowledge();
  //      acceptEndingWithAt();
        acceptQuantifierQuestion();
    }
}
