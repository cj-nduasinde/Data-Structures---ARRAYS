import java.util.Scanner;

public class SortedArrayTest {
	public static void main(String args[]) {
		int n, position;
		float key;
		Student item;

		// Create an empty array with a space for 200 items //
		SortedArrayClass arrApp = new SortedArrayClass(15);

		// insert n items to the empty array //
		System.out.println("Enter the number of students to insert:");
		n = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s students" + "\r\n", n);
		for (int i = 0; i < n; i++) {
			item = new Student();
			arrApp.insertion(item);
		}
		System.out.println("Display all students from index 0:");
		arrApp.display();

		// Test the operations //
		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for minimum Score, 5 for maximum Score: ");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s >= 1 && s <= 5) {
			if (s == 1) {
				System.out.println("Enter a key for search");
				key = Float.parseFloat(new Scanner(System.in).nextLine());
				position = arrApp.BinarySearch(key);
				if (position != -1) {
					System.out.printf("The index of the searching in the array is %1$s" + "\r\n", position);
					Student stud = arrApp.get(position);
					System.out.println("Student ID : " + stud.id);
					System.out.println("Student Name : " + stud.name);
					System.out.println("Student Score : " + stud.score);
					System.out.println();
				}
			}
			if (s == 2) {
				System.out.println("Enter an Student for insertion");
				// Accept one student object //
				item = new Student();
				arrApp.insertion(item);
				System.out.println("Display all students from index 0:");
				arrApp.display();
			}
			if (s == 3) {
				System.out.println("Enter a key (score) for deletion");
				key = Float.parseFloat(new Scanner(System.in).nextLine());
				arrApp.deletion(key);
				System.out.println("Display all students from index 0:");
				arrApp.display();
			}
			if (s == 4) {
				System.out.println("The minimum score for student is: " + arrApp.minValue());
			}
			if (s == 5) {
				System.out.println("The maximum score for student is: " + arrApp.maxValue());
			}
			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for minimum Score, 5 for maximum Score: ");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
	}
}
