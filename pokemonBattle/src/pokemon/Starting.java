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
    	System.out.println(name + "이(가) " + gainedExp + "의 경험치를 얻었다!");
        this.exp += gainedExp;
        updateLevel();
    }

    private void updateLevel() {
        for (int i = expTable.length - 1; i >= 0; i--) {
            if (exp >= expTable[i]) {
                int newLevel = i + 1;
                if (newLevel > lv) {
                    int levelGap = newLevel - lv;
                    lv = newLevel;

                    this.hp += 10 * levelGap;
                    this.atk += 2 * levelGap;
                    this.def += 2 * levelGap;
                    this.spd += 3 * levelGap;

                    System.out.println("레벨이 " + lv + "이(가) 되었습니다!");
                    System.out.println("HP +" + (10 * levelGap));
                    System.out.println("ATK +" + (2 * levelGap));
                    System.out.println("DEF +" + (2 * levelGap));
                    System.out.println("SPD +" + (3 * levelGap));
                	
                }
                break;
            }
        }
    }

    
    

}
