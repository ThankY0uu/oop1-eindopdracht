package oop1;

import java.util.Scanner;

public class Ov
{

    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	Ovactions Account = new Ovactions();
	System.out.println("momenteel is dit je saldo: $" + Account.opladen());

	System.out.println("wil je inchecken");
	Account.inchecken = input.nextLine();
	System.out.println(Account.incheckPaal());
	if (Account.ingecheckt.equals("Ingecheckt"))
)
	{
	    System.out.println(Account.overstappen());
	    
	}
	else {
	    System.out.println("fijne dag nog");
	}
	input.close();
    }

}