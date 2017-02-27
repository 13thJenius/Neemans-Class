import java.util.Random;
public class AssmtPasswordJadenL {
public static void main(String []args){
      String[] strings = new String[100];
      int[] ints = new int[100];
      char[] chars = new char[100];
      Random myRand = new Random();
      for (int i =0;i<strings.length;i++)
         strings[i] = generateString(myRand, "1234567890qwertyuiopasdfghjklzxcvbnm!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 4);
      for (int i =0;i<ints.length;i++)
         ints[i] = Integer.parseInt(generateString(myRand, "1234567890", 3));
      for (int i =0;i<chars.length;i++)
         chars[i] = generateString(myRand, "qwertyuiopasdfghjklzxcvbnm", 1).charAt(0);
      System.out.print(strings[4]);
      System.out.print(ints[4]);
      System.out.print(chars[4]);
      
}
public static String generateString(Random rng, String characters, int length)
{
    char[] text = new char[length];
    for (int i = 0; i < length; i++)
        text[i] = characters.charAt(rng.nextInt(characters.length()));
    return new String(text);
}
}