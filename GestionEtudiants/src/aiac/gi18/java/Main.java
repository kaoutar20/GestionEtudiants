package aiac.gi18.java;

public class Main{
	public static void main(String[] args)//public static void main(String[] args) 
	{
		Etudiant e1=new Etudiant(1,"hamid");
		Etudiant e2=new Etudiant(2,"driss");
		Etudiant e3=new Etudiant(1,"youssef");
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		ListEtudiants myList = new ListEtudiants();
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		System.out.println(myList);
		
		
	}
	
	

}
