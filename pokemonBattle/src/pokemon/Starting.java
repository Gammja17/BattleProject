package pokemon;

import gameplay.Type;

import skill.Skill;

public class Starting extends Pokemon {

	int exp = 0;
	
    public Starting(String name, Type type, double hp, double atk, double def, double speed, Skill[] skill, int Lv, int exp) {
		super(name, type, hp, atk, def, speed, skill, Lv);
		this.exp = exp;
		
		// TODO Auto-generated constructor stub
	}
    
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
                this.Lv = i + 1;  // index 0 → lv 1, index 1 → lv 2 ...
                this.hp += this.Lv*10;
            	this.atk += this.Lv*2;
                this.def += this.Lv*2;
                this.speed += this.Lv*3;
                break;
            }
        }
    }
    
    

}
