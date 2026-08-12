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
| 26.08.11 |  |  | [보러가기](./doc/2026-08-11.md ) |
| 26.08.12 | JPA - JPQL, QueryDSL | JPA 쿼리 방식 비교 - JPQL, QueryDSL | [보러가기](./doc/2026-08-12.md ) |
| 26.08.13 |  |  | [보러가기](./doc/2026-08-13.md ) |
| 26.08.14 |  |  | [보러가기](./doc/2026-08-14.md ) |
| 26.07.20 ~ 26.??.?? |  학습자료 정리 | 웹 학습에 도움이 되는 자료 모음 | [보러가기](./Spring_정리자료) |





---
## 🛠️ 주요 사용 기술

### 🌐 Frontend
- **Languages & Frameworks:** HTML5, CSS3, JavaScript (ES6+), Vue 3 (Vuex, Pinia), jQuery
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
