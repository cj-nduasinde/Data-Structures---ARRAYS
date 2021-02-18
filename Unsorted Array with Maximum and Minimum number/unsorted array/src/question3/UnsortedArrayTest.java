package question3;

	import java.util.*;

	public class UnsortedArrayTest
	{
		public static void main(String args[]) {
			int n, position;
			int key;
			Student item;

			/* Create an empty array with a space for 200 items */
			UnsortedArrayClass arrApp = new UnsortedArrayClass(200);

			/* Append n items to the empty array */
			System.out.println("Enter the number of Students to append:");
			n = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.printf("Enter %1$s items" + "\r\n", n);
			for (int i = 0; i < n; i++) {

				item = new Student();
				arrApp.append(item);
			}
			;
			System.out.println("Display all items in the array:");
			arrApp.display();

			/* Test the operations */
			System.out.println("Enter 1 for search, 2 for append, 3 for delete, 4 for "
					+ "remove, 5 for student with max score, 6 for student with min score: ");
			int s = Integer.parseInt(new Scanner(System.in).nextLine());
			while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s == 6) {
				if (s == 1) {
					System.out.println("Enter the Score of student for search");
					key = Integer.parseInt(new Scanner(System.in).nextLine());
					position = arrApp.search(key);
					if (position != -1) {
						System.out.printf("The index of the searching item in the array is %1$s" + "\r\n", position);
						item = arrApp.get(position);
						System.out.printf("The  searching item is" + "\r\n" 
						+ item.id + " " + item.name + " " + item.score + "\r\n");
					}
				}
				if (s == 2) {
					System.out.println("Add a new student:");
					item = new Student();
					arrApp.append(item);
					System.out.println("Display all items in the array from index 0:");
					arrApp.display();
				}
				if (s == 3) {
					System.out.println("Enter the student Score to delete");
					key = Integer.parseInt(new Scanner(System.in).nextLine());
					arrApp.deletion(key);
					System.out.println("Display all items in the array from index 0:");
					arrApp.display();
				}

				if (s == 4) {
					item = arrApp.remove();
					if (item != null) {
						System.out.printf("The removed item is:" + "\r\n" + 
								+ item.id + " " + item.name + " " + item.score + "\r\n");
					}
					System.out.println("Display all items in the array from index 0:");
					arrApp.display();
				}

				if (s == 5) {
					item = arrApp.maxScoreStudent();
					if (item != null) {
						System.out.printf("The max score student is:" + "\r\n" + 
								+ item.id + " " + item.name + " " + item.score + "\r\n");
					}
				}

				if (s == 6) {
					item = arrApp.minScoreStudent();
					if (item != null) {
						System.out.printf("The min score student is:" + "\r\n" + 
								+ item.id + " " + item.name + " " + item.score + "\r\n");
					}
				}

				System.out.println("Enter 1 for search, 2 for append, 3 for delete, 4 for "
						+ "remove, 5 for student with max score, 6 for student with min score: ");
				System.out.println("\n \n");
				s = Integer.parseInt(new Scanner(System.in).nextLine());
			}
		}
	}


