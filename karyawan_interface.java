package solution;

import javax.swing.JTable;


public interface karyawan_interface {
    
    public void read(JTable tb);
    public void create(Karyawan kr);
    public void update(Karyawan kr);
    public void delete(int Idkaryawan);
    public void search(JTable tb, int Idkaryawan);

}
