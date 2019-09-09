package assignments.strategy;
/*
 * Queen class inherits from abstract Character class and its methods
 */
public class Queen extends Character{
	
	public Queen(String name) {
		/*
		 * super constructor invokes parent Character constructor to set name
		 */
		super(name);
		/*
		 * Queen will display WeaponKnife behavior
		 */
		weaponBehavior = new WeaponKnife();
	}
	
	public void display() {
		System.out.println(name + " is a beautiful queen");
	}

}
