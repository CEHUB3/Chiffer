import java.util.Scanner;

public class Crypt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            // anropa metod att skriva ut meny.
            printMenu();
            // while (input.hasNext()) {
            // input.next();
            // }
            //while (!input.hasNextLine()){}
            // int val = input.nextInt();
            //String text3 = input.nextLine();
            // while (input.hasNext()) {
            // input.next();
            int val = input.nextInt();
            if (val == 3) {
                break;
            }

            // System.out.println(val);
            switch (val) {
                case 1:
                    System.out.print("Ange sträng att kryptera: ");
                    String text = input.nextLine();
                    // Anropa krypteringsmetod:
                    String krypterad = kryptera(text);
                    System.out.println("krypterad sträng: " + krypterad);
                    break;

                case 2:
                    System.out.print("Ange sträng att dekryptera: ");
                    String text2 = input.nextLine();
                    // Anropa dekrypteringsmetod:
                    String dekrypterad = dekryptera(text2);
                    System.out.println("Sträng dekrypterad: " + dekrypterad);
                    break;
            }
            //input.close();
        }
        // System.out.println("Tack och välkommen åter");   
    }




    // Meny
    public static void printMenu() {

        System.out.println("Välj operation: ");
        System.out.println("1. Kryptera en sträng");
        System.out.println("2. Dekryptera en sträng.");
        System.out.println("3. Avsluta program.");
    }

    // Krypteringsmetod:
    public static String kryptera(String text) {
        String krypt = "";
        System.out.println("enter kryptera" + text);
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            switch (c) {
                case 'x':
                    c = 'a';
                case 'y':
                    c = 'b';
                case 'z':
                    c = 'c';
                case 'X':
                    c = 'A';
                case 'Y':
                    c = 'B';
                case 'Z':
                    c = 'C';
                default:

                    int tal = (int) c;
                    char k = (char) (tal + 3);
                    krypt = krypt + k;
                    //krypt = krypt + String.valueOf(k);

            }
        }
        return krypt;
    }

    // Dekrypteringsmetod
    public static String dekryptera(String text2) {
        String dekrypt = "";

        int length = text2.length();

        for (int i = 0; i < length; i++) {

            char c = text2.charAt(i);
            switch (c) {
                case 'a':
                    c = 'x';
                case 'b':
                    c = 'y';
                case 'c':
                    c = 'z';
                case 'A':
                    c = 'X';
                case 'B':
                    c = 'Y';
                case 'C':
                    c = 'Z';
                default:
                    int j = (int) c;
                    char n = (char) (j - 3);
                    dekrypt = dekrypt + String.valueOf(n);

            }
        }
        return dekrypt;
    }

}