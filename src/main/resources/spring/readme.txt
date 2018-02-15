在公司里面，spring-mvc的开发绝大多都用注解式开发，配置式开发已经out了。

但是对于低版本的jre，仍然采用注解式开发。

配置式开发与注解式开发的区别：
    配置式开发在Controller类中没有@RequestMapping(value = "/test")这一类
    的注释，而是将其放在springmvc-servlet.xml文件中，加上一个<bean>标签
