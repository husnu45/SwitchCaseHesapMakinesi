
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlayın.
        
        Scanner verial = new Scanner(System.in);
        System.out.println("**************************************************");
        String islemler = "1. Toplama Islemi\n"
                          +"2. Cikarma Islemi\n"
                          +"3. Carpma Islemi\n"
                          +"4. Bolme Islemi";
        System.out.println(islemler);
        System.out.println("**************************************************");
        System.out.println("Islemi Seciniz : ");
        String islem = verial.nextLine();
        
        int a;
        int b;
        
        switch(islem){
            
        case "1":
        System.out.print("Birinci Sayi: ");
             a = verial.nextInt();
        System.out.print("Ikinci Sayi: ");
             b = verial.nextInt();
        System.out.println("Girilen Degerlerin Toplamlari : " + (a+b));
        break;
        
        case "2":
        System.out.print("Birinci Sayi: ");
             a = verial.nextInt();    
        System.out.print("Ikinci Sayi: ");
             b = verial.nextInt();
        System.out.println("Girilen Degerlerin Farklari : " + (a-b)); 
        break;
        
         case "3":
        System.out.print("Birinci Sayi: ");
             a = verial.nextInt();    
        System.out.print("Ikinci Sayi: ");
             b = verial.nextInt();
        System.out.println("Girilen Degerlerin Carpimi : " + (a*b));
        break;
        
         case "4":
        System.out.print("Birinci Sayi: ");
             a = verial.nextInt();    
        System.out.print("Ikinci Sayi: ");
             b = verial.nextInt();
        System.out.println("Girilen Degerlerin Bolumu : " + ((double)a/b));  // 10 u 4 e bölse 2 vereceği için a'yı double olarak tanımladık.
        break;
        
        default:
            System.out.println("Gecersiz Islem");
        
             
        
        
        
        
        
    }
        
        
    }
}
