import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //wczytanie 3 liczb calkowitych i rozpoznanie, czy liczba jest parzysta
        int number;
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę");
            number = scan.nextInt();

            if(number % 2 == 0) {
                System.out.println("Liczba " + number + " jest parzysta");
            } else {
                System.out.println("Liczba " + number + " jest nieparzysta");
            }
        }
    }
}
