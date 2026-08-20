package com.sist.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sist.web.controller.*;
import com.sist.web.entity.Emp;
import com.sist.web.entity.QDept;
import com.sist.web.entity.QEmp;

import lombok.RequiredArgsConstructor;
/*
 * 	1. window < showview < other < gradle < Gradle Tasks
 * 	2. ./geadlew clean compileJava
 * 		터미널에서 실행
 * 	3. project폴더에서 gradle > refresh
 * 	4. project < clean 설정
 * 
 * 	Q-class : 데이터베이스를 검색할때 사용하는 Java 코드 생성
 * 		=> QueryDSL => 자동으로 생성 
 * 		Dept => QDept
 */
@Repository
@RequiredArgsConstructor
public class EmpQueryRepository {
	private final JPAQueryFactory queryFactory;
	/*
	 * @Query("SELECT e FROM Emp e") 
	// Emp는 테이블명이 아닌 Entity 객체명
	// 반드시 별칭을 사용해야 한다
	public List<Emp> empListData();
	
	// Emp findByEmpno(int empno);
	@Query("SELECT e FROM Emp e WHERE e.empno=:empno")
	public Emp empDetailData(@Param("empno") int empno);
	
	// List<Emp> findByEname(String ename);
	@Query("SELECT e FROM Emp e WHERE e.ename=:ename")
	public List<Emp> empEnameFind(@Param("ename") String ename);
	
	//List<Emp> findByEnameStartsWith(String ename);
	@Query("SELECT e FROM Emp e WHERE e.ename LIKE CONCAT(:ename, '%')")
	public List<Emp> empEnameStartsLike(@Param("ename") String ename);
	// A%
	
	//List<Emp> findByEnameEndsWith(String ename);
	@Query("SELECT e FROM Emp e WHERE e.ename LIKE CONCAT('%', :ename)")
	public List<Emp> empEnameEndsLike(@Param("ename") String ename);
	// %A
	 
	@Query("SELECT e FROM Emp e WHERE e.ename LIKE CONCAT('%', :ename, '%')")
	public List<Emp> empLikeData(@Param("ename") String ename );
	// %A%
	
	@Query("SELECT e FROM Emp e WHERE e.sal>=:sal")
	List<Emp> findBySalGreaterThanEqual(@Param("sal") int sal);
	
	@Query("SELECT e FROM Emp e WHERE e.sal<=:sal")
	List<Emp> findBySalLessThanEqual(@Param("sal") int sal);
	
	@Query("SELECT e FROM Emp e WHERE e.sal BETWEEN :min AND :max")
	List<Emp> findBySalBetween(@Param("min") int min, @Param("max") int max);
	
	// List<Emp> findByJobAndSalGreaterThan(String job, int sal);
	@Query("SELECT e FROM Emp e "
			+"WHERE e.job=:job AND e.sal>:sal")
	List<Emp> findByJobAndSalGreaterThan(@Param("job") String job, @Param("sal") int sal);
	
	// List<Emp> findByJobOrEname(String job, String ename);
	@Query("SELECT e FROM Emp e WHERE e.job=:job OR e.ename=:ename")
	List<Emp> findByJobOrEname(@Param("job") String job, @Param("ename") String ename);
	
	//List<Emp> findByDeptDname(String dname);
	@Query("SELECT e FROM Emp e "
			+"JOIN e.dept d "
			+"WHERE d.dname=:dname")
	List<Emp> findByDeptDname(@Param("dname")String dname);
	
	//List<Emp> findByDeptDnameContains(String dname);
	@Query("SELECT e FROM Emp e "
			+"JOIN e.dept d "
			+"WHERE d.dname LIKE CONCAT('%', :dname, '%')")
	List<Emp> findByDeptDnameContains(@Param("dname") String dname);
	
	// List<Emp> findTop3ByOrderBySalDesc();
	//@Query("SELECT e FROM Emp e "
	//		+"ORDER BY e.sal DESC")
	
	//List<Emp> findDistinctByJob();
	@Query("SELECT DISTINCT e FROM Emp e "
			+"WHERE e.job=:job")
	List<Emp> findDistinctByJob(@Param("job") String job);
	 */
	
	/*
	 * 	@Query("SELECT e FROM Emp e "
			+"WHERE e.comm IS NULL")
	List<Emp> findByCommIsNull();
	
	//List<Emp> findByJobNot(String job);
	@Query("SELECT e FROM Emp e "
			+"WHERE e.job!=:job")
	List<Emp> findByJobNot(@Param("job") String job);
	
	// List<Emp> findByDeptDeptnoIn(List<Integer> deptnos);
	@Query("SELECT e FROM Emp e "
			+"JOIN e.dept d "
			+"WHERE d.deptno IN :deptnos")
	List<Emp> findByDeptDeptnoIn(@Param("deptnos") List<Integer> deptnos); 
	 */
	// @Query("SELECT e FROM Emp e") : JPQL
	// Emp findByEmpno(int empno) : 메소드 규칙
	// QueryDSL
	public Emp findByEmpno(int empno) {
		QEmp emp=QEmp.emp; // Q-class
		return (Emp) queryFactory.from(emp)
								.where(emp.empno.eq(empno))
								.fetchOne();
	}
	
	// List<Emp> findByEname(String ename);
	// @Query("SELECT e FROM Emp e WHERE e.ename=:ename")
	/*
	 * 	from(테이블 : Q-class 객체 
	 */
	public List<Emp> findByEname(String ename) {
		QEmp emp=QEmp.emp; // Q-class
		return (List<Emp>)queryFactory.from(emp)
									.where(emp.ename.eq(ename))
									.fetch();
	}
	//List<Emp> findByEnameStartsWith(String ename);
	//@Query("SELECT e FROM Emp e WHERE e.ename LIKE CONCAT(:ename, '%')")
	public List<Emp> findByEnameStartsWith(String ename) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
							.where(emp.ename.startsWith(ename))
							.fetch();
	}
	public List<Emp> findByEnameEndsWith(String ename) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
							.where(emp.ename.endsWith(ename))
							.fetch();
	}
	public List<Emp> findByEnameContains(String ename) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
							.where(emp.ename.contains(ename))
							.fetch();
	}
	
	// 비교연산
	/*
	 * 	= : eq() emp.sal.eq(3000) sal=3000
	 * 	----------------------------------------
	 * 	< : lt() emp.sal.lt(3000) sal<3000
	 * 				LessThan
	 * 	> : gt() emp.sal.gt(3000) sal>3000
	 * 				GreaterThan
	 * 	<= : loe() emp.sal.loe(3000) sal<=3000
	 * 				LessThanEqual
	 * 	>= : goe() emp.sal.goe(3000) sal>=3000
	 * 				GreaterThanEqual
	 * 	----------------------------------------
	 * 	!= : ne() emp.sal.ne(3000) sal<>3000
	 * 
	 * 	메소드가 연산자 명칭을 그대로 사용
	 * 	between() in() 
	 */
	// List<Emp> findByJobAndSalGreaterThan(String job, int sal);
	//	@Query("SELECT e FROM Emp e "
	public List<Emp> findBySalGreaterThanEqual(int sal) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.where(emp.sal.goe(sal))
				.fetch();
		// sal>=? sal<=? sal<? sal>? sal<>? sal=?
		// emp.sal.goe(sal)
		// emp.sal.loe(sal)
		// emp.sal.lt(sal)
		// emp.sal.gt(sal)
		// emp.sal.ne(sal)
	}
	
	//@Query("SELECT e FROM Emp e WHERE e.sal BETWEEN :min AND :max")
	// List<Emp> findBySalBetween(@Param("min") int min, @Param("max") int max);
	public List<Emp> findBySalBetween(int min, int max) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.where(emp.sal.between(min, max))
				.fetch();
	}
	// List<Emp> findByJobAndSalGreaterThan(String job, int sal);
	//@Query("SELECT e FROM Emp e "
	//		+"WHERE e.job=:job AND e.sal>:sal")
	public List<Emp> findByJobAndSalGreaterThan(String job, int sal) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.where(emp.job.eq(job), emp.sal.gt(sal))
				.fetch();
		/*
		 * return (List<Emp>)queryFactory.from(emp)
				.where(emp.job.eq(job).and(emp.sal.gt(sal)))
				.fetch();
		 */
	}
	// List<Emp> findByCommIsNull();
	public List<Emp> findByCommIsNull(){
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.where(emp.comm.isNull())
				.fetch();
	}
	//
	public List<Emp> findByJobNot(String job){
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.where(emp.job.ne(job))	// !=(ne)
				.fetch();
	}
	// List<Emp> findByDeptDeptnoIn(List<Integer> deptnos);
	public List<Emp> findByDeptDeptnoIn(List<Integer> deptnos) {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.where(emp.dept.deptno.in(deptnos))	// !=(ne)
				.fetch();
	}
	
	//List<Emp> findByDeptDname(String dname);
	//	@Query("SELECT e FROM Emp e "
	//			+"JOIN e.dept d "
	//			+"WHERE d.dname=:dname")
	//	List<Emp> findByDeptDname(@Param("dname")String dname);
	
	// List<Emp> findTop3ByOrderBySalDesc();
		//@Query("SELECT e FROM Emp e "
		//		+"ORDER BY e.sal DESC")
	
	// 정렬
	public List<Emp> findByOrderBySal() {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.orderBy(emp.sal.desc())
				.fetch();
	}
	// Top-N
	/*
	 *  String jpql="SELECT DISTINCT e.job FROM Emp e";
		// List<Emp> list=em.createQuery(jpql, String.class).getResultList();
	 */
	public List<Emp> findByTop3Sal() {
		QEmp emp=QEmp.emp;
		return (List<Emp>)queryFactory.from(emp)
				.orderBy(emp.sal.desc())
				.limit(3)
				.fetch();
	}
	
	// Distinct
	public List<Integer> findByDistinctSal() {
		QEmp emp=QEmp.emp;
		return (List<Integer>)queryFactory.select(emp.sal)
				.distinct()
				.from(emp)
				.fetch();
	}
	/*
	 * //List<Emp> findByDeptDname(String dname);
	@Query("SELECT e FROM Emp e "
			+"JOIN e.dept d "
			+"WHERE d.dname=:dname")
	List<Emp> findByDeptDname(@Param("dname")String dname);
	 */
	public List<Emp> findByDeptDname(String dname) {
		QEmp emp=QEmp.emp;
		QDept dept=QDept.dept;
		return (List<Emp>) queryFactory.from(emp)
							.join(emp.dept, dept)
							.where(dept.dname.eq(dname))
							.fetch();
	}
	public List<Emp> findByDeptDnameLike(String dname) {
		QEmp emp=QEmp.emp;
		QDept dept=QDept.dept;
		return (List<Emp>) queryFactory.from(emp)
							.join(emp.dept, dept)
							.where(dept.dname.contains(dname))
							.fetch();
	}
}
