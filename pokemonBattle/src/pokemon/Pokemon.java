package pokemon;

import skill.Skill;


public class Pokemon {
	
	public String name;
	
	public int hp, atk, def, spd;
	private int lv;
	private int type; // 1 = 노말, 2 = 풀, 3 = 불, 4 = 물
	private boolean isAlive = true;
	private Skill[] skill = new Skill[4];
	
	public void attack(Pokemon target, Skill skill) {
		
	}
	
	public void decreaseHP(int damage) {
		hp -= damage;
	}
	
	public boolean checkAlive(int hp) {
		if (hp <= 0) {
			isAlive = false;
		}
		return false;
	}
	
	
}
