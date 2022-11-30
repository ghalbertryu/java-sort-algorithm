package org.albertryu.utils.sort;

public class SelectionSort {
	/***********************
	 * 
	 * func selection sort
	 * 
	 * **********************/
	public static void seleSort(int value[]){
		int size=value.length;
		for(int i=0; i<size-1; i++){
			//找到index>i中最小的欄位
			int m = -1;
			for(int j=i+1; j<size; j++){
				if(m==-1){
					m = j;
					continue;
				}
				if(value[j]<value[m]){
					m = j;
				}
			}
			//若最小值比index為i的值小 值就對調
			if(value[i]>value[m]){
				int tmp = value[i];
				value[i] = value[m];
				value[m] = tmp;
			}
		}
	}
}
