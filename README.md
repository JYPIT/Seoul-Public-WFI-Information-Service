# 서울시 와이파이 정보 제공 서비스

<hr/>

![wifi](https://images.unsplash.com/photo-1526411116157-21b2b172c6bc?q=80&w=1740&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D)

```
개발기간: 2024.04.01 ~ 2024.04.15
개발인원: 개인
```

# 목차

- [프로젝트 소개](#프로젝트-소개)
    - [기술 스택](#기술-스택)
    - [개발 환경](#개발-환경)
    - [프론젝트 구조](#프로젝트-구조)
- [주요 기능](#주요-기능)
    - [구현 화면](#구현-화면)
- [개선할 사항](#개선할-사항)

# 프로젝트 소개

<hr/>

- 위치를 기반으로 서울시 와이파이 정보를 제공하는 서비스입니다.
- 원하는 위치나 혹은 현재 위치의 좌표를 이용하여 근처의 공공 와이파이 정보를 확인할 수 있습니다.

## 기술 스택

<hr/>
<p style="text-align: center;">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="">
<img src="https://img.shields.io/badge/sqlite-%2307405e.svg?style=for-the-badge&logo=sqlite&logoColor=white" alt="">
<img src="https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black" alt="">
</p>
<p style="text-align: center;">
<img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white" alt="">
</p>

### 개발 환경

<hr/>

- JDK: JDK 1.8
- Server: Tomcat 8.5

### 라이브러리

<hr/>

- okhttp 3 4.9.3
- Gson 2.9.0
- lomok 1.18.24
- sqlite-jdbc 3.36.0.3

### 데이터

<hr/>

<a href="https://data.seoul.go.kr/dataList/OA-20883/S/1/datasetView.do" target="_blank">서울시 공공 와이파이 서비스 위치 정보</a>

## 프로젝트 구조

<hr/>

```
📦 
└─ src
   └─ main
      ├─ java
      │  ├─ ApiSection
      │  │  └─ SeoulWifiApi.java
      │  ├─ DbSection
      │  │  └─ DbConnection.java
      │  ├─ dto
      │  │  ├─ HistoryDto.java
      │  │  └─ WifiInfoDto.java
      │  ├─ model
      │  │  ├─ HistoryModel.java
      │  │  └─ WifiInfoModel.java
      │  ├─ service
      │  │  ├─ HistoryService.java
      │  │  └─ WifiInfoService.java
      │  └─ utils
      │     └─ Distance.java
      └─ webapp
         ├─ GeolocationApi.js
         ├─ WEB-INF
         │  └─ web.xml
         ├─ header.jsp
         ├─ history.jsp
         ├─ index.jsp
         ├─ load-wifi.jsp
         ├─ result.jsp
         └─ style.css
```

## 주요 기능

### 구현 화면

<hr/>

## 개선할 사항

<hr/>

##### 이미지 출처

<a href="https://unsplash.com/" target="_blank">Unsplash</a>



