package penjualan_parfum.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import penjualan_parfum.entity.Barang;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class BarangModel {
    private Connection connection;
    
    public BarangModel(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Barang barang) throws SQLException{
        String sql = "INSERT INTO "
                + "ms_barang("
                    + "kode, "
                    + "nama, "
                    + "satuan, "
                    + "harga_satuan"
                + ") "
            + "VALUES ("
                + "?, "
                + "?, "
                + "?, "
                + "?"
            + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, barang.getKode());
        statemen.setString(2, barang.getNama());
        statemen.setString(3, barang.getSatuan());
        statemen.setInt(4, barang.getHarga_satuan());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public void update(Barang barang) throws SQLException{
        String sql = " UPDATE "
                        + " ms_barang "
                     + " SET "
                        + "nama = ?, "
                        + "satuan = ?, "
                        + "harga_satuan = ?"
                     + " WHERE "
                         + "kode = ?"
                     ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, barang.getNama());
        statemen.setString(2, barang.getSatuan());
        statemen.setInt(3, barang.getHarga_satuan());
        statemen.setString(4, barang.getKode());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public void delete(Barang barang) throws SQLException{
        String sql = 
                "DELETE FROM "
                    + "ms_barang "
                + "WHERE "
                    + "kode = ?"
                ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, barang.getKode());
        statemen.executeUpdate();
        statemen.close();
    }
    
    public List<Barang> search(String keyword){
        String sql = 
                "SELECT "
                    + "kode, "
                    + "nama, "
                    + "satuan, "
                    + "harga_satuan "
                + "FROM "
                    + "ms_barang "
                + "WHERE "
                    + "kode LIKE ? "
                + "OR "
                    + "nama LIke ? "
                ;
        List<Barang> list = new ArrayList<Barang>();
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setString(1, "%"+keyword+"%");
            statement.setString(2, "%"+keyword+"%");
            ResultSet result = statement.executeQuery();
            while(result.next()){
                Barang entity = new Barang();
                entity.setKode(result.getString("kode"));
                entity.setNama(result.getString("nama"));
                entity.setSatuan(result.getString("satuan"));
                entity.setHarga_satuan(result.getInt("harga_satuan"));
                list.add(entity);
            }
            result.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return list;
    }
    public List<Barang> getData(){
        String sql = 
                "SELECT "
                    + "kode, "
                    + "nama, "
                    + "satuan, "
                    + "harga_satuan "
                + "FROM "
                    + "ms_barang"
                ;
        List<Barang> list = new ArrayList<Barang>();
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                Barang entity = new Barang();
                entity.setKode(result.getString("kode"));
                entity.setNama(result.getString("nama"));
                entity.setSatuan(result.getString("satuan"));
                
                entity.setHarga_satuan(result.getInt("harga_satuan"));
                list.add(entity);
            }
            result.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return list;
    }
}
