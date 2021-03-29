package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class InviteSqlDAO implements InviteDAO {
	
	private JdbcTemplate jdbcTemplate;
	public InviteSqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean createInvite(long userId, String inviteName, String restaurantName) {
		
		int inviteCreated = 0;
		
		String insertSql = "INSERT INTO invite (user_id,invite_name,invite_date) \r\n" + 
				"VALUES (?, ?, CURRENT_DATE);\r\n" + 
				"INSERT INTO invite_restaurant (restaurant_name)\r\n" + 
				"VALUES (?);";
		inviteCreated = jdbcTemplate.update(insertSql, userId, inviteName, restaurantName);
		
		if(inviteCreated > 0) {
			return true;
		} else {
			return false;
		}
	}

}
