package QuanLyCacPhuongTienGiaoThong;

public class PhuongTien {
	private String id;
	private String hangSx;
	private int namSX;
	private double giaBan;
	private String mauXe;
	public PhuongTien(String id2, String hangSx, int namSX, double giaBan, String mauXe) {
		super();
		this.id = id2;
		this.hangSx = hangSx;
		this.namSX = namSX;
		this.giaBan = giaBan;
		this.mauXe = mauXe;
	}
	
	public PhuongTien() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHangSx() {
		return hangSx;
	}
	public void setHangSx(String hangSx) {
		this.hangSx = hangSx;
	}
	public int getNamSX() {
		return namSX;
	}
	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public String getMauXe() {
		return mauXe;
	}
	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}
	@Override
	public String toString() {
		return "PhuongTien [id=" + id + ", hangSx=" + hangSx + ", namSX=" + namSX + ", giaBan=" + giaBan + ", mauXe="
				+ mauXe + "]";
	}
	
	
}