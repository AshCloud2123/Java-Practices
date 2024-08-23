public class FizzBuzz{
	//class
	public static void main(String args[]){
		//main body
		//declared a variable and initialize
		int i=1;
		// repetitive structure that will continue execute as long as the condtion is not falsified
		while(i!=0){
			// repetitive structure that will help give a 50 output
			for(int m=1; m<=50; m++){
				//conditional statement if the condition is meet a set of command will be executed
				if(m%3==0 && m%15!=0)
				//if the condition is meet this will be executed
				System.out.println(m + " Fizz");
				//conditional statement if the condition is meet a set of command will be executed
				else if(m%5==0 && m%15!=0)
				//if the condition is meet this will be executed
				System.out.println(m + " Buzz");
				//conditional statement if the condition is meet a set of command will be executed
			     if(m%15==0)
			     //if the condition is meet this will be executed
				System.out.println(m +  " FizzBuzz");
				//conditional statement if the condition is meet a set of command will be executed
				if(m%3!=0 && m%5!=0 && m%15!=0)
				 //if the condition is meet this will be executed
				System.out.println(m);
				}
				//prompts a message
			System.out.print("Enter 1--Continue, 0--Exit");
			//stores the input into a variable declared
			int decision = Mel.readInt();
			//control struture that if the condition is satisfied the program will be forcefully terminated
			if(decision==0)
			return;
		}
	}
}