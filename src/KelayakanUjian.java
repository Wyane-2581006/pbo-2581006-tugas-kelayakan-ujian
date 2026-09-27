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
        // &&: hasil bernilai true jika kedua kondisi bernilai true.
        // ||: hasil bernilai true jika salah satu atau kedua kondisi bernilai true.
        // Kesimpulan: && mengikat lebih kuat daripada ||.

        //pembuktian short-circuit
        int cek = 0;
        //jika cek bertambah menjadi 1 itu berarti short circuit tidak berjalan
        boolean x = (kehadiran >= 75) && (cek++ >= 0);
        //Saat di run saya menggunakan angka kehadiran 60 sehingga
        // kehadiran = 60, sehingga kehadiran >= 75 bernilai false.
        // Karena menggunakan &&, kondisi kedua tidak diperiksa lagi (short-circuit).
        // Akibatnya cek++ tidak dijalankan dan cek tetap 0.
        // Jika kehadiran kurang dari 75, kondisi pertama bernilai false.
        // Karena menggunakan &&, kondisi kedua tidak diperiksa lagi (short-circuit).
        // Akibatnya cek++ tidak dijalankan dan cek tetap 0.

        boolean y = (nilai_Tugas >= 60) || (cek++ >= 0);
        //Saat di run saya menggunakan nilai tugas 80 sehingga
        // nilai_Tugas = 80, sehingga nilai_Tugas >= 60 bernilai true.
        // Karena menggunakan ||, kondisi kedua tidak diperiksa lagi (short-circuit).
        // Akibatnya cek++ tidak dijalankan dan cek tetap 0.
        // Jika nilai tugas minimal 60, kondisi pertama bernilai true.
        // Karena menggunakan ||, kondisi kedua tidak diperiksa lagi (short-circuit).
        // Akibatnya cek++ tidak dijalankan dan cek tetap 0.

        System.out.println("==== KELAYAKAN UJIAN ====");
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Nilai Tugas : " + nilai_Tugas);
        System.out.println("Dispensasi : " + dispensasi);
        System.out.println("a (tanpa kurung)      : " + a);
        System.out.println("b (kurung precedence) : " + b);
        System.out.println("c (kurung digeser)    : " + c);
        System.out.println("!dispensasi           : " + !dispensasi);
        System.out.println("cek dipanggil         : " + cek);
    }
}
