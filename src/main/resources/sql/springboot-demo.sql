/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50132
Source Host           : localhost:3306
Source Database       : springboot-demo

Target Server Type    : MYSQL
Target Server Version : 50132
File Encoding         : 65001

Date: 2019-04-06 15:58:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `uid` char(32) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('356307645cbc4e82a6280770b03aaca3', '222', '222');
INSERT INTO `tbl_user` VALUES ('A6043E4CB32A40698F64449655D2EFB2', 'demoName', 'demoPassword');
