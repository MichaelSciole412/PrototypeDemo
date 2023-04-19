package forest;

import java.lang.Cloneable;

/**
 * Foliage.java Abstract Class.
 * Allows the Forest class to create
 * objects like trees and shrubs more efficiently
 * @author Michael Sciole
 * @version 1.0
 **/

abstract class Foliage implements Cloneable
{
	protected String foliageName;

	abstract void addFoliage();

/**
 * clone() method.
 * Allows classes extending Foliage to
 * have their objects cloned rather than
 * using the new operator
 * @return Object
 **/
	public Object clone()
	{
		Object foliageClone = null;
		try
		{
			foliageClone = super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return foliageClone;
	}
}
