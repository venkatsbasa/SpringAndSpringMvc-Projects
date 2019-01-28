package com.spring.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PersonDao;
import com.spring.model.Person;
import com.spring.services.PersonServices;

@Service("personServices")
public class PersonServiceImpl implements PersonServices {
	@Autowired
	private PersonDao personDao;

	/*
	 * public void setPersonDao(PersonDao personDao) { this.personDao = personDao; }
	 * public PersonDao getPersonDao() { return personDao; }
	 */
	@Override
	public void addPerson(Person person) {
		personDao.addPerson(person);

	}

	@Override
	public void editPerson(Person person, int personId) {
		personDao.editPerson(person, personId);

	}

	@Override
	public void deletePerson(int personId) {
		personDao.deletePerson(personId);

	}

	@Override
	public Person find(int personId) {
		return personDao.find(personId);
	}

	@Override
	public List<Person> findAll() {
		return personDao.findAll();
	}

}
