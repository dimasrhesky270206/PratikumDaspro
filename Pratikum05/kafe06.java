import java.util.Scanner;
import javax.sql.rowset.spi.SyncFactoryException;

/** 
 * kafe06
 */
public static void main(String[] args) {
    //Deklarasi scanner 
    Scanner sc = new Scanner(System.in);

    //Deklarasikan Variable untuk menyimpan nilai input
    String menu;
    char ukuranCup;
    int jumlah;
    boolean keanggotaan;

    //perintah untuk membaca input kemudian meyimpanya ke dalam variable
    System.out.print("Masukan menu: ");
    menu = sc.nextLine();
    System.out.print("Masukan ukuran cup (S/M/L): ");
    ukuranCup = sc.nextLine().charAT(index:0);
    System.out.print("Masukkan jumlah");
    jumlah = sc.nextInt();
    System.out.print("Masukkan keanggotaan (true/false) ");
    keanggotaan = sc.nextBoolean();

//Tentukan harga menu dengan switch-case
double hargaMenu = 0;

switch (menu.toLowerCase()) {
    case "kopi":
        hargaMenu = 12000;
        break;
    case "teh":
        hargaMenu = 7000; // Tambahkan titik koma di sini
        break;
    case "coklat":
        hargaMenu = 20000;
        break;
    default:
    System.out.println("Menu tidak valid");
    sc.close();
    return; //keluar dari program jika menu tidak valid
}

}
//Hitung total harga
double totalHarga = hargaMenu * jumlah;

// Update total harga berdasarkan ukuran cup yang dipilih
switch(ukuranCup) {
    break; // Tidak ada penambahan warga
case 'M':
    totalHarga += 0.25 * totalHarga;//25% tambahan
    break;
case 'L':
    totalHarga += 0.4 * totalHarga;// 40% tambahan
    break;
default:
    System.out.println(x:"Ukuran cup tidak valid");
    sc.close();
    return;// keluar dari program jika ukuran cup tidak valid 
    }
double diskon = keanggotaan ?0.1 :0;//Diskon 10% untuk anggota
double nominalBayar = totalHarga -(diskon* totalHarga);

//menampilkan hasil
System.out.print("Item pembelian" + jumlah +" " + "dengan ukuran cup " + ukuranCup);
