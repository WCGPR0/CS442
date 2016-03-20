/*
 * OddFilterImpl.java
 * 
 */

package studentRecordsBackup.util;

import studentRecordsBackup.util.Filter;

public class OddFilterImpl implements Filter
{
	@Override
	public boolean check(int x) {
		return (x & 1) != 1;
	}

}

