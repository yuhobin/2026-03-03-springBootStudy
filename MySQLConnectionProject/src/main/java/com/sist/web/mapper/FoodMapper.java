package com.sist.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.sist.web.vo.*;
@Mapper
@Repository
public interface FoodMapper {
	@Select("SELECT no, name, poster, address "
			+"FROM food "
			+"ORDER BY no ASC "
			+"LIMIT #{start}, 12")
	public List<FoodVO> foodListData(int start);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM food")
	public int foodTotalPage();
	
	@Select("""
			SELECT * FROM food
			WHERE no=#{no}
			"""
			)
	public FoodVO foodDetailData(int no);
}
