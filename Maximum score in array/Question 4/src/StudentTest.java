import java.util.Scanner;

public class StudentTest {
	

		   public static void main(String[] args)
			{
		       int Num;
		       float Ave;
		       //float maximum;
		       Student[] Stu = new Student[100];
		       /* input student number and records */ 
		       System.out.println("Enter the number of students:");
		       Num = Integer.parseInt(new Scanner(System.in).nextLine());
		       for (int i = 0; i < Num; i++)
		        	Stu[i] = new Student();
		       StudentStatistics stuApp = new StudentStatistics();
		       Ave = stuApp.AverageScore(Stu, Num);
		       System.out.printf("The list of students:");
		       System.out.println();
		       stuApp.Display(Stu, Num);
		       System.out.printf("Average Score is:"+"%1$s%n", Ave);
		       System.out.printf("Maximum Score is:"+"%1$s", stuApp.MaximumScore(Stu, Num));
		    }
	}


