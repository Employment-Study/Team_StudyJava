package tv;


// 필드와 메서드
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다.


//최대 최널에서 돌아가면 다시 1번부터 시작
//최대와 최소 볼륨 설정
//음소거


public class TV implements Bluetooth {
	//필드(볼륨,최대/최소 볼륨)(채널, 최대채널, 최소최널)(전원)
	public static int cnt;
	
	static {cnt++;}
	
	//전원
	public  boolean power;
	//볼륨
	static boolean mute;
	public  int volume;
	final  int MAX_VOLUME = 20;
	final  int MIN_VOLUME = 0;
	//채널
	public  int channel;
	static final int MAX_CHANNEL = 999;
	static final  int MIN_CHANNEL = 1;
	public  int  kind = (int)(Math.random()*1000)+1;
	//안테나 조정
	public  int reception_statment = (int)(Math.random()*100)+1;
	//날씨
	public  String[] weather = {"맑음","흐림","태풍","천재지변"};
	//미러캐스트
	public  boolean mirrorOn = false;
	Phone p1 = new Phone();
	//블루투스
	public  boolean bluetooth = true;
	
	
	
	
	
	//생성자
	public TV() {
		power = false;
		mute = false;
		volume=0;
		channel = 1;
		System.out.printf("TV : ON \t channel : %d\tvolume=%d\n", channel,volume);
		
		
	}
	
	
	
	//메서드
	//전원 메서드(on/off)
	public  void OnAndOff() {
		power = !power;
		ChannelState();
		CheckWeather();
		Reception();
	}
//	 ================================================================전원 메서드 끝
	// 볼륨메서드(mute, up,down)
	public void VolumeUp() {
		if(power) {
		if(volume == MAX_VOLUME) System.out.println("최대 볼륨입니다.");
		else 					 volume++;
		
		if(mute == true) {
			mute = !mute;
			System.out.println("음소거 해제");
		}
		}
		System.out.println("voluem : " +volume);
		System.out.println();
	}//VolumeUp
	
	public void VolumeDown() {
		if(power) {
			volume--;
			
		if(volume == MIN_VOLUME|| volume <0) {
			System.out.println("음소거 되었습니다.");
			mute = true;
		}
		if (volume-1 == MIN_VOLUME) System.out.println("Mute모드 ON");
		System.out.println("volume : "+ volume);
		}
		System.out.println();
	}//VolumeDown
	
	public void Mute() {
		if(power) {
		if(mute) System.out.println("이미 음소거상태입니다.");
		else {mute= !mute;
			System.out.println("음소거되었습니다.");
		}
		}
		
		System.out.println();
	}//Mute
//	 ================================================================소리 메서드 끝
//	채널 메서드(채널 Up,Down)
	public  void ChannelState() {
		if(power && !mirrorOn ) {
		if(channel >= 600) System.out.println("드라마 상영중");
		else if(channel<600 && channel >=200) System.out.println("예능 상영중");
		else System.out.println("뉴스 방송중");
		}
		else {
			System.out.println(p1.youtube+"미러링중");
		}

		System.out.println();
	}//ChannelState
	public  void ChannelUp() {
		if(power) {
		if(channel == MAX_CHANNEL) 				channel=1;
			
		else 									++channel;
		
		System.out.println("channel:"+channel);		
		ChannelState();
		}
		System.out.println();
	}//ChannelUp
	
	public  void ChannelDown() {
		if(power) {
		if(channel == MIN_CHANNEL) channel=999 ;
		else --channel;
		System.out.println("channel:"+channel);
		ChannelState();
		}
		System.out.println();
	}//ChannelDown
//	 ================================================================채널 메서드 끝
	
	public  void Reception(){
		if(power) {
		if (reception_statment >=50)
		System.out.printf("수신상태가 %d로 양호합니다.\n",reception_statment);
		else {
			System.out.println("=====================================================");
			System.out.printf("수신 상태가 %d로 불량합니다 네트워크를 조정합니다.\n",reception_statment);;
			System.out.println("=====================================================");
			while(true) {
				reception_statment = (int)(Math.random()*100)+1;
				System.out.println("조정중 ...\nreception_statment :"+reception_statment);
				if(reception_statment>=50) {System.out.println("조정완료"); break;}
				}
			}
		}
		System.out.println();
	}
	public  void CheckWeather() {
		if(power) {
		int weath = (int)(Math.random()*4);
		String Now = weather[weath];
		System.out.println("날씨:" +Now);
		
		if(Now.equals("천재지변")||Now.equals("태풍")) { power = !power; 
		
			while(true) {
				System.out.println("=====================================================");
				System.out.println("천재지변 또는 태풍으로 티비가 꺼졌습니다.날씨가 다시 맑아지길 기다려주세요"
						+ "\n날씨 : "+weather[weath]);
				System.out.println("=====================================================");
				weath = (int)(Math.random()*4);
				Now = weather[weath];
				if(Now.equals("맑음") ||Now.equals("흐림")) {
					power = !power;
					System.out.println("현재 날씨 : " + Now);
					System.out.println("Tv 가 다시 켜졌습니다.");
					break;
					}
				}
			}
		}//if(power)
		System.out.println();
	}//Weather
	
//	 ================================================================ 수신상태 메서드 끝
	public void MirrorON(){
		mirrorOn = !mirrorOn;
		if(!mirrorOn) {
			System.out.printf("화면이 다시 %d번으로 돌아갑니다. 현재:",channel);
			ChannelState();
		}
	}
	public void MirrorCast(){
	System.out.println("화면이 "+p1.youtube+"로 전환되었습니다.");
	}

//	 ================================================================미러링 메서드 끝
	public void setPhone(Phone p1) {
		this.p1 = p1;
	}
	
	public void Match() {
		if(p1.bluetooth && bluetooth) System.out.println("블루투스 연결완료");
		else System.out.println("연결 실패 , 두 기기의 블루투스를 켜주세요");
	}
	
	public void Check_B() {
		if(bluetooth && p1.bluetooth) System.out.println("두 기기 모두 ON되어 있습니다.");
		else if(bluetooth || !p1.bluetooth) System.out.println("p1의 블루투스를 켜주세요");
		else if(!bluetooth || p1.bluetooth) System.out.println("tv의 블루투스를 켜주세요");
		else System.out.println("두 기기 모두 OFF되어 있습니다.");
	}
	
	@Override
	public void B_On() {
		bluetooth = !bluetooth;
		if (bluetooth) 	System.out.println("ON");
		
	}

	@Override
	public void B_Off() {
		bluetooth = !bluetooth;
		if (!bluetooth) System.out.println("OFF");
		
	}
	
//	 ================================================================미러링 메서드 끝
	public String toString() {
		
		String name = String.format("TV%d", cnt);
		
		return name;
	}
	
//	 ================================================================ 기타 기능
	
	
}
