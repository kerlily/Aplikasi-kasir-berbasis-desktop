package penjualan_parfum.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import penjualan_parfum.entity.Penjualan;
public class PenjualanModel {
    private Connection connection;
    public PenjualanModel (Connection connection){
        this.connection = connection;
    }
    
    public void insert(Penjualan penjualan) throws SQLException{
        String sql = 
                "INSERT INTO "
                    + "tr_penjualan("
                        + "nomor, "
                        + "tanggal, "
                        + "total, "
                        + "pelanggan"
                    + ") "
                + "VALUES("
                    + "?, "
                    + "?, "
                    + "?, "
                    + "?"
                + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, penjualan.getNomor());
        statemen.setDate(2, new java.sql.Date(penjualan.getTanggal().getTime()));
        statemen.setInt(3, penjualan.getTotal());
        statemen.setString(4, penjualan.getPelanggan().getKode());
        statemen.executeUpdate();
        statemen.close();
    }
}
