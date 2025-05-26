package pokemon;

import skill.*;
import gameplay.Type;


public class Pokemon {
	
	public String name;
	public double hp;
	public double atk;
	public double def;
	public Type type;
	public Skill[] skill;
	public boolean isAlive = true;
	public int Lv;
	public boolean isDefense = false;
	public double speed;
	public int spdCnt = 0;
	public int atkCnt = 0;
	public Pokemon(String name, Type type, double hp, double atk, double def, double speed, Skill[] skill, int Lv)
	{
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.type = type;
		this.skill = skill;
		this.Lv = Lv;
		this.speed = speed;
	}
	
	public void attack(Skill skillName, Pokemon target, Pokemon myPoki)
	{
		skillName.useSkill(skillName, target, myPoki);
		
	}
	public boolean checkAlive(double hp)
	{
		if(this.hp>0)
		{
			return true;
		}
		return false;
	}
	public boolean checkStrongType(Pokemon myPoki, Pokemon target)
	{
		if(myPoki.type == Type.불 && target.type == Type.풀)
		{
			return true;
		}
		else if(myPoki.type == Type.물 && target.type == Type.불)
		{
			return true;
		}
		else if(myPoki.type == Type.풀 && target.type == Type.물)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkWeakType(Pokemon myPoki, Pokemon target)
	{
		if(myPoki.type == Type.풀 && target.type == Type.불)
		{
			return true;
		}
		else if(myPoki.type == Type.불 && target.type == Type.물)
		{
			return true;
		}
		else if(myPoki.type == Type.물 && target.type == Type.풀)
		{
			return true;
		}
		return false;
	}
	
	public boolean checkDefense(Skill skill) 
	{
		if(skill.name == "방어")
		{
			return true;
		}
		return false;
	}
	public double vital()
	{
		int n = (int)(Math.random()*1000)%100;
		if(n<5)
		{
			return 2;
		}
		return 1;
	}
	

	
}
