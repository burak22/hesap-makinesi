import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        int selection;
        while(isRun){
            System.out.println("Seçiniz: ");
            System.out.println("1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Faktoriyel Hesaplama\n"
            + "7- Mod Alma\n"
            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap");
            selection = sc.nextInt();
            switch(selection){
                case 0:
                    isRun = false;
                    break;
                case 1:
                    System.out.println("Sonuç: " + sum(sc.nextInt(), sc.nextInt()));
                    break;
                case 2:
                    System.out.println("Sonuç: " + sub(sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    System.out.println("Sonuç: " + mult(sc.nextInt(), sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Sonuç: " + div(sc.nextDouble(), sc.nextDouble()));
                    break;
                case 5:
                    System.out.println("Sonuç: " + exp(sc.nextInt(), sc.nextInt()));
                    break;
                case 6:
                    System.out.println("Sonuç: " + factorial(sc.nextInt()));
                    break;
                case 7:
                    System.out.println("Sonuç: " + mod(sc.nextInt(),sc.nextInt()));
                case 8:
                    rect(sc.nextInt(), sc.nextInt());
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        }
        System.out.println("Hesap Makinesi Kapatılıyor...");
        sc.close();
    }

    static int sum(int a, int b){
        return(a+b);
    }
    static int sub(int a, int b){
        return(a-b);
    }
    static int mult(int a,int b){
        return(a*b);
    }
    static double div(double a, double b){
        return(a/b);
    }
    static int exp(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++) {
            result*=a;
        }
        return(result);
    }
    static int factorial(int a){
        int result = 1;
        for (int i = a; i >= 1; i--) {
            result *=i;
        }
        return result;
    }
    static int mod(int a, int b){
        return (a%b);
    }
    static void rect(int a, int b){
        System.out.print("Dikdörtgen alanı: " + (a*b));
        System.out.print("\nDikdörtgen çevresi: " + (a+b) +"\n");
    }

}