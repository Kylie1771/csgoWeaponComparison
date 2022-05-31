import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int gunType = 0;
	static int team = 1;
	static int killsToRebuy = 4;
	static int maxSpeed = 5;
	static int damage = 7;
	static int dps = 8;
	static int armorPenetration = 9;
	static String line;
	static String[] arr;
	static ArrayList<String[]> result = new ArrayList<String[]>();
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("In this game you and another player will choose");
		System.out.println("a gun and the gun with the most damage will be the winner!");
		File file = new File("CSGOOFFICIAL.txt");
		Scanner scanner = new Scanner(file);
		ArrayList<csgoWeapons[]> weaponsList = new ArrayList<csgoWeapons[]>();
		
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			arr = line.split("\\s+");
			result.add(arr);
		}
		
		for(int i = 0 ; i < result.size() ; i++) {
			System.out.println((i + 1) + " " + result.get(i)[gunType]);
			
		}
		
		System.out.println("Select the corresponding number: ");
		csgoWeapons w = new csgoWeapons("AK-47", "Terrorist", 36, 360, 0.775);
		Player p1 = new Player(true, true, w);
		Player p2 = new Player(true, true, w);
		fight(p1,p2);
		
	
	}
	
	public static void fight(Player p1, Player p2) {
		
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		input1 -= 1;
		System.out.println(result.get(input1)[0] + " " + result.get(input1)[3] + " Damage");
		int input2 = input.nextInt();
		input2 -= 1;
		System.out.println(result.get(input2)[0] + " " + result.get(input2)[3] + " Damage");
		
		if(result.get(input1)[4] == result.get(input2)[4]) {
			System.out.println("ITS A DRAW");
		}
		if(Integer.parseInt(result.get(input1)[4]) < Integer.parseInt(result.get(input2)[4])) {
			System.out.println("Player 1 Wins");
		}
		
		if(Integer.parseInt(result.get(input1)[4]) > Integer.parseInt(result.get(input2)[4])) {
			System.out.println("Player 2 Wins");
		}
	}
	
	
	
}
