# SpringBootJPASOA
Spring Boot Basic skeleton on SOA Architecture 

This repostiroy will contain different projects related to Spring Boot that I created for my learning and exploration purposes.

SpintBootOAuth2

OAtuh2 - Resource Owner Password flow is implemented in this project.

Here is the curl command to create the token, it is using the data that is already provided in the databse dump i.e. employeebook.sql

http://localhost:8080/oauth/token?grant_type=password&username=mudassir@domain.com&password=Mudassir2017

use basic auth with user name=TestClient password: MySecret

{"access_token":"1a27dc06-3c63-43f0-98c8-06fd80bdb0d6","token_type":"bearer","refresh_token":"c4a9dedd-2478-4e2c-8c4c-0a51eff56629","expires_in":86399,"scope":"read write"}

Once you have the token you will just have to pass this token to the APIs in the Authorization header as Bearer here-goes-the-token
