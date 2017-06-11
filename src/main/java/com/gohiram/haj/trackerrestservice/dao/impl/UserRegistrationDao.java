package com.gohiram.haj.trackerrestservice.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gohiram.haj.trackerrestservice.dao.IUserRegistrationDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;

@Repository
public class UserRegistrationDao implements IUserRegistrationDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Value("${sql.insert.user.details}")
	private String insertUserSql;
	
	@Value("${sql.select.user.details}")
	private String selectUserById;
	
	
	@Override
	public boolean isUserRegistered(String id) throws TrackerException
	{
		return true;
	}

	@Override
	public boolean registerUser(UserInformation userInformation) throws TrackerException{
		
		try
		{
			int updatedRows= jdbcTemplate.update(insertUserSql, stmt->{
				stmt.setString(1, userInformation.getId());
				stmt.setString(2, userInformation.getFirstName());
				stmt.setString(3, userInformation.getLastName());
				stmt.setString(4, userInformation.getEmail());
				stmt.setLong(5, userInformation.getMobileNumber());
			});
			
			return updatedRows>0;
		}
		catch(Exception e)
		{
			throw new TrackerException(e);
		}
		
		
	}

	@Override
	public UserInformation readUserInformation(String id) throws TrackerException {
		return jdbcTemplate.queryForObject(selectUserById, new Object[]{id}, (rs,rowNum)->{
			UserInformation userInformation=new UserInformation();
			userInformation.setId(rs.getString(1));
			userInformation.setFirstName(rs.getString(2));
			userInformation.setLastName(rs.getString(3));
			userInformation.setEmail(rs.getString(4));
			userInformation.setMobileNumber(rs.getLong(5));
			return userInformation;
		});
	}
	
	
	
}
