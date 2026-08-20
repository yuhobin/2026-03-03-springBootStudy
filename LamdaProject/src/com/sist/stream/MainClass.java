package com.sist.stream;
import java.util.*;
import java.util.stream.Collector;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDAO dao=new EmpDAO();
		List<EmpVO> list=dao.empAllData();
		
		// 전체 목록 출력 : forEach
		list.stream()
			.forEach(vo -> System.out.println(
					vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()
			));
		System.out.println("============= filter =============");
		list.stream()
			.filter(vo -> vo.getSal()>=3000)
			.forEach(vo -> System.out.println(
					vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()
			));
		System.out.println("============= filter =============");
		list.stream()
			.filter(vo -> vo.getEmpno()%2==0)
							// if(vo.getEmpno()%2==0)
							// 권한 
			.forEach(vo -> System.out.println(
					vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()
			));
		System.out.println("============= sort ============");
		list.stream()
			.sorted(Comparator.comparing(EmpVO::getSal).reversed())
			// order by sal asc
			// order by sal desc => .reversed()
			.forEach(vo -> System.out.println(
					vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()
			));
		// 중복 제거 
		System.out.println("============= 중복제거(distinct()) ============");
		List<String> kList=List.of("java","oracle","html","spring","css","javascript","css","vuejs","html");
		kList.stream()
			.distinct()
			.forEach(System.out::println);
		
		// 통계
		System.out.println("============= reduce ============");
		int total=list.stream()
					.map(EmpVO::getSal)
					.reduce(0, Integer::sum);
		System.out.println(total);
		
		System.out.println("============= average ============");
		double avg=list.stream()
				.mapToInt(EmpVO::getSal)
				.average()
				.orElse(0);
		System.out.println(avg);
		/*
		 * 	distinct : 중복 제거
		 * 	reduce : 총합 => sum
		 * 	average : 평균 => avg
		 * 	sorted : 정렬 => order by
		 * 	filter : 조건 => where
		 * 	map : 새로운 데이터 생성 
		 * 	forEach : 반복문
		 * 	toList() : 데이터를 List로 묶어주는 경우
		 */
	}

}
