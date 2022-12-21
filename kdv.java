import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double  fiyat,kdv=0.18,kdvv=0.08,kdvt=0;
        System.out.println("Fiyat giriniz: ");
        fiyat = input.nextDouble();
        if(fiyat>0 && fiyat<=1000)
        {
            kdvt = fiyat*kdv;
            fiyat += fiyat*kdv;
        }
        else if (fiyat>1000)
        {
            kdvt = fiyat*kdvv;
            fiyat += fiyat*kdvv;
        }
        else System.out.println("Lütfen doğal sayı giriniz!!");
        System.out.println("KDV'li fiyat: "+fiyat);
        System.out.println("KDV tutarı: "+ kdvt);
    }
}
