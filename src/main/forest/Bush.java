package forest;

/**
 * Bush class.
 * Concrete prototype object
 * extends Foliage class
 * @author Michael Sciole
 * @version 1.0
 **/

public class Bush extends Foliage
{
	public Bush()
	{
		this.foliageName = "Bush";
	}

	@Override
	public void addFoliage()
	{
		System.out.println("Added a bush to the forest");
	}
}
