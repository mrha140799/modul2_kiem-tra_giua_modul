import java.util.ArrayList;

public class Manager implements ISinhVienTest {
    private ArrayList<SinhVien> arrayList = new ArrayList<>();
    @Override
    public void sortSinhVien() {
        for (int i = 0 ; i < arrayList.size() ; i++) {
            for (int j =i+1 ; j < arrayList.size() ; j++) {
                if (arrayList.get(i).getTongDiem() > arrayList.get(j).getTongDiem()){
                    SinhVien svtg ;
                    svtg = arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j , svtg);
                }
            }
        }
    }

    @Override
    public SinhVien timKiemSinhVien( int id ) {
        for (SinhVien s : arrayList) {
            if (s.getMaSV() == id) {
                return  s;
            }
        }
        return  null;
    }

    @Override
    public boolean xoaSinhVien(int id) {
        if (id > arrayList.size()){
            return false;
        }else {
            for (SinhVien s : arrayList) {
                if (s.getMaSV() == id) {
                    arrayList.remove(s);
                    return true;
                }

            }
            return false;
        }
    }

    @Override
    public boolean isIn(int id) {
        for (SinhVien s : arrayList){
            if (s.getMaSV() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void inputSinhVien(SinhVien s) {
        arrayList.add(s);
    }

    @Override
    public void displaySinhVien() {
        for (SinhVien s : arrayList) {
            s.displaySinhVien();
        }
    }

    @Override
    public void suaSinhvien(int id) {
        if (this.isIn(id)) {
            for (SinhVien s :arrayList) {
                if (s.getMaSV() == id) {
                    s.inputSinhVien();
                    System.out.println("ĐÃ SỬA XONG");
                }
            }
        }else {
            System.out.println("KHÔNG CÓ HỌC SINH CÓ MÃ ID: " + id);
        }

    }


}
