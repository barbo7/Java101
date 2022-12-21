import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        System.out.println("Matematik notunu giriniz:");
        Matematik = input.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        Fizik = input.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        Kimya = input.nextInt();
        System.out.println("Türkçe notunu giriniz: ");
        Türkçe =input.nextInt();
        System.out.println("Tarih notunu giriniz: ");
        Tarih = input.nextInt();
        System.out.println("Müzik notunu giriniz: ");
        Müzik = input.nextInt();
        double ort = (Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik)/6;
        String drm = (ort>=60) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(drm);
    }
}
