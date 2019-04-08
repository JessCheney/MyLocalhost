package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.User;

public interface UserDao {

	   String GetName(String strName);
	
	    int deleteByPrimaryKey(Integer userId);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer userId);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
	    //这个方式我自己加的
	    List<User> selectAllUser();
	    
	    List<User> findAllUser();

	  
}
