package ukl.laundry;
public class Laporan {//public modifier 
     public void laporan(JenisLaundry barang){ //parameter
        int x=barang.getJmlJenisLaundry();
        // x = field falue dari x terdekat yaitu parameter jenis laundry

        System.out.println(); 
        System.out.println("Tabel Laundry"); 
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi/jam \tHarga"); 
        for (int i = 0; i < x; i++) {//perulangan / looping
        System.out.println(barang.getJenisLaundry(i)+"\t"+ barang.getDurasi(i)+"\t\t"+barang.getHarga(i));
        }//konstruktor
    }
    public void laporan (Petugas petugas){
        System.out.println("");
        System.out.println("Nama Petugas  \tAlamat \t\tTelepon \tJabatan");
        System.out.println("");
        System.out.println(petugas.getNama(0)+"\t"+petugas.getAlamat(0)+"\t"+"\t"+petugas.getTelepon(0)+"\t"+petugas.getJabatan(0));
        System.out.println(petugas.getNama(1)+"\t"+"\t"+petugas.getAlamat(1)+"\t"+"\t"+petugas.getTelepon(1)+"\t"+petugas.getJabatan(1));
        System.out.println(petugas.getNama(2)+"\t"+"\t"+petugas.getAlamat(2)+"\t"+"\t"+petugas.getTelepon(2)+"\t"+petugas.getJabatan(2));
        System.out.println(petugas.getNama(3)+"\t"+"\t"+petugas.getAlamat(3)+"\t"+petugas.getTelepon(3)+"\t"+petugas.getJabatan(3));
        System.out.println("");
        System.out.println("============================================================================");
        }//konstruktor
    
        public void laporan(Client member){ 
            int x=member.getJmlClient();//field value dari x terdekat yaitu parameter client member

        System.out.println(); 
        System.out.println("============================================================================");
        System.out.println("");
        System.out.println("Tabel Pelanggan "); 
        System.out.println();
        System.out.println("Nama \t\tAlamat \t\tTelepon \tSaldo"); 
        for (int i = 0; i < x; i++) {
        System.out.println(member.getNama(i)+"\t\t"+ member.getAlamat(i)+"\t\t"+member.getTelepon(i)+"\t"+ member.getSaldo(i));
        
        }
            System.out.println("");
            System.out.println("============================================================================");
    }
        public void laporan(Transaksi transaksi, JenisLaundry barang){ 
            int x=transaksi.getJmlTransaksi();//field value dari x terdekat / parameter transaksi, jenis laundry barang
            
            
            System.out.println("Laporan Transaksi");
            System.out.println();
            System.out.println("Jenis Laundry\tTotal \tHarga \tJumlah");
            
            int total=0;
            for (int i = 0; i < x; i++){
                int jumlah=transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
                    total+=jumlah;
                            
                System.out.println(barang.getJenisLaundry(transaksi.getIdBarang(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
            }//menghitung total harga laundry keseluruhan
            System.out.println("");
            System.out.println("Total Omset ="+total);
            System.out.println("");
            System.out.println("===============================================================================");
            }
            }
    

