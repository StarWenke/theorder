/*
 Navicat Premium Data Transfer

 Source Server         : Makonike
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3306
 Source Schema         : theorder

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 23/07/2021 00:51:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `c_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '商品名称',
  `c_type` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '商品类型',
  `c_num` int(10) NOT NULL COMMENT '商品数量',
  `c_price` decimal(10, 2) NOT NULL COMMENT '商品单价',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (1, 'R7000P', '电子产品', 1, 7000.00);
INSERT INTO `commodity` VALUES (2, '多用挂篮', '生活用品', 2, 25.00);
INSERT INTO `commodity` VALUES (3, '数据结构', '书籍', 1, 30.00);
INSERT INTO `commodity` VALUES (4, '新华字典', '书籍', 1, 35.00);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `o_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `o_no` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `u_id` int(11) NULL DEFAULT NULL,
  `c_id` int(11) NULL DEFAULT NULL,
  `total_amount` decimal(10, 2) NOT NULL COMMENT '订单总金额',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `status` tinyint(3) NOT NULL DEFAULT 0 COMMENT '订单状态',
  PRIMARY KEY (`o_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, '202122220011', 1, 1, 7000.00, '2021-07-23 00:13:05', '2021-07-23 00:14:14', 0);
INSERT INTO `order` VALUES (2, '202122220012', 1, 2, 50.00, '2021-07-23 00:16:03', '2021-07-23 00:16:10', 0);
INSERT INTO `order` VALUES (3, '202122220013', 2, 3, 30.00, '2021-07-23 00:18:54', '2021-07-23 00:19:00', 0);
INSERT INTO `order` VALUES (4, '202122220014', 2, 4, 35.00, '2021-07-23 00:19:16', '2021-07-23 00:19:16', 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `u_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '无' COMMENT '用户名称',
  `u_phone` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户手机号',
  `u_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户收货地址',
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '吕程风', '13135555404', 'gdut');
INSERT INTO `user` VALUES (2, '王明明', '13595555589', 'gdut');

SET FOREIGN_KEY_CHECKS = 1;
