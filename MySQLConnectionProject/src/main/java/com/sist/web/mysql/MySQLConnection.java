package com.sist.web.mysql;
import java.sql.*;
/*
 * 			자바 / 파이썬
 * 				|
 * 		-----------------------------
 * 		|							|
 * 	Oracle/MySQl				HTML / CSS => 수정
 * 	PostgresSQL						|
 * 		|						JavaScript
 * 		SQL							|
 * 		(DDL, DML, DCL, TCL)	Vanilla JS
 * 	=> JOIN / SubQuery				|
 * 		차이점					-------------
 * 	=> View / Sequence			|			|
 * 	=> Index : 가장 많이 질문		JSP			Vue3
 * 								|			|
 * 								MVC			Pinia
 * 								|			|
 * 								-------------
 * 									  |
 * 									SpringFramework(전자정부)
 * 									  |
 * 									Spring-Boot
 * 									  |
 * 								---------------------------------
 * 								|			|					|
 * 							  CORE		   JWT(Security)		Rest API
 * 							DI/AOP/ORM (필수)						=> 선택
 * 								|
 * 							=> SI / SM / 솔루션 / 프레임워크
 * 												=> 위탁개발
 * 								|
 * 							WebSocket
 * 								|
 * 							-------------------------
 * 							|			|			|
 * 						SockJS			Stomp	 실시간통신
 * 													|
 * 												React + TypeScript
 * 													|
 * 												---------------------
 * 												|					|
 * 												Redux				TanStack-Query
 * 												|					|
 * 												---------------------
 * 															|
 * 														NodeJS
 * 															|
 * 														SpringAI
 * 															|
 * 														RAG / Embedding
 * 															|
 * 														AI 서비스
 * 		=> DataBase (Oracle / MySQL)
 * 		=> 언어 (JAVA / PYTHON)
 * 		=> Front (Vue / React)
 * 		=> Spring / Django(FastAPI)
 * 		=> Docker
 * 		=> AWS 
 * 
 * 	=> 자바
 * 		변수 / 데이터형 / 연산자 / 제어문(반복문, 조건문) / 배열 / 메소드
 * 		클래스 / 객체 / 생성자 / 상속 / 다형성 / 인터페이스
 * 		예외처리 / 컬렉션 / 제네릭 / 람다 / 파일 (IO) / Wrapper
 * 		=> 객체지향 / Collection / Generick / 예외처리 / 람다  자주 등장
 * 
 * 	=>	Oracle + SQL	
 * 		DML : SELECT / INSERT / UPDATE / DELETE 
 * 		DDL : CREATE / DROP / ALTER / TRUNCATE 
 * 		TCL : COMMIT / ROLLBACK
 * 		=> VIEW, INDEX, JOIN, SUBQUERY
 * 	
 * 	=> JavaScript
 * 		Vanilla JS 
 * 		Vue3 / Pinia (*****)
 * 		React / Redux / TanStack-Query (*****)
 * 	
 * 	=> JSP / MVC
 * 
 * 	=> Spring Framework
 * 
 * 	=> Spring Boot
 * 
 * 	=> Spring AI (*****)
 * 
 * 	=> Spring Security / JWT (*****)
 * 
 * 	=> AWS / Docker / Docker-compose / Jenkins
 */
public class MySQLConnection {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
		String user="root";
		String password="happy";
		String driver="com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, user, password);
			String sql="SELECT no, name, sex FROM member";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
