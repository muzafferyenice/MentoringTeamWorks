package interviewQuestions;

public class PalindromesFather {

   protected static void palindromeWithStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String tersStr=sb.reverse().toString();
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("polindrome dur father "+tersStr);
        }else System.out.println("palindrome degil father "+tersStr);
    }

    protected static void palindromeWithFoorLoop(String str) {
        String ters="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ters+=str.charAt(i);
        }
        // System.out.print(ters);
        if (ters.equalsIgnoreCase(str)){
            System.out.println("bu polindrome  " +ters);
        }else System.out.println("palindrome degil "+ters);
    }

}
