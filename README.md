# 🚀 Java Full-Stack Spring Development
> **Java 풀스택 개발자 양성 과정 (Step 05)** >  Spring-Boot 웹 개발의 전 과정을 학습하고 기록하는 저장소

## 📅 학습 타임라인
| 날짜 | 주요 주제 | 요약 | 상세 내용 |
|:---:|:---|:---|:---:|
| 26.08.03 | gradle build 실습 | gradle build로 jar파일 묶고 포장 | [보러가기](./doc/2026-08-03.md ) |
| 26.08.04 | JPA, ThymeLeaf를 사용하여 게시판 구현 | JPA, ThymeLeaf를 이용해 쿼리문 없이 DB를 연결해 게시판 구현 | [보러가기](./doc/2026-08-04.md ) |
| 26.08.05 | vuex 학습 | vuex - 중앙 집중식 상태 관리 (vs code에서 작성) | [보러가기](./doc/2026-08-05.md ) |
| 26.08.06 | Docker, Docker Compose | Docker로 이미지 만들어서 Docker Compose에 올리고 서버 구동| [보러가기](./doc/2026-08-06.md ) |
| 26.08.07 | gitAction을 사용한 CI/CD | gitAction을 이용한 CI/CD 진행 | [보러가기](./doc/2026-08-07.md ) |
| 26.08.10 | 파일 업로드 | 게시판의 게시글에 파일 업로드 구현 | [보러가기](./doc/2026-08-10.md ) |
| 26.08.11 | pinia 학습 | vue의 최신 기술 pinia 학습 | [보러가기](./doc/2026-08-11.md ) |
| 26.08.12 | JPA - JPQL, QueryDSL | JPA 쿼리 방식 비교 - JPQL, QueryDSL | [보러가기](./doc/2026-08-12.md ) |
| 26.08.13 |  Pinia 활용부터 배포까지 | Pinia를 활용해 맛집목록 및 검색을 만들고 GitActions와 Docker, Ubuntu를 이용해 배포 진행 | [보러가기](./doc/2026-08-13.md ) |
| 26.08.14 | 람다식 활용 | security 코드 작성을 위한 람다식 복습 | [보러가기](./doc/2026-08-14.md ) |
| 26.08.18 | Spring-Security | (spring-security -> SpringPiniaProject2참고)람다식을 활용하여 security 코드 작성 | [보러가기](./doc/2026-08-18.md ) |
| 26.08.19 | Spring-Security | 보안 인증/인가 부터 자동로그인까지 학습 | [보러가기](./doc/2026-08-19.md ) |
| 26.08.20 |  |  | [보러가기](./doc/2026-08-20.md ) |
| 26.08.21 | 쿠버네티스 활용 | 쿠버네티스를 활용해 우분투에서 배포 진행 | [보러가기](./doc/2026-08-21.md ) |
| 26.08.24 | WebScoket | WebScoket을 활용한 실시간 채팅 구현 | [보러가기](./doc/2026-08-24.md ) |
| 26.08.25 | Kafka | Kafka의 쓰임 학습| [보러가기](./doc/2026-08-25.md ) |
| 26.08.26 | Kafka 알림 - JPA활용 | JPA를 활용해 댓글 구현하고 Kafka로 알림 보내기 구현 | [보러가기](./doc/2026-08-26.md ) |
| 26.08.27 | Jenkins 자동화 | Jenkins를 활용한 배포 진행  | [보러가기](./doc/2026-08-27.md ) |
| 26.08.28 | kafka AWS에서 호스팅 진행해보기 | Ubuntu에서 진행하던 호스팅을 AWS에서 실습하며 진행 | [보러가기](./doc/2026-08-28.md ) |
| 26.08.31 | JWT 쿠키기반 보안 인증방식 | JWT(JSON Web Token)을 활용해 보안을 적용하고 권한에 따라 제어 차별화 실습 | [보러가기](./doc/2026-08-31.md ) |
| 26.09.01 | JWT 보안 인증방식 적용 후 AWS 로스팅 진행 | JWT 보안 인증방식을 사용해 AWS에서 CI/CD 진행해보기 | [보러가기](./doc/2026-09-01.md ) |
| 26.09.02 | AWS CI/CD 진행 | AWS에서 CI/CD 진행을 위한 deploy.yml 작성(자동화) | [보러가기](./doc/2026-09-02.md ) |
| 26.09.03 |  |  | [보러가기](./doc/2026-09-03.md ) |
| 26.07.20 ~ 26.??.?? |  학습자료 정리 | 웹 학습에 도움이 되는 자료 모음 | [보러가기](./Spring_정리자료) |





---
## 🛠️ 주요 사용 기술

### 🌐 Frontend
- **Languages & Frameworks:** HTML5, CSS3, JavaScript (ES6+), Vue 3 (Pinia), jQuery
- **Template Engine:** Thymeleaf
- **Tools:** VS Code 

### ⚙️ Backend & Server
- **Language:** Java (JDK 21)
- **Framework:** Spring Boot (Embedded Apache Tomcat 11.0.20)
- **ORM & Mapper:** Spring Data JPA, MyBatis
- **Build Tool:** Gradle
- **IDE:** Eclipse IDE (Main Environment)
- **Libraries:** Lombok, Slf4j

### 💾 Database & Connectivity
- **DB:** Oracle Database 21c Express Edition (XE)
- **Tools:** SQL Developer, DBeaver
- **Connectivity:** JDBC (ojdbc11)

### ☁️ Infrastructure & DevOps
- **OS:** Ubuntu 26.04
- **Cloud:** AWS
- **Container:** Docker

### 🚀 VCS
- **Git / GitHub**

---

## 📂 Project Archive
학습한 기술들을 실제로 적용해 본 프로젝트 목록입니다.

| 프로젝트명 (기간) | 설명 및 담당 역할 | 사용 기술 | 링크 |
| :--- | :--- | :--- | :--- |
| **도서관리 시스템 (Kiosk)** <br> `26.04.20 - 26.04.30` | 자바 기반의 도서 대여/반납 키오스크 프로그램 <br> - **담당:** 로그인, 회원가입, 마이페이지 모듈 구현 <br> - **성과:** JDBC를 통한 DB 연동 및 Swing GUI 구현 | Java, Oracle SQL, JDBC, Swing | [보러가기](https://github.com/library-kiosk/2026-java-project) |
| **신발 물류/재고 관리 프로젝트** <br> `26.06.17 - 26.07.24` | 자바, Oracle, MyBatis, jquery 기반의 신발 재고/물류 판매 사이트 제작 <br> - **담당:** 상품 목록, 상품 상세페이지, 상품 검색, 메인 홈 구현 <br> - **성과:** MyBatis를 통한 DB 연동 및 Jquery로 ajax 구현 및 VueJS axios로 비동기 처리 구현| Java, Oracle, MyBatis, Jquery, Vue | [보러가기](https://github.com/SIST-SWMS/2026-web-project.git) |
| **교육센터 평가 시스템 웹페이지** <br> `26.08.10 - 26.09.11` | 자바, Oracle, MyBatis, jquery 기반의 교육센터 평가 시스템 웹사이트 제작 <br> - **담당:** 로그인, 회원가입, 보안, 도서파트 <br> - **성과:** Spring-Boot와 ThymeLeaf를 이용한 구조 및 Vue3 Pinia를 이용해 프론트엔드 구현| Java, Oracle, Spring-Boot, ThymeLeaf, MyBatis, Vue3 (Pinia) | [보러가기]() |
