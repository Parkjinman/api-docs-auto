# api-docs-auto 사용 가이드
#### Swagger UI와 Spring RestDocs의 장점들을 활용한 통합 샘플 코드입니다.
#### 컬리 기술 블로그를 참고하였습니다.
(https://helloworld.kurly.com/blog/spring-rest-docs-guide/)

<!-- TABLE OF CONTENTS -->
<summary>목차</summary>
<ol>
  <li>
    <a href="#설치 버전">설치 버전</a>
  </li>
  <li>
    <a href="#설치 과정">설치 과정</a>
  </li>
  <li>
    <a href="#설치 확인">설치 확인</a>
  </li>
</ol>

## 설치 버전
* Java: JDK 1.8.0_281
* Spring Boot: 2.7.15
* Gradle: 7.4.2
  * Gradle 8 이상 호환 안됌. 
* RestDoc: 0.16.2
  * 0.17버전은 java 1.8에서 호환 안됌.
* SpringDoc: 1.6.11


## 설치 과정

1. 프로젝트 구성하기(Reload All Gradle Projects)
    ```sh
   ./gradlew clean build
    ```

3. API문서생성
    ```sh
   ./gradlew clean restDocsTest
    ```

4. 생성문서 확인
    1. Spring REST Docs: `build/docs/asciidoc/index.html`
    2. Swagger UI: `api-spec/openapi3.yaml`

5. application.jar 파일 생성
    ```sh
    ./gradlew apiBuild
    ```

6. application.jar 파일 위치로 이동
    ```sh
    cd build/libs
    ```
   
7. application.jar 파일 실행( * 터미널 관리자 권한 실행 )
    ```sh
    java -jar application.jar
    ```



## 설치 확인

### Spring REST Docs
[http://localhost:9080/docs/index.html]()

### Spring REST Docs - OpenAPI Specification Integration
[http://localhost:9080/swagger/swagger-ui.html]()

### Springdoc
[http://localhost:9080/swagger-ui/index.html]()
