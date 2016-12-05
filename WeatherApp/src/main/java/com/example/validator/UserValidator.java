package com.example.validator;

import com.example.model.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.annotation.Resource;

/**
 * Created by isirbu on 11/28/2016.
 */

@Component
public class UserValidator implements Validator{

    @Resource
    private UserRepository userRepository;

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UserEntity.class);
    }

    @Override
    public void validate(Object o, Errors errors) {

        UserEntity user = (UserEntity) o;
        System.out.println(user.toString());

        if(userRepository.findByName(user.getName()) != null){
            System.out.println("\n da \n");
            errors.rejectValue("name","username existent");
        }

        if(!user.getPassword().equals(user.getConfirmPassword())){
            System.out.println("\n da \n");
            errors.rejectValue("name","parola gresita");
        }

        System.out.println(errors.getAllErrors().toString());
    }
}
