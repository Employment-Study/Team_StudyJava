package tv;

public class SamsungTV extends TV implements Bluetooth{
	public SamsungTV() {
		super();
	}
	@Override
	public void B_On() {
		bluetooth = !bluetooth;
		super.B_On();
	}@Override
	public void B_Off() {
		bluetooth = !bluetooth;
		super.B_Off();
	}
	
}
