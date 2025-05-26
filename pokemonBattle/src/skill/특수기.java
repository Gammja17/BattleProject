package skill;

import gameplay.Type;
import pokemon.Pokemon;

public class 특수기 extends Skill {

	public 특수기(String name, Type type, double power, int accuracy) {
		super(name, type, power, accuracy);   
		this.name = name;
	    this.type = type;
	    this.power = power;
	    this.accuracy = accuracy;

	}

	@Override
	public void useSkill(Skill skillName, Pokemon target, Pokemon myPoki)
	{
		double damage;
		damage = skillName.power;
		damage += myPoki.atk - target.def;
		if(checkStrongType(myPoki, target))
		{
			damage *= 2;
		}
		if(checkWeakType(myPoki, target))
		{
			damage *= 0.5;
		}
		if(checkType(myPoki))
		{
			damage *= 1.2;
		}
		damage *= vital();
		target.hp -= damage;

	}
	


}
