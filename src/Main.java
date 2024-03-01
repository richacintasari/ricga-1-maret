import java.sql.SQLOutput;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String Name;
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        System.out.println("Masukkan Nama :");
        String Name=objInput.nextLine();

        System.out.println("Masukkan jenis kelamin (P/L:");
        char jenisKelamin = objInput.next().charAt(0);
        String jenisKelaminStr = jenisKelamin == 'P' || jenisKelamin == 'p' ? "Perempuan" : "laki-laki";

        System.out.println("Masukkan tanggal lahir (YYYY-MM-DD):");
        String tanggalLahirStr = objInput.next();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, sekarang);
        int umur = selisih.getYears();

        System.out.println("\nData diri :");
        System.out.println("Nama :" + Name);
        System.out.println("Jenis Kelamin :" + jenisKelaminStr);
        System.out.println("Tanggal Lahir :" + tanggalLahir);
        System.out.println("Umur :" + umur + "tahun");

        objInput.close();
    }
}