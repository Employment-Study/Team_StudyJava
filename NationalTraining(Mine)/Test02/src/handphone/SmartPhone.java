package handphone;

public class SmartPhone  extends HandPhone implements Ringing{
		private boolean touch;
	
	public SmartPhone(String name, String publishDate, int number, boolean touch) {
		super(name, publishDate, number);
		this.touch = touch;
		
	}
	
	public boolean isTouch() {
		return touch;
	}

	public void setTouch(boolean touch) {
		this.touch = touch;
	}

	@Override
	public String toString() {
		String format = "%s(%s) P.H : %d, touch기능 : %b";
		Object[] args = {this.getName(),this.getPublishDate(),this.getNumber(), touch};
		return String.format(format, args);
	}
	@Override
	public String ring() {
		
		return "삼성 알람";
	}
	
}
