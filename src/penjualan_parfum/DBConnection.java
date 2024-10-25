package penjualan_parfum;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static Connection connection;
    public static Connection newgetInstant(){
        if (connection == null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                String url = "jdbc:mysql://localhost:3306/db_parfum0088";
                String user = "root";
                String password = "";
                connection = DriverManager.getConnection(url, user, password);
            }catch(Throwable throwable){
                throwable.printStackTrace();
            }
        }
        return connection;
    }
}
