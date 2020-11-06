package com.cdac.valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.cdac.dto.User;

@Service
public class Uservalidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "","unmKey", "Admin name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "", "passKey","password required");
		
		User user = (User)target;
		if(user.getMobNo()!=null) {
			if(user.getMobNo().length()<11) { 
				errors.rejectValue("mobNo", "passKey", "mobl should be les than 11 chars");
			}
		}
	}

}
