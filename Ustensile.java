package tp4_3;

public abstract class Ustensile {
	protected int annee;
	public Ustensile(int annee)
	{
		this.annee=annee;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Ustensile [annee=" + annee + "]";
	}
	public void afficher()
	{
		System.out.println(this);
	}
	abstract public double calculevaleurtotal();
	public boolean equals(Object o)
	{
		if(o!=null && o.getClass()!=this.getClass())
		{
			return false;
		}
		if(((Ustensile)o).annee==this.annee)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
