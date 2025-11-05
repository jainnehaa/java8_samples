package package1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleExamples1 {

	public static void main(String[] args) {

		// 1. Simple Runnable Example
		System.out.println("1. Simple Runnable Example");
		Runnable runnable = () -> System.out.println("hello runnable!"); // it's ordering may disturb due to threading
		new Thread(runnable).start();

		// 2. Iterating list using Lambda
		System.out.println("2. Iterating list using Lambda");
		List<String> list2 = Arrays.asList("Java", "Python", "JavaScript");
		list2.forEach(item -> System.out.println(item));

		// 3. Filtering a List with Lambda
		System.out.println("3. Filtering a List with Lambda");
		List<String> list3 = Arrays.asList("Java", "Python", "JavaScript");
		List<String> filteredList = list3.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
		filteredList.forEach(System.out::println);

		// 4. Sorting a List using Lambda
		System.out.println("4. Sorting a List using Lambda");
		List<String> list4 = Arrays.asList("Java", "Python", "JavaScript");
		list4.sort((s1, s2) -> s1.compareTo(s2));
		list4.forEach(System.out::println);

		// 5. Using a Custom Functional Interface
		System.out.println("5. Using a Custom Functional Interface");
		Calculator calculator1 = (a, b) -> a + b;
		Calculator calculator2 = (a, b) -> a * b;
		System.out.println("Addition : " + calculator1.calculate(5, 3));
		System.out.println("Multiplication : " + calculator2.calculate(5, 3));

		// 6. Lambda with Map Iteration
		System.out.println("6. Lambda with Map Iteration");
		Map<String, Integer> hashMap1 = new HashMap<>();
		hashMap1.put("Java", 8);
		hashMap1.put("Spring", 5);
		hashMap1.put("Lambda", 1);
		hashMap1.forEach((key, value) -> System.out.println(key + ", " + value));

		// 7. Creating a thread with Lambda
		System.out.println("7. Creating a thread with Lambda");
		new Thread(() -> System.out.println("Thread with Lambda !!")).start();

		// 8. Lambda with Comparator
		System.out.println("8. Lambda with Comparator");
		List<String> list8 = Arrays.asList("Java", "JavaScript", "Spring");
		list8.sort(Comparator.comparingInt(String::length));
		list8.forEach(System.out::println);

		// 9. Method Reference with Lambda
		System.out.println("9. Method Reference with Lambda");
		List<String> list9 = Arrays.asList("Java", "Lambda", "Kafka");
		list9.forEach(System.out::println);

		// 10. Lambda with Optional
		System.out.println("10. Lambda with Optional");
		Optional<String> optional101 = Optional.of("Java");
		optional101.ifPresent(s -> System.out.println("Value is present : " + s));
		Optional<Integer> optional102 = Optional.of(12);
		optional102.ifPresent(s -> {
			int a = s * 4;
			System.out.println("Integer value is present : " + a);
		});

		// 11. Lambda with Predicate
		System.out.println("11. Lambda with Predicate");
		Predicate<String> predicate1 = s -> s.isEmpty();
		System.out.println(predicate1.test(""));
		System.out.println(predicate1.test("    Kafka    "));
		Predicate<Integer> predicate2 = s -> s > 41;
		System.out.println(predicate2.test(4));
		System.out.println(predicate2.test(82));

		// 12. Lambda with BiFunction
		System.out.println("12. Lambda with BiFunction");
		BiFunction<Integer, Integer, Integer> biFunction12 = (a, b) -> a + b;
		System.out.println(biFunction12.apply(5, 3));

		// 13. Lambda with Consumer
		System.out.println("13. Lambda with Consumer");
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Hello Consumer");

		// 14. Lambda with Supplier
		System.out.println("14. Lambda with Supplier");
		Supplier<String> supplier14 = () -> "Java";
		System.out.println(supplier14.get());

		// 15. Lambda with Function
		System.out.println("15. Lambda with Function");
		Function<String, Integer> function15 = s -> s.length();
		System.out.println(function15.apply("Lambda"));

		// 16. Lambda with UnaryOperator
		System.out.println("16. Lambda with UnaryOperator");
		UnaryOperator<Integer> unaryOperator16 = x -> x * x;
		System.out.println(unaryOperator16.apply(5));

		// 17. Lambda with BinaryOperator
		System.out.println("17. Lambda with BinaryOperator");
		BinaryOperator<Integer> binaryOperator17 = (a, b) -> a * b;
		System.out.println(binaryOperator17.apply(2, 3));

		// 18. Lambda for Checking even numbers
		System.out.println("18. Lambda for Checking even numbers");
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(isEven.test(4));
		System.out.println(isEven.test(41));

		// 19. Lambda with Custom Sorting
		System.out.println("19. Lambda with Custom Sorting");
		List<String> list19 = Arrays.asList("Java", "Kafka", "JavaScript", "Bash");
		list19.sort((s1, s2) -> s2.compareTo(s1)); // reverse order
		list19.forEach(System.out::println);

		// 20. Lambda with Uppercase Conversion
		System.out.println("20. Lambda with Uppercase Conversion");
		List<String> list20 = Arrays.asList("java", "lambda", "kafka");
		List<String> uppercaseList = list20.stream().map(String::toUpperCase).collect(Collectors.toList());
		uppercaseList.forEach(System.out::println);

		// 21. Lambda with Stream Reduce
		System.out.println("21. Lambda with Stream Reduce");
		List<Integer> list21 = Arrays.asList(1, 2, 3, 4, 5);
		int sum = list21.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		// 22. Lambda with Stream Filter
		System.out.println("22. Lambda with Stream Filter");
		List<Integer> list22 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> evenNumbers = list22.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		evenNumbers.forEach(System.out::println);

		// 23. Lambda with Stream Map
		System.out.println("23. Lambda with Stream Map");
		List<String> list23 = Arrays.asList("Java", "Spring", "Lambda");
		list23.stream().map(String::toLowerCase).forEach(System.out::println);

		// 24. Lambda with Stream Distinct
		System.out.println("24. Lambda with Stream Distinct");
		List<Integer> list24 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		list24.stream().distinct().forEach(System.out::println);

		// 25. Lambda with Stream Sorted
		System.out.println("25. Lambda with Stream Sorted");
		List<String> list25 = Arrays.asList("Grapes", "Banana", "Pear");
		list25.stream().sorted().forEach(System.out::println);

		// 26. Lambda with Stream Count/Counting
		System.out.println("26. Lambda with Stream Count");
		List<Integer> list261 = Arrays.asList(1, 2, 3, 4, 55, 6, 7, 8);
		long count261 = list261.stream().count();
		System.out.println(count261);
		List<String> list262 = Arrays.asList("java", "javascript", "python");
		long count262 = list262.stream().collect(Collectors.counting());
		System.out.println(count262);

		// 27. Lambda with Stream anyMatch
		System.out.println("27. Lambda with Stream anyMatch");
		List<String> list27 = Arrays.asList("java", "spring", "lambda");
		boolean hasMatch = list27.stream().anyMatch(s -> s.equals("java"));
		System.out.println("contains java : " + hasMatch);

		// 28. Lambda with Stream allMatch
		System.out.println("28. Lambda with Stream allMatch");
		List<Integer> list28 = Arrays.asList(2, 6, 8, 10);
		boolean allEven = list28.stream().allMatch(s -> s % 2 == 0);
		System.out.println(allEven);

		// 29. Lambda with Stream noneMatch
		System.out.println("29. Lambda with Stream noneMatch");
		List<String> list29 = Arrays.asList("Java", "JavaScript", "Spring");
		boolean nonePython = list29.stream().noneMatch(s -> s.equals("Python"));
		System.out.println(nonePython);

		// 30. Lambda with Stream findFirst
		System.out.println("30. Lambda with Stream findFirst");
		List<String> list301 = Arrays.asList("java", "spring", "python");
		Optional<String> optional301 = list301.stream().findFirst();
		optional301.ifPresent(System.out::println);

		List<String> list302 = Arrays.asList();
		Optional<String> optional302 = list302.stream().findFirst();
		optional302.ifPresent(System.out::println); // nothing prints

		// 31. Lambda with Stream findAny
		System.out.println("31. Lambda with Stream findAny");
		List<String> list31 = Arrays.asList("java", "python", "kafka");
		Optional<String> findAny31 = list31.stream().findAny();
		findAny31.ifPresent(System.out::println);

		// 32. Lambda with Summing Integers
		System.out.println("32. Lambda with Summing Integers");
		List<Integer> list32 = Arrays.asList(1, 2, 3, 4, 5, 6);
		int sum32 = list32.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum32);

		// 33. Lambda for Max/Min Integer
		System.out.println("33. Lambda for Max/Min Integer");
		List<Integer> list331 = Arrays.asList(1, 2, 3, 6, 4, 9, 5);
		int min = list331.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
		System.out.println("min : " + min);

		List<Integer> list332 = Arrays.asList();
		int max = list332.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
		System.out.println("max : " + max);
		/**
		 * For min() : If empty, it returns the largest possible integer, which is safe
		 * for min calculations or it signals that no actual minimum was found
		 * 
		 * For max() : If empty, it returns the smallest possible integer, which is safe
		 * for max calculations.
		 */

		// 34. Lambda for Joining Strings
		System.out.println("34. Lambda for Joining Strings");
		List<String> list34 = Arrays.asList("java", "spring", "lambda");
		String joined341 = list34.stream().collect(Collectors.joining("::"));
		String joined342 = list34.stream().collect(Collectors.joining());
		System.out.println(joined341);
		System.out.println(joined342);

		// 35. Lambda with Stream mapToInt
		System.out.println("35. Lambda with Stream mapToInt");
		List<String> list35 = Arrays.asList("Java", "Python", "JavaScript");
		list35.stream().mapToInt(String::length).forEach(System.out::println);

		// 36. Lambda with Stream Collect to Set
		System.out.println("36. Lambda with Stream Collect to Set");
		List<String> list36 = Arrays.asList("java", "spring", "lamda", "java", "spring");
		Set<String> set36 = list36.stream().collect(Collectors.toSet());
		set36.forEach(System.out::println);

		// 37. Lambda with Stream Collectors.groupingBy : to get Frequency OR by any
		// other condition which divides in more than 2 groups
		/**
		 * for conditions as argument in groupingBy and partitioningBy - only one
		 * parameter is required
		 * 
		 * also in these in Map 'value' is 'list of integers' and not integer, means for
		 * 1-to-Many s->s isn't required
		 */
		System.out.println("37. Lambda with Stream GroupingBy : to get Frequency");
		List<String> list37 = Arrays.asList("java", "spring", "javascript", "java", "spring", "bash", "lambda",
				"spring");
		Map<String, Long> frequency37 = list37.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		frequency37.forEach((k, v) -> System.out.println(k + ": " + v));

		Map<Integer, List<String>> groupedMap37 = list37.stream().collect(Collectors.groupingBy(String::length));
		groupedMap37.forEach((k, v) -> System.out.println(k + ": " + v));

		// 38. Lambda with Stream Collectors.partitioningBy : to get two list based on a
		// boolean condition
		System.out.println("38. Lambda with Stream partitioningBy : to get two list based on an if condition");
		List<Integer> list38 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> partitioned38 = list38.stream().collect(Collectors.partitioningBy(s -> s % 3 == 0));
		partitioned38.forEach((k, v) -> System.out.println(k + ": " + v));

		// 39. Lambda with Stream SummarizingInt
		System.out.println("39. Lambda with Stream SummarizingInt");
		List<Integer> list39 = Arrays.asList(2, 3, 1, 4, 9, 5, 8, 7, 6);
		IntSummaryStatistics intSummaryStatistics39 = list39.stream()
				.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Sum : " + intSummaryStatistics39.getSum());
		System.out.println("Average : " + intSummaryStatistics39.getAverage());
		System.out.println("Max : " + intSummaryStatistics39.getMax());
		System.out.println("Min : " + intSummaryStatistics39.getMin());
		System.out.println("Count : " + intSummaryStatistics39.getCount());
		System.out.println("Class : " + intSummaryStatistics39.getClass());

		// 40. Lambda with Stream Collectors.toMap - to create map from a list
		System.out.println("40. Lambda with Stream Collectors.toMap - to create map from a list");
		List<String> list40 = Arrays.asList("java", "kafka", "lambda", "spring");
		Map<String, Integer> map40 = list40.stream().collect(Collectors.toMap(s -> s, String::length));
		map40.forEach((k, v) -> System.out.println(k + ": " + v));

		// 41. Lambda for Creating a Stream
		System.out.println("41. Lambda for Creating a Stream");
		Stream<String> stream41 = Stream.of("java", "lambda", "spring");
		stream41.forEach(System.out::println);

		// 42. Lambda with Stream Limit
		System.out.println("42. Lambda with Stream Limit");
		Stream<String> stream42 = Stream.of("java", "kafka", "spring", "lambda");
		stream42.limit(2).forEach(System.out::println);

		// 43. Lambda with Stream Skip
		System.out.println("43. Lambda with Stream Skip");
		Stream<String> stream43 = Stream.of("java", "kafka", "spring", "lambda");
		stream43.skip(2).forEach(System.out::println);

		// 44. Lambda with Stream Peek
		System.out.println("44. Lambda with Stream Peek");
		Stream<String> stream44 = Stream.of("java", "kafka", "spring", "lambda");
		stream44.peek(System.out::println).collect(Collectors.toList());

		// 45. Lambda with Optional
		System.out.println("45. Lambda with Optional");
		Optional<String> optional45 = Optional.of("Java");
		optional45.ifPresent(System.out::println);
		System.out.println(optional45.isPresent() ? "Optional is present" : "Optional is not present");

	}

}

//5. Using a Custom Functional Interface
@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}