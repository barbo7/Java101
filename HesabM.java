import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı  girin: ");
        double s1 = input.nextDouble();
        System.out.println("Bi sayı daha girin: ");
        double s2 = input.nextDouble();

        System.out.println("İşlem seçiniz: Toplama(1), Çıkartma(2), Bölme(3), Çarpma(4) ");

        int sec = input.nextInt();
        switch (sec)
        {
            case 1:
                System.out.println(s1 + " + " + s2 + " = "+ (s1+s2));
                break;
            case 2:
                System.out.println(s1 + " - " + s2 + " = "+ (s1-s2));
                break;
            case 3:
                System.out.println(s1 + " / " + s2 + " = "+ (s1/s2));
                break;
            case 4:
                System.out.println(s1 + " * " + s2 + " = "+ s1*s2);
                break;
            default:
                System.out.println("Hatalı duşlama");
                break;
        }
    }
}
