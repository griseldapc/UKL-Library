//encapsulasi karena public menyembunyikan nilai
package ukl.laundry;
import java.util.ArrayList;//keyword 

public class JenisLaundry {
    private ArrayList<String>   JenisLaundry    = new ArrayList<String>(); 
    private ArrayList<Integer>  durasi          = new ArrayList<Integer>(); 
    private ArrayList<Integer>  harga           = new ArrayList<Integer>();
    
    public JenisLaundry (){//araylist
        this.JenisLaundry.add("Baju/Kg ");
        this.harga.add(15000);
        this.durasi.add(0);
        //this untuk menyatakan objek sekarang
        
        this.JenisLaundry.add("Celana/Kg ");
        this.harga.add(12000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Selimut/Pcs");
        this.harga.add(7000);
        this.durasi.add(0);
        
        
        this.JenisLaundry.add("Seragam/Set");
        this.harga.add(5000);
        this.durasi.add(0);
         
    }//inheritance
    public int getJmlJenisLaundry(){ // memanggil - asesor method = membaca data
        return this.JenisLaundry.size();//mengembalikan nilai
        }
    public void setJenisLaundry(String namaBarang ){ //menentukan
        this.JenisLaundry.add(namaBarang);
        }
    public String getJenisLaundry(int idBarang){
        return this.JenisLaundry.get(idBarang);
        }
    public void setDurasi(int Durasi ){ //mutator method = memberi / mengubah nilai
        this.durasi.add(Durasi);
        }
    public int getDurasi(int idBarang){ 
        return this.durasi.get(idBarang);
        }
    public void editDurasi(int idBarang, int Durasi){ 
        this.durasi.set(idBarang, Durasi);
    }
    public void setHarga(int harga ){ 
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){ 
        return this.harga.get(idBarang);
}
}

