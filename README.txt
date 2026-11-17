JWT Token Generation - Spring Boot project

Requirements:
- Java 17
- Maven (STS can use its embedded Maven)
- Internet connection for Maven dependencies on first build

Import into Spring Tool Suite (STS):
1. Extract jwt-demo.zip.
2. Open STS.
3. Select File > Import > Maven > Existing Maven Projects.
4. Browse to the extracted jwt-demo folder.
5. Select the pom.xml and click Finish.
6. Wait for Maven dependencies to download.
7. Right-click JwtDemoApplication.java > Run As > Spring Boot App.

Test:
- Swagger UI: http://localhost:8080/swagger-ui/index.html
- Endpoint: POST http://localhost:8080/api/jwt/generate
- JSON body:
  {
    "username": "john",
    "role": "ADMIN"
  }

The response is a JWT string with three dot-separated parts:
header.payload.signature

Security note:
This is an educational lab demo. The endpoint accepts username and role from the request body.
A real application must derive identity and roles from an authenticated user, not trust arbitrary
client-supplied role values. Replace the demo secret with a securely generated secret before use.
