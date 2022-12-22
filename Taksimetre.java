import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        int giris=10,km;
        double kmf=2.2,ucret;
        System.out.println("Kaç km: ");
        km =input.nextInt();
        ucret = giris+kmf*km;
        ucret = (ucret<=20) ? 20 : ucret;
        System.out.println("Taksimetre ücreti :" + ucret + "TL'dir");
    }
}
