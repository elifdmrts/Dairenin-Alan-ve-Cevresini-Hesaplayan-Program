import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double r,pi,alan,cevre;
       pi=3.14;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz: ");
        r=scanner.nextDouble();
        alan=pi*r*r;
        System.out.println("Dairenin Alanı: "+alan);
        cevre=2*pi*r;
        System.out.println("Dairenin Çevresi: "+cevre);


    }
}