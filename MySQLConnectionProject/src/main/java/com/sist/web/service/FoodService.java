package com.sist.web.service;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import java.util.*;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;

import com.sist.web.mapper.*;

@Service
@RequiredArgsConstructor
public class FoodService {
	private final FoodMapper mapper;
	
	public List<FoodVO> foodListData(int start) {
		return mapper.foodListData(start);
	}
	
	
	public int foodTotalPage() {
		return mapper.foodTotalPage();
	}
	
	public FoodVO foodDetailData(int no) {
		return mapper.foodDetailData(no);
	}
}
