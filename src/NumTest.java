import java.io.Console;

public class NumTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//int i = GetNumber.getI();
		Console c = System.console();
		try{
		String in = c.readLine();
		
			int i = Integer.parseInt(in);
			System.out.println(i);
		}
		catch (Exception e){
			System.out.println("error");
		}
	}

}
