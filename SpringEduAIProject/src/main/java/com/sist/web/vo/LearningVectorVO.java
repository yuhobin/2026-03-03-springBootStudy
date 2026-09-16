package com.sist.web.vo;

import java.time.LocalDateTime;

import lombok.Data;

/*
 *  id BIGSERIAL PRIMARY KEY,
    member_id BIGINT NOT NULL,
    exam_count INTEGER DEFAULT 0,
    average_score NUMERIC(5,2) DEFAULT 0,
    correct_count INTEGER DEFAULT 0,
    wrong_count INTEGER DEFAULT 0,
    accuracy_rate NUMERIC(5,2) DEFAULT 0,
    weak_theme VARCHAR(2000),
    learning_summary TEXT,
    content TEXT,
    embedding VECTOR(768)
 */
@Data
public class LearningVectorVO {
	private Long id, member_id;
	private int  exam_count, average_score, correct_count, wrong_count, accuracy_rate;
	private String weak_theme, learning_summary, content, embedding;
	private LocalDateTime created_at, updated_at;
}
