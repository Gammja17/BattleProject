package skill;

import gameplay.*;
import pokemon.Pokemon;
import java.util.Random;

public abstract class Skill {
	public String name;
	public Type type;
	public double power;
	public int accuracy;

	public double dmg;
	
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

