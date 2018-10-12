import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scan = new Scanner(System.in);

        for(int tmp:numbers) {
            System.out.println("Podaj liczbę");
            tmp = scan.nextInt();
        }



    }
}
