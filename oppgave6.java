import javax.swing.JOptionPane;

public class oppgave6{
	public static void main(String[] args) {
		
		String lowerLimit = JOptionPane.showInputDialog("Din score");
        System.out.println(lowerLimit);
        int l = Integer.parseInt(lowerLimit);
        
        if (l <=  39)
        System.out.println("DU får karakter F");
        
    else if (l <= 49)
        System.out.println("du får karakter E");
    else if (l <= 59)
        System.out.println("Du får karakter D");
    else if (l <= 79)
        System.out.println("Du får karakter C");
    else if (l >= 89)
        System.out.println("Du får karakter B");
    else if (l >= 100)
        System.out.println("Du får karakter A");

		
	}
		
	    }
	
