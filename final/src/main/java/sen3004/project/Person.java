package sen3004.project;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Person {
	
	@NotEmpty
	@Size(min = 3, max = 24)
	private String firstName;
	@NotEmpty
	@Size(min = 3, max = 24)
	private String lastName;
	@NotEmpty
	@Email
	@Size(min = 3, max = 24)
	private String email;
	@NotEmpty
	@Size(max = 13)
	@Pattern(regexp = "(\\+90|0)[0-9]{10}")
	private String phoneNumber;
	@NotEmpty
	@Size(min = 10, max = 10)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	@NotNull
	private String gender;
	@NotEmpty
	private List<String> completedLevelsOfEducation;
	@NotEmpty
	@Max(value = 99)
	private int yearsOfExperience;
	@NotEmpty
	private Object cv;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getCompletedLevelsOfEducation() {
		return completedLevelsOfEducation;
	}
	public void setCompletedLevelsOfEducation(List<String> completedLevelsOfEducation) {
		this.completedLevelsOfEducation = completedLevelsOfEducation;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public Object getCv() {
		return cv;
	}
	public void setCv(Object cv) {
		this.cv = cv;
	}
	
}
