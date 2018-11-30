由于种种原因已弃用

## :pushpin: 简介
>> 这是一个模仿博客园的博客平台，主要是为前端学习者作为练手素材，或则对于有前端经验想自行搭建设计博客页面的开发者使用
## :bulb: 背景
>> 本人以前在组内学习前端时，练手项目大多使用网上像“天气预报”等接口进行，但却遇到较多困难。比如跨域问题: 大多API都采用是json格式，但要想解决跨域问题最简单的却要用jsonp格式。本人当时找了好多方法，大多都要改后台代码，这对于前端开发者是很不友好的。于是在本人成为学长后，为避免学弟学妹遇到像我一样的问题，决定开发一友好交互的后台提供给学习前端的学弟学妹使用
## :label: 项目介绍
>> 本系统采用SpringMVC + Spring + Mybatis 进行开发<br>
>> 使用Shiro进行权限管理<br>
>> 使用solr进行搜索<br>
>> 使用EasyUI编写后台主页面<br>
>> 使用百度ueditor编辑博客<br>
>> 前台页面又前端开发者自行设计[前端接口文档]()<br>
## :lock: 代码规范
>> 此处省略，可参考《阿里巴巴Java开发手册》
## :wrench: 使用
### 1:安装MYSQL数据库及客户端
>> 详细步骤可参考[JAVA开发环境搭建](https://www.cnblogs.com/nullering/p/9366313.html) 第五条<br>
### 2:导入Sql
>> 下载doc文件夹下的  db_blog.sql 文件 ,打开MYSQL客户端，导入该文件，如图所示操作<br>
![importSQLFile](https://github.com/3218870799/Blog/blob/master/doc/img/importSQl.png)
### 3:下载配置Tomact
>> 详细步骤可参考[Java开发环境搭建](https://www.cnblogs.com/nullering/p/9366313.html) 第二条
### 4:启动项目：
##### 方案一：
>>>> 将War包放入Tomact的[D:\Tomact\apache-tomcat-8.0.53\webapps]下
>>>> 点击[D:\Tomact\apache-tomcat-8.0.53\bin\startup.sh]文件
>>>> 打开浏览器输入url路径即可

	
	