package aiac.gi18.java;

//import java.util.Set;
import java.util.Collections;

public class Main{
	public static void main(String[] args)
	{
		Etudiant e1=new Etudiant(1,"hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(1,"youssef");
		
		
		
		e1.setNote(15);
		e2.setNote(12);
		e3.setNote(16);
		
		//mespoints
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(" ");
		
		ListEtudiants listEtudiants = new ListEtudiants();
		listEtudiants.add(e1);
		listEtudiants.add(e2);
		listEtudiants.add(e3);
	    System.out.println(listEtudiants);
      
      
	    System.out.println("apres");
        Collections.sort(listEtudiants);
        System.out.println(listEtudiants);
      

	}
	
	

}
