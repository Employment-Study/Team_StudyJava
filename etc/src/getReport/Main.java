package getReport;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 신고 맵
        HashMap<String, String> reportMap = new HashMap<String, String>();
        // 신고받은횟수
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        // 신고리스트
        HashSet<String> dup = new HashSet<String>();
        
        for(String s : report) {
        	// 신고
        	String key = s.split(" ")[0];
        	String value = s.split(" ")[1];
        	if(reportMap.get(key) == null || reportMap.get(key).isEmpty()) {
        		reportMap.put(key, value);
        	}else {
        		reportMap.put(key, reportMap.get(key)+" "+value);
        	}
        }

        // 신고받은 횟수  
        for(String s : id_list) {
        	if(!(reportMap.get(s)==null)) {
        		String[] arr = reportMap.get(s).split(" ");
        		for(String a : arr) {
        			if(countMap.containsKey(a)  && !(dup.contains(s)) ) {
        				dup.add(s);
        				countMap.put(a,countMap.get(a)+1);
        			}else {
        				countMap.put(a,1);
        			}
        		}
        	}
        }

        for(int i=0;i<answer.length;i++) {
        	int count = 0;
        	if(reportMap.get(id_list[i]) != null ) {
        		String[] arrAns = reportMap.get(id_list[i]).split(" ");
        		for(int j=0;j<arrAns.length;j++) {
            		if(countMap.containsKey(arrAns[j])) {
            			if(countMap.get(arrAns[j])>=k) {
            				count++;
            			}
            		}
            	}
        	}
        	answer[i] = count;
        }
        
        return answer;
    }
}
*/

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        // 한 유저가 같은 유저를 신고한 경우를 제외함.
        List<String> noRedun = new ArrayList<>(new HashSet<>(Arrays.asList(report)));
        Map<String,Integer> reported = new HashMap<>();  // 유저별 신고당한 횟수
        Map<String, ArrayList<String>> relation = new HashMap<>();   // 유저별 신고 관계
        int[] answer = new int[id_list.length];          // 정답
        int n_size = noRedun.size();
        int id_size = id_list.length;

        for(int i=0;i<id_size;i++){  // 이용자를 위한 신고 서비스 생성
            relation.put(id_list[i],new ArrayList<>()); // 관계
            reported.put(id_list[i],0); // 횟수
        }

        for(int j=0;j<n_size;j++){   // (이용자 신고자) 배열을 순회

            String[] member = noRedun.get(j).split(" ");        // (이용자 신고자)
            ArrayList<String> check = relation.get(member[0]);  // 이용자의 신고자 목록을 가져옴    
            check.add(member[1]);   // 신고자 목록 추가
            relation.put(member[0],check);  // 신고 관계 추가
            reported.put(member[1],reported.get(member[1])+1);  // 이전 횟수에 1을 더함
        }    

        for(int i=0; i<id_size; i++){

            List<String> reId = relation.get(id_list[i]);   // 사용자가 신고한 ID들을 받아옴.

            if(reId != null){
                for(String user : reId){   // 유저별 신고당한 횟수를 순회

                    // 사용자가 신고한 유저가 정지 기준에 도달했다면
                    if(reported.get(user) >= k){
                        answer[i]++;          // 처리 결과 메일 수 증가
                    }
                }    
            }

        }

        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		String[] id_list = {
				"muzi", "frodo", "apeach", "neo"
		};
		String[] report = {
				"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"
		};
		
		int k = 2;
		
		Solution sol = new Solution();
		
		System.out.println(Arrays.toString(sol.solution(id_list, report, k)));
		
		
	}
}
