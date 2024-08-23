/*Use these do, while and for loop.

				PROBLEM 1: Write a program that accepts 3 quizzes, 4 projects, and 2 major exams (in integer) and compute the average
				each and get 25%, 45% and 30% respectively. Compute and display the Quiz, Project, and Major Exam Average, and the total grade.
				Problem1.java
				Author: Espedillon Melchor A.
				Date: March 1, 2023
				ver 1.0
				*/
				public class DoWhileLoop{
					public static void main(String []args){
						int i = 0;
						//the body of the loop structure, this will be executed until the condition is satisfied
				do{
						System.out.println("- - - Quizzes " + "\t" + "(out of 100 in integer) ----");
						System.out.print("Quiz 1: ");
						Integer quiz1 = Mel.readInt();
						System.out.print("Quiz 2: ");
						Integer quiz2 = Mel.readInt();
						System.out.print("Quiz 3: ");
						Integer quiz3 = Mel.readInt();
						System.out.println("- - - Projects " + "\t" + "(out of 100 in integer) ----");
						System.out.print("Project 1: ");
						Integer project1 = Mel.readInt();
						System.out.print("Project 2: ");
						Integer project2 = Mel.readInt();
						System.out.print("Project 3: ");
						Integer project3 = Mel.readInt();
						System.out.print("Project 4: ");
						Integer project4 = Mel.readInt();
						System.out.println("- - - Major Exams " + "\t" + "(out of 100 in integer) ----");
						System.out.print("Midterm: ");
						Integer midterm = Mel.readInt();
						System.out.print("Final: ");
						Integer finals = Mel.readInt();
						double qAverage = ((quiz1 + quiz2 + quiz3) / 3) * .25;
						double pAverage= ((project1 + project2 + project3 + project4) / 4) * .45;
						double fAverage= ((midterm + finals) / 2) * .30;
						System.out.println("Quiz Average: " + qAverage);
						System.out.println("Project Average: " + pAverage);
						System.out.println("Exam Average: " + fAverage);
						System.out.println("The total grade: " + (qAverage + pAverage + fAverage));
					    System.out.print("Enter: 1--> Continue\n Enter: 0 --> Exit");
					    Integer dec = Mel.readInt();
					    if(dec == 0)
					    return;
					}while(i<5); //the condition of the loop structure
					}
					}

