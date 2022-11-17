import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Perhitungan Biaya Parkir");
        System.out.print("Masukkan jam parkir: ");
        int jamParkir = in.nextInt();

        double biaya = 0;
        if (jamParkir <= 5)
        {
            biaya += (jamParkir * 1);
        }
        else if (jamParkir > 5 && jamParkir < 24){
            biaya += 5;
            jamParkir -= 5;
            biaya += (jamParkir * 0.5);

        }
        else if (jamParkir == 24){
            biaya += 15;
        }
        else {
            biaya += 15;
            jamParkir -= 24;
            biaya += (jamParkir * 0.5);
        }
        System.out.println("Biaya parkir adalah : " + biaya + "$");
    }
}