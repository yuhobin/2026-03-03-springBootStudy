package com.sist.web.vo;
/*
 *  NO          NOT NULL NUMBER         
	TITLE                VARCHAR2(4000) 
	IMAGE                VARCHAR2(2000) 
	ANSWER               VARCHAR2(2000) 
	SCORE       NOT NULL NUMBER         
	DESCRIPTION          CLOB           
	THEME                NUMBER         
	TYPE                 NUMBER         
	DIFFICULTY           NUMBER(1)      
 */

import lombok.Data;

@Data
public class QuestionVO {
	private int no, score, theme, type, difficulty;
	private String title, image, answer, description;
	private ExamOptionVO evo=new ExamOptionVO();
}
