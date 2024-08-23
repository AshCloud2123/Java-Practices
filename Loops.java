/*Use these do, while and for loop.

				PROBLEM 1: Write a program that accepts 3 quizzes, 4 projects, and 2 major exams (in integer) and compute the average
				each and get 25%, 45% and 30% respectively. Compute and display the Quiz, Project, and Major Exam Average, and the total grade.
				Problem1.java
				Author: Espedillon Melchor A.
				Date: March 1, 2023
				ver 1.0
				*/
				public class Loops{
					public static void main(String []args){
						//prompts a message
					System.out.println("- - - Quizzes " + "\t" + "(out of 100 in integer) ----");
					//initialize array
				    int array[] = new int[4];
				    //using for loops to get the score in quiz
					for(int i = 0; i<3 ; i++){
					     System.out.println("Enter quize score " + (i + 1));
					     //store the score into an array variable
					     array[i] = Mel.readInt();
					}
					//prompts a message
					System.out.println("- - - Projects " + "\t" + "(out of 100 in integer) ----");
					//intialize the variable
				     int j = 0;
				    //initialize array
				     int array1[] = new int[5];
				     //the body of the repetitive structure do while loop
				     do{
						 //prompts a message
						 System.out.println("Project's score" + (j+1));
						 //stores the input into the variable array
				         array1[j] = Mel.readInt();
				         //increment
				         j++;
					     }while(j<4); // the condition of the repetitive structure
					     //prompts a message
					   System.out.println("- - - Major Exams " + "\t" + "(out of 100 in integer) ----");
					   //initialize the variable
					   int n = 0;
					   //initialize array
					   int array2[] = new int[3];
					   //while repetitive structure
					   while(n < 2){
						   //prompts a message
					   System.out.println("Enter Major Exam score " + (n+1));
					   //store the input into the array varaible
					   array2[n] = Mel.readInt();
					   //increment
					   n++;
				       }
				       //formula in getting the average
				       double qAverage = ((array[0] + array[1] + array[2]) / 3) * .25;
					   double pAverage= ((array1[0] + array1[1]  + array1[2]  + array1[3] ) / 4) * .45;
			         	double fAverage= ((array2[0] + array2[1]) / 2) * .30;
			         	//print out the averag score in quiz, projec, and major exams
			         	System.out.println("Quiz Average: " + qAverage);
						System.out.println("Project Average: " + pAverage);
						System.out.println("Exam Average: " + fAverage);
				        System.out.println("The total grade: " + (qAverage + pAverage + fAverage));

					}
				}
				//terminate










