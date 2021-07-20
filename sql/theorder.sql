SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `c_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '商品名称',
  `c_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '商品类型',
  `c_num` int(10) NOT NULL COMMENT '商品数量',
  `c_price` int(10) NOT NULL COMMENT '商品价格',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (1, '多用挂篮', '家用', 1, 123);
INSERT INTO `commodity` VALUES (2, 'R7000P', '电子设备', 1, 3220);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `o_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `o_createTime` datetime(0) NULL DEFAULT NULL,
  `o_user` int(11) NOT NULL COMMENT '下单的用户',
  `o_commodity` int(11) NOT NULL COMMENT '下单的商品',
  `o_condition` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`o_id`) USING BTREE,
  INDEX `o_user`(`o_user`) USING BTREE,
  INDEX `o_commodity`(`o_commodity`) USING BTREE,
  CONSTRAINT `o_commodity` FOREIGN KEY (`o_commodity`) REFERENCES `commodity` (`c_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `o_user` FOREIGN KEY (`o_user`) REFERENCES `user` (`u_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, '2021-07-18 23:46:20', 1, 1, '0');
INSERT INTO `order` VALUES (2, '2021-07-20 14:04:16', 1, 2, '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '用户名称',
  `u_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户手机号',
  `u_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户收货地址',
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '吕程风', '13135555404', 'gdut');

SET FOREIGN_KEY_CHECKS = 1;
