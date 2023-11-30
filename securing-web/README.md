# Securing Web Applications using Spring Boot's Basic Authentication

Spring Boot provides security using their HTTPS to secure endpoints - it allow users to 
authenticate before accessing resources, webpages, and other private parts of an application. 

As indicated from the <a href="https://spring.io/guides/gs/securing-web/">documentation</a>. We need to have 
barriers to force our users in signing-in before they can access a particular resource or page in an application.

To create and secure web applications, we need to secure endpoints, and to do that, we need to configure and set 
Spring security. 

>  If Spring Security is on the classpath, Spring Boot automatically secures all HTTP endpoints with “basic” authentication.