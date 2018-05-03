package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

		Main.printPersons(persons, 
				p -> p.getGender() == Person.Sex.MALE
							&& p.getAge() >= 18
					        && p.getAge() <= 25 );

	}

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

}
