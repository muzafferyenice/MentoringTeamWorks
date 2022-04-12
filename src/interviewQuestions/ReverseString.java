package interviewQuestions;

public class ReverseString extends ReverseStringde_Method{
    public static void main(String[] args) {

        String input = "All is well";
        StringBuilder str = new StringBuilder();
        str.append(input);
        StringBuilder reverse = str.reverse();
        System.out.println("reverse = " + reverse);

        System.out.println("2 yol");

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(" " + input.charAt(i));
        }
        System.out.println();
        System.out.println("3. yol");
        tersYaz(input);
    }
}


