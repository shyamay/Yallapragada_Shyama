import java.util.Scanner; //import Statement

public class SYSubwoofer
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate a new SYSubwoofer object

		
		//prompt for user input
		System.out.println("Please enter the height (inches): ");
		double height = keyboard.nextDouble();
		System.out.println("Please enter the length (inches): ");
		double length = keyboard.nextDouble();
		System.out.println("Please enter the width (inches): ");
		double width = keyboard.nextDouble();
	
		SYSubwoofer volume = new SYSubwoofer();
		
		double box = volume.calcVol(height, length, width);
		System.out.printf("The total volume of your subwoofer box, in cubic feet, is %4.2f\n", box);
	}
	
	public double calcVol(double height, double length, double width)
	{
		return((height*length*width))/1728;
	}
}