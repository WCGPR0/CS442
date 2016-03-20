/*
 * EvenFilterImpl.java
 * 
 * 
 */

package studentRecordsBackup.util;

import studentRecordsBackup.util.Filter;

public class EvenFilterImpl implements Filter
{
	@Override
	public boolean check(int x) {
		return (x & 1) == 1;
	}
}
