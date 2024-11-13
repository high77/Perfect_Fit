## 🎤 안쏭맞춤 Perfect-fit
### 사용자 자동 음정 맞춤 노래방 서비스 안쏭맞춤 Perfect-Fit 🎙
<img src='assets/Group 3.png' width=70% height=80%>
<br />

## 1️⃣ 프로젝트 개요

🌈 **개발 기간**

| 개발 기간 | 2024.02.26 ~ 2024.04.04(6주) |
| --------- | ---------------------------- |

🌈 **팀원 소개**

총 6명

<!-- | 팀원   | 역할                            |
| ------ | ------------------------------- |
| 김혁일 | 팀장, BE 리드, Infra(CI/CD), DB |
| 김재훈 | BE, 크롤링, DB, 서기            |
| 문신웅 | FE, 디자인, ,스크럼 마스터      |
| 박희찬 | AI, 크롤링, DB                  |
| 전재완 | BE, DB, 발표, Jira 담당자       |
| 정유나 | FE 리드, 디자인                 | -->

## 2️⃣ 주요 기능

🌈 **노래 부르기**

- 추천 알고리즘을 기반 사용자 맞춤 노래 차트를 제공
- 싱글모드와 듀엣모드로 나눠져 노래를 부르고 저장할 수 있습니다.
- 부르는 도중 학습시킨 내 음성을 기반으로 음정을 낮추거나 높혀줍니다.

🌈 **릴스**

- 부른 노래를 릴스로 만들어 모두와 공유할 수 있습니다.
- 녹화 및 녹음 후 커스텀하여 릴스형태로 공유 기능

🌈 **노래,릴스 추천**

- 찜이나 노래를 부른 기록에 맞춰서 부를 노래 추천이 가능합니다.
- 시청한 릴스를 기반으로 릴스가 추천되어 시청할수 있습니다.

## 3️⃣ API 명세서,기술 스택 및 아키텍처

### ⚙ 개발 환경

---

**FE**

<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=black"> <img src="https://img.shields.io/badge/TypeScript-3178C6?style=for-the-badge&logo=typescript&logoColor=white"> <img src="https://img.shields.io/badge/ZUSTAND-764ABC?style=for-the-badge&logo=zustand&logoColor=white"> <img src="https://img.shields.io/badge/StyledComponents-DB7093?style=for-the-badge&logo=styledcomponents&logoColor=white"> <img src="https://img.shields.io/badge/SCSS-CC6699?style=for-the-badge&logo=sass&logoColor=white"> <img src="https://img.shields.io/badge/pwa-FF6F00?style=for-the-badge&logo=pwa&logoColor=white"> <img src="https://img.shields.io/badge/VITE-646CFF?style=for-the-badge&logo=vite&logoColor=white"> 

**BE**

<img src="https://img.shields.io/badge/Springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/SpringSecurity-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"> <img src="https://img.shields.io/badge/jwt-4479A1?style=for-the-badge&logo=jwt&logoColor=white"> <img src="https://img.shields.io/badge/oauth2.0-DB7093?style=for-the-badge&logo=jwt&logoColor=white"> <img src="https://img.shields.io/badge/FastAPI-009688?style=for-the-badge&logo=fastapi&logoColor=white"> <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white"> <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
<br />

**DATA**
<br />

<img src="https://img.shields.io/badge/Django-092E20?style=for-the-badge&logo=Django&logoColor=white"/>

**DevOps**

<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white"/> <img src="https://img.shields.io/badge/Nginx-009639?style=for-the-badge&logo=nginx&logoColor=white"/> <img src="https://img.shields.io/badge/AwsEC2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white"> <img src="https://img.shields.io/badge/AwsS3-569A31?style=for-the-badge&logo=amazons3&logoColor=white">

**협업**

<img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"> <img src="https://img.shields.io/badge/GitLab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white"> <img src="https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jirasoftware&logoColor=white"> <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=notion&logoColor=white"> 
<br>
<br>

---

## 4️⃣ 협업 환경

- ### Gitlab

  - 코드 버전 관리
  - 이슈 발행, 해결을 위한 토론
  - git-flow 방식 활용

- ### JIRA

  - <img src='assets/jira.png' width="800px">
  - Scrum Poker를 사용하여 Story Point 설정
  - 3Deps 구조를 활용하여 진행
  - 팀원들의 역할 진행도 확인

- ### 회의

  - 매일 아침 스크럼 회의를 통하여 전날 목표 달성량과 당일 할 업무 브리핑

- ### Notion

  - 이슈 사항 기록
  - 컨벤션 정리
  - api 명세서 정리

- ### Figma

  - 목업 제작, 와이어프레임 제작

- ### Miro

  - 아이디어 회의

- ### Canva
  - 발표 PPT 공유

## 5️⃣ 구현 내용

### 로그인, 초기 설정 및 음성 분석

- 소셜 로그인
- 초기 회원가입 시 사용자 목소리를 입력받은 후 사용자 음성 분석

    <!-- <img src='assets/1.gif' width="300"> -->

---

### 다양한 차트

- 최신 차트 및 장르별 차트

    <img src='assets/2.gif' width="300">

---

### 찜 및 추천 차트

- 사용자가 찜하거나 자주 부른 장르 등 데이터 분석 후
- 맞춤형 취향 차트, 장르추천 제공

    <img src='assets/3.gif' width="300">

---

### 분석 화면

- 사용자가 자주 부른 노래를 분석하여 분석 데이터 그래프 제공

    <img src='assets/4.gif' width="300">

---

### 검색 기능

- 노래검색
- 듀엣 모드를 위한 사용자 검색

    <!-- <img src='assets/5.gif' width="300"> -->

---

### 노래 부르기

- 싱글 모드 및 듀엣 모드
- 사용자의 분석된 음성 데이터를 활용한 자동 음정 맞춤 기능 제공
- 수동 음정 조절 기능 제공
- 노래 녹음 및 영상 녹화
- 릴스 추가 가능

    <!-- <img src='assets/6.gif' width="300"> -->

---

### 마이페이지 및 보관함 기능

- 사용자가 찜한 노래 조회 가능
- 사용자가 부른 노래 조회 가능
- 사용자 제작 릴스 조회 가능

    <!-- <img src='assets/7.gif' width="300"> -->

---

### 릴스 생성 기능

- 사용자가 부른 후 저장된 영상으로 릴스 등록 가능

    <!-- <img src='assets/8.gif' width="300"> -->

---

### 릴스 시청

- 다른 사용자의 릴스 조회 가능

    <!-- <img src='assets/9.gif' width="300"> -->

## 6️⃣ 산출물

<!-- - ### [API 명세서(Notion)](https://spark-pudding-194.notion.site/API-3c265388d59c417aa08ca0b19c162809?pvs=4) -->

- ### 아키텍쳐
<img src='assets/아키텍처.png' width="800px">
