

import java.util.GregorianCalendar;

public class Main_BTVN_TemplateMethod {

     public static void main(String[] args) {
        // TODO code application logic here
        EntityDB svdb = new SinhVienDB();
        svdb.add(new SinhVien(59132942, "Nguyen Thai Tuan", new GregorianCalendar(1999, 9, 10), "Phu Yen"));
        svdb.add(new SinhVien(61160405, "Nguyen Ha Quyen", new GregorianCalendar(1999, 3, 15), "Ninh Hoa"));
        svdb.add(new SinhVien(123456, "tuan", new GregorianCalendar(1999, 9, 10), "KH"));
        
        System.out.println(svdb.toString());
        
        svdb.delete(new SinhVien(59132942, "Nguyen Thai Tuan", new GregorianCalendar(1999, 9, 10), "Phu Yen"));
        System.out.println(svdb.toString());
        
        svdb.deleteByKey(123456);
        System.out.println(svdb.toString());
        
        svdb.update(new SinhVien(59132942, "Nguyen Truc Dao", new GregorianCalendar(1999, 11, 11), "Khanh Hoa"));
        System.out.println(svdb.toString());
        
        EntityDB mhdb = new MonHocDB();
    }
    
 }
    

