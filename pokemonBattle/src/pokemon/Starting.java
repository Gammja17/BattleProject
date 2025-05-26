package pokemon;

import gameplay.Type;
import skill.Skill;

public class Starting extends Pokemon {

    public Starting(String name, double hp, double atk, double def, double spd, Type type) {
		super(name, hp, atk, def, spd, type);
		// TODO Auto-generated constructor stub
	}

	int exp = 0;
    private final int[] expTable = {0, 2, 5, 9, 14, 20, 27, 35, 44, 54};

    public void learnSkill(Starting starting, int i, Skill skill) {
    	this.skill[i] = skill;
    }
    
    public void gainExp(int gainedExp) {
        this.exp += gainedExp;
        updateLevel();
    }

    private void updateLevel() { //레벨업 처리
        for (int i = expTable.length - 1; i >= 0; i--) {
            if (exp >= expTable[i]) {
                lv = i + 1;  // index 0 → lv 1, index 1 → lv 2 ...
                this.hp += lv*10;
            	this.atk += lv*2;
                this.def += lv*2;
                this.spd += lv*3;
                break;
            }
        }
    }
    
    

}
