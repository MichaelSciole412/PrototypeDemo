package forest;

/**
 * Tree class.
 * Concrete prototype object
 * extends Foliage class
 * @author Michael Sciole
 * @version 1.0
 **/

public class Tree extends Foliage
{
	public Tree()
	{
		this.foliageName = "Tree";
	}
	
	@Override
	public void addFoliage()
	{
		System.out.println("Added a tree to the forest");
	}
}
