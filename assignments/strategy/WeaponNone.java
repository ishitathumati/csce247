package assignments.strategy;
/*
 * Class implements the WeaponBehavior interface
 * attack method for this weapon is defined
 */
public class WeaponNone implements WeaponBehavior {
	public void attack() {
		System.out.println("Oh no! I lost my weapon");
	}

}
