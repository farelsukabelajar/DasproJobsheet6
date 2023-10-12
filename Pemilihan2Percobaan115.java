import java.util.Scanner;

public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukan Tahun : ");
        int tahun = input15.nextInt();

        if ((tahun % 400) == 0) {
            if ((tahun % 100) == 0)
                System.out.print("Tahun " + tahun + " adalah Tahun Kabisat");
            else if ((tahun % 4) == 0)
                System.out.print("Tahun " + tahun + " adalah Tahun Kabisat");
        } else {
            System.out.print("Tahun " + tahun + " Bukanlah Tahun Kabisat");
        }

    }
}