package lotto;

/*
	순위	당첨 	내용
	1	6개 번호가 	모두 일치
	2	5개 번호가 	일치
	3	4개 번호가 	일치
	4	3개 번호가 	일치
	5	2개 번호가 	일치
	6(낙첨)	그 외 
 
 */
// 로또의 최고 순위와 최저 순위
class Solution {
	public int[] solution(int[] lottos, int[] win_nums) { 
		int maxRate = 1;	// 최고 등수
		int minRate = 6;	// 최저 등수
		int[] answer = new int[2];	// {최고 등수, 최저 등수}
		int count = 0;		// 일치하는 갯수
		
		// 먼저 가려진 번호 0을 포함하여 비교하여 보이는 숫자만으로 등수 체크
		for(int i=0;i<win_nums.length;i++) {
			for(int j=0;j<lottos.length;j++) {
				if(win_nums[i]==lottos[j]) {
					count++;
					break;
				}
			}
		}
		// 최소 등수를 구한후 변수에 저장
		minRate = rank(count);
		// 0으로 가려진 등수를 모두 당첨이라고 가정한다음 최고 등수를 구함
		for(int i=0;i<lottos.length;i++) {
			if(lottos[i] == 0) {
				count++;
			}
		}
		// 최고 등수
		maxRate = rank(count);
		
		answer[0]=maxRate;
		answer[1]=minRate;
		
		return answer;
	}

	public int rank(int count) {	// 등수 매기기
		int rate = 0;
		switch(count) {
		case 6:
			rate = 1;
			break;
		case 5:
			rate = 2;
			break;
		case 4:
			rate = 3;
			break;
		case 3:
			rate = 4;
			break;
		case 2:
			rate = 5;
			break;
		default:
			rate = 6;
		}
		return rate;
	}
}

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] lottos = {44,1,0,0,31,25};
		int [] win_nums = {31,10,45,1,6,19};
		
		s.solution(lottos, win_nums);
	}
}
