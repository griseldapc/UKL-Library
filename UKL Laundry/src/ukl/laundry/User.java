package ukl.laundry;
public interface User { 
  //polimorphisme
    public void     setNama     (String nama);
    public void     setAlamat   (String alamat);
    public void     setTelepon  (String telepon);
    public String   getNama     (int id);
    public String   getAlamat   (int id);
    public String   getTelepon  (int id);
}//implementasikan ke client dan petugas