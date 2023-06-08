package handphone;

public abstract class HandPhone {
	private String name;
	private String publishDate;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public HandPhone(String name, String publishDate, int number) {
		super();
		this.name = name;
		this.publishDate = publishDate;
		this.number = number;
	}

		public abstract String toString(); 
}
