package penjualan_parfum.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import penjualan_parfum.entity.Barang;
public class BarangTableModel extends AbstractTableModel{
    private List<Barang> rows;
    public BarangTableModel (List<Barang> list){
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
        Barang perkiraan = rows.get(rowIndex);
        switch(columnIndex){
            case 0:
                return perkiraan.getKode();
            case 1:
                return perkiraan.getNama();
            case 2:
                return perkiraan.getSatuan();
            case 3:
                return perkiraan.getHarga_satuan();
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
                return "Merk Parfum";
            case 2:
                return "Varian";
            case 3:
                return "Harga";
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
    
    public void setRows(List<Barang> list){
        rows = list;
    }
    public List<Barang> getRows(){
        return rows;
    }
    
}
