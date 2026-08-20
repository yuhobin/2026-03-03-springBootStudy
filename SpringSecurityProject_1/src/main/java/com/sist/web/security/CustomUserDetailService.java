package com.sist.web.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service	// MyBatis 연동
/*
 * 	ID: <input type=text name="username">
 * 	PWD: <input type=password name="password">
 * 
 * 	로그인 화면 
 * 	  | POST => username=admin / password=1234
 * 			/login => 
 * 		Spring Security
 * 			|
 * 		Authentication : 인증
 * 			| - Success : 성공 => / (home.html)
 * 							LoginSuccessHandler
 * 			| - Fail 	: /login?error
 * 							LoginFailHandler
 * 							--------- 아이디나 비밀번호가 틀립니다
 * 			=> formLogin => 로그인 처리 후 인증 => 해당 접속자의 정보를 읽는다
 * 							=> id, password, enable, roles
 * 							=> Principal
 * 				logout => session 해제
 * 
 * 			=> Controller
 * 				@GetMapping("/chat")
 * 				public String chat(HttpSession session, Principal p) {
 * 					UserVO vo=dao.infoData(p.username)
 * 					session.setAttribute("vo", vo)
 * 				}
 */
public class CustomUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		if(username.equals("admin")) {
			return User.builder()
					.username("admin")
					.password("{noop}1234") // {noop} 암호화 없이 처리
					.roles("ADMIN")
					.build();
		}
		return User.builder()
				.username("user")
				.password("{noop}1234")
				.roles("USER")
				.build();
	}

}
