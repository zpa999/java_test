package test;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCharacter character = new GameCharacter();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Ax());
		character.attack();
	}

}
