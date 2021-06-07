package com.singer.cd;

import java.util.Comparator;

public class sortBySingerName implements Comparator<CD> {

	@Override
	public int compare(CD cd1, CD cd2) {
		// TODO Auto-generated method stub
		int res = cd1.getSinger().compareTo(cd2.getSinger());
		if(res<0)
			return -1;
		else if(res>0)
				return 1;
		return 0;
	}
	
}
