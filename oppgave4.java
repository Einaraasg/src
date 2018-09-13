
		import javax.swing.*;

		public class oppgave4 {
		    public static void main(String[] args){
		        String lowerLimit = JOptionPane.showInputDialog("Nedre grense");
		        System.out.println(lowerLimit);
		        String  upperLimit = JOptionPane.showInputDialog("Øvre grense");
		        System.out.println(upperLimit);
		        int l = Integer.parseInt(lowerLimit);
		        int u = Integer.parseInt(upperLimit);
		        int[] oddNumbers= new int[(u-l)/2];
		        int counter = 0;
		        for(int i = l; i<u; i++){
		            if(i % 2 !=0){
		                oddNumbers[counter] = i;
		                counter ++;
		            }
		        }
		        String output = new String();
		        for(int i =0; i<oddNumbers.length; i++) {
		            output = output + oddNumbers[i] + " ";
		        }
		        JOptionPane.showMessageDialog(null, "Dette er oddetallene " + output);
		    }
	

}

