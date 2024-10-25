package penjualan_parfum.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PenggunaModel {
    private Connection connection;
    public PenggunaModel (Connection connection){
        this.connection = connection;
    }
    
    public boolean login(String username, String password){
        String sql = 
                "SELECT "
                    + "username, "
                    + "password "
                + "FROM "
                    + "ms_pengguna "
                + "WHERE "
                    + "username = ? "
                + "AND "
                    + "password = MD5(?)"
                ;
        PreparedStatement statement = null;
        boolean status = false;
        try{
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            status = result.first() ? true : false;
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
        return status;
    }
}
