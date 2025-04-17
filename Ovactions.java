package oop1;

import java.util.Scanner;

public class Ovactions
{
    public double kaartBalance;

    public String inchecken;
    public String ingecheckt;
    public String uitcheck;
    public String uitcheckmoment;
    public double saldo;
    

    public String incheckPaal()
    {
	boolean accept = false;
	if (inchecken.equalsIgnoreCase("yes") || inchecken.equalsIgnoreCase("ja") || inchecken.equalsIgnoreCase("yahoo") || inchecken.equalsIgnoreCase("misschien :)"))
	{
	    accept = true;
	}
	if (accept == true && kaartBalance <= 20)
	{
	    ingecheckt = "Ingecheckt";

	}
	else if (accept == true && kaartBalance >= 20)
	{
	    ingecheckt = "Sorry geen balance:(";
	}
	else
	{
	    ingecheckt = "doei:(";
	}
	return ingecheckt;
    }

    public String overstappen()
    {
	Scanner input = new Scanner(System.in);

	boolean overstap = false;
	while (overstap == false)
	{
	    System.out.println("welkom bij de volgende stop, wil je hier uitstappen? Elke stop kost 1 euro");
	    uitcheckmoment = input.next();
	    if (uitcheckmoment.equalsIgnoreCase("nee"))
	    {
		System.out.println("okey is goed");
		saldo = saldo - 1;
	    }
	    else
	    {
		uitcheck = "uitgecheckt, saldo is nog : $" + saldo + ". fijna dag nog";
		break;
	    }
	}
	input.close();
	return uitcheck;

    }

    public Double opladen()
    {
	Scanner input = new Scanner(System.in);
	double oplaad;
	String keuze;
	System.out.println("wil je saldo opladen?");
	keuze = input.next();
	if (keuze.equalsIgnoreCase("ja"))
	{
	    System.out.println("hoeveel wil je, je saldo opladen?");
	    saldo = saldo += (oplaad = input.nextDouble());
	}
	input.close();
	return saldo;
	
    }
}