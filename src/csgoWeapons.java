
public class csgoWeapons {
	
	private String name;
	private String team;
	
	private double killsToRebuy;
	private int maxSpeed;
	private int damage;
	private int damagePerSec;
	private double armorPenetration;
	
	public csgoWeapons(String n, String t, int d,  int dps, double ap) {
		n = name;
		t = team;
		d = damage;
		dps = damagePerSec;
		ap = armorPenetration;
		
	}
	
	public String getname() {
		return name;
	}
	public String getTeam() {
		return team;
	}
	public double getKillsToRebuy() {
		return killsToRebuy;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getDamage() {
		return damage;
	}
	public int getDamagePerSec() {
		return damagePerSec;
	}
	public double getArmorPenetration() {
		return armorPenetration;
	}

	
}
