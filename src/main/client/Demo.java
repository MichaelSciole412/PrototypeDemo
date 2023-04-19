package forest;

/**
 * Demo class.
 * Implements methods from the cloned objects
 * @author Michael Sciole
 * @version 1.0
 **/

public class Demo
{
        public static void main(String[] args)
        {
        	
		System.out.println("These are made from the prototypes themselves:");
	        Forest.FOLMAP.get("Tree").addFoliage();
 		Forest.FOLMAP.get("Bush").addFoliage();
 
		System.out.println("These are made from the prototype clones:");
		Forest.cloneFoliage("Tree").addFoliage();
		Forest.cloneFoliage("Bush").addFoliage();
		Forest.cloneFoliage("Tree").addFoliage();
        }
}         
