package aiac.gi18.java;

public class Etudiant 
{
	private int id;
	private String nom;
	private double  note;
	
	public Etudiant(int id,String nom )
	{
		note=10;
		this.id=d;
		this.nom=nom;
	}
	@override
	public String toString()
	{
		return nom+ ":" +note;
		
	}
	
	@override
	public boolean equals(Object obj) 
	 {
		if(!(Object instanceof Etudiant )) return false;
		return ((Etudiant)obj).id==this.id;
		
			 
	 }
	
	
	
	
	
	
	

}
