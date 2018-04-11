1.spring
2.Logger:slf4j+log4j
3.test:jUnit
4.dao层没有添加component注解以便于spring扫描 据我判断是orm框架扫描dao层并生成相应代理放到spring容器中。
5.maven-surefire-plugin 这个插件让他跳过test去打包
6.struts2 文档中写道：First the Convention plugin finds packages named struts, struts2, action or actions.
  注意： 在使用Convention时，所有Action必须放在以struts/struts2/action/actions结尾的包路径下！
7.在启动struts2时 出现YOU USE DEPRECATED / UNKNOWN CONSTANTS 原因struts2版本太低！ 自己解决！！！！！