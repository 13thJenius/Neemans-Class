import java.util.Scanner

package apComputer;

public class AustinHeatonLab10{
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hero: ")
		String name = input.nextLine();
		System.out.rpintln("Enter a Weapon: ");
		String weapon = input.nextLine();
		Hero myHero = new Hero(name);
		
		System.out.println(myHero.getStats());
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

class Powers{
	String powers;
	String name;
	
	public Powers(String name, String powers){
		super(name);
		this.powers = powers;
	}
}

class AlterEgo extends Hero{
	String Alter = "";
	 public static String flipString(String param)
   {
      Alter = "";
      for( int i = param.length()-1; i >= 0; i--)
      {
         Alter += param.charAt(i);
      }
      return Alter;

	}
}

