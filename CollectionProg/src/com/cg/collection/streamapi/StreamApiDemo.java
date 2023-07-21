package com.cg.collection.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> cityList=Arrays.asList("Pune","Mumbai","nagapur","Nasik","Chennai","Bengaluru");
		
		System.out.println("total cities:"+cityList.stream().count());
		cityList.forEach((city)->System.out.println(city));
		System.out.println("cities with name length>4");
		cityList.stream().filter((city)->city.length()>4).forEach((city)->System.out.println(city));;
		cityList.stream().map((city)->city.toUpperCase()).forEach((city)->System.out.println(city));;
		System.out.println("first 4 cities");
		cityList.stream().limit(4).forEach((city)->System.out.println(city));;
		//System.out.println("city with max length:");
		//cityList.stream().filter((city)->city.length()>4).forEach(city->System.out.println(city));
		
		
		//Stream <String> sequential=cityList.stream().sequential();
		//Stream <String> parallel=cityList.stream().parallel();
		
		//System.out.println("sequential stream output");
		//sequential.forEach((city)->System.out.println(city));
		
		//System.out.println("parallel stream output");
		//parallel.forEach((city)->System.out.println(city));
	}

}
