import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        Float totalSudut;

        System.out.print("Masukan Sudut 1 : ");
        Float sudut1 = input15.nextFloat();
        System.out.print("Masukan Sudut 2 : ");
        Float sudut2 = input15.nextFloat();
        System.out.print("Masukan Sudut 3 : ");
        Float sudut3 = input15.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga Tersebut adalah Segitiga Siku-Siku");
            else
                System.out.println("Segitiga Tersebut Bukan Segitiga Siku-Siku");
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
