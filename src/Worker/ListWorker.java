package Worker;

public class ListWorker {
	private Worker[] DSCN;
	private int soLuongHienTai = 0;
	
	public ListWorker(int n) {
		try {
			if(n > 0) {
				this.DSCN = new Worker[n];
			}
			else {
				throw new IllegalArgumentException("not !");
			}
		}catch(IllegalArgumentException e) {
			this.DSCN = new Worker[n];
			this.soLuongHienTai = 0;
		}
	}
	

	public boolean addWorker(Worker worker) {
	    try {
	        if (worker == null) {
	            throw new IllegalArgumentException("Không thể thêm công nhân trống (null)!");
	        }
	        if (this.soLuongHienTai < this.DSCN.length) {
	            this.DSCN[this.soLuongHienTai] = worker;
	            this.soLuongHienTai++; 
	            System.out.println("Thêm công nhân thành công!");
	            return true;
	            
	        } else {
	            throw new IllegalArgumentException("Danh sách đã đầy, không thể thêm nữa!");
	        }
	        
	    }catch (IllegalArgumentException e) {
	        System.out.println("Thêm thất bại: " + e.getMessage());
	        return false; 
	    }
	}
	
	public void printAllWorkers() {
	    System.out.println("\n=== DANH SÁCH TOÀN BỘ CÔNG NHÂN ===");
	    if (soLuongHienTai == 0) {
	        System.out.println("Danh sách trống!");
	        return;
	    }
	    for (int i = 0; i < soLuongHienTai; i++) {
	        System.out.println(DSCN[i].toString());
	    }
	}
	public void printWorkersOver200Products() {
	    System.out.println("\n=== CÔNG NHÂN LÀM TRÊN 200 SẢN PHẨM ===");
	    boolean flag = false;
	    for (int i = 0; i < soLuongHienTai; i++) {
	        if (DSCN[i].getmSoSP() > 200) {
	            System.out.println(DSCN[i].toString());
	            flag = true;
	        }
	    }
	    if (!flag) {
	        System.out.println("Không có công nhân nào làm trên 200 sản phẩm.");
	    }
	}
	public void sortByProductsDescending() {
	    for (int i = 0; i < soLuongHienTai - 1; i++) {
	        for (int j = i + 1; j < soLuongHienTai; j++) {
	            if (DSCN[i].getmSoSP() < DSCN[j].getmSoSP()) {
	                Worker temp = DSCN[i];
	                DSCN[i] = DSCN[j];
	                DSCN[j] = temp;
	            }
	        }
	    }
	    System.out.println("\nĐã sắp xếp danh sách công nhân theo số sản phẩm giảm dần!");
	}


	public int getSoLuongCongNhan() {
		return this.soLuongHienTai;
		
		
	}
	
	
} 
