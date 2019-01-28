package com.spring.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.dao.PersonDao;
import com.spring.model.Person;

@Repository
@Qualifier("personDao")
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addPerson(Person person) {
		int i = jdbcTemplate.update("insert into venkats.person (first_name ,last_name,age) VALUES (?, ?, ?) ",
				person.getFirst_name(), person.getLast_name(), person.getAge());
		if (i > 0) {
			System.out.println("Person Added!!");
		}
	}

	@Override
	public void editPerson(Person person, int personId) {

	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person find(int personId) {
		 Person person = (Person) jdbcTemplate.queryForObject("SELECT * FROM venkats.person where person_id = ? ", new Object[] { personId }, new BeanPropertyRowMapper(Person.class));
		return person;
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return  (List<Person>) jdbcTemplate.query("SELECT * FROM venkats.person ",  new BeanPropertyRowMapper(Person.class));
	}

}
