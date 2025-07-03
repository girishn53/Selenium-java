package arrayPractice;
;
public class SortArray {

	public static void main(String[] args) {

		int a[] = { 12, 9, 23, 56, -9,-8, 0, 32, 54 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}

}
