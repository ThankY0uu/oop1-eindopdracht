package oop1.oop1;

import java.util.Scanner;

public class Ov
{
    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	Ovactions account = new Ovactions();

	account.opladen(input);
	System.out.println("Momenteel is dit je saldo: €" + account.saldo);

	System.out.println("Wil je inchecken?");
	account.inchecken = input.next();
	System.out.println(account.incheckPaal(input));

	if (account.ingecheckt.equals("Ingecheckt"))
	{
	    System.out.println(account.overstappen(input));
	}
	else
	{
	    System.out.println("Fijne dag nog!");
	}

	input.close();
    }
}
