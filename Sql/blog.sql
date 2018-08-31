/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-31 13:20:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for b_blog
-- ----------------------------
DROP TABLE IF EXISTS `b_blog`;
CREATE TABLE `b_blog` (
  `b_diary_id` varchar(255) NOT NULL,
  `b_diary_title` varchar(255) NOT NULL,
  `b_diary_body` varchar(255) NOT NULL,
  `b_diary_show_body` longtext NOT NULL,
  `b_diary_create_time` varchar(255) NOT NULL,
  `b_diary_update_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`b_diary_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of b_blog
-- ----------------------------
INSERT INTO `b_blog` VALUES ('2404119bad9c4a11abd8e46ffefad9dd', '好看的标题', '## 好看的文字', '<div class=\"markdown-body editormd-preview-container\" previewcontainer=\"true\" style=\"padding: 20px;\"><h2 id=\"h2-u597Du770Bu7684u6587u5B57\"><a name=\"好看的文字\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>好看的文字</h2></div>', '2018-08-30', '2018-08-31');
INSERT INTO `b_blog` VALUES ('2d7ff5d756e548e8adbfeca42c6817de', '啥啊', '# nn', '<div class=\"markdown-body editormd-preview-container\" previewcontainer=\"true\" style=\"padding: 20px;\"><h1 id=\"h1-nn\"><a name=\"nn\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>nn</h1></div>', '2018-08-31', '2018-08-31');
INSERT INTO `b_blog` VALUES ('8d59c2f93c6c4a2592ef65397ae4abab', '这个标题怎么样', '# 123\n456', '<div class=\"markdown-body editormd-preview-container\" previewcontainer=\"true\" style=\"padding: 20px;\"><h1 id=\"h1-123\"><a name=\"123\" class=\"reference-link\"></a><span class=\"header-link octicon octicon-link\"></span>123</h1><p>456</p>\n</div>', '2018-08-31', '2018-08-31');

-- ----------------------------
-- Table structure for b_user
-- ----------------------------
DROP TABLE IF EXISTS `b_user`;
CREATE TABLE `b_user` (
  `b_user_id` varchar(255) NOT NULL,
  `b_user_name` varchar(255) NOT NULL,
  `b_user_password` varchar(255) NOT NULL,
  PRIMARY KEY (`b_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of b_user
-- ----------------------------
INSERT INTO `b_user` VALUES ('09182d917ef34eda9ee247cda3869892', 'demo', '123456');
INSERT INTO `b_user` VALUES ('238d0a8d8b134eff847c322216959d68', 'demo02', '123456');
INSERT INTO `b_user` VALUES ('75c0d9d3506146c9b53d141ab57ecbd6', 'demo03', '123456');
SET FOREIGN_KEY_CHECKS=1;
