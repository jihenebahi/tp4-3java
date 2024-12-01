package tp4_3;

public class Collection {
	public static void main(String[] args) {
		Ustensile[] us = new Ustensile[5];
		us[0] = new AssietteRonde(1926, 8.4);
		us[1] = new Cuillere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuillere(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);
		Cuillere u=new Cuillere(1985,5.6);
		AssietteRonde a= new AssietteRonde(1837, 5.4);
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		affichecollection(us);
		cherche(us,u);
		cherche(us,a);

}
	static void affichecollection(Ustensile[] us)
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println(us[i]);
		}
	}
	static void afficherCuilleres (Ustensile[] us)
	{
		int nb=0;
		for(int i=0;i<=4;i++)
		{
			if(us[i] instanceof Cuillere)
			{
				nb=nb+1; 
			}
		}
		System.out.println( "il ya "+ nb +" cuilléres");
	}
	static void afficherSurfaceAssiettes(Ustensile[] us)
	{
		double s=0;
		for(int i=0;i<=4;i++)
		{
			if(us[i] instanceof Assiette)
			{
				s=s+((Assiette)us[i]).calculesurface();
				
			}
		}
		System.out.println( "la surface totale:  "+ s);
	}
	static void afficherValeurTotale(Ustensile[] us)
	{
		double som=0;
		for(int i=0;i<=4;i++)
		{
			som=som+ us[i].calculevaleurtotal();
		}
		System.out.println( "la valeur totale :  "+ som);
	}
	static void cherche(Ustensile us[], Object u)
	{
		int i=0;
		boolean test=false;
		while(i<us.length && test==false)
		{
			if(us[i].equals(u))
			{
				System.out.println("L ustensile existe");
				test=true;
			}
			else
			{
				i++;
			}
		}
		if(test==false)
		{
			System.out.println("Cet Utensile n'existe pas");
		}
	}
}
