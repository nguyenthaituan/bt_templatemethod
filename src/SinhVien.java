
import java.util.Calendar;


public class SinhVien {
    private int maSV;
    private String tenSV;
    private Calendar ngaySinh;
    private String queQuan;

    public SinhVien(int maSV, String tenSV, Calendar ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Calendar getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Calendar ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", ngaySinh=" + ngaySinh.get(Calendar.DAY_OF_MONTH)+"/" + ngaySinh.get(Calendar.MONTH)+"/" +ngaySinh.get(Calendar.YEAR) + ", queQuan=" + queQuan + '}';
    }
  
    
    
}
