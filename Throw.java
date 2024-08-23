public class Throw{
	public static void checkE(int age){
				if(age<18){
				new throw ArithmeticException("You are minor");
			}else{
				System.out.println("You are allowed to vote");
			}
	}
	public static void main(String args[]){
		System.out.print("Enter your age: ");
		int age=Mel.readInt();
		checkE(age);
	}
}