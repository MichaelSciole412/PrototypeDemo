package forest;

import java.util.HashMap;

public class Forest
{
	public static final HashMap<String, Foliage> foliageMap = getFoliage();
	
	private static HashMap<String, Foliage> getFoliage()
	{
		HashMap<String, Foliage> folMap = new HashMap<>();
		folMap.put("Tree", new Tree());
		return folMap;
	}

	public static Foliage cloneFoliage(String foliageName)
	{
		return (Foliage) foliageMap.get(foliageName).clone();
	}
}
