package com.zxc.service.impl;

import com.zxc.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @program: macblog
 * @description:
 * @author: Xiangchun Zeng
 * @create: 2018-09-15 14:50
 **/
@Service
public class TestServiceImpl implements TestService {

	@Override
	public String test() {
		return "test";
	}
}
