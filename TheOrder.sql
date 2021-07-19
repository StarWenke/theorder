CREATE DATABASE theorder1;

CREATE TABLE `commodity`(
`c_id` INT(4) NOT NULL AUTO_INCREMENT COMMENT '商品id',
`c_name` VARCHAR(20) NOT NULL DEFAULT '无' COMMENT '商品名称',
`c_type` VARCHAR(20) NOT NULL DEFAULT '无' COMMENT '商品类型',
`c_num` INT(10) NOT NULL COMMENT '商品数量',
`c_price` INT(10) NOT NULL COMMENT '商品价格',
PRIMARY KEY (`c_id`)
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `user`(
`u_id` INT (4) NOT NULL AUTO_INCREMENT COMMENT '用户id',
`u_name` VARCHAR(20) NOT NULL DEFAULT '无' COMMENT '用户名称',
`u_phone` INT (10) NOT NULL COMMENT '用户手机号',
`u_address` VARCHAR(20) NOT NULL COMMENT '用户收货地址',
PRIMARY KEY (`u_id`)
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `order`(
`o_id` INT (4) NOT NULL AUTO_INCREMENT COMMENT '订单id',
`o_time` DATETIME DEFAULT NULL COMMENT '订单下单时间',
`o_user` INT (4) NOT NULL COMMENT '下单的用户',
`o_commodity` INT(4) NOT NULL COMMENT '下单的商品',
`o_condition` VARCHAR(20) NOT NULL COMMENT '订单状态',
PRIMARY KEY (`o_id`)
)ENGINE = INNODB DEFAULT CHARSET = utf8;
ALTER TABLE `order`
ADD CONSTRAINT `o_user` FOREIGN KEY (`o_user`) 
REFERENCES `user` (`u_id`);
ALTER TABLE `order`
ADD CONSTRAINT `o_commodity` FOREIGN KEY (`o_commodity`) 
REFERENCES `commodity` (`c_id`);

ALTER TABLE `order` CHANGE `o_time` `o_createTime` DATETIME;

INSERT INTO `commodity`
(`c_id`,`c_name`,`c_type`,`c_num`,`c_price`)
VALUES
(0001,'笔记本电脑','数码',2,10000),
(0002,'电视机','数码',1,2000);

INSERT INTO `user`
(`u_id`,`u_name`,`u_phone`,`u_address`)
VALUES
(001,'张飞',10086,'山东菏泽'),
(002,'刘备',12305,'山东青岛');

INSERT INTO `order`
(`o_id`,`o_createTime`,`o_user`,`o_commodity`,`o_condition`)
VALUES
(01,'2020-09-12',001,0001,'取消订单'),
(02,'2021-07-19',002,0002,'正在捡货');