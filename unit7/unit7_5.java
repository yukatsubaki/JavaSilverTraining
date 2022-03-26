class Test{
	void loop() throws ArrayIndexOutOfBoundsException{
		int[] num = {10, 20, 30};
		for(int i = 0; i < 4; i++){
			System.out.println("num : " + num[i]);
		}
	}
}
public class unit7_5{
	public static void main(String[] args){
		try {
			Test t = new Test();
			t.loop();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("例外が発生しました");
		}finally{
			System.out.println("---end---");
		}
	}
}
