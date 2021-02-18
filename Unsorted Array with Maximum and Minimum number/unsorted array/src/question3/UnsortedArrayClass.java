package question3;

	import java.util.*;

	public class UnsortedArrayClass
	{
		public static Student[] arr;
		private int arraySize;

		public UnsortedArrayClass(int scale) {
			arr = new Student[scale];
			arraySize = 0;
		}

		public Student get(int i) {
			return arr[i];
		}

		public int search(float score) {
			int i = 0;
			while ((i < arraySize) && (arr[i].score != score))
				i = i + 1;
			if (i < arraySize)
				return i;
			else {
				System.out.println("There is no such item!");
				return -1;
			}
		}

		public void append(Student student) {
			if (arraySize == arr.length)
				System.out.println("It is full!");
			else {
				arr[arraySize] = student;
				arraySize = arraySize + 1;
			}
		}

		public Student remove() {
			if (arraySize == 0) {
				System.out.println("It is empty!");
				return null;
			} else {
				Student x = arr[arraySize - 1];
				arraySize = arraySize - 1;
				return x;
			}
		}

		public void deletion(float score) {
			int k = search(score);
			if (k != -1) {
				for (int i = k; i < arraySize; i++)
					arr[i] = arr[i + 1];

				arraySize = arraySize - 1;
			}
		}

		public void display() {
			if (arraySize == 0)
				System.out.println("It is empty!");
			else
				for (int i = 0; i < arraySize; i++) {
					System.out.println(arr[i].id + " " + arr[i].name + " " + arr[i].score);
				}
		}

		public Student maxScoreStudent() {
			if (arraySize == 0) {
				System.out.println("It is empty!");
				return null;
			} else {
				Student max = arr[0];
				for (int i = 0; i < arraySize; i++) {
					if(arr[i].score > max.score) {
						max = arr[i];
					}
				}
				return max;
			}
		}

		public Student minScoreStudent() {
			if (arraySize == 0) {
				System.out.println("It is empty!");
				return null;
			} else {
				Student min = arr[0];
				for (int i = 0; i < arraySize; i++) {
					if(arr[i].score < min.score) {
						min = arr[i];
					}
				}
				return min;
			}
		}
	}

