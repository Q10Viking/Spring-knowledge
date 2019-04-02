# Spring-knowledge

> learning spring


1. 在visual studio code中启动spring boot项目[Creating a Hello World Spring Boot App using VS Code](https://medium.com/programming-is-hard/creating-a-hello-world-spring-boot-app-using-vs-code-f59b1e2e95d)

    > [项目链接](./letsgo/)

2. control层与view层接触
    1. 数据domain,控制类
    2. 数据绑定: 在springmvc返回view时，在model中创建一个对象，然后再html中使用模板如thymeleaf，将数据绑定
        2.1 同时表单也会从对象中取数据
    3. 校验错误: 在domain设置条件-->control中判断是否有错--> 显示（使用了thymeleaf模板的if判断属性）
    > [项目链接](./ch02/)



**插件**

[	
Lombok Annotations Support for VS Code](https://marketplace.visualstudio.com/items?itemName=GabrielBB.vscode-lombok)