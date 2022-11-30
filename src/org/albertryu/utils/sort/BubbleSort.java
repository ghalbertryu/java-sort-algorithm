package org.albertryu.utils.sort;

public class BubbleSort {
	/*******************
	 * func bubble sort
	 *******************/
	public static void bubbleSort(int value[]){
		int size=value.length;
		while(size-2>=0){
			for(int i=0; i<=size-2; i++){
				//若左邊比右邊的值大 數值就對調
				if(value[i]>value[i+1]){
					int tmp = value[i];
					value[i]=value[i+1];
					value[i+1]=tmp;
				}
			}
			size--;
		}
	}
}
