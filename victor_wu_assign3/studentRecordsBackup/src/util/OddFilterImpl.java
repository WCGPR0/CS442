/*
 * OddFilterImpl.java
 * 
 */

package studentRecordsBackup.util;

import studentRecordsBackup.util.Filter;

public class OddFilterImpl extends Filter
{
	@override
	boolean check(int x) {
		return ~(x % 2);
	}

}

