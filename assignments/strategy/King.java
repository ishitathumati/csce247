package assignments.strategy;
/*
 * King class inherits from abstract Character class and its methods
 */
public class King extends Character{
	
	public King(String name) {
		/*
		 * super constructor invokes parent Character constructor to set name
		 */
		super(name);
		/*
		 * King will display WeaponSword behavior
		 */
		weaponBehavior = new WeaponSword();
	}
	
	public void display() {
		System.out.println(name + " is a Noble King");
	}
}
