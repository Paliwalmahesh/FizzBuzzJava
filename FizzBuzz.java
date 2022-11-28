
public class FizzBuzz {
	public String Print_Fizz_Buzz(int input_number) {
		String result="";
		if(input_number>100 || input_number<=0) {
			return "-1";
		}
		else {
			for(int loop_input_number=1;loop_input_number<=input_number;loop_input_number++) {
				if(loop_input_number%3==0) {
					result=result+"Fizz";
				}
				else if(loop_input_number%5==0) {
					result=result+"Buzz";
				}
				else {
					result=result+loop_input_number;
				}	
			}	
		}
		return result;
	}



}
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//}
