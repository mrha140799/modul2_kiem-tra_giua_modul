
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        xuLi();


    }
    static void Menu() {
        System.out.println("1. NHẬP VÀO 1 SINH VIÊN!");
        System.out.println("2. XEM DANH SÁCH SINH VIÊN!");
        System.out.println("3. SẮP XẾP DANH SÁCH THEO THỨ TỰ TĂNG DẦN THEO TỔNG ĐIỂM");
        System.out.println("4. TÌM KIẾM THEO MASV!");
        System.out.println("5. SỬA THÔNG TIN SINH VIÊN CÓ MÃ ĐƯỢC NHẬP TỪ BÀN PHÍM!");
        System.out.println("6. XÓA SINH VIÊN CÓ MÃ NHẬP TỪ BÀN PHÍM!");
        System.out.println("0. NHẬP VÀO 1 SINH VIÊN!");
        System.out.println("    --->NHẬP: !");


    }

    static void xuLi() {
        Scanner scn = new Scanner(System.in);
        Manager manager = new Manager();
        int check ;
        while (true) {
            Menu();
            check = scn.nextInt();
            switch (check) {
                case 1:
                    SinhVien sv = new SinhVien();
                    sv.inputSinhVien();
                    manager.inputSinhVien(sv);
                    break;
                case 2:
                    System.out.println("\n\n-------------------------------");
                    manager.displaySinhVien();
                    System.out.println("-------------------------------\n\n");
                    break;
                case 3:
                    manager.sortSinhVien();
                    break;
                case 4:
                    System.out.println("\n\n-------------------------------");

                    System.out.println("Mời bạn nhập vào Mã sinh viên muốn tìm kiếm : ");
                    int msv = scn.nextInt();
                    if (manager.timKiemSinhVien(msv)){
                        System.out.println("CÓ TRONG DANH SÁCH!");
                    }else {
                        System.out.println("KHÔNG CÓ TRONG DANH SÁCH!");
                    }
                    System.out.println("-------------------------------\n\n");
                    break;
                case 5:
                    System.out.println("\n\n-------------------------------");
                    System.out.println("Mời bạn nhập vào Mã sinh viên MUỐN SỬA : ");
                    int id = scn.nextInt();
                    manager.suaSinhvien(id);
                    System.out.println("-------------------------------\n\n");
                    break;
                case 6:
                    System.out.println("\n\n-------------------------------");
                    System.out.println("Mời bạn nhập vào Mã sinh viên MUỐN SỬA : ");
                    int ma = scn.nextInt();
                    manager.xoaSinhVien(ma);
                    System.out.println("-------------------------------\n\n");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }
    }
}
