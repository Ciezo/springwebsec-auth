# Securing Web Applications using Spring Boot's Basic Authentication

Spring Boot provides security using their HTTPS to secure endpoints - it allow users to 
authenticate before accessing resources, webpages, and other private parts of an application. 

As indicated from the <a href="https://spring.io/guides/gs/securing-web/">documentation</a>. We need to have 
barriers to force our users in signing-in before they can access a particular resource or page in an application.

To create and secure web applications, we need to secure endpoints, and to do that, we need to configure and set 
Spring security. 

This is an example project to utilize the Spring's framework of providing securing
endpoints which allow HTTPS traffic. Moreover, we allow the use of Beans and Configuration
files which allow us to easily setup the security of a web application.

>  If Spring Security is on the classpath, Spring Boot automatically secures all HTTP endpoints with “basic” authentication.

# Providing Encryption
> The <code>BCryptPasswordEncoder</code> implementation uses the widely supported “bcrypt” algorithm to hash the passwords. 
> Bcrypt uses a random <b>16-byte salt value</b> and is a deliberately slow algorithm, to hinder password crackers.

It is a bad practice to print or log hashed and secret values such as <b>passwords, credit card information, and emails.</b>

I need to remind myself that I cannot log or print a hashed value. Even if I want to test if it works.

> Printing sensitive information, especially passwords or their hashed forms, in logs is a bad practice and a potential security risk. 
> It's important to avoid logging sensitive information to prevent unintentional exposure. - <b>ChatGPT</b>


However, there are instances that we can hash or not hash an email. Such an example can be seen 
<a href="https://security.stackexchange.com/questions/201361/is-it-worth-storing-email-addresses-as-hashes">here</a>.

> The first question you need to ask yourself is, does your service need the email address in the first place and
what does it need that email address for?

> If you don't need the email address, then don't store it.

> If you need to know the email address, and if all of those needs can be satisfied by a hashed version, then it sounds 
> like a good idea to store just a hash.

> If you need to know the email address for purposes which cannot be satisfied by a hash, then it's not a good idea to 
> store just a hash. If for example you need to send emails to your users, chances are you cannot do that with just a hash.


# Some important notes
<hr>

## Configuration annotation

<code>@Configuration</code> annotation allows us to indicate that a class is declared to use one ore more <code>@Bean</code>
methods, and it will be processed by the Spring Container at runtime to generate <code>@Bean</code> classes. 
Classes which have this annotation can be used as an external configuration including beans in one place.

Furthermore, using this annotation can help setup Spring security where most of the user credentials and authentication
are configured.

> The <code>@Configuration</code> annotation in Spring is used to indicate that a class declares one or more 
> <code>@Bean</code> methods and may be processed by the Spring container to generate bean definitions and service requests
> for those beans at runtime.


## Bean annotation

<code>@Bean</code> these are snippets of methods found within a @Configuration class which is used to define 
Spring Beans.

> A class annotated with <code>@Configuration</code> is often used to define Spring beans. 
> Methods annotated with <code>@Bean</code> within this class provide bean definitions.

> The <code>@Bean</code> annotation on a method indicates that the method will return an object that should be registered 
> as a bean within the Spring application context.


## Spring Container Processing 

Allows the application to create a Spring Bean definition for each class that is annotated with <code>@Configuration</code>. 
Then, it creates Spring processes each method annotated with <code>@Bean</code>.

> When Spring sees a class annotated with @Configuration, it processes the class to create a Spring bean definition 
> for each @Bean method in the class.

## Dependency Injection

This allows us to make code 'modular' and make classes independent and loosely coupled against other classes. Moreover,
Dependency injection can make writing code much easier by using inserting or injecting code into another classes. 

> In Spring, the objects returned by <code>@Bean methods</code> can be injected into other beans, providing a way to manage 
> dependencies within the Spring application context.