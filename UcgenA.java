import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        Scanner input = new Scanner(System.in);
        int[] Kenaru = new int[3];
        int Alan=1,u=0;
        for (int i =3;i>=1;i--)
        {
            System.out.printf("Kenar uzunluklarını giriniz(%d): ", i);
            Kenaru[3-i] = input.nextInt();
            u+=Kenaru[3-i];
        }
        u /=2;
        for (int k : Kenaru)
            Alan *= (u-k);
        System.out.println("Üçgenin alanı: "+Math.sqrt((Alan*u)));
    }
}
