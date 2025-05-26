package skill;

import gameplay.Type;
import pokemon.*;

public class 위력기 extends Skill {


	public 위력기(String name, Type type, double power, int accuracy) {
		super(name, type, power, accuracy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skillEffect(Pokemon my, Pokemon opp) {
		// TODO Auto-generated method stub
		dmg = this.power + my.atk - opp.def;
		dmg *= checkSameType(my, this) * checkEffective(opp) * checkDouble();
	}

	
}
