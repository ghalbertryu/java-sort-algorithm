package org.albertryu.utils.search;

public class BinarySearch {
	/*********************
	 * func binary search
	 *********************/
	//在陣列value搜尋x值 start為搜尋的起點 end為終點 找到x回傳true 沒找到回傳false
	public static boolean biSearch(int x, int start, int end, int value[]){
		if(start<=end){
			//從中間切半搜尋
			int point=(start+end)/2;
			//找到回傳true
			if(x==value[point]) 
				return true;
			//若x小於標記值,往左邊搜尋
			else if(x<value[point])
				return biSearch(x, start, point-1, value);
			//若x大於標記值,往右邊搜尋
			else if(x>value[point])
				return biSearch(x, point+1, end, value);
		}
		//沒找到回傳false
		return false;
	}
}
