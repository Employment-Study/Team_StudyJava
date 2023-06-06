package construction;

public class Construction {
		private int HP;
		boolean floating = false;
		public int getHP() {
			return HP;
		}
		public void setHP(int hP) {
			HP = hP;
		}
		public boolean isFloating() {
			return floating;
		}
		public void setFloating(boolean floating) {
			this.floating = floating;
		}
		
		public Construction(int hp) {
			this.HP = hp;
		}
		
		
}
