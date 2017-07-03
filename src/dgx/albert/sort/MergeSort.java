package dgx.albert.sort;

public class MergeSort {
	/*******************
	 * func merge sort
	 ******************/
	//排序value陣列, work陣列為暫存陣列, p為要排序陣列index起頭, q為尾
	public static void mergeSort(int value[], int work[], int p, int q){
		if(p==q) return;
		int point = (p+q)/2;
		mergeSort(value, work, p, point);
		mergeSort(value, work, point+1,q);
		merge(value, work, p, point, point+1, q);
	}
	
	/***************
	 * func merge
	 * *************/
	//merge到value陣列, work陣列為暫存陣列, p1為左邊陣列起頭, q1左邊陣列結尾, p2為右邊陣列起頭, q2右邊陣列結尾
	public static void merge(int value[], int work[], int p1, int q1, int p2, int q2){
		int head=p1;
		for(int i=p1; i<=q2; i++){
			//左右陣列都還沒放完
			if(p1<=q1 && p2<=q2){
				//左陣列標記之值較小 取左陣列標記放
				if(value[p1]<=value[p2]){
					work[i]=value[p1];
					p1++;
				}
				//右陣列標記之值較小 取右陣列標記放
				else if(value[p1]>value[p2]){
					work[i]=value[p2];
					p2++;
				}
			}
			//左陣列放完 取右陣列標記放
			else if(p1>q1){
				work[i]=value[p2];
				p2++;
			}	
			//右陣列放完 取左陣列標記放
			else if(p2>q2){
				work[i]=value[p1];
				p1++;
			}
		}
		//複製work陣列之值到value陣列
		for(int i=head; i<=q2; i++){
			value[i]=work[i];
		}
	}

}
