package aiac.gi18.java;

import java.util.ArrayList;
public class ListEtudiants extends ArrayList<Etudiant>
{
	
	
	@Override
	public boolean add(Etudiant e)
	{
		if(this.contains(e)) 
		{
			int i=this.indexOf(e);
			this.set(i, e);
			
			return false;
		}
		return super.add(e) ;
		
		
		
	}

	
}
	
	
	
	


