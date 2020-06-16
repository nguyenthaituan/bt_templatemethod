
public class SinhVienDB extends EntityDB<SinhVien>{

    @Override
    protected SinhVien findByID(int id) {
        for (SinhVien sv : list) {
            if(sv.getMaSV()== id)
                return sv;
        }
        return null;
    }

    @Override
    protected int getKey(SinhVien t) {
        return t.getMaSV();
    }
    
}



