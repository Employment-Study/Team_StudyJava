package englishWordChain;

import java.util.Arrays;
import java.util.Stack;
// 영어 끝말 잇기
class Solution {
	public int[] solution(int n, String[] words) {		// n은 참여자의 수
		int[] answer = new int[2];						// 2 ~ 10명
		int step = 1;									// 1단계
		int count = 0;									
		char prev = 1;									// 이전 단어
		
		Stack<String> wordStack = new Stack<String>();					// 단어 저장 및 STACK
		
		loop1:for(String s : words) {
			if (!wordStack.isEmpty())
				prev = wordStack.peek().charAt(wordStack.peek().length()-1);
			if(wordStack.isEmpty()) {							// 비었으면 바로 push
				wordStack.push(s);
				count++;
			}else if(prev == s.charAt(0)) {						// 뒷자리와 앞자리가 일치하고 
				for(String pwords : wordStack) {				// 중복 x
					if(pwords.equals(s)) {						// 중복
						count++;								
                        answer[0] = count;
			            answer[1] = step;
						break loop1;							// 라벨링으로 바깥 for문 탈출
					}
				}
				// 중복 검사 마저 끝났으면
				wordStack.push(s);
				count++;
			}else {												// 앞자리 불일치
				count++;
                answer[0] = count;
			    answer[1] = step;
				break;
			}
			if(count == n) {									// index계산
				count = 0;
				step += 1;
			}	
		}// end of for		
		return answer;
	}
}

public class Main {
	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother","robot","tank"};
		int n = 3;
		
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(n, words)));
		
	}
}
