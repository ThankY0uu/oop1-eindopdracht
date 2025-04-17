package oop1.oop1;

import java.util.Scanner;

public class Ovactions
{
    public double saldo;
    public String inchecken;
    public String ingecheckt;
    public String uitcheck;
    public String uitcheckmoment;

    public String incheckPaal(Scanner input)
    {
	boolean accept = false;
	if (inchecken.equalsIgnoreCase("yes") || inchecken.equalsIgnoreCase("ja") || inchecken.equalsIgnoreCase("yahoo") || inchecken.equalsIgnoreCase("misschien :)"))
	{
	    accept = true;
	}

	if (accept && saldo >= 20)
	{
	    ingecheckt = "Ingecheckt";
	}
	else if (accept && saldo < 20)
	{
	    ingecheckt = "Sorry, geen voldoende saldo :(";
	}
	else
	{
	    ingecheckt = "Niet ingecheckt. Doei :(";
	}

	return ingecheckt;
    }

    public String overstappen(Scanner input)
    {
	while (true)
	{
	    System.out.println("Welkom bij de volgende stop, wil je hier uitstappen? Elke stop kost 1 euro");
	    uitcheckmoment = input.next();
	    if (uitcheckmoment.equalsIgnoreCase("nee"))
	    {
		System.out.println("Okey is goed");
		saldo -= 1;
	    }
	    else
	    {
		uitcheck = "Uitgecheckt, saldo is nog: €" + saldo + ". Fijne dag nog!";
		break;
	    }
	}
	return uitcheck;
    }

    public void opladen(Scanner input)
    {
	String keuze;
	System.out.println("Wil je saldo opladen?");
	keuze = input.next();
	if (keuze.equalsIgnoreCase("ja"))
	{
	    System.out.println("Hoeveel wil je je saldo opladen?");
	    saldo += input.nextDouble();
	}
    }
}
