
import javax.swing.JOptionPane;
public class AverageCalculation{
	
	public static void main(String[] args){
	
      int Number, count;
      int Sum = 0;
      double Average;
      
     
      for (count = 1; count > 0; count++){
    	  try{  
    	  Number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer (9999 to stop):")); 
      } catch (NumberFormatException e){
    	  JOptionPane.showMessageDialog(null, "Illegal data! Please input an integer!", "Error", JOptionPane.WARNING_MESSAGE);	
    	  count--;
    	  continue;}
    	  
    	  if (Number != 9999){
    		  Sum += Number;
    	  	  }  else {
    		            count--;
    		            break;
                 	  } 	  
      }	 
		   Average = (double)Sum / count;
		   
		   JOptionPane.showMessageDialog(null, "The average of input values is:  " + Average);	
       
	}
		
}