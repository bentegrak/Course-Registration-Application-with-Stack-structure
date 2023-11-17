package kurskayit;

import java.util.Scanner;


public class Stack {
    Scanner scanner = new Scanner(System.in);
    Node top;
    int kontenjan;
    int sayac;
    
    public Stack(int kontenjan){
        this.kontenjan=kontenjan;
        sayac=0;
        top=null;
    }
    
    String Tc;
    String Ad;
    String Soyad;
    String MezunBolum;
    
    private boolean isFull() {
       return sayac==kontenjan;
    }
    
    private boolean isEmpty(){
        return sayac==0;
    }
    
    void ekle(){
        System.out.println("Kursa Kayit Edilecek Kisi Bilgileri:");
        System.out.println("Tc No:");  Tc=scanner.nextLine();
        System.out.println("Ad:");  Ad=scanner.nextLine();
        System.out.println("Soyad:");  Soyad=scanner.nextLine();
        System.out.println("Mezun Oldugu Bolum:");  MezunBolum=scanner.nextLine();
        
        Node eleman =new Node(Tc,Ad,Soyad,MezunBolum);
        
        if(isFull()){
            System.out.println("Kurs Kontenjani Dolu, Yeni Kayit Alinamaz.");
        }
        else{
            if(isEmpty()){
                top=eleman;
                System.out.println(top.Tc+"Kimlik Numarali Kisi Kursa Ilk Kayit Olarak Eklendi.");
            }
            else{
                eleman.next=top;
                top=eleman;
                System.out.println(top.Tc+"Kimlik Numarali Kisi Kursa Eklendi.");
            }
            sayac++;
        }
    }
    
    void sil(){
        if(isEmpty()){
            System.out.println("Kursta Kayitli Kimse Yok:");
        }
        else{
            System.out.println(top.Tc+"Numarali Kisi Silindi.");
            top=top.next;
        }
        sayac--;
    }
    
    void yazdir(){
        if(isEmpty()){
            System.out.println("Kursa Kayitli Kimse Yok.");
        }
        else{
            Node temp=top;
            System.out.println("Kursa Kayitli Kisi Listesi:");            
            while(temp!=null){
                System.out.println("T.C. NUMARASI: "+temp.Tc+"\n"+"ADI: "+temp.Ad+"\n"+"SOYADI: "+temp.Soyad+"\n"+"MEZUN BOLUMU: "+temp.MezunBolum);
                temp=temp.next;    
            }
        }
    }
    
    void enSonKayitOlanKisi(){
        if(isEmpty()){
            System.out.println("Kursa Kayitli Kimse Yok.");
        }
        else{
            System.out.println("Kursa Kayitli En Son Kisinin Bilgileri:");
            System.out.println("T.C. NUMARASI: "+top.Tc+"\n"+"ADI: "+top.Ad+"\n"+"SOYADI: "+top.Soyad+"\n"+"MEZUN BOLUMU: "+top.MezunBolum);
        }
    }
    
    void kalanKontenjan(){
        System.out.println("Toplam Kayitli Kisi Sayisi:"+sayac);
        System.out.println("Kalan Kontenjan Sayisi:"+(kontenjan-sayac));
    }

    
}
