package aiac.gi18.java;

public class Etudiant implements Comparable<Etudiant> 
{
	private int id;
	private String nom;
	private double  note;
	
	public Etudiant(int id,String nom )
	{
		note=10;
		this.id=id;
		this.nom=nom;
	}
	
	public double getNote( )
	{
		return note;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNote(double note) {
		this.note = note;
	}

	
	
	
	@Override
	public String toString()
	{
		return nom+ ":" +note;
		
	}
	
	@Override
	public boolean equals(Object obj) 
	 {
		if(!(obj instanceof Etudiant )) return false;
		return ((Etudiant)obj).id==this.id;
		
			 
	 }
	@Override
	public int compareTo(Etudiant e)
	{
		if(this.note< e.note )
			return 1;
		if(this.note> e.note )
			return 0;
		return -1;
	}
	
	
	
	
	
	
	
	

}
