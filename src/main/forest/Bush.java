package forest;

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
