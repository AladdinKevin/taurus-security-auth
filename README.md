### attention
数据库的密码，目前台式机为admin,而笔记本的则是Xukai1234!@#$
后期会统一

###SQL
```sql
demo 的 user 
CREATE TABLE `user` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
```