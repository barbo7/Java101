import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double ortalama=0,gecerli=0;
        String[] sorular = {"Matematik notunuz: ","Fizik notunuz: ","Türkçe notunuz: ","Kimya notunuz: ","Müzik notunuz: "};
        int[] notlar = new int[5];
        for (int i=0;i<notlar.length;i++)
        {
            System.out.println(sorular[i]);
            notlar[i]= input.nextInt();
            if(notlar[i]>=0 && notlar[i]<=100)
            {
                ortalama += notlar[i];
                gecerli++;
            }
        }
        ortalama /=gecerli;
        if(ortalama>55)
            System.out.println("Tebrikler geçtiniz!!");
        else
            System.out.println("Seneye tekrar görüşürüzzzz");
        System.out.println("Ortalamanız : " + ortalama);
}
}
