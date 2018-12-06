package com.zxc.service.impl;

import com.zxc.entity.Person;
import com.zxc.repository.PersonRepository;
import com.zxc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: macblog
 * @description:
 * @author: Xiangchun Zeng
 * @create: 2018-09-15 15:46
 **/
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Long savePerson() {
		Person person = new Person();
		person.setUsername("macblog");
		person.setPhone("17789868109");
		person.setAddress("haikou");
		person.setRemark("this is zxc");
		return personRepository.save(person);
	}

	@Override
	public Person getPersonById(Long id) {
		return personRepository.get(id);
	}
}
