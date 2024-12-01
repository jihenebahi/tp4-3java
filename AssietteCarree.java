package tp4_3;

public class AssietteCarree extends Assiette {
	private double cote;
	public AssietteCarree(int annee,double cote)
	{
		super(annee);
		this.cote=cote;
	}
	
	@Override
	public String toString() {
		return super.toString()+"AssietteCarree [cote=" + cote + "]";
	}
	public double calculesurface()
	{
		return cote*cote;
	}
	public double calculevaleurtotal()
	{
		AssietteRonde a= new AssietteRonde(getAnnee(),0);
		return a.calculevaleurtotal()*2;
	}
	public boolean equals(Object o)
	{
		if(super.equals(o))
		{
			if(((AssietteCarree)o).cote==this.cote)
			{
				return true;
			}
		}
		return false;
	}


}
