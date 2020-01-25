import java.util.Scanner;

public class NestedStatements2{
	public static void main (String[]args){
	Scanner reader = new Scanner (System.in);

	System.out.print("(F)orce, (D)istance, and (V)olume: ");
	String one = reader.nextLine();
	{
	if(one.equalsIgnoreCase("F"))
		{
			System.out.print("(P)ounds to Newtons or (N)ewtons to Pounds: ");
			String fcon = reader.nextLine();

				if(fcon.equalsIgnoreCase("N"))
				{
				System.out.print("How many Newtons: ");
				double fn = reader.nextDouble();
				double fconv = fn/4.9;
				reader.nextLine();
				System.out.println(fconv+" pounds");
				}

				if(fcon.equalsIgnoreCase("P"))
				{
				System.out.print("How many Pounds: ");
				double fp = reader.nextDouble();
				double fconv2 = fp*4.9;
				reader.nextLine();
				System.out.println(fconv2+" Newtons");
				}
}
	if(one.equalsIgnoreCase("D"))
	{
			System.out.print("(M)eters to feet or (F)eet to meters: ");
			String fm = reader.nextLine();

					if(fm.equalsIgnoreCase("M"))
					{
					System.out.print("How many Meters: ");
					double m = reader.nextDouble();
					double mconv = m*3.28;
					reader.nextLine();
					System.out.println(mconv+" feet");
					}

					if(fm.equalsIgnoreCase("F"))
					{
					System.out.print("How many Feet: ");
					double f = reader.nextDouble();
					double fco = f/3.28;
					reader.nextLine();
					System.out.println(fco+" Newtons");
					}
		}
		if(one.equalsIgnoreCase("V")){
				System.out.print("(L)iters to gallons or (G)allons to liters: ");
				String gl = reader.nextLine();

						if(gl.equalsIgnoreCase("L"))
						{
						System.out.print("How many Liters: ");
						double l = reader.nextDouble();
						double lco = l*3.79;
						reader.nextLine();
						System.out.println(lco+" gallons");
						}

						if(gl.equalsIgnoreCase("G"))
						{
						System.out.print("How many Gallons: ");
						double g = reader.nextDouble();
						double gco = g/3.79;
						reader.nextLine();
						System.out.println(gco+" Liters");
						}
			}

		}
	}
}