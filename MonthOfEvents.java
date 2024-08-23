/*
3. Write a program that will accept a character type of data for a month.
Use block codes for the statement. Switch-case statement. Trap the errors
for example:
Enter a month in character: a
It is January
Pirititit Month!!!
/**@ MonthOfEvents.java
/* @Author: Espedillon Melchor A.
/* @Date Started: Mach 10, 2023
/*@Date Finished: March 13, 2023
Pöver 1.0
*/
//the class
public class MonthOfEvents{
	//the main class
	public static void main(String []args){
		//prompts the user to enter a character ranging in A - L
		System.out.println("Enter a month in a character (Note: Enter only between A - L): ");
		//stores the variable
		String character = Mel.readString();

		//add another parameter, if the user enter a lower case we will convert it into to an uppercase
		String character1 = character.toUpperCase();

		//the switch statement
		switch(character1){
		//case 1
		case "A":
		//this will be executed if the condition match the case
		System.out.println("It is January!\n It is prititit month\nPIT SENYOR!");
		//forcefully terminates the program
		break;
		//case 2
		case "B":
		//this will be executed if the condition match the case
				System.out.println("It is February!\n It is the month of hearts <3 \n  matulog ang single!");
		//forcefully terminates the program
		break;
		//case 3
		case "C":
		//this will be executed if the condition match the case
				System.out.println("It is March!\n It is  International Women's \n Day Long Live!");
		//forcefully terminates the program
		break;
		//case 4
		case "D":
		//this will be executed if the condition match the case
				System.out.println("It is April!\n It is April Fools' Day \n Sa mga taong niloko at pinagpalit sa malapit!");
		//forcefully terminates the program
		break;
		//case 5
		case "E":
		//this will be executed if the condition match the case
				System.out.println("It is May!\n It is International Labour Day month!\n MABUHAY ANG MGA AMA'T INA");
		//forcefully terminates the program
		break;
		//case 6
		case "F":
		//this will be executed if the condition match the case
				System.out.println("It is June!\n It is International Yoga Day month!");
		//forcefully terminates the program
		break;
		//case 7
		case "G":
		//this will be executed if the condition match the case
				System.out.println("It is July!\n It is Philippines Republic Day month!");
		//forcefully terminates the program
		break;
		//case 8
		case "H":
		//this will be executed if the condition match the case
				System.out.println("It is August!\n It is National Heroes Day month!");
		//forcefully terminates the program
		break;
		//case 9
		case "I":
		//this will be executed if the condition match the case
				System.out.println("It is September!\n It is National Peace Consciousness Month month! \n Ber Months naaaaa!! HAPIT NA PASKO");
		//forcefully terminates the program
		break;
		//case 10
		case "J":
				System.out.println("It is October!\n It is National Indigenous Peoples month month!\n Birthday ni PAPA nako ug Fiesta sa among Lungsod");
		//forcefully terminates the program
		break;
		//case 11
		case "K":
		//this will be executed if the condition match the case
				System.out.println("It is November!\n It is Filipino Values Month!\n One Month nalang Pasko na!!");
		//forcefully terminates the program
		break;
		//case 12
		case "L":
		//this will be executed if the condition match the case
				System.out.println("It is December !\n It is Christmas month!\nNINONG/NINANG AKONG PINASKUHANNNNN!!!!");
		//forcefully terminates the program
		break;
		//the default execution if the input doesnt match the condition
		default:
	        	System.out.println("Please only enter between A-L");
	}

	}
	}