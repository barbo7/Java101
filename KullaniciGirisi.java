import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi,Sifre;

        System.out.println("Kullanıcı adı: ");
        kullaniciAdi = input.nextLine();
        System.out.println("Şifre: ");
        Sifre = input.nextLine();
        if(kullaniciAdi.equals("patika") && Sifre.equals("java101") )
        {
            System.out.println("Giriş Başarılı!!");
        }
        else if (!Sifre.equals("java101"))
        {
            System.out.println("Şifreniz yanlış. şifrenizi sıfırlamak ister misiniz?");
            System.out.println("Evet ise 1 Hayır ise 0'a basınız.");
            String sonuc = input.nextLine();
            if(sonuc.equals("1"))
            {
                System.out.println("Yeni şifre giriniz: ");
                String sonucc = (Sifre != input.nextLine()) ? "Şifre oluşturuldu": "Şifre oluşturulamadı, lütfen başka şifre giriniz.";
                System.out.println(sonucc);
            }
            else System.out.println("Pekii");
        }
        else
            System.out.println("Bilgileriniz yanlış!");
    }
}
