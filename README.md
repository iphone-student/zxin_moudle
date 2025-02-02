#### zxin系统管理平台

为了项目的长远发展，以后会在gitee里面进行更新维护，感谢支持！ :smiley: 

<br>

**项目说明** 

- zxin_moudle是一个轻量级的，前后端分离的Java快速开发平台，能快速开发项目并交付【接私活利器】
- 支持MySQL数据库
- 前端地址：https://gitee.com/renrenio/renren-fast-vue
- 后端地址：
- 小程序地址：
- 代码生成器：https://gitee.com/renrenio/renren-generator

<br>

**技术选型：** 

- 核心框架：Spring Cloud 、Spring Boot 2.1

- 安全框架：Apache Shiro 1.4

- 持久层框架：MyBatis 3.3

- 定时器：Quartz 2.3

- 数据库连接池：Druid 1.0

- 日志管理：SLF4J 1.7、Log4j

- 页面交互：Vue2.x 

- 文件服务器：minio

- 配置中心：nacos

  <br>

**具有如下特点** 

- 友好的代码结构及注释，便于阅读及二次开发
- 实现前后端分离，通过token进行数据交互，前端再也不用关注后端技术
- 灵活的权限控制，可控制到页面或按钮，满足绝大部分的权限需求
- 页面交互使用Vue2.x，极大的提高了开发效率
- 引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
- 引入API模板，根据token作为登录令牌，极大的方便了APP接口开发
- 引入Hibernate Validator校验框架，轻松实现后端校验
- 引入云存储服务，已支持：七牛云、阿里云、腾讯云等
- 引入swagger文档支持，方便编写API接口文档
<br> 

**项目结构** 
```
zxin_moudle
├─db  项目SQL语句
│
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─RenrenApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件

```
<br>


 **后端部署**
- 通过git下载源码
- idea、eclipse需安装lombok插件，不然会提示找不到entity的get set方法
- 创建数据库renren_fast，数据库编码为UTF-8
- 执行db/mysql.sql文件，初始化数据
- 修改application-dev.yml，更新MySQL账号和密码
- Eclipse、IDEA运行RenrenApplication.java，则可启动项目
- Swagger文档路径：http://localhost:8080/renren-fast/swagger/index.html
- Swagger注解路径：http://localhost:8080/renren-fast/swagger-ui.html

<br> 

 **前端部署**
 - 本项目是前后端分离的，还需要部署前端，才能运行起来
 - 前端下载地址：https://gitee.com/renrenio/renren-fast-vue
 - 前端部署文档：https://gitee.com/renrenio/renren-fast-vue/wikis/Home
 - 前端部署完毕，就可以访问项目了，账号：admin，密码：admin

 <br>

 **项目演示**
- 演示地址：http://demo.open.renren.io/renren-fast
- 账号密码：admin/admin
<br> 

**接口文档效果图：**
![输入图片说明](https://images.gitee.com/uploads/images/2018/0728/145341_73ba6f75_63154.jpeg "在这里输入图片标题")

<br> <br> <br> 


**效果图：**
![输入图片说明](https://gitee.com/uploads/images/2018/0505/173115_d3c045ef_63154.jpeg "在这里输入图片标题")
![输入图片说明](https://gitee.com/uploads/images/2018/0624/225728_b06f72b3_63154.jpeg "在这里输入图片标题")
![输入图片说明](https://gitee.com/uploads/images/2018/0505/173140_79928d91_63154.jpeg "在这里输入图片标题")
![输入图片说明](https://gitee.com/uploads/images/2018/0505/173151_12d065db_63154.jpeg "在这里输入图片标题")

<br>