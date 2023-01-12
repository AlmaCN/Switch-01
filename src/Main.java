import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Ho chiesto all'user di inserire un numero tra 1 e 10.
         */
        System.out.println("Enter a number between 1 and 10");

        /**
         * Ho creato la variabile i di tipo int e le ho dato valore 1 per poter iniziare il loop while.
         */
        int i = 1;
        while(i > 0){

            /**
             * Ho creato uno scanner e poi ho attribuito a i la stampa del nuovo numero.
             */
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

            /**
             * Ho creato lo switch a cui ho dato come parametro i, ho usato i numero da 1 a 10 come case, e come
             * default ho usato un if che nel caso in cui l'user inserisce un numero piu piccolo di 1 o piu
             * grande di 10, stampera "Cannot give you the name.
             */
            switch (i){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    if(i < 1 || i > 10){
                        System.out.println("Cannot give you the name");
                    }
            }

            /**
             * Infine ho aggiunto i++ per far continuiare il loop di un numero alla volta.
             */
            i++;
        }

    }
}
