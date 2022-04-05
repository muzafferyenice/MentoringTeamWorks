package myProjects_Basic;

public class ForEachLoopString {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String each:list
             ) {
            System.out.print(each+" "+each.length()+" ");
        }
        System.out.println("kontrol sout");
        for (String each:list
        ) {
            if (each.startsWith("v")){
                break;
            }
            System.out.println(each);

        }

    }
}