package ukl.laundry;
//interface karena menggunakan keyword implements
import java.util.ArrayList;

public class Petugas implements User{ 
private ArrayList<String> namaPetugas   = new ArrayList<String>(); 
private ArrayList<String> alamat        = new ArrayList<String>(); 
private ArrayList<String> telepon       = new ArrayList<String>(); 
private ArrayList<String> jabatan       = new ArrayList<String>();

public Petugas (){ //keywoard this buat pemanggil methods kelas itu sendiri , pembuatan kelas untuk menyatakan objek
    this.namaPetugas.add("Griselda");
    this.alamat.add     ("Turen");
    this.telepon.add    ("081249699404");
    this.jabatan.add    ("Pemilik toko");
    
    this.namaPetugas.add("Zalfa");
    this.alamat.add     ("Malang");
    this.telepon.add    ("081243212567");
    this.jabatan.add    ("Petugas cuci");
    
    this.namaPetugas.add("Aurel");
    this.alamat.add     ("Kediri");
    this.telepon.add    ("081234789654");
    this.jabatan.add    ("Petugas setrika");
    
    this.namaPetugas.add("Rifa");
    this.alamat.add     ("Ngantang");
    this.telepon.add    ("085617902834");
    this.jabatan.add    ("Petugas packing");
}
public void setJabatan(String jabatan){ //mutator method - mengubah/memberi nilai
    this.jabatan.add(jabatan);
}
public String getJabatan(int id){//asesor method - memanggil/membaca nilai
    return this.jabatan.get(id);
}
public int getJmlPetugas(){
    return this.namaPetugas.size();
}

    @Override //mengimplementasi kembali subclas
    public void setNama(String namaKaryawan) {
        this.namaPetugas.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaPetugas.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaPetugas.add(telepon);
    }

    @Override
    public String getNama(int idKaryawan) {
        return this.namaPetugas.get(idKaryawan);
    }

    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }//nama method dan isi implementasi methodnya sama
    } 

