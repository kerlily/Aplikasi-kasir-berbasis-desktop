package penjualan_parfum.entity;
public class PenjualanDetail {
    private Integer id;
    private Integer kuantiti;
    private Integer harga_satuan;
    private Barang barang;
    private Penjualan penjualan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKuantiti() {
        return kuantiti;
    }

    public void setKuantiti(Integer kuantiti) {
        this.kuantiti = kuantiti;
    }

    public Integer getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(Integer harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }
    
    
}
