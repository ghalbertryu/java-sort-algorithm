package dgx.albert.sort;

import java.util.Date;
import java.util.Arrays;

import dgx.albert.input.GetNumber;

public class SortSpeedTest {
	static int MAX = 65536;
	public static void main(String[] args) {
		//印出說明並取得輸入size
		System.out.print("請輸入要產生陣列的大小:");
		//設定合法輸入最小值
		int size = GetNumber.getInt(1);
		if(size==-1) return;
		
		//隨機產生大小為size 內存整數最大值為MAX的陣列, 並複製5份
		int arrayInt[] = new int[size];
		for(int i=0; i<size; i++){
			arrayInt[i] = (int)(((2*MAX+1)*Math.random())%MAX+1);
		}
		int copyArray [][]=new int[5][];
		for(int i=0; i<copyArray.length; i++){
			copyArray[i] = Arrays.copyOf(arrayInt, arrayInt.length);
		}

		//列印原始矩陣
		System.out.println("排序前:");
		for(int val: arrayInt){
			System.out.print(val+" ");
		}

		/*Date t1 = new Date();
		//bubble排序1
		BubbleSort.bubbleSort(copyArray[0]);
		Date t2 = new Date();
		
		Date t3 = new Date();
		//Selection排序2
		SelectionSort.seleSort(copyArray[1]);
		Date t4 = new Date();
		
		Date t5 = new Date();
		//Insertion排序3
		InsertionSort.inserSort(copyArray[2]);
		Date t6 = new Date();*/
		
		Date t7 = new Date();
		//merge排序4
		int work[] = new int[copyArray[3].length];
		MergeSort.mergeSort(copyArray[3], work, 0, size-1);
		Date t8 = new Date();
		
		//Arrays排序5
		Date t9 = new Date();
		Arrays.sort(copyArray[4]);
		Date t10 = new Date();
		
		//列印排序後矩陣
		System.out.println("\n排序後:");
		for(int val: copyArray[3]){
			System.out.print(val+" ");
		}
		
/*		System.out.println("\nBubble"+(t2.getTime()-t1.getTime())+"ms");
		System.out.println("SeleSort"+(t4.getTime()-t3.getTime())+"ms");
		System.out.println("InserSort"+(t6.getTime()-t5.getTime())+"ms");*/
		System.out.println("MergeSort="+(t8.getTime()-t7.getTime())+"ms");
		System.out.println("Arrays.Sort="+(t10.getTime()-t9.getTime())+"ms");
	}
}
