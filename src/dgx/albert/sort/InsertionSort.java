package dgx.albert.sort;

public class InsertionSort {
	/**********************
	 * func insertion sort
	 **********************/
	public static void inserSort(int value[]){
		int size=value.length;
		//檢查index i 於0~(i-1)內的陣列找到正確位子插入
		for(int i=1; i<size; i++){
			for(int j=0; j<i; j++){
				//在0~(i-1)內的陣列找到index j的值比i內的值大 index j~i-1的值都往右移一格
				if(value[j]>value[i]){
					int tmp=value[i];
					int k = i;
					while(k>j){
						value[k]=value[k-1];
						k--;
					}
					//原index i的值放入index j並跳出
					value[j]=tmp;
					break;
				}
			}
		}
	}
}
