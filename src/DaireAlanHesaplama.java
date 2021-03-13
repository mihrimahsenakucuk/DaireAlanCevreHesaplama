import java.util.Scanner;

public class DaireAlanHesaplama {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Dairenizin yarıçapını giriniz");
        double r= scan.nextDouble();
        double pi= 3.14;

        System.out.println("Dairenizin çevresi: " + 2 * pi * r);
        System.out.println("Daire alanı: " + pi * r * r );
    }

}
