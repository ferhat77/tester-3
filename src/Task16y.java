import java.util.Scanner;

public class Task16y {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi girin: ");
        int sayi = input.nextInt();

        String result = (sayi > 0 ? (sayi > 10 ? "buyuksun" : "normalsin") : (sayi > -10 ? "negatifsin" : "cok negatifsin"));
        System.out.println(result);

        System.out.println("*****  if  çözümü  *****");

        if (sayi > 0) {
            System.out.println("positive sayı");
            if (sayi > 10) {
                System.out.println("Buyuksun");

            }
            if (sayi < 10 && sayi > 0) {
                System.out.println("Normalsin");
            }


        } else System.out.println("negatif sayı");
        if (sayi >= -10 && sayi < 0) {
            System.out.println("negatifsin");
        }
        if (sayi < -10) System.out.println("cok negatifsin");

    }
}
