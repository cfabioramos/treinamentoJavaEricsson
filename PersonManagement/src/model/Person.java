package model;

import java.time.LocalDate;

public class Person {

	Person(String name, LocalDate nascimento, String email, Sex genero) {
		this.name = name;
		this.birthday = nascimento;
		this.gender = genero;
		this.emailAddress = email;
	}
	
	public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public int getAge() {
        return LocalDate.now().getYear() - this.birthday.getYear();
    }

    public void printPerson() {
    	System.out.println(this.name);
    }
    
    public Sex getGender() {
		return gender;
	}
	
}
