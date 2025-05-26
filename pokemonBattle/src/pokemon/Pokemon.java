package pokemon;

import skill.Skill;


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
		int damage;
		damage = skillName.skillAct();
		damage += this.atk - target.def;
		if(checkStrongType(myPoki, target))
		{
			damage *= 2;
		}
		if(checkWeakType(myPoki, target))
		{
			damage *= 0.5;
		}
		if(skillName.checkType(myPoki))
		{
			damage *= 1.2;
		}
		if(target.defense(target.isDefense))
		{
			damage *= 0.3;
		}
		damage *= vital();
		target.hp -= damage;
		
		
	}
	public boolean checkAlive(double hp)
	{
		if(this.hp>0)
		{
			return true;
		}
		return false;
	}
	private boolean checkStrongType(Pokemon myPoki, Pokemon target)
	{
		if(myPoki.type == "Fire" && target.type == "Grass")
		{
			return true;
		}
		else if(myPoki.type == "Water" && target.type == "Fire")
		{
			return true;
		}
		else if(myPoki.type == "Grass" && target.type == "Water")
		{
			return true;
		}
		return false;
	}
	
	private boolean checkWeakType(Pokemon myPoki, Pokemon target)
	{
		if(myPoki.type == "Grass" && target.type == "Fire")
		{
			return true;
		}
		else if(myPoki.type == "Fire" && target.type == "Water")
		{
			return true;
		}
		else if(myPoki.type == "Water" && target.type == "Grass")
		{
			return true;
		}
		return false;
	}
	
	public boolean defense(Skill skill) //지금 사용 스킬이 방어하기이면 여기에 인자 보내기?
	{
		if(skill == /*여기에 방어 넣기*/)
		{
			return true;
		}
		return false;
	}
	private double vital()
	{
		int n = (int)(Math.random()*1000)%100;
		if(n<5)
		{
			return 2;
		}
		return 1;
	}
	
	
	
	

	
	
	
	
//	public String name;
//	
//	public int hp, atk, def, spAtk, spDef, spd;
//	public int lv;
//	public int type; // 1 = 노말, 2 = 풀, 3 = 불, 4 = 물
//	public Skill[] skill = new Skill[4];
//	
//	public void useSkill(Skill skill, Pokemon target) {
//	    System.out.println(name + "이(가) " + skill.name + "을(를) 사용했습니다!");
//	    target.hp -= skill.dmg;
//	    System.out.println(target.name + "의 남은 HP: " + target.hp);
//	}
//	
	
}
