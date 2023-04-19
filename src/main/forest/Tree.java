package forest;

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
