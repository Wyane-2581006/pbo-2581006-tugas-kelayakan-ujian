import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kehadiran (%)   : ");
        double kehadiran = scanner.nextDouble();

        System.out.print("Nilai Tugas     : ");
        double nilai_Tugas = scanner.nextDouble();

        System.out.print("Dispensasi      : ");
        boolean dispensasi = scanner.nextBoolean();


    }
}
