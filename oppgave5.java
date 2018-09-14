import javax.swing.JOptionPane;

public class oppgave5 {
	public static void main(String[] args) {
		
		
		 String lowerLimit = JOptionPane.showInputDialog("x for math.pov");
	        System.out.println(lowerLimit);
	        String  upperLimit = JOptionPane.showInputDialog("n for math.pov");
	        System.out.println(upperLimit);
	        int l = Integer.parseInt(lowerLimit);
	        int u = Integer.parseInt(upperLimit);
	        
	        
System.out.println("x^n= " + Math.pow(l,u));

	 String llowerLimit = JOptionPane.showInputDialog("x for while");
	 
     System.out.println(llowerLimit);
     
     String  uupperLimit = JOptionPane.showInputDialog("n for while");
     
     System.out.println( uupperLimit);
     
     int n = Integer.parseInt(llowerLimit);
     int m = Integer.parseInt(uupperLimit);
     
	 int i = 1;   
   double y = 1.0;
   
   while(i<=m){                      
       i = i+1;
       y = y*n;                
      
	}

     System.out.println("x^n=" + y);

}}

