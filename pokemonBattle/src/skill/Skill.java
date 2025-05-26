package skill;
import pokemon.Pokemon;

import gameplay.*;
import pokemon.Pokemon;
import java.util.Random;

public class Skill {
	public double power;
	public int accuracy;
	public String name;
	public Type type;
	
	public Skill(String name, double power, int accuracy, Type type)
	{
		this.name = name;
		this.power = power;
		this.accuracy = accuracy;
		this.type = type;
	}
	
	public boolean checkType(Pokemon myPoki)
	{
		if(myPoki.type == this.type)
		{
			return true;
		}
		return false;
	}
	
	public void useSkill(Skill skillName, Pokemon target, Pokemon myPoki)
	{
		double damage;
		damage = skillName.power;
		damage += myPoki.atk - target.def;
		if(myPoki.checkStrongType(myPoki, target))
		{
			damage *= 2;
		}
		if(myPoki.checkWeakType(myPoki, target))
		{
			damage *= 0.5;
		}
		if(skillName.checkType(myPoki))
		{
			damage *= 1.2;
		}
		damage *= myPoki.vital();
		target.hp -= damage;
		target.isDefense = false;
	}
	
}

