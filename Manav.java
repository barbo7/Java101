import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double Armut = 2.14, Elma = 3.67, Domates =1.11, Muz = 0.95, Patlican = 5;

        System.out.println("Armut Kaç Kilo ? ");
        Armut *= input.nextDouble();
        System.out.println("Elma Kaç Kilo ? ");
        Elma *= input.nextDouble();
        System.out.println("Domates Kaç Kilo ? ");
        Domates *= input.nextDouble();
        System.out.println("Muz Kaç Kilo ? ");
        Muz *= input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? ");
        Patlican *= input.nextDouble();

        System.out.println("Toplam Tutar = "+(Armut+Elma+Domates+Muz+Patlican));
    }
}
