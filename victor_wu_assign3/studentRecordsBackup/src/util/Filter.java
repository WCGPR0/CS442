/*
 * Filter.java 
 * 
 */

package studentRecordsBackup.util;

public abstract class Filter
{
	boolean check(int x);

	public void notify(){
	
	if (check(x)) {
		obs.update(args);		
	}
	}
}
