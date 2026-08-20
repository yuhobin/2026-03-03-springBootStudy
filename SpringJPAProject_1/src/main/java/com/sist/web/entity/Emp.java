package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
/*
 *   EMPNO                                     NOT NULL NUMBER(4)
	 ENAME                                              VARCHAR2(10)
	 JOB                                                VARCHAR2(9)
	 MGR                                                NUMBER(4)
	 HIREDATE                                           DATE
	 SAL                                                NUMBER(7,2)
	 COMM                                               NUMBER(7,2)
	 DEPTNO                                             NUMBER(2)
 */
/*
 * 	1. DQL => SELECT => 검색 : 메소드 규칙
 * 			  findByName(String name) => eq
 * 			  WHERE name=?
 * 	2. DML => INSERT / UPDATE / DELETE
 * 				|		 |		   |
 * 				----------		-------
 * 					| save		 | delete
 */
@Entity
@Table(name="EMP")
@Getter
@Setter
public class Emp {
	@Id	// primary key 설정
	private int empno;
	private String ename;
	private String job;
	private Integer mgr; // column안에 null 값이 있는 경우
	private Date hiredate;
	private int sal;
	private Integer comm;
	// deptno는 조인을 걸기때문에 작성하지 않는다 => 작성하면 조인 시 중복된다
	
	@ManyToOne // 다 대 1
	@JoinColumn(name="deptno")
	private Dept dept;
}
