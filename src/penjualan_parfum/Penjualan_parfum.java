package penjualan_parfum;
import java.awt.Frame;
import java.util.Locale;
import penjualan_parfum.view.MainMenu;
import javax.swing.UnsupportedLookAndFeelException;
import penjualan_parfum.view.LoginForm;
public class Penjualan_parfum {
    public static void main(String[] args){
        try{
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }catch(UnsupportedLookAndFeelException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(InstantiationException ex){
            ex.printStackTrace();
        }catch(IllegalAccessException ex){
            ex.printStackTrace();
        }
        
        Locale.setDefault(new Locale("in", "ID"));
        LoginForm loginForm = new LoginForm(new Frame(), true);
        loginForm.setLocationRelativeTo(null);
        loginForm.setVisible(true);
    }
}
