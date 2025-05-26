package skill;
import pokemon.Pokemon;

public abstract class Skill {
	
	
	public double power;
	public int accuracy;
	public String name;
	public Type type;
	
	public Skill(String name, double power, int accuracy, Type type)
	{
		this.name = name;
		this.power = power;
		this.accuracy = accuracy;
		this.type = type;
	}
	
	public boolean checkType(Pokemon myPoki)
	{
		if(myPoki.type == this.type)
		{
			return true;
		}
		return false;
	}
	
	public double skillAct()
	{
		int damage = this.power;
		
		return damage;
	}
	
	private boolean vital()
	{
		int n = (int)(Math.random()*1000)%100;
		if(n<5)
		{
			return true;
		}
	}
	
//	public int dmg, hittingRate, type;
//	public String name;
//	public int skillForm; //1은 물리, 2는 특수
	
}
