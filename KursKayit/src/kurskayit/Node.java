package kurskayit;


public class Node {
    String Tc;
    String Ad;
    String Soyad;
    String MezunBolum;
    Node next;
    
    public Node(String Tc,String Ad,String Soyad,String MezunBolum){
        this.Tc=Tc;
        this.Ad=Ad;
        this.Soyad=Soyad;
        this.MezunBolum=MezunBolum;
        next=null;
    }
}
