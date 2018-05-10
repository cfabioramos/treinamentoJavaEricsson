package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.Person.Sex;

public class Main {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		Person pessoa1 = new Person("Jão", LocalDate.now().minusYears(18), "jao@yahoo.com", Sex.MALE);
		Person pessoa2 = new Person("Zé", LocalDate.now().minusYears(20), "ze@gmail.com", Sex.MALE);
		Person pessoa3 = new Person("Maria", LocalDate.now().minusYears(24), "maria@uol.com", Sex.FEMALE);
		Person pessoa4 = new Person("Jana", LocalDate.now().minusYears(9), "jana@yahoo.com", Sex.FEMALE);

		persons.add(pessoa1);
		persons.add(pessoa2);
		persons.add(pessoa3);
		persons.add(pessoa4);
//
//		Main.processPerson(persons, 
//				p -> p.getGender() == Person.Sex.MALE
//							&& p.getAge() >= 18,
//							p -> p.printPerson());
//		
//		Main.processPerson(persons, 
//				p -> p.getGender() == Person.Sex.MALE
//							&& p.getAge() >= 18,
//							p -> {
//								System.out.println(p.getAge());
//							});
//		
		Main.printPersonsForAlistamento(persons);

	}

	public static void processPerson(List<Person> roster, 
			Predicate<Person> tester,
		    Consumer<Person> block) {
		
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}
	
	public static void printPersonsForAlistamento(List<Person> roster) {
		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE
							&& p.getAge() >= 18).forEach(p -> p.printPerson());
		
	}

}
