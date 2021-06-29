package mock.test;

import java.util.Arrays;

public class IdentifyDuplicate {

	public static void main(String[] args) {
		String[] names = { "Bucku", "Yama", "Same", "Yama" };
		// System.out.println(names.length);

		// print the duplicate element from array names

		for (int i = 0; i < names.length; i++) {// i1
			for (int j = i + 1; j < names.length; j++) {// j2
				if (names[i].equals(names[j])) {
					System.out.println(names[j]);
				}

			}

		}

		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

	}

}
