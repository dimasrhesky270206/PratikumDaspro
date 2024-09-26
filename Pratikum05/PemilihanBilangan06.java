import java.util.Scanner;
/**
 * PemilihanBilangan06
 */
public class PemilihanBilangan06 {

    public static void main(String[] args) {
        // Deklarasi scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();

        // Memanfaatkan ternary operator untuk menentukan genap atau ganjil
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";
        
        // Menampilkan hasil
        System.out.println(hasil);

        // Menutup scanner
        sc.close();
    }
}
