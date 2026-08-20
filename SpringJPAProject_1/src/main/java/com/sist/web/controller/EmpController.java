package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.repository.*;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EmpController {
	private final EmpMethodRepository eDao;
	private final EmpJpqlRepository eDao2;
	private final EntityManager em;
	private final EmpQueryRepository eDao3;
	
	@GetMapping("/emp")
	public void emp_method() {
		//Emp emp=eDao.findByEmpno(7788);
		// List<Emp> list=eDao.findByEnameStartsWith("A");
		// List<Emp> list=eDao.findByEnameEndsWith("N");
		// List<Emp> list=eDao.findByEnameContains("K");
		// List<Emp> list=eDao.findByOrderBySalDesc();
		// List<Emp> list=eDao.findByJobAndSalGreaterThan("SALESMAN", 1000);
		// List<Emp> list=eDao.findBySalBetween(1000, 2000);
		// List<Emp> list=eDao.findByDeptDnameContains("인");
		// List<Emp> list=eDao.findTop3ByOrderBySalDesc();
		// List<Emp> list=eDao2.empListData();
		// List<Emp> list=eDao2.empEnameFind("SCOTT");
		// List<Emp> list=eDao2.empEnameStartsLike("B");
		// List<Emp> list=eDao2.empEnameEndsLike("N");
		// List<Emp> list=eDao2.empLikeData("A");
		//List<Emp> list=eDao2.findBySalGreaterThanEqual(1000);
		// List<Emp> list=eDao2.findBySalBetween(1000, 2000);
		// List<Emp> list=eDao2.findByJobAndSalGreaterThan("SALESMAN", 1000);
		// List<Emp> list=eDao2.findByJobOrEname("SALESMAN", "ADAMS");
		// List<Emp> list=eDao2.findByDeptDname("개발팀");
		//List<Emp> list=eDao2.findByDeptDnameContains("사");
		// => Service 안에서 코딩
		// String jpql="SELECT e FROM Emp e "
			//		+"ORDER BY e.sal DESC";
		// List<Emp> list=em.createQuery(jpql, Emp.class).setMaxResults(5).getResultList();
		// List<Emp> list=eDao2.findDistinctByJob("MANAGER");
		// String jpql="SELECT DISTINCT e.job FROM Emp e";
		// List<Emp> list=em.createQuery(jpql, String.class).getResultList();
		//List<Emp> list=eDao2.findByJobNot("MANAGER");
		/*
		 * List<Integer> deptnos=List.of(10, 20, 30); List<Emp>
		 * list=eDao2.findByDeptDeptnoIn(deptnos); for(Emp emp:list) {
		 * System.out.println(emp.getEmpno()+" "+emp.getEname()+" "+emp.getJob()+" "+emp
		 * .getHiredate()+" "+emp.getSal()); //System.out.println(job); }
		 */
		//Emp e=eDao3.findByEmpno(7788);
		//List<Emp> list = eDao3.findByEnameStartsWith("A");
		//List<Emp> list = eDao3.findByEnameEndsWith("N");
		// List<Emp> list = eDao3.findByEnameContains("N");
		//List<Emp> list = eDao3.findBySalGreaterThanEqual(1000);
		// List<Emp> list = eDao3.findBySalBetween(2000,3000);
		List<Emp> list = eDao3.findByDeptDnameLike("팀");
		
		for (Emp e : list) {
		    System.out.println(e.getEmpno() + " " +
		                        e.getEname() + " " +
		                        e.getJob() + " " +
		                        e.getHiredate() + " " +
		                        e.getSal());  
		}
		/*
		 * List<Integer> list2 = eDao3.findByDistinctSal();
		 * 
		 * 
		 * for (Integer sal : list2) { System.out.println("급여: " + sal); }
		 */
		
	}
}
