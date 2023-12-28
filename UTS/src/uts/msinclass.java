
package uts;
import java.util.Scanner;
public class msinclass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        dharga daftar = new dharga();
        kalku kkl = new kalku();
        user usr = new user();
       
        System.out.println("Data Pelanggan");
        System.out.print("Masukan nama anda: ");
        String nama = input.nextLine();
        System.out.print("Masukan nomer antrian anda: ");
        String noantrian = input.nextLine();

       
        daftar.daftarharga(); 
         usr.datapelanggan(nama, noantrian);
        kkl.pesanan(0, 0, 0, 0, 0);
        }
       
}
