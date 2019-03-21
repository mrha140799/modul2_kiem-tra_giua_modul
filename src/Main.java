
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
        System.out.println("0. THOÁT!");
        System.out.print("    --->NHẬP: ");


    }

    static void xuLi() {
        Scanner scn = new Scanner(System.in);
        Manager manager = new Manager();
        int msv;
        int check ;
        while (true) {
            Menu();
            check = scn.nextInt();
            switch (check) {
                case 1:
                    SinhVien sv = new SinhVien();
                    sv.inputSinhVien();
                    manager.inputSinhVien(sv);
                    System.out.println("THÊM THÀNH CÔNG");
                    System.out.println("-------------------------------\n\n");
                    break;
                case 2:
                    System.out.println("\n\n-------------------------------");
                    manager.displaySinhVien();
                    System.out.println("-------------------------------\n\n");
                    break;
                case 3:
                    manager.sortSinhVien();
                    System.out.println("\n\n-------------------------------");
                    System.out.println("SẮP XẾP THÀNH CÔNG!");
                    manager.displaySinhVien();
                    System.out.println("-------------------------------\n\n");
                    break;
                case 4:
                    System.out.println("\n\n-------------------------------");

                    System.out.println("Mời bạn nhập vào Mã sinh viên muốn tìm kiếm : ");
                    msv= scn.nextInt();
                    if (manager.isIn(msv)){
                        System.out.println("CÓ TRONG DANH SÁCH!");
                        manager.timKiemSinhVien(msv).displaySinhVien();
                    }else {
                        System.out.println("KHÔNG CÓ TRONG DANH SÁCH!");
                    }
                    System.out.println("-------------------------------\n\n");
                    break;
                case 5:
                    System.out.println("\n\n-------------------------------");
                    System.out.println("Mời bạn nhập vào Mã sinh viên MUỐN SỬA : ");
                    msv = scn.nextInt();
                    manager.suaSinhvien(msv);
                    manager.timKiemSinhVien(msv).displaySinhVien();
                    System.out.println("-------------------------------\n\n");
                    break;
                case 6:
                    System.out.println("\n\n-------------------------------");
                    manager.displaySinhVien();
                    System.out.println("Mời bạn nhập vào Mã sinh viên MUỐN XÓA : ");
                    msv = scn.nextInt();
                    if (manager.xoaSinhVien(msv)){
                        System.out.println("XÓA THÀNH CÔNG");
                    }else {
                        System.out.println("KHÔNG CÓ HỌC SINH ĐÓ TRONG DANH SÁCH");
                    }

                    System.out.println("-------------------------------\n\n");
                    break;
                case 0:
                    System.out.println("HẸN GẶP LẠI");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("BẠN NHẬP SAI YÊU CẦU NHẬP LẠI!");
                        break;
            }

        }
    }
}
