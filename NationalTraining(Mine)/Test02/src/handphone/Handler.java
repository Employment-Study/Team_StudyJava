package handphone;

import java.util.Arrays;
import java.util.function.Predicate;

public class Handler {

	HandPhone[] arr = new HandPhone[10];

	
	//1. 목록
	public HandPhone[] selectAll() {
		
		return arr; 
		
	}

	//2. 추가
	public int insert(HandPhone hp) {
		int row =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == null) {
				arr[i] = hp;
				row = 1;
				break;
			}
		}
		return row;
	}

	
	//3. 검색 
	public HandPhone[] findList(String search) {
		int cnt =0;
		Predicate<HandPhone> p = i-> i!=null && i.getName().contains(search); 
		for(int i=0;i<arr.length;i++) {
			if(p.test(arr[i])) cnt++;
		}
		int cnt2=0;
		HandPhone[] newArr = new HandPhone[cnt];
		for(int i=0;i<arr.length;i++) {
			if(p.test(arr[i])) newArr[cnt2++]=arr[i];
		}
		return newArr;
	}
	//정렬
	public void sort(int num3) {
		if(num3 ==1) Arrays.sort(arr,(a,b)-> 
		{
			if(a!=null && b!= null)  return a.getName().compareTo(b.getName());
			return 0;
		});
		else if(num3 ==2) Arrays.sort(arr, (a,b) -> {
			if(a!=null && b!= null) return a.getNumber()- b.getNumber();
			return 0;
		});
		else Arrays.sort(arr,(a,b) -> {
			if(a!=null && b!= null) return a.getPublishDate().compareTo(b.getPublishDate());
			return 0;
			});
		
	}

	public int delete(String select) {
		int row =0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=null && arr[i].getName().equals(select)) 
			{
				arr[i]=null; 
			row =1;
			}
		}
		
		return row;
	}
}
