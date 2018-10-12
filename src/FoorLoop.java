public class FoorLoop {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // deklaracja tablicy

        //uzupelnienie tablicy
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        //int i - licznik pętli
        // i < numbers.length - warunek stopu; zwraca true lub false; czy licznik petli jest mniejszy od rozmiaru tablicy?; petla konczy sie gdy spotka false;
        // modyfikacja licznika;

        //wyswietlenie tablicy
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[2]);


    }
}
