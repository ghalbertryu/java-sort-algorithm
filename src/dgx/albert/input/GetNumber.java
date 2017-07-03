package dgx.albert.input;

import java.io.Console;
import java.util.Scanner;

public class GetNumber {
	/********************
	 *屬性 合法輸入最小值,預設為0
	 *******************/
	
	/***************************************
	 * 
	 * getInt取得最小值為min之整數並回傳,輸入錯誤回傳-1
	 * 
	 ***************************************/
	public static int getInt(int min){
		//宣告參數 開啟輸入
		int i = -1;
		Scanner input = new Scanner(System.in);
		
		//若輸入合法,跳出並回傳值
		if(input.hasNextInt()){
			i = input.nextInt();
			if(i>=min){
				input.close();
				return i;
			}
		}
		//輸入錯誤 回傳-1
		input.close();
		System.out.println("輸入錯誤，請重新執行");
		return getInt(min);
	}
	
	
	/************************************************
	 * 
	 * getDouble取得最小值為min之浮點數輸入並回傳,輸入錯誤回傳-1
	 * 
	 ************************************************/
	public static double getDouble(int min){
		//宣告參數 開啟輸入
		double i = -1;
		Scanner input = new Scanner(System.in);
		//若輸入合法,跳出並回傳值
		if(input.hasNextDouble()){
			i = input.nextDouble();
			if(i>=min){
				input.close();
				return i;
			}
		}
		//輸入錯誤 回傳-1
		input.close();
		System.out.println("輸入錯誤，請重新執行");
		return -1;
	}
	
	public static int getI(){
		Console c = System.console();
		String in = c.readLine("%s", "123");
		try{
			int i = Integer.parseInt(in);
			System.out.println(i);
			return i;
		}
		catch (Exception e){
			//return getI();
		}
		return -1;
	}
	
}
