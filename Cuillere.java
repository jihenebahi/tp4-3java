package tp4_3;

import java.time.LocalDate;

public class Cuillere extends Ustensile {
	private double longueur;
	public Cuillere(int annee,double longueur)
	{
		super(annee);
		this.longueur=longueur;
		
	}
	@Override
	public String toString() {
		return super.toString()+"Cuillere [longueur=" + longueur + "]";
	}
	public double calculevaleurtotal()
	{
		if(annee>30)
		{
			return ((LocalDate.now().getYear()-annee)* 0.5);
		}
		else
		{
			return 0;
		}
	}
	public boolean equals(Object o)
	{
		if(super.equals(o))
		{
			if(((Cuillere)o).longueur==this.longueur)
			{
				return true;
			}
		}
		return false;
	}

}
