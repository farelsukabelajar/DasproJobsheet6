import java.util.Scanner;

public class Pemilihan2Percobaan1 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukan Tahun : ");
        int tahun = input15.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.print("Tahun Kabisat");
        } else {
            System.out.print("Bukan Tahun Kabisat");
        }

    }
}