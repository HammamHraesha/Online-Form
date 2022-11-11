package sen3004.project.validator;

import java.time.LocalDate;
import java.time.Period;

import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import sen3004.project.Person;

@Component
public class MatchValidator implements Validator{
	
	Person person = new Person();
	LocalDate dob = person.getDateOfBirth();
	int experience = person.getYearsOfExperience();
		

		@Override
		public boolean supports(Class<?> clazz) {
			return Person.class.isAssignableFrom(clazz);
		}
		
		// calculate the age of applicant
		public static int calculateAge(LocalDate dob, LocalDate currentDate) {
	        if ((dob != null) && (currentDate != null)) {
	        	int difference = Period.between(dob, currentDate).getYears();
	            return difference;
	        } else {
	            return 0;
	        }
	    }
		 

		//check if years of experience > age for applicant
		@Override
		public void validate(int experience, int difference) {
			Person person = (Person)experience;
			if(experience >= difference )
				errors.rejectValue("yearsOfExperience", "my.custom.err2");		
		}

		@Override
		public void validate(Object target, Errors errors) {
			// TODO Auto-generated method stub
			
		}
		

}
