package tyingString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 문자열 묶기
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int maxValue = 0;
        
        // HashMap에 key, value로 길이를 Key로 둔 갯수(value) Map을 만듦
        Map<Integer, Integer> numArr = new HashMap<Integer, Integer>();
        
        for(int i=0;i<strArr.length;i++) {
        	if(numArr.get(strArr[i].length())!= null)
        		numArr.put(strArr[i].length(), numArr.get(strArr[i].length())+1);
        	else
        		numArr.put(strArr[i].length(), 1);
        }
        
        Set set = numArr.entrySet();
        Iterator iterator = set.iterator();
        
        // 반복자(iterator)를 사용하여 다음 요소가 없을 때까지 값을 가져와서 MAX값과 비교
        while(iterator.hasNext()) {
        	Entry<Integer, Integer> entry = (Entry)iterator.next();
        	int value = (Integer)entry.getValue();
        	if(value > maxValue) {
        		maxValue = value;
        	}
        }
        
        answer = maxValue;
        return answer;
    }
}
public class Main {
	public static void main(String[] args) {
		String[] strArr = {"a","bc","d","efg","hi"};
		
		Solution s = new Solution();
		System.out.println(s.solution(strArr));
		
	}
}
