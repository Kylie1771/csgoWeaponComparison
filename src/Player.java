
public class Player {

	private int health;
	private boolean bodyArmor;
	private boolean isAlive;
	private csgoWeapons weapons;
	private String team;
	
	public Player(boolean ba, boolean ia, csgoWeapons w) {
		
		bodyArmor = ba;
		health = 100;
		isAlive = true;
		weapons = w;
	}

	public void takeDamage(int x) {
		health -= x;
		if(health <= 0) {
			isAlive = false;
		}
	}
	
	public String getTeam() {
		return team;
	}
	
	public boolean hasBodyArmor() {
		return bodyArmor;
	}
	
	public int getHealth() {
		return health;
	}
	
	public csgoWeapons getWeapons() {
		return weapons;
	}
	public boolean getIsAlive() {
		return isAlive;
	}
	
	
	
}
