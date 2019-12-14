-- ----------------------------
-- Table structure for goods_goods
-- ----------------------------
DROP TABLE IF EXISTS `goods_goods`;
CREATE TABLE `goods_goods` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_no` varchar(40) NOT NULL COMMENT '货品编码，必须唯一，可以系统生成',
  `goods_name` varchar(255) NOT NULL COMMENT '货品名称',
  `short_name` varchar(255) NOT NULL DEFAULT '' COMMENT '简称',
  `spec_count` int(11) NOT NULL DEFAULT '0' COMMENT '规格个数',
  `class_id` int(11) NOT NULL DEFAULT '0' COMMENT '分类id,0表示无分类',
  `brand_id` int(11) NOT NULL DEFAULT '0' COMMENT '品牌ID',
  `base_unit_id` smallint(6) NOT NULL DEFAULT '0' COMMENT '基本单位ID',
  `aux_unit_id` smallint(6) NOT NULL DEFAULT '0' COMMENT '辅助单位ID',
  `origin` varchar(64) NOT NULL DEFAULT '' COMMENT '产地',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`goods_id`),
  UNIQUE KEY `UK_goods_goods_no` (`goods_no`),
  KEY `FK_goods_goods_class_id` (`class_id`),
  KEY `FK_goods_goods_brand_id` (`brand_id`),
  KEY `IX_goods_goods_modified` (`modified`),
  CONSTRAINT `FK_goods_goods_brand_id` FOREIGN KEY (`brand_id`) REFERENCES `goods_brand` (`brand_id`),
  CONSTRAINT `FK_goods_goods_class_id` FOREIGN KEY (`class_id`) REFERENCES `goods_class` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='货品表';

-- ----------------------------
-- Table structure for goods_spec
-- ----------------------------
DROP TABLE IF EXISTS `goods_spec`;
CREATE TABLE `goods_spec` (
  `spec_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_id` int(11) NOT NULL,
  `spec_no` varchar(40) NOT NULL COMMENT '商家编码',
  `spec_code` varchar(40) NOT NULL COMMENT '规格码',
  `spec_name` varchar(100) NOT NULL COMMENT '规格名称',
  `retail_price` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '零售价',
  `member_price` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '会员价',
  `member_discount` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '会员折扣',
  `validity_days` smallint(6) NOT NULL DEFAULT '0' COMMENT '保质期，天数',
  `sales_days` int(11) NOT NULL DEFAULT '0' COMMENT '最佳销售天数',
  `receive_days` int(11) NOT NULL DEFAULT '0' COMMENT '最佳收货天数',
  `weight` decimal(19,4) NOT NULL DEFAULT '0.0000' COMMENT '重量',
  `length` decimal(19,4) NOT NULL DEFAULT '0.0000',
  `width` decimal(19,4) NOT NULL DEFAULT '0.0000',
  `height` decimal(19,4) NOT NULL DEFAULT '0.0000', 
  `base_unit_id` smallint(6) NOT NULL DEFAULT '0' COMMENT '基本单位ID',
  `aux_unit_id` smallint(6) NOT NULL DEFAULT '0' COMMENT '辅助单位ID',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`spec_id`),
  KEY `FK_goods_spec_goods_id` (`goods_id`),
  CONSTRAINT `FK_goods_spec_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `goods_goods` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='货品规格';

-- ----------------------------
-- Table structure for goods_brand
-- ----------------------------
DROP TABLE IF EXISTS `goods_brand`;
CREATE TABLE `goods_brand` (
  `brand_id` int(11) NOT NULL AUTO_INCREMENT,
  `brand_no` varchar(32) NOT NULL DEFAULT '' COMMENT '品牌编号',
  `brand_name` varchar(64) NOT NULL,
  `is_disabled` tinyint(4) NOT NULL DEFAULT '0' COMMENT '停用',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`brand_id`),
  UNIQUE KEY `UK_goods_brand_name` (`brand_name`),
  UNIQUE KEY `IX_goods_brand_no` (`brand_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='货品品牌';

-- ----------------------------
-- Table structure for goods_class
-- ----------------------------
DROP TABLE IF EXISTS `goods_class`;
CREATE TABLE `goods_class` (
  `class_id` int(10) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `is_leaf` tinyint(1) DEFAULT NULL,
  `class_name` varchar(64) NOT NULL,
  `path` varchar(1024) NOT NULL DEFAULT '' COMMENT '记录了从跟元素到当前元素的ID，以,分隔',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`class_id`),
  UNIQUE KEY `UK_goods_class_name` (`class_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='货品分类';

-- ----------------------------
-- Table structure for cfg_goods_unit
-- ----------------------------
DROP TABLE IF EXISTS `cfg_goods_base_unit`;
CREATE TABLE `cfg_goods_unit` (
  `rec_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '单位名称',
  `is_disabled` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否停用',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`rec_id`),
  UNIQUE KEY `UK_cfg_goods_unit` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本货品单位，库存用的单位，个，件';

-- ----------------------------
-- Table structure for cfg_goods_aux_unit
-- ----------------------------
DROP TABLE IF EXISTS `cfg_goods_aux_unit`;
CREATE TABLE `cfg_goods_aux_unit` (
  `rec_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL COMMENT '单位名称',
  `is_disabled` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否停用',
  `base_ratio` decimal(19,4) NOT NULL DEFAULT '1.0000' COMMENT '系数,即基本单位的几倍',
  `base_unit_id` smallint(6) NOT NULL COMMENT '基本单位id',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`rec_id`),
  UNIQUE KEY `UK_cfg_goods_aux_unit_name` (`name`),
  KEY `FK_cfg_goods_aux_unit_base_id` (`base_unit_id`),
  CONSTRAINT `FK_cfg_goods_aux_unit_base_id` FOREIGN KEY (`base_unit_id`) REFERENCES `cfg_goods_unit` (`rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='货品辅助单位，与基本单位，且一个倍数来表示';


-- ----------------------------
-- Table structure for sys_shop
-- ----------------------------
DROP TABLE IF EXISTS `sys_shop`;
CREATE TABLE `sys_shop` (
  `shop_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `shop_no` varchar(20) NOT NULL COMMENT '店铺编号',
  `shop_name` varchar(128) NOT NULL,
  `account_id` varchar(40) NOT NULL DEFAULT '' COMMENT '平台账号ID',
  `account_nick` varchar(128) NOT NULL DEFAULT '' COMMENT '平台帐号，比如淘宝登录帐号,nick',
  `contact` varchar(32) NOT NULL DEFAULT '' COMMENT '联系人',
  `country` smallint(6) NOT NULL DEFAULT '0',
  `province` int(11) NOT NULL,
  `city` int(11) NOT NULL,
  `district` int(11) NOT NULL,
  `address` varchar(255) NOT NULL DEFAULT '',
  `telno` varchar(40) NOT NULL DEFAULT '',
  `mobile` varchar(40) NOT NULL DEFAULT '' COMMENT '手机',
  `email` varchar(64) NOT NULL DEFAULT '',
  `remark` varchar(255) NOT NULL DEFAULT '',
  `website` varchar(1024) NOT NULL DEFAULT '' COMMENT '店铺网址',
  `prop1` varchar(255) NOT NULL DEFAULT '' COMMENT '自定义字段1',
  `prop2` varchar(255) NOT NULL DEFAULT '' COMMENT '自定义字段2',
  `is_disabled` tinyint(1) NOT NULL DEFAULT '0',
  `modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`shop_id`),
  UNIQUE KEY `UK_sys_shop_no` (`shop_no`),
  UNIQUE KEY `UK_sys_shop_name` (`shop_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='店铺表';

-- ----------------------------
-- Table structure for advert_position
-- ----------------------------
DROP TABLE IF EXISTS `advert_position`;
CREATE TABLE `advert_position` (
  `rec_id` SMALLINT(6) NOT NULL AUTO_INCREMENT,
  `img_url` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '图片URL',
  `img_link` VARCHAR(1024) NOT NULL DEFAULT '' COMMENT '图片链接，事件触发时跳转',
  `modified` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (`rec_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='广告位表';




