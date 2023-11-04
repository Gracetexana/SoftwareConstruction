package homework5;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */
public class Problem6 {
    /**
     * demonstrates the function palindrome() using the example String "A man, a plan, a canal, Panama" (my grandpa's favorite palindrome)
     * @param args
     */
    public static void main(String[] args){
        System.out.println(palindrome("A man, a plan, a canal, Panama"));
    }

    /**
     * checks whether sentence is a palindrome
     * @param sentence is the String being tested for the same forward and backward reading
     * @return true if sentence is a palindrome or false otherwise
     */
    public static boolean palindrome(String sentence){
        sentence = sentence.strip().toLowerCase().replaceAll("\\p{Punct}", "").replaceAll(" ", "");
        char firstChar = sentence.charAt(0);
        int lastIndex = sentence.length() - 1;
        char lastChar = sentence.charAt(lastIndex);

        switch (sentence.length()){
            case 0: return true;
            case 1: return true;
            default:
                if (firstChar == lastChar){
                    return palindrome(sentence.substring(1, lastIndex));
                } else{
                    return false;
                }
        }
    }
}
