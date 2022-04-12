package interviewQuestions;



public class ReverseStringde_Method {

    static void tersYaz(String input) {
        char []arr=input.toCharArray();//stringi karakaterlere char tipinde ayirir

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(" " + arr[i]);
        }
    }
}
