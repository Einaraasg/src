import javax.swing.JOptionPane;

public class oppgave6b {
	public static void main (String[] args ) {
		int counter = 0;
		
		while(counter < 10) {
		
		
		String lowerLimit = JOptionPane.showInputDialog("Din score");
	    System.out.println(lowerLimit);
	    int l = Integer.parseInt(lowerLimit);
	    
	    if(l<0)
	    	  System.out.println("Ugyldig peongsum");
	    else if (l>100)
	    	  System.out.println("Ugyldig poengsum");
	    else if (l <=  39)	
	    System.out.println("DU f�r karakter F");
	    
	else if (l <= 49)
	    System.out.println("du f�r karakter E");
	else if (l <= 59)
	    System.out.println("Du f�r karakter D");
	else if (l <= 79)
	    System.out.println("Du f�r karakter C");
	else if (l <= 89)
	    System.out.println("Du f�r karakter B");
	else if (l <= 100)
	    System.out.println("Du f�r karakter A");
	else if (l >= 100)
	    System.out.println("Du f�r karakter A");
	    counter++;
	    
	    
		}
		
	}
}
