/*
 * EvenFilterImpl.java
 * 
 * 
 */

package studentRecordsBackup.util;

import studentRecordsBackup.util.Filter;

public class EvenFilterImpl extends Filter
{
	@override
	boolean check(int x) {
		return x % 2;
	}
}
