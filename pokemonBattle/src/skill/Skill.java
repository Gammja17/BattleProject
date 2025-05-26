package skill;
import pokemon.Pokemon;

import gameplay.*;
import pokemon.Pokemon;
import java.util.Random;

public abstract class Skill {
<<<<<<< HEAD
	
	
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
	
	public double skillAct()
	{
		int damage = this.power;
		
		return damage;
	}
	
	private boolean vital()
	{
		int n = (int)(Math.random()*1000)%100;
		if(n<5)
		{
			return true;
		}
	}
	
//	public int dmg, hittingRate, type;
//	public String name;
//	public int skillForm; //1은 물리, 2는 특수
=======
	public String name;
	public Type type;
	public double power;
	public int accuracy;

	public double dmg;
>>>>>>> 461bd95d39c61ce74e4da9d823e0ede2b54d5f63
	
	public Skill(String name, Type type, double power, int accuracy) {
		   this.name = name;
	       this.type = type;
	       this.power = power;
	       this.accuracy = accuracy;

	}
	
	public abstract void skillEffect(Pokemon my, Pokemon opp);
	
	private static final Random random = new Random();
	
	public boolean checkHit() {
		  int roll = random.nextInt(100) + 1; // 1 ~ 100
	        return roll <= accuracy;
	}
	
	public double checkSameType(Pokemon my, Skill skill) {
		if(my.type == skill.type) {
			return 1.2;
		}
		return 1.0;
	}

    public double checkEffective(Pokemon opp) {
        return this.type.effective(opp.type);
    }
    
    public double checkDouble() {
    	 int roll = random.nextInt(100) + 1; 
	     if(roll <= 5) return 2.0;
		return 1.0;
	     
    }
    
    
    
}

