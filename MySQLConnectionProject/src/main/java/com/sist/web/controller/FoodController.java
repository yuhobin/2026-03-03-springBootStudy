package com.sist.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sist.web.service.*;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class FoodController {
	private final FoodService fService;
	// /food/list/1
	@GetMapping("/food/list/{page}")
	public ResponseEntity<Map> foodListData(@PathVariable("page") int page) {
		Map map=new HashMap();
		try {
			int start=(page*12)-12;
			List<FoodVO> list=fService.foodListData(page);
			int totalpage=fService.foodTotalPage();
			final int BLOCK=10;
			int startPage=((page-1)/BLOCK*BLOCK)+1;
			int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
			if(endPage>totalpage)
				endPage=totalpage;
			map.put("list", list);
			map.put("curpage", page);
			map.put("startPage", startPage);
			map.put("endPage", endPage);
			map.put("totalpage", totalpage);
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(map);
	}
	@GetMapping("/food/detail_react/{no}")
	public ResponseEntity<FoodVO> foodDetailData(@PathVariable("no") int no) {
		FoodVO vo=new FoodVO();
		try {
			vo=fService.foodDetailData(no);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		return ResponseEntity.ok(vo);
	}
}
