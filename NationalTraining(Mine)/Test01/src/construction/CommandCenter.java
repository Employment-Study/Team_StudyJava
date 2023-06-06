package construction;

import Unit.Unit;

public class CommandCenter  extends Construction{
		private static int cnt= 0;
	
		public CommandCenter() {
			super(200);
			cnt++;
			System.out.printf("CommandCenter%d 건설완료%n ",cnt);
		}
		
		public void Floating() {
			this.floating = !floating;
			System.out.println("플로팅 상태 입니다.");
		}
}
