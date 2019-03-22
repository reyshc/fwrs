SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for movie_viewing_record
-- ----------------------------
DROP TABLE IF EXISTS `movie_viewing_record`;
CREATE TABLE `movie_viewing_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '片名',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `Image` varchar(512) DEFAULT NULL COMMENT '图片路径',
  `mark` varchar(512) DEFAULT NULL COMMENT '备注',
  `actor` varchar(512) NOT NULL COMMENT '主演',
  `path` varchar(1024) NOT NULL COMMENT '电影存放路径',
  `viewing_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '观看时间',
  `movie_type` varchar(20) NOT NULL DEFAULT '' COMMENT '电影类型（科幻、玄幻、动作、战争、爱情、惊悚、悬疑、动漫、校园、历史）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of movie_viewing_record
-- ----------------------------
INSERT INTO `movie_viewing_record` VALUES ('126', '天龙八部', '', null, null, '周星驰', '\\\\123\\1\\23', null, '');
INSERT INTO `movie_viewing_record` VALUES ('127', '泰囧', '', null, null, '王宝强', '\\\\123\\12\\31\\23', null, '');
INSERT INTO `movie_viewing_record` VALUES ('128', '黄金甲', '', null, null, '周杰伦', '\\\\123\\123\\12\\', null, '');
