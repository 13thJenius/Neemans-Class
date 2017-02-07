public class AustinHeatonLab10{
	
	public static void main (String [] args){
		Super mySuper = new Super("Mr. Neeman", "Hero");
		System.out.println(mySuper.getProfile());
	}
}

class Person{
	String name;
	
	public Person(String name){
		this.name = name;
	}
}//close class Person

class Powers{
	String powers;
	
	public Powers(String powers){
		this.powers = powers;
	}
}//close class Powers

class Super extends Person{
	String sideOf;
	Powers myPower = new Powers("Hyper Cognitive Ability");
	
	public Super(String name, String Super) {
		super(name);
		Super.toLowerCase();
		sideOf = Super;
		
	}
	public String getProfile(){
		return "Your Hero is: " + name + "\n" + "He has the power of: " + myPower.powers;
	}
	
}

