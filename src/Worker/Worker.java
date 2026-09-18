package Worker;

public class Worker {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	public Worker(String maCN, String mHo, String mTen, int mSoSP) {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}

	public String getMaCN() {
		return maCN;
	}

	public void setMaCN(String maCN) {
		try {
		    if(maCN.length() >= 4 && maCN.length() <= 7) {
			   this.maCN = maCN;
		    }
		    else {
		    	throw new IllegalArgumentException("Độ dài mã công nhân không hợp lệ!");
		    }
		}
		catch(IllegalArgumentException e) {
			this.maCN = null;
		}
		
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		try {
			if(mSoSP > 0) {
				this.mSoSP = mSoSP;
			}
			else {
				throw new IllegalArgumentException("Số sản phẩm của bạn nhập sai");
			}
		} catch(IllegalArgumentException e) {
			this.mSoSP = 0;
		}
	}
	
	public double calculateSalary(int mSoSP) {
		double Salary;
		try {
			if(this.getmSoSP() != 0 && this.getmSoSP() < 200) {
				Salary = this.getmSoSP() * 0.5;
				return Salary;
			}
			else if(this.getmSoSP() < 400) {
				Salary = (this.getmSoSP()-199) * 0.55 + 199 * 0.5;
				return Salary;
			}
			else if(this.getmSoSP() < 600) {
				Salary = (this.getmSoSP()-399) * 0.6 + 200 *0.55 + 199 * 0.5;
				return Salary;
			}
			else if(this.getmSoSP() >= 600) {
				Salary = (this.getmSoSP()-599) * 0.65 + 200 * 0.6 + 200 *0.55 + 199 * 0.5;
				return Salary;
			}
			else {
				throw new IllegalArgumentException("Không co luong vì số lượng sản phẩm 0");
			}
		}catch(IllegalArgumentException e) {
			Salary =0;
			return Salary;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-20s | %-10d | %-10.2f", getMaCN(), getmHo(), getmTen(), getmSoSP());
	} 
	
	
	
	
	
	

}
