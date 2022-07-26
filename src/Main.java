import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a ,b , ucgeninCevresi , u , ucgeninAlani ;
        double c ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1.kenar uzunlugu  giriniz:");
        a = input.nextInt();
        System.out.print("Lutfen 2.kenar uzunlugunu giriniz :");
        b = input.nextInt();
        c = (int) Math.sqrt((a*a) + (b*b));
        System.out.println("Ucgenimizin Hipotenus uzunlugu = " + c);
        u = (int) ((a+b+c)/2);
        ucgeninCevresi = u * 2;
        System.out.println("Ucgenin Cevresi = " + ucgeninCevresi);
        ucgeninAlani = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Ucgenin Alani =" + ucgeninAlani);

    }
}
