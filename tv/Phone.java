package tv;

public class Phone implements Bluetooth{
	String youtube = "롤 챔스";
	public boolean bluetooth = false;
	
	
	@Override
	public void B_On() {
		bluetooth = !bluetooth;
	}

	@Override
	public void B_Off() {
		bluetooth = !bluetooth;
	}
	
	
	
}
