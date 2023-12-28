
package uts;


public class user{
protected String nama;
protected String noantrian;

void datapelanggan(String nama, String noantrian){
    this.nama = nama;
    this.noantrian = noantrian;
    
    System.out.println("\nData Pelanggan Adalah");
    System.out.println("Nama Pelanggan: "+this.nama);
    System.out.println("Nomer Antrian: "+this.noantrian);
}

}
