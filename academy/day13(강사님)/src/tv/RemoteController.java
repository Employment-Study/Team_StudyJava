package tv;

public class RemoteController {
	
	private TV tv;	// TV 객체를 참조할 수 있는 참조변수
	
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	void turn() 		{	tv.turn();			}
	void channelUp() 	{	tv.channelUp();		}
	void channelDown() 	{	tv.channelDown();	}
	void volumeUp() 	{	tv.volumeUp();		}
	void volumeDown() 	{	tv.volumeDown();	}
	void mute() 		{	tv.mute();			}
	
	void setChannel(int channel) {
		tv.setChannel(channel);
	}
}









