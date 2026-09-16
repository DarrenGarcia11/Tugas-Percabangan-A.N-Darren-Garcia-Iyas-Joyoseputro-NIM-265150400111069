import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        if (nilai > 100 || nilai < 0) {
            System.out.println("Nilai yang Anda masukkan Invalid");
        } else if (nilai >= 85 && nilai <= 100) {
            System.out.println("Selamat Anda mendapat predikat A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Selamat Anda mendapat predikat B");
        } else if (nilai >= 55 && nilai <= 69) {
            System.out.println("Anda mendapat predikat C");
        } else if (nilai >= 40 && nilai <= 54) {
            System.out.println("Anda mendapat predikat D");
        } else if (nilai >= 0 && nilai <= 84) {
            System.out.println("Anda mendapat predikat E");
        }

    }
}
