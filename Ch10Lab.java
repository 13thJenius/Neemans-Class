package apComputer;

public class AustinHeatonLab10{
	
	public static void main (String [] args){
		Hero myHero = new Hero("Steelheart");
		System.out.println(myHero.getName());
	}
}

class Hero{
	String name;
	
	public Hero(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}

class Powers extends Hero{
	String powers;
	String name;
	
	public Powers(String name, String powers){
		this.name = name;
		this.powers = powers;
	}
}

class Weapons{
	String weapon = "";
	public Weapons(String weapon){
		this.weapon = weapon;
	}
}

