package QuanLyCacPhuongTienGiaoThong;

public class Car extends PhuongTien implements ICar {
	
	private int soChongoi;
	private String kieuDongCo;
	public Car(String iD, String hangSx, int namSX, double giaBan, String mauXe, int soChongoi, String kieuDongCo) {
		super(iD, hangSx, namSX, giaBan, mauXe);
		this.soChongoi = soChongoi;
		this.kieuDongCo = kieuDongCo;
	}
	public int getSoChongoi() {
		return soChongoi;
	}
	public void setSoChongoi(int soChongoi) {
		this.soChongoi = soChongoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	@Override
	public String toString() {
		return "Car [soChongoi=" + soChongoi + ", kieuDongCo=" + kieuDongCo + "]";
	}
	@Override
	public void showInfor() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		
	}
	
}
