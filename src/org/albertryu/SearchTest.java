package org.albertryu;

import org.albertryu.utils.input.GetNumber;
import org.albertryu.utils.search.BinarySearch;
import org.albertryu.utils.sort.BubbleSort;
import org.albertryu.utils.sort.InsertionSort;
import org.albertryu.utils.sort.MergeSort;
import org.albertryu.utils.sort.SelectionSort;

import java.util.Arrays;
import java.util.Date;

public class SearchTest {
	static int MAX = 65536;
	static int searchNum = 100;

	public static void main(String[] args) {

		//印出說明並取得輸入size
		System.out.print("請輸入要產生陣列的大小:");
		//設定合法輸入最小值
		int size = GetNumber.getInt(1);
		if(size==-1) return;

		//隨機產生大小為size 內存整數最大值為MAX的陣列, 並隨機塞入 searchNum
		int arrayInt[] = new int[size];
		for(int i=0; i<size; i++){
			int randomInt = (int) (((2 * MAX + 1) * Math.random()) % MAX + 1);
			arrayInt[i] = randomInt;
			if (randomInt == searchNum) {
				searchNum = 0;
			}
		}
		if (searchNum > 0) {
			int idx = size / 5;
			arrayInt[idx] = searchNum;
		}

		System.out.println("原始陣列:");
		for(int val: arrayInt){
			System.out.print(val+" ");
		}

		Date t1 = new Date();
		Arrays.sort(arrayInt);
		boolean containNumber = BinarySearch.biSearch(searchNum, 0, arrayInt.length - 1, arrayInt);
		Date t2 = new Date();

		System.out.println();
		System.out.println();
		System.out.println("排序後陣列:");
		for(int val: arrayInt){
			System.out.print(val+" ");
		}
		System.out.println("\narray contain " + searchNum + " is " + containNumber);
		System.out.println("BinarySearch spend=" + (t2.getTime()-t1.getTime()) + "/ms");

	}
}
