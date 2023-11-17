
package kurskayit;

import java.util.Scanner;


public class Uygulama  {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,secim=-1;
        System.out.println("Kursa Kayit Edilecek Kisi Sayisi:"); n=scanner.nextInt();
        Stack liste= new Stack(n);
        
        
        while(secim!=0){
            System.out.println("1- Kursa Yeni Kayit:");
            System.out.println("2- Kursa Kayitli Kisi Bilgileri:");
            System.out.println("3- En Son Kayitli Kisi Bilgileri:");
            System.out.println("4- Son Kaydi Sil:");
            System.out.println("5- Kalan Kontenjan Bilgileri:");
            System.out.println("0- Cikis:");
            System.out.print("Seciminiz:"); secim=scanner.nextInt();
            
            
            switch(secim){
                case 1:liste.ekle();
                break;
                case 2:liste.yazdir();
                break;
                case 3:liste.enSonKayitOlanKisi();
                break;
                case 4:liste.sil();
                break;
                case 5:liste.kalanKontenjan();
                break;
                case 0:System.out.println("Cikis Yaptiniz.");
                break;
                default:System.out.println("Hatali Secim Yaptiniz[0-5");
            }
        }
        
        
        
        
    }
    
}
