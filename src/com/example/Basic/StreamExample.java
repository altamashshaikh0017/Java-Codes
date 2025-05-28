package com.example.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

	public void stream() {

		List<Integer> list = Arrays.asList(7,3,1,8,4,2);
		//		Stream<Integer> nums =list.stream();
		//       Stream<Integer>mappedData =  nums.map(n->n*2);
		//		mappedData.forEach(n->System.out.println(n));

		//		Predicate<Integer> pred =  (t -> t%2==1);

		//		Function<Integer, Integer> fun = t-> t*10;    //map()


		int result =	list.stream()
				.filter(t->t%2==0)
				.sorted()
				.map(n->n*10)
				.reduce(0, (c,e)->(c+e));
		//			           .forEach(n-> System.out.println(n));

		System.out.println(result);
	}
	public static void main(String[] args) {
		StreamExample se = new StreamExample();
		se.stream();
	}
}
