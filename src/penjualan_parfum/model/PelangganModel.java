package penjualan_parfum.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import penjualan_parfum.entity.Pelanggan;
import java.util.List;
import java.util.ArrayList;
public class PelangganModel {
    private Connection connection;
    
    public PelangganModel(Connection connection){
        this.connection = connection;
    }
    
    //QUERY UNTUK INSERT DATA PELANGGAN    
    public void insert(Pelanggan pelanggan) throws SQLException{
        String sql = "INSERT INTO "
                + "ms_pelanggan("
                    + "kode, "
                    + "nama, "
                    + "alamat, "
                    + "telepon"
                + ") "
            + "VALUES ("
                + "?, "
                + "?, "
                + "?, "
                + "?"
            + ")";
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, pelanggan.getKode());
        statemen.setString(2, pelanggan.getNama());
        statemen.setString(3, pelanggan.getAlamat());
        statemen.setString(4, pelanggan.getTelepon());
        statemen.executeUpdate();
        statemen.close();
    }
    
    
    //QUERY UNTUK UPDATE DATA PELANGGAN    
    public void update(Pelanggan pelanggan) throws SQLException{
        String sql = " UPDATE "
                        + " ms_pelanggan "
                     + " SET "
                        + "nama = ?, "
                        + "alamat = ?, "
                        + "telepon = ?"
                     + " WHERE "
                         + "kode = ?"
                     ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, pelanggan.getNama());
        statemen.setString(2, pelanggan.getAlamat());
        statemen.setString(3, pelanggan.getTelepon());
        statemen.setString(4, pelanggan.getKode());
        statemen.executeUpdate();
        statemen.close();
    }
    
    //QUERY DELETE DATA PELANGGAN
    public void delete(Pelanggan pelanggan) throws SQLException{
        String sql = 
                "DELETE FROM "
                    + "ms_pelanggan "
                + "WHERE "
                    + "kode = ?"
                ;
        
        PreparedStatement statemen = connection.prepareStatement(sql);
        statemen.setString(1, pelanggan.getKode());
        statemen.executeUpdate();
        statemen.close();
    }
    
    //QUERY UNTUK SEARCH PELANGGAN
    public List<Pelanggan> search(String keyword){
            String sql = 
                    "SELECT "
                        + "kode, "
                        + "nama, "
                        + "alamat, "
                        + "telepon "
                    + "FROM "
                        + "ms_pelanggan "
                    + "WHERE "
                        + "kode LIKE ? "
                    + "OR "
                        + "nama LIke ? "
                    ;
            List<Pelanggan> list = new ArrayList<Pelanggan>();
            PreparedStatement statement = null;
            try{
                statement = connection.prepareStatement(sql);
                statement.setString(1, "%"+keyword+"%");
                statement.setString(2, "%"+keyword+"%");
                ResultSet result = statement.executeQuery();
                while(result.next()){
                    Pelanggan entity = new Pelanggan();
                    entity.setKode(result.getString("kode"));
                    entity.setNama(result.getString("nama"));
                    entity.setAlamat(result.getString("alamat"));
                    entity.setTelepon(result.getString("telepon"));
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
    public List<Pelanggan> getData(){
        String sql = 
                "SELECT "
                    + "kode, "
                    + "nama, "
                    + "alamat, "
                    + "telepon "
                + "FROM "
                    + "ms_pelanggan"
                ;
        List<Pelanggan> list = new ArrayList<Pelanggan>();
        PreparedStatement statement = null;
        
        try{
            statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                Pelanggan entity = new Pelanggan();
                entity.setKode(result.getString("kode"));
                entity.setNama(result.getString("nama"));
                entity.setAlamat(result.getString("alamat"));
                entity.setTelepon(result.getString("telepon"));
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
