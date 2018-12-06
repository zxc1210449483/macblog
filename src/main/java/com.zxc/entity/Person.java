package com.zxc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: macblog
 * @description: 实体Person
 * @author: Xiangchun Zeng
 * @create: 2018-09-15 15:28
 **/
@Data
@Entity
@Table(name = "Person")
public class Person {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "created")
	private Long created = System.currentTimeMillis();

	@Column(name = "username")
	private String username;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "remark")
	private String remark;
}
