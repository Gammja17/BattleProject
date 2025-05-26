package skill;

import pokemon.Pokemon;
import gameplay.Type;

public class NormalSkill implements Skill{
	
	int power;
	int accuracy;
	Type SkillType;
	
	public NormalSkill(int power, int accuracy, Type SkillType) {
		this.power = power;
		this.accuracy = accuracy;
		this.SkillType = SkillType;
	}
	
	public void useSkill(Pokemon me, Pokemon target) {
		int damage;
		
		damage = power + me.atk - target.def; // 아직 타입별 구현 안함
		if (Math.random() * 100 < accuracy) {
			target.decreaseHP(accuracy);
		}
	}
	
	private int typeCalculator() {
		return 1;
	}

}
