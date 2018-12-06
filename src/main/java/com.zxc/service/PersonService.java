package com.zxc.service;

import com.zxc.entity.Person;

/**
 * @program: macblog
 * @description:
 * @author: Xiangchun Zeng
 * @create: 2018-09-15 15:45
 **/
public interface PersonService {
	Long savePerson();

	Person getPersonById(Long id);
}
