
public class SortedArrayClass {
	// arr is an array of objects of type Student //
	public static Student[] arr;
	private int arraySize;

	public SortedArrayClass(int scale) {
		// Initialize Student array with the size given //
		arr = new Student[scale];
		arraySize = 0;
	}

	// get method returns the Student object at index position i //
	public final Student get(int i) {
		return arr[i];
	}

	public final int BinarySearch(double Key) {
		int k = 0;
		int lower = 0;
		int upper = arraySize - 1;
		while (lower < upper) {
			k = (lower + upper + 1) / 2;
			// Compare key with the "score" of the specific Student object at index k //
			if (Key == arr[k].score)
				break;
			if (Key < arr[k].score)
				upper = k - 1;
			else
				lower = k + 1;
		}
		if (lower == upper)
			k = lower;
		if (Key == arr[k].score)
			return k;
		else {
			System.out.println("There is no such item!");
			return -1;
		}
	}

	/** insert a student object */
	public final void insertion(Student Item) {
		if (arraySize == arr.length)
			System.out.println("It is full!");
		else {
			Student Key = Item; // Item is used as the key here //
			if (arraySize == 0)
				arr[0] = Item;
			// find the position for inserting the given key //
			int position = 0;
			while (position < arraySize && Key.score > arr[position].score)
				position++;

			for (int i = arraySize; i > position; i--)
				arr[i] = arr[i - 1];
			arr[position] = Item;
			arraySize = arraySize + 1;
		}
	}

	public final void deletion(float Key) {
		if (arraySize == 0)
			System.out.println("It is empty!");
		else {
			int position = BinarySearch(Key);
			if (position != -1) {
				for (int i = position; i < arraySize - 1; i++)
					arr[i] = arr[i + 1];
				arraySize = arraySize - 1;
			}
		}
	}

	float minValue() {
		return arr[0].score;
	}

	float maxValue() {
		return arr[arraySize - 1].score;
	}

	// display all the values of Student object //
	public final void display() {
		if (arraySize == 0)
			System.out.println("It is empty");
		else
			for (int i = 0; i < arraySize; i++) {
				System.out.println("Student " + (i + 1));
				System.out.println("Student ID : " + arr[i].id);
				System.out.println("Student NAME : " + arr[i].name);
				System.out.println("Student SCORE : " + arr[i].score);
				System.out.println();
			}
	}
}


