package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 *   DEPTNO                                    NOT NULL NUMBER(2)
	 DNAME                                     NOT NULL VARCHAR2(30)
	 LOC                                       NOT NULL VARCHAR2(50)
 */
@Entity
@Table(name="DEPT")
@Getter
@Setter
public class Dept {
	@Id
	private int deptno;
	private String dname;
	private String loc;
}
