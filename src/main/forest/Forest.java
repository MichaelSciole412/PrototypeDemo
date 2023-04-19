package forest;

import java.util.HashMap;

/**
 * Forest Class.
 * Creates a HashMap to store prototype objects
 * and has a method to clone them
 * @author Michael Sciole
 * @version 1.0
 **/

public class Forest
{
	public static final HashMap<String, Foliage> FOLMAP = getFoliage();
	
	private static HashMap<String, Foliage> getFoliage()
	{
		HashMap<String, Foliage> folMap = new HashMap<>();
		folMap.put("Tree", new Tree());
		folMap.put("Bush", new Bush());
		return folMap;
	}

/**
 * Creates a clone of prototype.
 * Casts prototype clone as Foliage object
 * @param foliageName
 * @return Foliage
 **/

	public static Foliage cloneFoliage(String foliageName)
	{
		return (Foliage) FOLMAP.get(foliageName).clone();
	}
}
