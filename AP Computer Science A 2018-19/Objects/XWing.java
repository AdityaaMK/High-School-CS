public class XWing{
	private int strength;
	private String name;
	private LaserCannon weapon;
	private int power;

	public XWing(int strength, String name, int power){
		this.strength = strength;
		this.name = name;
		weapon = new LaserCannon(power);
	}

	public void setPower(int power){
		this.power = power;
	}

	public int getPower(){
		return weapon.getPower();
	}

	public void fireCannon(int power){
		System.out.println("Firing lasers are "+weapon.getPower()+"% power!");
	}

}