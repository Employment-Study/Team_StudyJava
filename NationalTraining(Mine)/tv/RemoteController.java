package tv;

public class RemoteController {
	 TV tv;	// TV객체를 참조할 수 있는 참조변수
	 Phone p1;
	 
	 public void SelectTV(TV tv) {
		 this.tv = tv;
		 
		 System.out.println("연결된 tv : " +tv.toString());
	 }
	 
	 public void SelectPhone(Phone p1) {
		 this.p1 = p1;
	 }
	 
	 public void TurnOnTV() {
		 
	 }
	 public void TurnOffTV() {
		 tv.OnAndOff();
	 }
	 
	 public void volumeUp() {
		 tv.VolumeUp();
	 }
	 
	 public void volumeDown() {
		 tv.VolumeDown();
	 }
	 
	public void Mute() {
		tv.Mute();
	}
	
	public void Reception() {
		tv.Reception();
	}
	public void CheckWeather() {
		tv.CheckWeather();
	}
	
	public void B_On() {
		tv.B_On();
	}
	
	public void B_Off() {
		tv.B_Off();
	}
	public void Match() {
		tv.Match();
	}
	
	public void B_Check() {
		tv.Check_B();
	}
	 
	 
	 
}
