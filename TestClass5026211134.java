public class TestClass5026211134{
	
	public static void main(String[] args){

	ComputeMethods5026211134 Azza = new ComputeMethods5026211134();

	double celcius = Azza.fToC(100);
	System.out.println("100 F = "+ celcius + "c");

	double hypotenuse = Azza.hypotenuse(5,12);
	System.out.println("Hypotenuse = " + hypotenuse);

	int rollDice = Azza.roll();
	System.out.println("Roll 2 Dice result = " + rollDice);
	
	}
}