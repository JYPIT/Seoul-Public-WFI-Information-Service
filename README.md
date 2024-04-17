# 서울시 와이파이 정보 제공 서비스

<hr/>

![wifi](https://private-user-images.githubusercontent.com/68772640/323278701-b265c829-7099-4c5b-a72d-9071254ef4b6.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzI0NjAsIm5iZiI6MTcxMzM3MjE2MCwicGF0aCI6Ii82ODc3MjY0MC8zMjMyNzg3MDEtYjI2NWM4MjktNzA5OS00YzViLWE3MmQtOTA3MTI1NGVmNGI2LmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2NDI0MFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTg1OTAyYzQ2YzY1NWY4ODBiZDcxMjQzMDJlMzQ1OTJlZWY0ZDJhNDY4NGM2MTIyYThhOTI0ZDQ1YzFhZTRkM2UmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.bgVpEhgFeYZ1Fv1QLJHG-7bExnuSN5-UhBjZffHnD78)

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

 ![](https://private-user-images.githubusercontent.com/68772640/323297545-a5b52473-b794-4d22-beab-d7996ff705d2.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzI0NjAsIm5iZiI6MTcxMzM3MjE2MCwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NDUtYTViNTI0NzMtYjc5NC00ZDIyLWJlYWItZDc5OTZmZjcwNWQyLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2NDI0MFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTlmMTFjMTVmMTA5NDYxNmRkYmIyYTc1NTk5MDEyM2MxMTBhZTBjYWI5ZWYxYmI4OWY3ZjJiNDk4NjQ2ZGQ5YjImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.CkhuCR-mhxIIltpCdF1GZO2RlSNd-kbZc8SY2Dm5dWM) | ![](https://private-user-images.githubusercontent.com/68772640/323297545-a5b52473-b794-4d22-beab-d7996ff705d2.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzI0NjAsIm5iZiI6MTcxMzM3MjE2MCwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NDUtYTViNTI0NzMtYjc5NC00ZDIyLWJlYWItZDc5OTZmZjcwNWQyLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2NDI0MFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTlmMTFjMTVmMTA5NDYxNmRkYmIyYTc1NTk5MDEyM2MxMTBhZTBjYWI5ZWYxYmI4OWY3ZjJiNDk4NjQ2ZGQ5YjImWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.CkhuCR-mhxIIltpCdF1GZO2RlSNd-kbZc8SY2Dm5dWM) 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

<figure>
<a href=""><img src="https://private-user-images.githubusercontent.com/68772640/323297569-b9d79d7e-05c1-4cf0-8da3-d9ce3c941594.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzAzNjIsIm5iZiI6MTcxMzM3MDA2MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NjktYjlkNzlkN2UtMDVjMS00Y2YwLThkYTMtZDljZTNjOTQxNTk0LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MDc0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTIxODdmZjg0YzU0YTg5M2M3ZTU5NWIzN2NiY2EwYzllMDRiYWQ2MWRhYTQ4YjRmNjJjMTY5MjgyYjA2OWE4YmUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.7vnBAEF4tzi9aMq6EgE1ANE2Q3lMR8o6QTSis0oR0oA" alt="" height="150px" width="49%" align="left"></a>
<a href=""><img src="https://private-user-images.githubusercontent.com/68772640/323297562-eb3ff666-9575-447a-ace8-cf34ba227cb0.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzAzNjIsIm5iZiI6MTcxMzM3MDA2MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NjItZWIzZmY2NjYtOTU3NS00NDdhLWFjZTgtY2YzNGJhMjI3Y2IwLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MDc0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTRmYmFhNDcwZTdlMDRhZmQ5NWJmMzRhNTM5ZTAyMjZlMTZjZGMwMWNkNzBiOWQ0ZWI4ZGY3OGIzYTg0Mjg3NzUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.lYXBLVpIdhOnyjEy2T6TDA2DjutFeyOlvvfw1sP_T7U" alt="" height="150px" width="49%" align="right"></a>
</figure>
와이파이 API 호출

조회한 좌표 히스토리 목록

![load-wifiInfo](https://private-user-images.githubusercontent.com/68772640/323297578-776be7c6-a3b0-4ce9-9c01-baff95510076.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzIxODcsIm5iZiI6MTcxMzM3MTg4NywicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NzgtNzc2YmU3YzYtYTNiMC00Y2U5LTljMDEtYmFmZjk1NTEwMDc2LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MzgwN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTU1YjI5MGIwYzMwZTU4MzZmODExYzU1MTYzZjM3NDM3ZjNkMzhmM2ExYjcwMDY2OGM5YzAwNDlmN2Q0Y2I0NDMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.tVomVj88jxqDeOdVlE-C1kJB2pFws_hEhjXmVMCP5EI)

![load-nearWifiInfo](https://private-user-images.githubusercontent.com/68772640/323297577-fc5e38b0-15f2-449a-b235-051922973a8b.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzIxODcsIm5iZiI6MTcxMzM3MTg4NywicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NzctZmM1ZTM4YjAtMTVmMi00NDlhLWIyMzUtMDUxOTIyOTczYThiLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MzgwN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTRkNTdkNzYzMTQxZWNmNjU5NWUzOTA3NjZhOWVmNTk5MmU4OWIyMWMwYWQzOTgzOWE4YTVlZDIwOGFhM2JiNjUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.6L17MR2qWEhY6iaTzEEPq32LMS_n70SHIZatF-ehLJU)
![load-history]()
![delete-history]()
![input-coordinate](https://private-user-images.githubusercontent.com/68772640/323297562-eb3ff666-9575-447a-ace8-cf34ba227cb0.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzIxODcsIm5iZiI6MTcxMzM3MTg4NywicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NjItZWIzZmY2NjYtOTU3NS00NDdhLWFjZTgtY2YzNGJhMjI3Y2IwLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MzgwN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTRhYmRjNGEyNzljNzU1ZmI0MmRjMTNkM2JmOGZjOTE3NjJmNjhjM2FhYWEyNTJjZjc3ODI4MmNiNGIzYWI5OTYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.RdcGpu8UyFHBBFbCWDaG8qhq7CRtTGKSnZSrpFeR_RU)

조회한 좌표 히스토리 삭제
<img src="https://private-user-images.githubusercontent.com/68772640/323297545-a5b52473-b794-4d22-beab-d7996ff705d2.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzAzNjIsIm5iZiI6MTcxMzM3MDA2MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NDUtYTViNTI0NzMtYjc5NC00ZDIyLWJlYWItZDc5OTZmZjcwNWQyLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MDc0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTMyZTRlNTI3MzRmNjU4YTU0YjI0OGYwY2NmNWEyMTE5MmQ3M2JkZTliMTEzZWI2MmI1YzU1NmFhYmE1OTMyNjMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.8tiyThgJxekOOSYNYj6w2tWnvTzQTCnEdO6t2I2ms_w" alt="">
<img src="https://private-user-images.githubusercontent.com/68772640/323297578-776be7c6-a3b0-4ce9-9c01-baff95510076.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzAzNjIsIm5iZiI6MTcxMzM3MDA2MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NzgtNzc2YmU3YzYtYTNiMC00Y2U5LTljMDEtYmFmZjk1NTEwMDc2LmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MDc0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTMxMDg2NzhlYzNjMDAzOTNjZjAwZDBmNjYyMGMwZjgyNjM1ZDQ5MDVlZTIyZWYxNzEzYjgxMmUzZjdjMTdkZTQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.YIKX9eV0ryVKE5TVxH9g6BsWeV4FKHdnSVCIL9-Bod8" alt="">
<img src="https://private-user-images.githubusercontent.com/68772640/323297577-fc5e38b0-15f2-449a-b235-051922973a8b.gif?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTMzNzAzNjIsIm5iZiI6MTcxMzM3MDA2MiwicGF0aCI6Ii82ODc3MjY0MC8zMjMyOTc1NzctZmM1ZTM4YjAtMTVmMi00NDlhLWIyMzUtMDUxOTIyOTczYThiLmdpZj9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA0MTclMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwNDE3VDE2MDc0MlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTEzZWRiYzhjMmY2MjZhYjY5YjZiMTA3Yzk5MzMzMzE5MjcxNmVmOTQ1ODhiOGM5ZDA5YmMyZjVkMGNhMWM1NDQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.cVuevUNBACAUpGg-8TLeBG1e2-D2bezxdfb3fbdXsDM" alt="">

<hr/>

## 개선할 사항

### 1

### 2

### 3

<hr/>
커버 이미지 출처 - <a href="https://unsplash.com/" target="_blank">Unsplash</a>



