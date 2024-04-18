# 서울시 와이파이 정보 제공 서비스

<hr/>

![wifi](https://private-user-images.githubusercontent.com/68772640/323278701-b265c829-7099-4c5b-a72d-9071254ef4b6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MjMsIm5iZiI6MTcxMzQzMTYyMywicGF0aCI6Ii82ODc3MjY0MC8zMjMyNzg3MDEtYjI2NWM4MjktNzA5OS00YzViLWE3MmQtOTA3MTI1NGVmNGI2LmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM0M1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTM1MmUxNGNmNTI5ODU1MmMzYjNjZjFlNjUzNzAxM2ZlNmMwMzdjZjE1MmE3MDY4NTY2NjY2MzJiODEwMDFmMjAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.3BdeUoVsW-COUDiBIeZsUVHsJRnojJYjEI_BqZ1KaJY)

```
개발기간: 2024.04.01 ~ 2024.04.15
개발인원: 1명
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

- 위치를 기반으로 서울시 와이파이 정보를 제공하는 서비스입니다.
- 원하는 위치나 혹은 현재 위치의 좌표를 이용하여 근처의 공공 와이파이 정보를 확인할 수 있습니다.

## 기술 스택

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

| ![wifi-info-service_features](https://private-user-images.githubusercontent.com/68772640/323541362-d4703b99-45b2-484d-a80e-78fd53e92d98.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MzYsIm5iZiI6MTcxMzQzMTYzNiwicGF0aCI6Ii82ODc3MjY0MC8zMjM1NDEzNjItZDQ3MDNiOTktNDViMi00ODRkLWE4MGUtNzhmZDUzZTkyZDk4LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM1NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTAxY2Q1ZTc1MWU1NzA5MjU2ZThiNzFmYmIzODYzMzIwMmQ5OGMyYzlmOGQ5NGVjYjk3NDdiMTM3OWJlY2RkZmImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.7-D9Hh5XWwrTaiWpvNC2cMHnmcAgj7QUqv5aJxfRvgQ) 서비스 구현 전체 |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

| ![load-wifiInfo](https://private-user-images.githubusercontent.com/68772640/323535458-572d2913-510d-4013-a4fc-17e2637b1230.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MzYsIm5iZiI6MTcxMzQzMTYzNiwicGF0aCI6Ii82ODc3MjY0MC8zMjM1MzU0NTgtNTcyZDI5MTMtNTEwZC00MDEzLWE0ZmMtMTdlMjYzN2IxMjMwLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM1NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTQ2MjgxOWI1ZTJhNjFiZWY5ZGZjMzdjYjNiNzQ5Nzg0NmRjYzNjYTk1OWE4NTBiMDQzZWFlZDFmNjU4NDJiMmMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.0Jsm6j0dYRSnFvXAbM4BLgt-_ESZBvN65zpCMLSdGII) 공공와이파이 API 호출 | 
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

 ![load-nearWifiInfo](https://private-user-images.githubusercontent.com/68772640/323540736-f82796f3-851a-4170-809a-901557af6713.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MzYsIm5iZiI6MTcxMzQzMTYzNiwicGF0aCI6Ii82ODc3MjY0MC8zMjM1NDA3MzYtZjgyNzk2ZjMtODUxYS00MTcwLTgwOWEtOTAxNTU3YWY2NzEzLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM1NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTkxZmZjZGU5Y2QxMDg4Mzc0NDU4MGIzNzZmN2ZlNzk5NDZhNWRlOGQ3MzRjNzAxZTJlNDg1ZmJjYjQ0MTBiNDcmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0._-3srqMqEmtBNtzQ61Iijt1yM4ZQT-G9LwxfzOFX92o) 근처 공공와이파이 정보 확인 | ![input-coordinate](https://private-user-images.githubusercontent.com/68772640/323534102-d625fb3f-2a51-4132-b8db-7fcc28f7f7f4.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MzYsIm5iZiI6MTcxMzQzMTYzNiwicGF0aCI6Ii82ODc3MjY0MC8zMjM1MzQxMDItZDYyNWZiM2YtMmE1MS00MTMyLWI4ZGItN2ZjYzI4ZjdmN2Y0LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM1NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWUwM2I0MjI3MDE2NDgzMjBlZTUwNmE3M2U0ZjM2MDZmMDRiYTU2NTZlNmUzZTNjMjhjMTI0MjE2NTFmMzJmOWMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.gySGnrHYvy5uK1nRlCWUTd6W8Pl2zoYjxe61g5ASdj0)직접 좌표 입력 후 근처 공공와이파이 정보 확인 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

 ![load-history](https://private-user-images.githubusercontent.com/68772640/323534117-d427cdd5-1a9e-4a42-9ef8-6520695d410f.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MzYsIm5iZiI6MTcxMzQzMTYzNiwicGF0aCI6Ii82ODc3MjY0MC8zMjM1MzQxMTctZDQyN2NkZDUtMWE5ZS00YTQyLTllZjgtNjUyMDY5NWQ0MTBmLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM1NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTYwMDk0MmMwODgzNWEwNjBmZjE5MTRhYjFmZjliNmE1ZTc1MjY5MzYzY2YxYWNjMTVmZjBlMmNkMDQxYjg1ZjUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.A5ltqchEW3yIUOQFnCj-rVv0cSzLk-zLJW3p3_HEBtk)조회한 좌표 히스토리 목록 | ![delete-history](https://private-user-images.githubusercontent.com/68772640/323534091-964cd080-185d-4013-a43c-3528565438f8.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzE5MzYsIm5iZiI6MTcxMzQzMTYzNiwicGF0aCI6Ii82ODc3MjY0MC8zMjM1MzQwOTEtOTY0Y2QwODAtMTg1ZC00MDEzLWE0M2MtMzUyODU2NTQzOGY4LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDA5MTM1NlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPThiM2NhNDRlODM3ZDE4MTQ5ODM1NWE0YzQ4ZjMwZDZmYmIxZThmYjg0N2VkYjY5ZGEzZGQzOTNlOTNhZDRlYTImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.nFlnJLSN4uJsK8g3UYbk71FN0EuZQK0IEq5QwQZ93w8)조회한 좌표 히스토리 삭제 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

<hr/>

## 개선할 사항

### 1

### 2

### 3

<hr/>
커버 이미지 출처 - <a href="https://unsplash.com/" target="_blank">Unsplash</a>



