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

