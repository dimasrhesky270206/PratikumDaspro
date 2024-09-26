import java.util.Scanner;

public class pemilihanHaridenganIf06 {
    
public static void main(String[] args){
    //Deklarasi Scanner untuk menerima input dari pengguna
    Scanner sc = new Scanner (System.in);

    //Menerima input dari pengguna 
    System.out.print("Masukan angka hari (1-7): ");
    int hari = sc.nextInt();

    if (hari >= 1 && hari <= 5) {
        System.out.println("Weekday");

    } else if (hari == 6 || hari == 7) {
        System.out.println("Weekend");

    } else {
        System.out.println("Invalid Number");
    }
}


}

