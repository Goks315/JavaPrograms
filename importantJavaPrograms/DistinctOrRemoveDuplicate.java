package importantJavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctOrRemoveDuplicate {
	public static void printDistinctCharacters(String str) {
		str.chars().distinct().mapToObj(ch -> (char) ch).forEach(ch -> System.out.print(ch + " "));
	}

	public static void printDistinctCharsUsingSet(String str) {
		Set<Character> distinctChars = new HashSet<>();
		for (char ch : str.toCharArray()) {
			distinctChars.add(ch);
		}
		System.out.println(" " + distinctChars);
	}

	// Remove Duplicate numbers and Sorted it
	public static void printUniqueNumbers() {
		List<Integer> numbers = Arrays.asList(4, 6, 3, 8, 5, 9, 4, 9, 8, 3, 5, 6, 9, 2, 1, 7);
		numbers.stream().distinct().sorted().forEach(s -> System.out.println(s));
	}

	public static void main(String[] args) {
		String input = "jacavodegeeks";
		printDistinctCharacters(input);
		printDistinctCharsUsingSet(input);
		printUniqueNumbers();
	}
}
