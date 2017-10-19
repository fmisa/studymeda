
INSTALL ARCHTYPE:
mvn install:install-file -Dfile=springmvc3.1-archetype-1.0.1.jar -DgroupId=com.pointclickcare -DartifactId=PCCSpringMVC3.1Archetype -Dversion=1.0.1 -Dpackaging=jar -DgeneratePom=true [-DlocalRepositoryPath=[path to your local repository]]
mvn install:install-file -Dfile=C:\dev\dev_downloads\springArchType\springmvc3.1-archetype-1.0.1.jar -DgroupId=com.pointclickcare -DartifactId=PCCSpringMVC3.1Archetype -Dversion=1.0.1 -Dpackaging=jar -DgeneratePom=true

FIND DEPS TARGETS GOALS:
mvn fr.jcgay.maven.plugins:buildplan-maven-plugin:list -Dbuildplan.tasks=clean,deploy


CREATE APP - BASED ON ARCHTYPE:
mvn archetype:generate -DarchetypeGroupId=com.pointclickcare -DarchetypeArtifactId=PCCSpringMVC3.1Archetype -DarchetypeVersion=1.0.1 -DgroupId=ca.deciphersolutions -DartifactId=misaDecipher -Dversion=1.0.0-SNAPSHOT




TOMCAT HOME CONFIG
In both startup.bat and shutdown.bat
set CATALINA_HOME=C:/dev/software/apache-tomcat-6.0.37



///////////////////////////////////////////////////////
// OLD
TOMCAT DEBUG CONFIGURATION:
In startup.bat set the following:

set JPDA_ADDRESS=8000
set JPDA_TRANSPORT=dt_socket
set JPDA_SUSPEND=y


REM call "%EXECUTABLE%" start %CMD_LINE_ARGS%
call "%EXECUTABLE%" jpda start %CMD_LINE_ARGS%

// NEW - Tomcat 7
catalina.sh jpda start
catalina.bat jpda start
//////////////////////////////////////////////////////

MAVEN settings.xml - 
New Server
    <server>
      <id>localTomcatServer</id>
      <username>admin</username>
      <password>Nexus600</password>
    </server>

New repositories
                    <repository>
                          <id>repository.sonatype.org -public</id>
                          <name>DWR repository</name>
                          <url>https://oss.sonatype.org/content/groups/public</url>
                    </repository>


POM CUSTOMIZATION

 <name>pccTAASBroker</name>


mvn -Dmaven.test.skip=true clean compile eclipse:clean eclipse:eclipse install

Under dependencyManagement:
    <dependency>
    	<groupId>org.apache.tomcat.maven</groupId>
    	<artifactId>tomcat6-maven-plugin</artifactId>
    	<version>2.1</version>
    	<type>maven-plugin</type>
    </dependency>


Under pluginManagement:
		<plugin>
			<groupId>org.codehaus.mojo</groupId>
			<artifactId>tomcat-maven-plugin</artifactId>
			<configuration>
				<warSourceDirectory>C:/dev/fmmDataProjects/PCCDevToolkitNEW/XXXXX/target/XXXXX-1.0.0-SNAPSHOT</warSourceDirectory>
				<url>http://localhost:8080/manager</url>
				<username>admin</username>
				<password>Nexus600</password>
				<server>localTomcatServer</server>
				<!-- <path>/pccTAASBroker</path> -->
			</configuration>
		</plugin>   

<!-- OLDER ?
	<dependency>
		<groupId>org.directwebremoting</groupId>
		<artifactId>dwr</artifactId>
		<version>3.0.0-rc3-SNAPSHOT</version>
	</dependency>    
-->


    <dependency>
    	<groupId>org.directwebremoting</groupId>
    	<artifactId>dwr</artifactId>
    	<version>3.0.M1</version>
    	<scope>runtime</scope>
    </dependency>


DWR CUSTOMIZATION
web.xml
	<!-- DWR mapping -->
	<servlet>
		<servlet-name>dwr</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>
          classpath:dwr.xml
        </param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>

	<servlet-mapping>
		<servlet-name>dwr</servlet-name>
		<url-pattern>/dwr/*</url-pattern>
	</servlet-mapping>



NOTE: FOR TESTING / DEBUG
/dwr/index.html 


dwr.xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:dwr="http://www.directwebremoting.org/schema/spring-dwr"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
       http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.0.xsd
       http://www.directwebremoting.org/schema/spring-dwr http://www.directwebremoting.org/schema/spring-dwr-3.0.xsd">

  <dwr:controller id="dwrController" debug="true" />

  <bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
    <property name="alwaysUseFullPath" value="true"/>
    <property name="mappings">
    <props>
      <prop key="/dwr/**/*">dwrController</prop>
    </props>
    </property>
  </bean>
  
  <dwr:configuration>
    <dwr:convert type="bean" class="org.uk.ltd.dwr.dev.model.Address" />
  </dwr:configuration>

  <bean id="dwrService" class="org.uk.ltd.dwr.dev.service.DWRService">
    <dwr:remote javascript="dwrService">
      <dwr:include method="getAddress" />   
    </dwr:remote>
  </bean>  
</beans>


BUILD:
	mvn -Dmaven.test.skip=true clean compile eclipse:clean eclipse:eclipse install
	mvn -Dmaven.test.skip=true clean compile eclipse:clean eclipse:eclipse -DdownloadSources=true -DdownloadJavadocs=true install
	mvn -Dmaven.test.skip=true compile eclipse:eclipse install


	mvn -e war:inplace tomcat:inplace
	mvn war:inplace tomcat:inplace
	mvn war:inplace tomcat:redeploy


	mvn dependency:tree


#########################################################
# MVN SOURCES
#########################################################

mvn dependency:sources
mvn dependency:resolve -Dclassifier=javadoc

##

   <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-eclipse-plugin</artifactId>
                <configuration>
                    <downloadSources>true</downloadSources>
                    <downloadJavadocs>true</downloadJavadocs>
                </configuration>
            </plugin>
        </plugins>
    </build>
    
##
    
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate</artifactId>
  <version>3.2.7.ga</version>
  <classifier>sources</classifier>
</dependency>

##

<profiles>
<profile>
    <id>downloadSources</id>
    <properties>
        <downloadSources>true</downloadSources>
        <downloadJavadocs>true</downloadJavadocs>           
    </properties>
</profile>
</profiles>

<activeProfiles>
  <activeProfile>downloadSources</activeProfile>
</activeProfiles>


#########################################################
MyBatis Generator
#########################################################


#########################################################



http://krams915.blogspot.ca/2011/01/spring-mvc-3-and-dwr-3-integration.html
http://dailypaper.in/technical/integrating-dwr3-and-spring3/



ARCHITECTURE:
Client:
	CSS:				Bootstrap 3
	Javascript:			JQuery
	JSP TagLibs:		DisplayTag

Remoting:				DWR3

Middle:
	ACL:				Shiro
	Layout:				TILES
	IoC:				Spring
	SOA:				Java Interfaces/Services

O/R Mapping:			MyBatis

Database:				MySQL


Color Selection:
	http://www.empower-yourself-with-color-psychology.com/color-and-marketing.html
	http://blog.bufferapp.com/the-science-of-colors-in-marketing-why-is-facebook-blue

http://getbootstrap.com/
http://bootstraphero.com/the-big-badass-list-of-twitter-bootstrap-resources
http://bootswatch.com/
https://jetstrap.com/   					<- Subscription - VERY Expensive
http://pikock.github.io/bootstrap-magic/	<- Free...




#########################################################
https://localhost:8443/StudyMedia/dwr/index.html


#########################################################
# Database Connect
# Set root user - password - non/blank - by default:
mysqladmin -u root password "Nexus600"

#
mysql -u USERNAME -p PASSWORD -h HOSTNAMEORIP DATABASENAME
mysql -u root -p

#
create database studymedia;


CREATE USER 'non-root'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON * . * TO 'non-root'@'localhost';
FLUSH PRIVILEGES;

GRANT [permission type] ON [database name].[table name] TO ‘non-root’@'localhost’;
REVOKE [permission type] ON [database name].[table name] FROM ‘non-root’@‘localhost’;

CREATE – Enables users to create databases/tables
SELECT – Enables users to retrieve data
INSERT – Enables users to add new entries in tables
UPDATE – Enables users to modify existing entries in tables
DELETE – Enables users to delete table entries
DROP – Enables users to delete entire databases/tables

# Script/Console access ?
\! vi
\! bash

#
SOURCE C:\User\Folder\Folder...
source C:\fmm\_projects\SVN_BACKUP\misaStudyMediaBACKUP\src\database\sql\mysql\studyMediaCreate.sql
source C:\fmm\_projects\SVN_BACKUP\misaStudyMediaBACKUP\src\database\sql\mysql\studyMediaInitialize.sql




#
Apache Tiles Support
https://tiles.apache.org/framework/tutorial/integration/frameworks.html
Struts 1: Currently under development. A Struts 1 plugin is available in the SVN trunk, that presumably will be released along with Struts 1.4.
Struts 2: at the time of this writing, the Struts 2 Tiles plugin still uses Tiles version 2.
Spring MVC: Spring-3.2 can integration up to Tiles-2 and Tiles-3.
For a closer look at custom integrations the spring code: forms a good example.

Tiles v3x
JDK	7.0 or above.
Servlet	2.5 or above. It might work with Servlet 2.4
JSP	2.1 or Above. It might work with JSP 2.0.

Tiles v2x
JDK	5.0 or above.
Servlet	2.5 or above. It might work with Servlet 2.4
JSP	2.1 or Above. It might work with JSP 2.0.


# Free SSL
https://letsencrypt.org/

With shell access - deploy letsencrypt certs with:
https://certbot.eff.org


# SSL Config
https://tomcat.apache.org/tomcat-6.0-doc/ssl-howto.html

"%JAVA_HOME%\bin\keytool" -genkey -alias tomcat -keyalg RSA
keytool -genkey -alias tomcat -keyalg RSA -keystore C:/fmm/apps/apache-tomcat-6.0.53/conf/tomcat.keystore
keytool -certreq -keyalg RSA -alias tomcat -file certreq.csr -keystore C:/fmm/apps/apache-tomcat-6.0.53/conf/tomcat.keystore
keytool -import -alias tomcat -keystore <your_keystore_filename> -file <your_certificate_filename>

Keystore Password: Usual BladeRunner

Uncomment the "SSL HTTP/1.1 Connector" entry in $CATALINA_BASE/conf/server.xml and modify as described in the Configuration section below.
    <Connector port="8443" protocol="HTTP/1.1" SSLEnabled="true"
               maxThreads="150" scheme="https" secure="true"
               clientAuth="false" sslProtocol="TLS" />

    <Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol" SSLEnabled="true"
               maxThreads="150" scheme="https" secure="true"
			   keystoreFile="${user.home}/.keystore" keystorePass="changeit"
               clientAuth="false" sslProtocol="TLS" />

