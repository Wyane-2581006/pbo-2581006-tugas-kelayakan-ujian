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

        boolean a = kehadiran >= 75 && nilai_Tugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilai_Tugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilai_Tugas >= 60 || dispensasi);
        // Versi A dan B menghasilkan nilai yang sama karena && memiliki
        // prioritas lebih tinggi daripada ||.
        // Kesimpulan: && mengikat lebih kuat daripada ||.

    }
}
