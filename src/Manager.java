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
    public boolean timKiemSinhVien( int id ) {
        for (SinhVien s : arrayList) {
            if (s.getMaSV() == id) {
                return  true;
            }
        }
        return  false;
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
    public boolean isIn(SinhVien sv) {
        for (SinhVien s : arrayList){
            if (s.getMaSV() == sv.getMaSV()) {
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
        if (timKiemSinhVien(id)){
            System.out.println("MÃ SINH VIÊN KHÔNG HỢP LỆ!");
        }else {
            for (SinhVien s : arrayList) {
                if (id == s.getMaSV()){
                    s.inputSinhVien();
                }
            }
        }

    }


}
