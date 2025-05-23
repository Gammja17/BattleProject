package pokemon;

import skill.Skill;


public class Pokemon {
	
	public String name;
	
	public int hp, atk, def, spAtk, spDef, spd;
	public int lv;
	public int type; // 1 = 노말, 2 = 풀, 3 = 불, 4 = 물
	public Skill[] skill = new Skill[4];
	
	public void useSkill(Skill skill, Pokemon target) {
	    System.out.println(name + "이(가) " + skill.name + "을(를) 사용했습니다!");
	    target.hp -= skill.dmg;
	    System.out.println(target.name + "의 남은 HP: " + target.hp);
	}
	
	
}
