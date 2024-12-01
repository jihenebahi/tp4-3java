package tp4_3;

import java.time.LocalDate;

public class AssietteRonde extends Assiette {
	private double rayon;
	public AssietteRonde(int annee,double rayon)
	{
		super(annee);
		this.rayon=rayon;
	}
	
	@Override
	public String toString() {
		return  super .toString()+"AssietteRonde [rayon=" + rayon + "]";
	}
	public double calculesurface()
	{
		return 3.14*rayon*rayon;
	}
	public double calculevaleurtotal()
	{
		if(annee>50)
		{
			return (LocalDate.now().getYear()-annee-50)*1;
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
			if(((AssietteRonde)o).rayon==this.rayon)
			{
				return true;
			}
		}
		return false;
	}

}
