import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double hava;
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Değeri giriniz: ");
        hava = input.nextDouble();

        if(hava<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if(hava <=5 && hava <15)
            System.out.println("Sinemaya gidebilirsiniz. ");
        else if(hava <= 15 && hava <25)
            System.out.println("Piknik yapabilirsiniz. ");
        else
            System.out.println("Yüzmeye gidebilirsiniz. ");

    }
}
