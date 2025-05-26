package skill;

import pokemon.Pokemon;

public class SpecialSkill implements Skill{
	
	String stat;
	int change;
	boolean isGuard;
	
	public SpecialSkill(String stat, int change, boolean isGuard) {
		this.stat = stat;
		this.change = change;
		this.isGuard = isGuard;
	}
	
	public void useSkill(Pokemon me, Pokemon target) {
		if(isGuard) {
			
			return;
		}
		switch (stat.toLowerCase()) {
        case "hp":
            target.hp += change;
            break;
        case "atk":
            target.atk += change;
            break;
        case "def":
            target.def += change;
            break;
        case "spd":
            target.spd += change;
            break;
        default:
            System.out.println("Unknown stat: " + stat);
            break;
		}
	}
}
