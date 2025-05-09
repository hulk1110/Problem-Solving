package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(new User("name1", 11, Arrays.asList("2", "5", "9")),
				new User("name2", 11, Arrays.asList("23", "54", "999")),
				new User("name3", 11, Arrays.asList("27", "51", "90")),
				new User("name4", 11, Arrays.asList("12", "315", "5339")));

		Optional<String> getTheNumber = users.stream().map(mapper -> mapper.getPhoneNumbers().stream())
				.flatMap(mapper2 -> mapper2.filter(p -> p.equals("315"))).findAny();
		// optional is getting used here for null check
		getTheNumber.ifPresent(System.out::println);
	}

	static class User {

		private String name;
		private int age;
		private List<String> phoneNumbers;

		public User(String name, int age, List<String> phoneNumbers) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumbers = phoneNumbers;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public List<String> getPhoneNumbers() {
			return phoneNumbers;
		}

		public void setPhoneNumbers(List<String> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}

	}
}
