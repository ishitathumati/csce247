package assignments.strategy;

public abstract class Character {
	/*
	 * Name of each character which is protected
	 * meaning it can be accessed by this class
	 * and child classes that inherit from this class.
	 */
	protected String name;
	/*
	 * Instantiating WeaponBehavior interface
	 */
	WeaponBehavior weaponBehavior;
	/*
	 * Creates a new character with a given name
	 */
	public Character(String name) {
		this.name = name;
	}
	/*
	 * Abstract method that displays a unique character message
	 */
	public abstract void display();
	/*
	 * Weapon attack method displays message for each weapon
	 * that will implement the weaponBehavior interface
	 */
	public void attack() {
		weaponBehavior.attack();
	}
	/*
	 * Method sets different weapon behaviors for each character
	 */
	public void setWeaponBehavior(WeaponBehavior wb) {
		weaponBehavior = wb;
	}

}
