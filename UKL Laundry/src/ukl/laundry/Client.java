//interface karena menggunakan keyword implements
package ukl.laundry;
import java.util.ArrayList;//keyword

public class Client implements User { //variabel
    private ArrayList<String>   namaClient  = new ArrayList<String>(); //arraylist
    private ArrayList<String>   alamat      = new ArrayList<String>();
    private ArrayList<String>   telepon     = new ArrayList<String>(); 
    private ArrayList<Integer>  saldo       = new ArrayList<Integer>();
    //untuk deklarasi variable
    
    public Client(){//konstruktor
        this.namaClient.add ("Sani");
        this.alamat.add     ("Malang");
        this.telepon.add    ("082134217834");
        this.saldo.add      (50000);
        // this menyatakan objek sekarang
        
        this.namaClient.add ("Rani");//deklarasi array list
        this.alamat.add     ("Tumpang");
        this.telepon.add    ("0812347091784");
        this.saldo.add      (100000);
        
        this.namaClient.add ("Hani");
        this.alamat.add     ("Wajak");
        this.telepon.add    ("082124738602");
        this.saldo.add      (200000);
        
    }
    public void setSaldo(int saldo){ 
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){//mendapatkan data 
        return this.saldo.get(idMember); //mengembalikan / menampilkan nilai saldo id member
    }
    public void editSaldo(int idMember, int saldo){//
        this.saldo.set(idMember, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    
    
    @Override //mendifinisikan kelas turunan dengan parameter yang sama
    public void setNama(String namaMember) {//parameter
        //void = method
        this.namaClient.add(namaMember);
    }

    @Override//nama dan isi implementasi methodnya sama
    public void setAlamat(String alamat) {//mengatur
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {//mendapatkan
        return this.namaClient.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.telepon.get(idMember);
        
    }

    @Override
    public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }
     
    
}
    

    

