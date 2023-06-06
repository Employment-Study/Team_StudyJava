package tv;

public class Main {
public static void main(String[] args) {
	TV tv = new TV();
	TV tv2 = new TV();
	TV tv1 = new SamsungTV();
	Phone p1 = new Phone();
	//수신상태, 날씨
	tv.OnAndOff();
	
	// 생성된 TV객체의 기능 테스트
	
	//1. 채널 1번으로
	tv.channel=999;
	tv.ChannelUp();
	
	//2. 채널 999번으로
	tv.channel=1;
	tv.ChannelDown();
	
	//3. 소리 최대
	tv.volume=20;
	tv.VolumeUp();
	
	//4. 소리 최소, 음소거
	tv.volume =1;
	tv.VolumeDown();
	tv.Mute();
	
	//5. 미러캐스트
	tv.MirrorON();
	tv.MirrorCast();
	tv.MirrorON();
	
	//6. 블루투스
	tv.setPhone(p1);
	tv.B_On();
	p1.B_On();
	tv.Match();
	System.out.println("=================리모컨 연동 후 =============================");
	//7.티비와 리모콘
	RemoteController remocon = new RemoteController();
	
	//리모컨의 메서드를 호출하면, TV의 기능이 작동하도록 코드를 작성하여
	// 아래에서 테스트하세요.
	
	remocon.SelectTV(tv);
	//소리
	remocon.volumeUp();
	remocon.volumeUp();
	remocon.Mute();
	//수신상태
	remocon.Reception();
	//기상
	remocon.CheckWeather();
	//블루투스
	remocon.B_On();
	remocon.B_Off();
	p1.B_Off();
	// 블루투스 연결상태 확인
	tv.Check_B();
	// 연결
	remocon.Match();
	
	
	
	
	
	
	
	

	

}
}
