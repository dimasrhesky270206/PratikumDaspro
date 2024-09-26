import java.util.Scanner;
/**
 * PemilihanHari06
 */
public class PemilihanHari06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi variable dayname dan dayType bertipe String
        String dayname, dayType;
        
        System.out.print("Input day name:");

        dayname = sc.nextLine();

        switch (dayname.toLowerCase()) {
            case "monday":
            case  "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType ="invalid day name";
             //cetak hasil ke layar
        }
        System.out.println(dayname + " is a " + dayType);

            sc.close();


        
    }
}
