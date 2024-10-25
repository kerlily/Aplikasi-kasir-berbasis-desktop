package penjualan_parfum.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import penjualan_parfum.entity.PenjualanDetail;
public class PenjualanDetailModel {
    private Connection connection;
    public PenjualanDetailModel (Connection connection){
        this.connection = connection;
    }
    
    public void insert(PenjualanDetail penjualanDetail) throws SQLException{
        String sql = 
                "INSERT INTO "
                    + "tr_penjualan_detail("
                        + "kuantiti, "
                        + "harga_satuan, "
                        + "barang, "
                        + "penjualan"
                    + ") "
                + "VALUES("
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?"
                + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setInt(1, penjualanDetail.getKuantiti());
        statemen.setInt(2, penjualanDetail.getHarga_satuan());
        statemen.setString(3, penjualanDetail.getBarang().getKode());
        statemen.setString(4, penjualanDetail.getPenjualan().getNomor());
        statemen.executeUpdate();
        statemen.close();
    }
    
}
