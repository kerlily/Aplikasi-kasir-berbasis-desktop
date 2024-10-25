package penjualan_parfum.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import penjualan_parfum.entity.Pelanggan;
public class PelangganTableModel extends AbstractTableModel {
    private List<Pelanggan> rows;
    public PelangganTableModel (List<Pelanggan> list){
        rows = list;
    }
    @Override
    public int getRowCount(){
        return rows.size();
    }
    @Override
    public int getColumnCount(){
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Pelanggan perkiraan = rows.get(rowIndex);
        switch(columnIndex){
            case 0:
                return perkiraan.getKode();
            case 1:
                return perkiraan.getNama();
            case 2:
                return perkiraan.getAlamat();
            case 3:
                return perkiraan.getTelepon();
            default :
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "Kode";
            case 1:
                return "Nama";
            case 2:
                return "Alamat";
            case 3:
                return "Telepon";
            default :
                return null;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch(columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            default :
                return super.getColumnClass(columnIndex);
        }
    }
    
    public void setRows(List<Pelanggan> list){
        rows = list;
    }
    public List<Pelanggan> getRows(){
        return rows;
    }
}
