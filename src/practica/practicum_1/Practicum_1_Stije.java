package practica.practicum_1;

public class Practicum_1_Stije {
    public static void main(String[] args) {

        // Opdracht 1: Getallenlijst: For
        System.out.println("Opdracht 1: Getallenlijst: For");
        int[] nummerlijst = {1,2,3,4,5,6,7,8,9,10};
        for(int nummer : nummerlijst) {
            System.out.println("nummer: " + nummer);
        }

        // Opdracht 2: Getallenlijst: While
        System.out.println("\nOpdracht 2: Getallenlijst: While");
        int index = 1;
        while (index < 11) {
            System.out.println("index: " + index);
            index += 1;
        }

        // Opdracht 3: Random getallen
        System.out.println("\nOpdracht 3: Random getallen");
        for(int i = 1; i < 11; i++) {
            System.out.println("Random getal:" + Math.random());
        }

        // Opdracht 4: Som van gehele getallen
        System.out.println("\nOpdracht 4: Som van gehele getallen");
        int totaal = 0;
        for(int i = 0; i < 40; i++) {
            totaal +=i;
        }
        System.out.println("De som van 0 t/m 39 = " + totaal);


        // Opdracht 5: Zaagtandpatroon
        // (ik begreep de opdracht niet helemaal, wat ik hier maar gedaan heb is door een if statement het patroon
        // halverwege de lus om te draaien.
        System.out.println("\nOpdracht 5: Zaagtandpatroon");
        for(int i = 1; i < 9; i++) {
            if(i < 5) {
                System.out.println("s");
                System.out.println("ss");
            } else {
                System.out.println("ss");
                System.out.println("s");
            }
        }
    }
}
