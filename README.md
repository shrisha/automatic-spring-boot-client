# Spring Boot, spring-security-oauth2 that pulls in trip data from automatic.com
* [Spring Boot](http://projects.spring.io/spring-boot) server-side application with [spring-security-oauth2](http://projects.spring.io/spring-security-oauth/).

# Contribute!
* If you have ideas on how to make this better, pull requests are welcome!
* If you can fix bugs, all the better!

# Known issues

# Local Setup Info
Locally, you can run it from an IDE (Intellij, Eclipse) as an application (`Application.java`), you don't have to deploy it to a web container.
 
# Heroku Setup Info

Procfile
```
web: java $JAVA_OPTS -Dserver.port=$PORT -jar target/autoclient-1.0.0.jar
```

# Getting started
After cloning this repo:
```
git remote add heroku git@heroku.com:autoclient.git
```
You can now deploy to heroku if you have permissions.  Make sure to download the heroku Toolbelt on your system.

# Deployment Stuff

To re-deploy fresh code, stop the proc, push and start it:

```
heroku ps:scale web=0
git push heroku master
heroku ps:scale web=1
```
#Usage

## Web

