package phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Phone {
	//전화번호부
	//전원
	//소리
	//문자보내기
	String name;
	String phoneNumber;
	HashMap<String, String> contact = new HashMap<>();
	
	boolean power;
	
	int volume;
	final static int MAX_VOLUME=100;
	final static int MIN_VOLUME=0;
	int save_volume;
	
	boolean mannerMode;
	String content = "";
	
	
	
	
	Phone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		power = false;
		volume =0;
		mannerMode= false;
		
	}
	//1. 전원 on/off
	public void PowerOn() {
		power = !power;
	}
	public void PowerOff() {
		power = !power;
	}
	
	//2. 소리
	public void VolumeUp() {
		if(power) {
		if( volume == MAX_VOLUME) System.out.println("이미 최대 볼륨입니다.");
		else {volume++; System.out.println("volume : " + volume);}
	
		}
		
	}//VolumeUp
	public void VolumeDown() {
		if(power) {
		if(volume == MIN_VOLUME) System.out.println("음소거 모드입니다.");
		else {volume--; System.out.println("volume :" + volume);}
		}
		
	}//VolumeDown	
	public void Mannermode() {
		
		if(power) {
		mannerMode = !mannerMode;
		if(mannerMode) {volume=0; System.out.println("매너모드 ON");}
		else System.out.println("매너모드  OFF");
		}
	}//Mannermode
	
	//3. 연락처
	public void addContact(Scanner sc) {
		if(power) {
		System.out.print("이름 : ");
		String name =sc.nextLine();
		
		System.out.println("\n연락처 :");
		String Number = sc.nextLine();
		
		contact.put(name, Number);
		
		}
	}//addContact
	
	public void ContactStatus() {
		if(power) {
//		for(Entry<String, String> entrySet: contact.entrySet()) 
//			System.out.println(entrySet.getKey()+" : " +entrySet.getValue());
		
		contact.forEach((key,value) -> {System.out.println(key + " : " + value);
		});
		}
	}//ContactStatus
	
	public void RemoveContact(Scanner sc) {
		if(power) {
		System.out.println("삭제하려는 이름 : ");
		String name = sc.nextLine();
		
		if(contact.containsKey(name)) {contact.remove(name); System.out.println("삭제 성공");}
		else System.out.println("존재하지 않는 이름입니다.");
		
		}
	}//RemoveContact
	
	
	//문자 보내기
	
	public void SendMail(Phone other) {
		if(power) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("여러 줄의 문장을 입력하세요. 입력이 끝나면 빈 줄을 입력하세요.");
	        
	        StringBuilder inputBuilder = new StringBuilder();
	        try {
	            String line;
	            while ((line = reader.readLine()) != null && !line.isEmpty()) {
	                inputBuilder.append(line).append('\n');
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        this.content= inputBuilder.toString();

		
		 
//		other.RecieveMail(this, content);
		}
	}//SendMail
	public void RecieveMail(Phone other) {
		System.out.print("내용 : "+ other.content );
	}
	
}//RecieveMail
