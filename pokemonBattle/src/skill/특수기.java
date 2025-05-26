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
	public void skillEffect(Pokemon my, Pokemon opp) {
		// TODO Auto-generated method stub
		
	}


}
