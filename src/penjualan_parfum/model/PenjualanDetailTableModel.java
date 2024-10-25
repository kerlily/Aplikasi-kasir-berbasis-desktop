package penjualan_parfum.model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import penjualan_parfum.entity.PenjualanDetail;
public class PenjualanDetailTableModel extends AbstractTableModel{
    private List<PenjualanDetail> rows;
    public PenjualanDetailTableModel(List<PenjualanDetail>entitys){
        this.rows = entitys;
    }
    
    @Override
    public int getRowCount(){
        return this.rows.size();
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        PenjualanDetail penjualanDetail = this.rows.get(rowIndex);
        switch(columnIndex){
            case 0:
                return penjualanDetail.getBarang().getKode();
            case 1:
                return penjualanDetail.getBarang().getNama();
            case 2:
                return penjualanDetail.getBarang().getSatuan();
            case 3:
                return penjualanDetail.getKuantiti();
            case 4:
                return penjualanDetail.getHarga_satuan();
            case 5:
                return penjualanDetail.getKuantiti() * penjualanDetail.getHarga_satuan();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Kode";
            case 1:
                return "Merk Parfum";
            case 2:
                return "varian";
            case 3:
                return "Jumlah";
            case 4:
                return "Harga";
            case 5:
                return "Jumlah";
            default:
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
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return Integer.class;
            default:
                return super.getColumnClass(columnIndex);
        }
    }
    
    public List<PenjualanDetail> getRows(){
        return rows;
    }
    
    public void setRows(List<PenjualanDetail> rows){
        this.rows = rows;
    }
}
