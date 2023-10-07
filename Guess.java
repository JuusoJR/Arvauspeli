import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String correctName = "Matti";
        String guess = "";

        System.out.println("Tervettuloa arvauspeliin!");
        do {
            System.out.println("Arvaa nimeni");
            guess = in.nextLine();

            if (guess.equalsIgnoreCase(correctName)) {

                System.out.println("Onneksi olkoon! Arvasit oikein");

            } else {
                System.out.println("Yritä uudestaan!");
            }
        } while (!guess.equalsIgnoreCase(correctName));

    }

}