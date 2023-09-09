import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik,matematik,turkce,kimya,muzik;

        System.out.println("Fizik Notu:");
        fizik = input.nextInt();

        System.out.println("Matematik Notu:");
        matematik = input.nextInt();

        System.out.println("Türkçe Notu:");
        turkce = input.nextInt();

        System.out.println("Kimya Notu:");
        kimya = input.nextInt();

        System.out.println("Muzik Notu:");
        muzik = input.nextInt();

        double sonuc = (fizik + matematik + turkce + kimya + muzik ) / 6;

        System.out.println("Ortalamanız:" + sonuc );
    }
}