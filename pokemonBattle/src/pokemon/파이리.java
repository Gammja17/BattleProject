package pokemon;

import skill.*;

public class 파이리 extends Starting {
	

	public 파이리(int lv) {
		name = "파이리";
		type = 3;
		
		hp = 90;
		atk = 40;
		def = 30;
		spAtk = 30;
		spDef = 20;
		spd = 30;
		this.lv = lv;
		skill[0] = new 할퀴기();
		learnSkill();
	}
	
	
	
	@Override
	public void learnSkill() {
		// TODO Auto-generated method stub
		if (lv >= 3 && skill[1] == null) {
            skill[1] = new 불꽃세례();
        }
		if (lv >= 5 && skill[2] == null) {
            skill[2] = new 용의분노();
        }

		if (lv >= 8 && skill[3] == null) {
            skill[3] = new 화염방사();
        }

	}
	
	
}
