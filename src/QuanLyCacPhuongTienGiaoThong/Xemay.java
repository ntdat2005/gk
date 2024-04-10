package QuanLyCacPhuongTienGiaoThong;

public class Xemay extends PhuongTien implements ICar {
	private long congSuat;

	public Xemay(String iD, String hangSx, int namSX, double giaBan, String mauXe, long congSuat) {
		super(iD, hangSx, namSX, giaBan, mauXe);
		this.congSuat = congSuat;
	}

	public long getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(long congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String toString() {
		return "Xemay [congSuat=" + congSuat + "]";
	}

	@Override
	public void showInfor() {
		// TODO Auto-generated methsy
		System.out.println();
	}
	
}
