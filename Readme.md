## 开发中的一些问题和bug ##

- **No converter found for return value of type**

> **主要原因是SpringMVC没有内置的JSON转换器**


> 1.需要引入jackson的包：jackson-bind和jackson-core

> 2.spring-mvc配置文件引入如下配置



    '<mvc:annotation-driven>  
     	<mvc:message-converters>  
    		<bean class="org.springframework.http.converter.StringHttpMessageConverter"/>  
    		<bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter"/>  
       </mvc:message-converters>
    </mvc:annotation-driven>'
> 3.返回的通用响应没有getter方法（最难发现）


- **linux ftp服务器要记得开启权限，不然无法上传成功**


- **数据库中文乱码问题**

> 在datasource.properties中配置jdbc.url时要加入userUnicode=true和characterEncoding=UTF-8.

>java.sql.SQLException: Data truncated for column 'user_type' at row 1  the type is not suit in db