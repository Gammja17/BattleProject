package skill;

import gameplay.Type;
import pokemon.Pokemon;

public class 특수기 extends Skill {

	public 특수기(String name, double power, int accuracy, Type type) {
		super(name, power, accuracy, type);   
		this.name = name;
	    this.type = type;
	    this.power = 0;
	    this.accuracy = accuracy;

	}

	@Override
	public void useSkill(Skill skillName, Pokemon target, Pokemon myPoki)
	{
		if(skillName.name.equals("고속이동"))
		{
			myPoki.spdCnt++;
			myPoki.speed += 10;
		}
		else if(skillName.name.equals("칼춤"))
		{
			myPoki.atkCnt++;
			myPoki.atk += 10;
		}
	}
}
