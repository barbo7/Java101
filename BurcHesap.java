import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int ay,gun=0;
        String gg = "Geçersiz Gün girdiniz!";

        System.out.println("Kaçıncı ayda doğdunuz?");
        ay = Input.nextInt();
        if(ay <=12 && ay>=1)
        {
            System.out.println("Ayın hangi gününde doğdunuz?");
            gun = Input.nextInt();
        }

        switch (ay)
        {
            case 1:
                if(gun<=31 && gun >=1)
                {
                    if(gun <22)
                        System.out.println("Oğlak burcusunuz");
                    else System.out.println("Kova burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 2:
                if(gun<=29 && gun >=1)
                {
                    if(gun <20)
                        System.out.println("Kova burcusunuz");
                    else System.out.println("Balık burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 3:
                if(gun<=31 && gun >=1)
                {
                    if(gun <21)
                        System.out.println("Balık burcusunuz");
                    else System.out.println("Koç burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 4:
                if(gun<=30 && gun >=1)
                {
                    if(gun <21)
                        System.out.println("Koç burcusunuz");
                    else System.out.println("Boğa burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 5:
                if(gun<=31 && gun >=1)
                {
                    if(gun <22)
                        System.out.println("Boğa burcusunuz");
                    else System.out.println("İkizler burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 6:
                if(gun<=30 && gun >=1)
                {
                    if(gun <23)
                        System.out.println("İkizler burcusunuz");
                    else System.out.println("Yengeç  burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 7:
                if(gun<=31 && gun >=1)
                {
                    if(gun <23)
                        System.out.println("Yengeç burcusunuz");
                    else System.out.println("Aslan  burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 8:
                if(gun<=31 && gun >=1)
                {
                    if(gun <23)
                        System.out.println("Aslan burcusunuz");
                    else System.out.println("Başak  burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 9:
                if(gun<=30 && gun >=1)
                {
                    if(gun <23)
                        System.out.println("Başak burcusunuz");
                    else System.out.println("Terazi  burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 10:
                if(gun<=31 && gun >=1)
                {
                    if(gun <23)
                        System.out.println("Terazi burcusunuz");
                    else System.out.println("Akrep  burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 11:
                if(gun<=30 && gun >=1)
                {
                    if(gun <22)
                        System.out.println("Akrep burcusunuz");
                    else System.out.println("Yay  burcusunuz");
                }
                else System.out.println(gg);
                break;
            case 12:
                if(gun<=31 && gun >=1)
                {
                    if(gun <22)
                        System.out.println("Yay burcusunuz");
                    else System.out.println("Oğlak  burcusunuz");
                }
                else System.out.println(gg);
                break;
            default:
                System.out.println("Geçersiz Ay değeri girdiniz!");
                break;
        }

    }
}
