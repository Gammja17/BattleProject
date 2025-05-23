package pokemon;

import skill.Skill;

public abstract class Starting extends Pokemon {

    int exp = 0;
    private final int[] expTable = {0, 2, 5, 9, 14, 20, 27, 35, 44, 54};

    public abstract void learnSkill();

    public void gainExp(int gainedExp) {
        this.exp += gainedExp;
        updateLevel();
    }

    private void updateLevel() {
        for (int i = expTable.length - 1; i >= 0; i--) {
            if (exp >= expTable[i]) {
                lv = i + 1;  // index 0 → lv 1, index 1 → lv 2 ...
                break;
            }
        }
    }

    public void lvStats(int lv) {
    	this.hp += lv*10;
    	this.atk += lv*2;
        this.def += lv*2;
        this.spAtk += lv*2;
        this.spDef += lv*2;
        this.spd += lv*3;
        
    }
}
