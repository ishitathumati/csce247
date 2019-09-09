package assignments.strategy;
/*
 * Knight class inherits from abstract Character class and its methods
 */
public class Knight extends Character{
	
	public Knight(String name) {
		/*
		 * super constructor invokes parent Character constructor to set name
		 */
		super(name);
		/*
		 * Knight will display WeaponBow behavior
		 */
		weaponBehavior = new WeaponBow();
	}
	
	public void display() {
		System.out.println(name + " is a valiant knight");
	}

}
