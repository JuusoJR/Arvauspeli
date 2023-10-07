import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Tervettuloa arvauspeliin!");
        System.out.println("Arvaa nimeni");

        String correctName = "Matti";
        String guess = "";

        do {
            
            guess = in.nextLine();

            if (guess.equalsIgnoreCase(correctName)) {

                System.out.println("Onneksi olkoon! Arvasit oikein");

            } else if (guess.equals("")) {
                System.out.println("Puhu kovempaa! En kuule!");
            }
             else {
                System.out.println("Yritä uudestaan!");
            }
        } while (!guess.equalsIgnoreCase(correctName));

    }

}