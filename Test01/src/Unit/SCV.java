package Unit;

import construction.CommandCenter;

public class SCV  extends Unit{
		
	
	public SCV() {
		super(50, 120, 1, 0, 0);
	}
	
	public void BuildingCommander(CommandCenter c1) {
		c1 = new CommandCenter();
	};
	
}
