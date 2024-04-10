package QuanLyCacPhuongTienGiaoThong;

public class Xetai extends PhuongTien implements ICar {
	private double trongTai;

	public Xetai(String iD, String hangSx, int namSX, double giaBan, String mauXe, double trongTai) {
		super(iD, hangSx, namSX, giaBan, mauXe);
		this.trongTai = trongTai;
	}

	public double getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}

	@Override
	public String toString() {
		return "XeTai [trongTai=" + trongTai + "]";
	}

	@Override
	public void showInfor() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		
		
	}
	
}
