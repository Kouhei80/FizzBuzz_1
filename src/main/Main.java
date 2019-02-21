package main;

public class Main {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++){
			System.out.println(FizzBuzz(i));
		}
	}
	public static String FizzBuzz(int count){
		//3かつ5で割り切れるなら"FizzBuzz"
		if(count % 3 == 0 && count % 5 == 0){
			return "FizzBuzz";
		//3で割り切れるなら"Fizz"
		}else if(count % 3 == 0){
			return "Fizz";
		//5で割り切れるなら"Buzz"
		}else if(count % 5 == 0){
			return "Buzz";
		//それ以外ならiを出力
		}else{
			return String.valueOf(count);
		}
	}

}
