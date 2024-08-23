public class practice5{
	public static void main(String args[]){
		System.out.print("Enter a letter: ");
		String letter=mel.readString();
		System.out.print("Enter a word: ");
		String word=mel.readString();
		System.out.print("Enter a num: ");
		Integer num=mel.readInt();
		System.out.print("Enter a number with decimal: ");
		Float num_dec=mel.readFloat();
		System.out.print("Enter a negative number with decimal: ");
		Float neg_dec=mel.readFloat();
		System.out.print("Enter a another number with decimal: ");
		Float ano_num=mel.readFloat();

        System.out.print("\n\nTHESE ARE THE FOLLOWING OUTPUT THAT IMPLEMENTS \nDIFFERENT KINDS OF SPECIFIER, POSITION AND DECIMAL PALCES\n\n");


        System.out.printf("1. %4s\n", letter);
         System.out.printf("2. %s\n", letter);
		System.out.printf("3. %2s\n", word);
		System.out.printf("4. %2d\n", num);
		System.out.printf("5. %8d\n", num);
		System.out.printf("6. %2d\n", num);
		System.out.printf("7. %2f\n", num_dec);
		System.out.printf("8. %2f\n", num_dec);
		System.out.printf("9. %10.2f\n", num_dec);
	    System.out.printf("10. %.2f\n", num_dec);
	 	System.out.printf("11. %.2f\n", num_dec);
		System.out.printf("12. %8.1f\n", neg_dec);
		System.out.printf("13. %8.5f\n", ano_num);

	}
}