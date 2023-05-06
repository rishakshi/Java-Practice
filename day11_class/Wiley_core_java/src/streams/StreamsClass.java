package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {
	
	public static void main(String[] args) {
		
//		int[] array = {1, 2, 3, 4, 5, 6, 7};
//		int sum = 0;
//		
//		for(int i=0; i<array.length; i++) {
//			if(array[i] %2 == 0) {
//				sum += array[i];
//			}
//		}
//		
//		System.out.println(sum);
//		
//		int total = Arrays.stream(array).filter(n -> n%2==0);
		
		// Readable Flexible Parallelism
		
		List<String> list = Arrays.asList("Java", "pyton","idhiwh");
		
		String[] arr = {"Java", "Python", "Ang"};
		Stream<String> msa = Arrays.stream(arr);
		
		Stream<Integer> intStr = Stream.of(1, 2, 3, 4, 5, 6, 7);
		
		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(100);
		
		Stream<String> limitString = Stream.generate(() -> "Wiley").limit(5);

		Stream<Integer> limitRandom = Stream.generate(() -> (int) Math.random() * 100).limit(5);
		
		List<Integer> intStr1 = Arrays.asList(6, 8, 18, 56, 1, 2, 3, 4, 5, 6, 7);
		List<Integer> filteredData = intStr1.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(filteredData);
		
		List<Integer> mappedList = filteredData.stream().map(n -> n/2).collect(Collectors.toList());
		System.out.println(mappedList);
		
		List<Integer> filt = intStr1.stream().filter(x -> x%2 == 0).map(n -> n/2).distinct().collect(Collectors.toList());
		System.out.println(filt);
		
		List<Integer> filt1 = intStr1.stream().filter(x -> x%2 == 0).map(n -> n/2).distinct().sorted((a, b) -> (b-a)).limit(3).collect(Collectors.toList());
		System.out.println(filt1);
		
	}

}
