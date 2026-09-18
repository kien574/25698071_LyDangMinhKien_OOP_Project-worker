package Worker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập kích thước tối đa của danh sách công nhân: ");
        int n = sc.nextInt();
        sc.nextLine();
        ListWorker qlcn = new ListWorker(n);
        System.out.print("Bạn muốn nhập bao nhiêu công nhân vào danh sách? ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("\nNhập thông tin công nhân thứ " + (i + 1) + ":");
            System.out.print("Nhập mã công nhân (4-7 ký tự): ");
            String maCN = sc.nextLine();
            System.out.print("Nhập số sản phẩm: ");
            int soSP = sc.nextInt();
            sc.nextLine();
            Worker w = new Worker("LDMK001", "Lý", "Kien", 200);
            w.setMaCN(maCN); 
            w.setmSoSP(soSP);
            boolean isAdded = qlcn.addWorker(w);
            if (!isAdded) {
                System.out.println("Bỏ qua công nhân này do nhập lỗi hoặc danh sách đầy.");
            }
        }
        System.out.println("\nSố lượng công nhân hiện có: " + qlcn.getSoLuongCongNhan());
        qlcn.printAllWorkers();
        qlcn.printWorkersOver200Products();
        qlcn.sortByProductsDescending();
        qlcn.printAllWorkers();
        
        sc.close();

	}

}
