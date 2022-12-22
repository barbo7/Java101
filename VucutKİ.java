import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //body mass index= Kilo (kg) / Boy(m) * Boy(m)
        Scanner input =  new Scanner(System.in);
        double kilo,boy,index;

        System.out.println("Kilonuzu giriniz(kg): ");
        kilo = input.nextDouble();

        System.out.println("Boyunuzu giriniz(cm): ");
        boy = input.nextDouble();
        boy/=100;

        index = kilo / (boy*boy);
        System.out.println("Vücut kitle endeksiniz: " + index);
    }
}
