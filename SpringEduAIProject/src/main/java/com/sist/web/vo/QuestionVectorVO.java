package com.sist.web.vo;

import lombok.Data;
/*
 * id BIGSERIAL PRIMARY KEY,
    question_no BIGINT NOT NULL,
    course_no BIGINT,
    title VARCHAR(4000) NOT NULL,
    description TEXT,
    theme INTEGER,
    type INTEGER,
    difficulty INTEGER NOT NULL,
    answer VARCHAR(2000) NOT NULL,
    option1 VARCHAR(2000),
    option2 VARCHAR(2000),
    option3 VARCHAR(2000),
    option4 VARCHAR(2000),
    content TEXT,
    embedding VECTOR(768),
    
    NO          NOT NULL NUMBER         
	TITLE                VARCHAR2(4000) 
	IMAGE                VARCHAR2(2000) 
	ANSWER               VARCHAR2(2000) 
	SCORE       NOT NULL NUMBER         
	DESCRIPTION          CLOB           
	THEME                NUMBER         
	TYPE                 NUMBER         
	DIFFICULTY           NUMBER(1)   
 */
@Data
public class QuestionVectorVO {
	private Long id, question_no;
	private int theme, type, difficulty;
	private String title, description, answer, option1, option2, option3, option4, content, embedding;
}
