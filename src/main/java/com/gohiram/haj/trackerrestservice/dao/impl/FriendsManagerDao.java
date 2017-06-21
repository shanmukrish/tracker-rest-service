package com.gohiram.haj.trackerrestservice.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gohiram.haj.trackerrestservice.dao.IFriendsManagerDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.model.UserInformation;

@Repository
public class FriendsManagerDao implements IFriendsManagerDao {

	@Value("${sql.insert.friend.id}")
	private String insertFriendById;

	@Value("${sql.select.friends.details.id}")
	private String selectFriendsById;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean acceptFriendRequest(String id, String friendId) throws TrackerException {
		return jdbcTemplate.update(insertFriendById, new Object[] { id, friendId }) > 0;
	}

	@Override
	public boolean sendRequest(String id, String friendId) throws TrackerException {

		return false;
	}

	@Override
	public List<UserInformation> findAllFriends(String id) throws TrackerException {

		return jdbcTemplate.query(selectFriendsById, new Object[] { id }, (rs, rowNum) -> {
			UserInformation userInformation = new UserInformation();
			userInformation.setId(rs.getString("ID"));
			userInformation.setFirstName(rs.getString("FIRST_NAME"));
			userInformation.setLastName(rs.getString("LAST_NAME"));
			userInformation.setMobileNumber(rs.getLong("MOBILE_NUMBER"));
			userInformation.setEmail(rs.getString("EMAIL_ID"));
			return userInformation;
		});

	}
	


}
