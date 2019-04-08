package com.example.demo.controller;

import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
	
	@Autowired
	private UserService service;
	
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();//1223
        user.setName("test");
        user.setAge(100);
        return user;
    }
    
    @RequestMapping("/String")
    public String Testing () { 
    	return service.GetName("Jsee"); 
    }
     
    
    @RequestMapping("/FindAllUser")
    public List<User>  FindAllUser () { 
    	return service.findAllUser(); 
    }
}