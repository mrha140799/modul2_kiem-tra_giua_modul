import java.util.Scanner;

public class SinhVien{
    private static int count=0;
    private int maSV;
    private String name;
    private String gioiTinh;
    private float diemToan;
    private float diemHoa;
    private float diemLy;


    public SinhVien() {
        count++;
        this.maSV = count;
    }

    public SinhVien( String name, String gioiTinh, float diemToan, float diemHoa, float diemLy) {
        count++;
        this.maSV = count;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemLy = diemLy;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }
    public float getTongDiem() {
        return this.getDiemToan() + this.getDiemHoa() + this.getDiemLy();
    }


    public void inputSinhVien() {
        Scanner scn = new Scanner(System.in);
        System.out.print("MỜI NHẬP VÀO TÊN SINH VIÊN : ");
        this.name = scn.nextLine();
        System.out.print("\nGIỚI TÍNH : ");
        this.gioiTinh = scn.nextLine();
        System.out.print("\nĐIỂM TOÁN :");
        this.diemToan = scn.nextFloat();
        System.out.print("\nĐIỂM LÍ :");
        this.diemLy = scn.nextFloat();
        System.out.print("\nĐIỂM HÓA :");
        this.diemHoa = scn.nextFloat();
    }
    public void displaySinhVien() {
        System.out.println("ID: " + this.getMaSV() +"-TÊN: " + this.getName()
                + "- GIỚI TÍNH: " + this.getGioiTinh() + "- ĐIỂM TOÁN: " + this.getDiemToan()
                + "- ĐIỂM HÓA:" + this.getDiemHoa() +"- ĐIỂM LÝ: "+ this.getDiemLy());
    }

}

