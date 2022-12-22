import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
       // Alan Formülü : π * r * r;
        // Çevre Formülü : 2 * π * r;
        double pi = 3.14; //π
        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çap giriniz: ");
        double r = input.nextDouble();
        System.out.println("merkez açısının ölçüsü giriniz: ");
        double a = input.nextDouble();
        double formul = (pi*r*r*a)/360;
        //System.out.println("Dairenin alanı: "+ (pi*r*r));
        //System.out.println("Dairenin çevresi: "+ (2*pi*r));
        System.out.println("Dairenin alanı: "+ formul);
    }
}
