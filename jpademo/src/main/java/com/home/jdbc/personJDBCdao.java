package com.home.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.home.entity.person;

@Repository
public class personJDBCdao {

	@Autowired
	JdbcTemplate jdbctemplate;

	public List<person> findAll() {
		return jdbctemplate.query("Select * from person", new BeanPropertyRowMapper<person>(person.class));
	}

	public person findbyId(int id) {
		return jdbctemplate.queryForObject("Select * from person where id =?", new Object[] { id },
				new BeanPropertyRowMapper<person>(person.class));
	}

	public int deletebyId(int id) {
		return jdbctemplate.update("delete from person where id =?", new Object[] { id });
	}

	public int insertIntoPerson(person person) {
		return jdbctemplate.update("insert into person (id,name,location,birth_date) values (?,?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(), person.getBirthDate() });
	}

	public int updatePerson(person person) {
		return jdbctemplate.update("update person set name = ? , location = ? , birth_date = ? where id = ?",
				new Object[] { person.getName(), person.getLocation(), person.getBirthDate(), person.getId() });
	}

	public person getPersonData(int id) {

		return jdbctemplate.queryForObject("select id,name,birth_date from person where id = ?", new Object[] { id },
				new RowMapper<person>() {

					@Override
					public person mapRow(ResultSet rs, int rowNum) throws SQLException {
						person person = new person();
						person.setId(rs.getInt(1));
						person.setName(rs.getString(2));
						person.setBirthDate(rs.getDate(3));

						return person;
					}

				});

	}

}
