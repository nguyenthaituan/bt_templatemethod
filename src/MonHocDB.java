

public class MonHocDB extends EntityDB<MonHoc>{
    
    @Override
    protected MonHoc findByID(int id) {
        for (MonHoc mh : list) {
            if(mh.getMaMH()== id)
                return mh;
        }
        return null;
    }

    @Override
    protected int getKey(MonHoc t) {
        return t.getMaMH();
    }
}