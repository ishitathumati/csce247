package assignments.strategy;
/*
 * Troll class inherits from abstract Character class and its methods
 */
public class Troll extends Character{
	
	public Troll(String name) {
		/*
		 * super constructor invokes parent Character constructor to set name
		 */
		super(name);
		/*
		 * Troll will display WeaponKnife behavior
		 */
		weaponBehavior = new WeaponAxe();
	}
	
	public void display() {
		System.out.println(name + " is a funny troll");
	}

}
