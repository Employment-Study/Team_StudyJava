package handphone;

public class FolderblePhone extends HandPhone implements Ringing{
	boolean fold;

	public FolderblePhone(String name, String publishDate, int number, boolean fold) {
		super(name, publishDate, number);
		this.fold = fold;
	}
	
	@Override
	public String toString() {
		String format = "%s(%s) P.H : %d, touch기능 : %b";
		Object[] args = {this.getName(),this.getPublishDate(),this.getNumber(), fold};
		return String.format(format, args);
	}
	
	public boolean isFold() {
		return fold;
	}

	public void setFold(boolean fold) {
		this.fold = fold;
	}

	@Override
	public String ring() {
		return "아이폰 울림소리";
	}
}
