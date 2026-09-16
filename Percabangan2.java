import java.util.Scanner;

public class Percabanagn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Status member Anda (Gold/Silver/Bronze/Reguler): ");
        String status = input.next();

        if (status.equals("Gold") || status.equals("Silver") || status.equals("Bronze") || status.equals("Reguler")) {
            if (status.equals("Gold")) {
                System.out.println("Selamat Anda mendapat diskon sebesar 20%");
            } else if (status.equals("Silver")) {
                System.out.println("Selamat Anda mendapat diskon sebesar 10%");
            } else if (status.equals("Bronze")) {
                System.out.println("Selamat Anda mendapat diskon sebesar 5%");
            } else if (status.equals("Reguler")) {
                System.out.println("Mohon maaf Anda tidak mendapatkan diskon");
            }
        } else {
            System.out.println("Status yang Anda masukkan invalid");
        }

        System.out.println("Terimakasih sudah berbelanja");
    }
}
