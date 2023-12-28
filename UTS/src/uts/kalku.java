
package uts;
import java.util.Scanner;
public class kalku extends dharga{
    int bakso = 20;
    int mieayam = 25;
    int eskelapa = 10;
    int esjeruk = 5;
    int esteh = 3;

    int ttpesanan;

   public void pesanan(int jbakso,int jmieayam,int jeskelapa,int jesjeruk,int jesteh){
       String loop;
        int tpbakso;
        int tpmieayam;
        int tpeskelapa;
        int tpesjeruk;
        int tpesteh;
        
        Scanner masuk = new Scanner(System.in);
       do{
        System.out.println("\nMasukan Jumlah Pesnan Anda");
        
        System.out.print("Bakso: ");
        jbakso = masuk.nextInt();
        System.out.print("Mie ayam: ");
        jmieayam = masuk.nextInt();
        System.out.print("Es kelapa: ");
        jeskelapa = masuk.nextInt();
        System.out.print("Es Jeruk: ");
        jesjeruk = masuk.nextInt();
        System.out.print("Es Teh: ");
        jesteh = masuk.nextInt();
        
        
            tpbakso = jbakso*bakso;
          if( jbakso >0){
            System.out.println("\nJumlah porsi bakso      : "+ jbakso);
            System.out.println("Total harga bakso       : "+ tpbakso + " K");
        }
            tpmieayam = jmieayam*mieayam;
          if(jmieayam >0){  
            System.out.println("\nJumlah porsi mie ayam   : "+ jmieayam);
            System.out.println("Total harga mie ayam    : "+ tpmieayam+" K");
          }
            tpeskelapa = jeskelapa * eskelapa;
           if(jeskelapa >0 ){
            System.out.println("\nJumlah porsi Es kelapa  : "+ jeskelapa);
            System.out.println("Total harga Es kelapa   : "+ tpeskelapa+" K");
           }
            tpesteh = jesteh*esteh;
           if(jesteh >0 ){
            System.out.println("\nJumlah porsi Es Teh     : "+ jesteh);
            System.out.println("Total harga Es Teh      : "+ tpesteh+" K");
           }
            tpesjeruk = jesjeruk*esjeruk;
           if(jesjeruk >0 ){
            System.out.println("\nJumlah porsi Es Jeruk   : "+ jesjeruk);
            System.out.println("Total harga Es Jeruk    : "+ tpesjeruk+" K");
           }
                ttpesanan = tpbakso + tpmieayam + tpeskelapa + tpesjeruk + tpesteh;
              if(ttpesanan >0 ){
                System.out.println("\nTotal harga pesanan anda: "+ttpesanan+" K");
                System.out.println(" Terimakasih sudah berkunjung :)");
              }else{
                  System.out.println("Anda tidak memesan apapun!!!");
              }
              System.out.println("Apakah anda ingin merubah pesanan anda? Y/N ");
              loop = masuk.next();
    }while(loop.equalsIgnoreCase("y"));
       System.out.println("Terimakasih Sudah Memesan :)");
   }
}
