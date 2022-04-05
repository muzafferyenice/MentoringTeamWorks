package myAdvancedProjects;

public class NestedTernary {
    public static void main(String[] args) {
         /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        char finalNotu = 'A';
        //char finalNotu='C';
        // char finalNotu='B';
        String result = "";

        result = (finalNotu == 'A') ? "\"Gayet Basarili\"" :
                (finalNotu == 'B') ? "\"Basarili\"" :
                        (finalNotu == 'C') ? "\"Ha Gayret\"" : "Digerleri ";

        System.out.println("result = " + result);


    }
}
