1.configure dispatcher servlet in web.xml
2.To configure it we need to have spring web mvc dependency
3.By addding this we included so many jars/dependencies i.e spring-aop,spring-beans,spring-context,spring-core,spring-web...
4.when we have written servletname and servlet class in web.xml,
 <servlet-class>org.springframework.web.servlet.org.springframework.web.servlet.DispatcherServlet</servlet-class> This line creates empty container(application context)
 Then after it looks for that particular file named configuration file(my-project-dispatcher) to create beans.
5.so out next step is to create the conf file named my-project-dispatcher.xml
6.Then we need to give component scan so when it triggers @Controller,@Service it creates beans for those particular classes

Note: dont forget to give -servlet to the configuration file because When no contextConfigLocation is specified, DispatcherServlet automatically searches for -servlet.xml extension
        or
tell spring explicitly by mentioning contextConfigLocation
<servlet>
    <servlet-name>myprojectdispatcher</servlet-name>

    <servlet-class>
        org.springframework.web.servlet.DispatcherServlet
    </servlet-class>

    <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/myprojectdispatcher.xml</param-value>
    </init-param>
</servlet>

search for spring mvc configuration xml->enable mvc configuration->select xml based->copy paste in my-pro-disp.xml