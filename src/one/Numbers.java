package one;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość liczb, które chcesz zsumować");
        int numbers = scanner.nextInt();

        int sum = 0;

        while (numbers-- > 0) {
            System.out.println("podaj kolejną liczbę");
            sum = sum + scanner.nextInt();
        }

        System.out.println(sum);

    }
}
