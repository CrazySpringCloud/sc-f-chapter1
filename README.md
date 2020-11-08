# 项目介绍
#### Spring Cloud Finchley; Spring Boot 2.0.3 
#### from https://github.com/forezp/SpringCloudLearning
#### 本项目学习资源来源于方志朋老师
#### 本项目包含 Finchley版本
##### 第一篇 第二篇 第三篇 第四篇 第五篇 第十篇


## 项目模块说明及简介：
### eureka-server  服务注册中心
### service-hi     服务提供方
### service-ribbon 服务消费方（负载均衡器）
### service-feign  服务消费方（声明式的伪HTTP客户端，默认集成了ribbon）
### service-zuul   智能路由（负责路由转发和服务过滤）


### 收获：
#### 1.要实现高可用的服务注册中心，方案之一是运行多个服务注册中心实例。通过服务器的冗余来增加可靠性。

### 记录学习中的疑问:
#### 1.nacos/consul/Eureka 的区别,技术方案上如何选择
#### 2.ribbon+restTemplate and Feign 的区别,技术方案上如何选择


# 打包时注意：
## 1.勾选skip Tests