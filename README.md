# 서울시 와이파이 정보 제공 서비스

<hr/>

![wifi](https://github.com/JYPIT/zerobase-study22/assets/68772640/b265c829-7099-4c5b-a72d-9071254ef4b6)
![wifi](https://private-user-images.githubusercontent.com/68772640/323278701-b265c829-7099-4c5b-a72d-9071254ef4b6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzQ5NzcsIm5iZiI6MTcxMzQzNDY3NywicGF0aCI6Ii82ODc3MjY0MC8zMjMyNzg3MDEtYjI2NWM4MjktNzA5OS00YzViLWE3MmQtOTA3MTI1NGVmNGI2LmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDEwMDQzN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTkyNjE0NTUxNWZlZGE4MTBmNDgxYTQ2MjE5MjBmYmEzMWZjZGNkYWUzOWJlMDU2NWNlYWE1NzFhOGE2OTMxZGQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.yuYYu_eIbbPfjGpFNvVulIhWN8zFYrk2mp3Ov3aaSR0)
![wifi](https://private-user-images.githubusercontent.com/68772640/323278701-b265c829-7099-4c5b-a72d-9071254ef4b6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzQ5NzcsIm5iZiI6MTcxMzQzNDY3NywicGF0aCI6Ii82ODc3MjY0MC8zMjMyNzg3MDEtYjI2NWM4MjktNzA5OS00YzViLWE3MmQtOTA3MTI1NGVmNGI2LmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDEwMDQzN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTkyNjE0NTUxNWZlZGE4MTBmNDgxYTQ2MjE5MjBmYmEzMWZjZGNkYWUzOWJlMDU2NWNlYWE1NzFhOGE2OTMxZGQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.yuYYu_eIbbPfjGpFNvVulIhWN8zFYrk2mp3Ov3aaSR0)
![wifi](https://private-user-images.githubusercontent.com/68772640/323278701-b265c829-7099-4c5b-a72d-9071254ef4b6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzUwNDIsIm5iZiI6MTcxMzQzNDc0MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyNzg3MDEtYjI2NWM4MjktNzA5OS00YzViLWE3MmQtOTA3MTI1NGVmNGI2LmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDEwMDU0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTcyYzY5NmMyNTYzZjU3MmY1ZGQyMjgwMTY2YzIxODhkOWMwYjBmNmM4YjZlMzhkNjk0ZDdmZmI4NzcwODkzYWImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.Ycj5QxMwdcGhldFtyWAsm-NJaNvSZ_x8Q9AXTSFTOm4)
![wifi](https://private-user-images.githubusercontent.com/68772640/323278701-b265c829-7099-4c5b-a72d-9071254ef4b6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTM0MzUwNDIsIm5iZiI6MTcxMzQzNDc0MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyNzg3MDEtYjI2NWM4MjktNzA5OS00YzViLWE3MmQtOTA3MTI1NGVmNGI2LmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTglMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE4VDEwMDU0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTcyYzY5NmMyNTYzZjU3MmY1ZGQyMjgwMTY2YzIxODhkOWMwYjBmNmM4YjZlMzhkNjk0ZDdmZmI4NzcwODkzYWImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.Ycj5QxMwdcGhldFtyWAsm-NJaNvSZ_x8Q9AXTSFTOm4)

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

<hr/>

<div align="center">

| ![wifi-service](https://github.com/JYPIT/zerobase-study22/assets/68772640/d4703b99-45b2-484d-a80e-78fd53e92d98) 서비스 구현 전체 |
|---------------------------------------------------------------------------------------------------------------------------|

</div>

| ![load-wifi](https://github.com/JYPIT/zerobase-study22/assets/68772640/572d2913-510d-4013-a4fc-17e2637b1230) 공공와이파이 API 호출 | 
|----------------------------------------------------------------------------------------------------------------------------|

 ![load-nearWifi](https://github.com/JYPIT/zerobase-study22/assets/68772640/f82796f3-851a-4170-809a-901557af6713) 근처 공공와이파이 정보 확인 | ![input-coordinate](https://github.com/JYPIT/zerobase-study22/assets/68772640/d625fb3f-2a51-4132-b8db-7fcc28f7f7f4) 직접 좌표 입력 후 근처 공공와이파이 정보 확인 
----------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|

 ![load-history](https://github.com/JYPIT/zerobase-study22/assets/68772640/d427cdd5-1a9e-4a42-9ef8-6520695d410f) 조회한 좌표 히스토리 목록 | ![delete-history](https://github.com/JYPIT/zerobase-study22/assets/68772640/964cd080-185d-4013-a43c-3528565438f8)조회한 좌표 히스토리 삭제 
--------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------|

<hr/>

## 개선할 사항

### 1

### 2

### 3

<hr/>
커버 이미지 출처 - <a href="https://unsplash.com/" target="_blank">Unsplash</a>



