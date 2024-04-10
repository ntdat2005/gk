package QuanLyCacPhuongTienGiaoThong;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VehicleManager BMNG = new VehicleManager();
        Scanner k = new Scanner(System.in);
        boolean check = true;
        int choose = 0;
        while (check == true) {
            System.out.println("Thêm xe hơi!");
            System.out.println("Thêm xe máy!");
            System.out.println("Thêm xe tải");
            System.out.println("hiển thị thông tin tất cả xe");
            System.out.println("Lưu thành file");
            System.out.println("đọc file");
            System.out.println("Thoát");
                    
            System.out.print("Chon: ");
            choose = k.nextInt();
            switch (choose) {
                case 1:
                    BMNG.addCar();
                    break;
                case 2:
                    BMNG.addMotorcycle();
                    break;
                case 3:
                    BMNG.addTruck();
                    break;
                case 4:
                    BMNG.showAllVehicles();
                    break;
                
                case 5:
                    BMNG.saveToFile(null);;
                    break;
                case 6:
                    BMNG.readFromFile(null);;
                    break;
                case 7:
                    check = false;
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Chi chon tu 1 den 7!");
                    break;
            }
        }
	}
}