CREATE DATABASE theorder3;

CREATE TABLE `commodity`(
                            `c_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
                            `c_name` VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '商品名称',
                            `c_type` VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '商品类型',
                            `c_price` INT(10) NOT NULL COMMENT '商品价格',
                            `c_num` INT(10) NOT NULL COMMENT '商品数量',
                            PRIMARY KEY (`c_id`) USING BTREE
)ENGINE = INNODB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;
INSERT INTO `commodity` VALUES (1, '多用挂篮', '家用', 123, 1,1,1);
INSERT INTO `commodity` VALUES (2, 'R7000P', '电子设备', 3220, 1,1,1);


CREATE TABLE `order`(
                        `o_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
                        `o_status` TINYINT(3) NOT NULL DEFAULT 0 COMMENT '订单状态',
                        `o_snumber` VARCHAR(20) NOT NULL COMMENT '订单编号',
                        `o_sum` VARCHAR(20) NOT NULL DEFAULT '0' COMMENT '订单总金额',
                        `o_createtime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `o_updatetime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                        PRIMARY KEY (`o_id`) USING BTREE
)ENGINE = INNODB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

INSERT INTO `order` VALUES (1, 01, 1, '2021-07-18 23:46:20',123, '2021-07-18 23:46:20');
INSERT INTO `order` VALUES (2, 02, 2, '2021-07-20 14:04:16',3220,'2021-07-20 14:04:16');

CREATE TABLE `user`(
                       `u_id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
                       `u_name` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '用户名称',
                       `u_phone` VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户手机号',
                       `u_address` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户收货地址',
                       PRIMARY KEY (`u_id`) USING BTREE
)ENGINE = INNODB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

INSERT INTO `user` VALUES (2, '吕程风', '13135555404', 'gdut');

BEGIN;
ALTER TABLE `order` ADD `c_id` INT(11);
ALTER TABLE `order` ADD `u_id` INT(11);
COMMIT; 