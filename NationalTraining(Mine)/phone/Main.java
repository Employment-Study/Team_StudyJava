package phone;

import java.io.*;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Phone p1 = new Phone("이선로", "010-5805-8510");
	Phone p2 = new Phone("이로","010-1234-5678");
	
	p1.PowerOn();
	
	//소리
	p1.volume = 100;
	p1.VolumeUp();
	p1.volume=0;
	p1.VolumeDown();
	p1.volume=50;
	p1.Mannermode();
	p1.Mannermode();
	
	
	//연락처
	
//	p1.addContact(sc);
//	p1.ContactStatus();
//	p1.RemoveContact(sc);
	
	//메세지 주고받기
	p1.SendMail(p2);
	p2.RecieveMail(p1);
	
}
}
