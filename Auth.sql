/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 5.7.21 : Database - zhiren
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zhiren` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `zhiren`;

/*Table structure for table `AuthClient` */

DROP TABLE IF EXISTS `AuthClient`;

CREATE TABLE `AuthClient` (
  `ClientId` varchar(36) NOT NULL,
  `ResourceIds` varchar(200) DEFAULT NULL,
  `SecretRequired` tinyint(1) DEFAULT NULL,
  `ClientSecret` varchar(100) NOT NULL,
  `Scoped` tinyint(1) DEFAULT NULL,
  `Scope` varchar(200) NOT NULL,
  `AuthorizedGrantTypes` varchar(200) NOT NULL,
  `RegisteredRedirectUri` varchar(200) DEFAULT NULL,
  `AccessTokenValiditySeconds` int(11) DEFAULT NULL,
  `RefreshTokenValiditySeconds` int(11) DEFAULT NULL,
  `AutoApprove` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ClientId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthClient` */

/*Table structure for table `AuthClientRoleRelationship` */

DROP TABLE IF EXISTS `AuthClientRoleRelationship`;

CREATE TABLE `AuthClientRoleRelationship` (
  `ClientRoleId` varchar(36) NOT NULL,
  `ClientId` varchar(36) NOT NULL,
  `RoleId` varchar(36) NOT NULL,
  PRIMARY KEY (`ClientRoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthClientRoleRelationship` */

/*Table structure for table `AuthGroup` */

DROP TABLE IF EXISTS `AuthGroup`;

CREATE TABLE `AuthGroup` (
  `GroupId` varchar(36) NOT NULL,
  `ParentGroupId` varchar(36) NOT NULL,
  `GroupName` varchar(100) NOT NULL,
  PRIMARY KEY (`GroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthGroup` */

/*Table structure for table `AuthGroupClientRelationship` */

DROP TABLE IF EXISTS `AuthGroupClientRelationship`;

CREATE TABLE `AuthGroupClientRelationship` (
  `GroupClientId` varchar(36) NOT NULL,
  `ClientId` varchar(36) NOT NULL,
  `GroupId` varchar(36) NOT NULL,
  PRIMARY KEY (`GroupClientId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthGroupClientRelationship` */

/*Table structure for table `AuthGroupRoleRelationship` */

DROP TABLE IF EXISTS `AuthGroupRoleRelationship`;

CREATE TABLE `AuthGroupRoleRelationship` (
  `GroupRoleId` varchar(36) NOT NULL,
  `GroupId` varchar(36) NOT NULL,
  `RoleId` varchar(36) NOT NULL,
  PRIMARY KEY (`GroupRoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthGroupRoleRelationship` */

/*Table structure for table `AuthGroupUserRelationship` */

DROP TABLE IF EXISTS `AuthGroupUserRelationship`;

CREATE TABLE `AuthGroupUserRelationship` (
  `GroupUserId` varchar(36) NOT NULL,
  `GroupId` varchar(36) NOT NULL,
  `UserId` varchar(36) NOT NULL,
  PRIMARY KEY (`GroupUserId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthGroupUserRelationship` */

/*Table structure for table `AuthOperation` */

DROP TABLE IF EXISTS `AuthOperation`;

CREATE TABLE `AuthOperation` (
  `OperationId` varchar(36) NOT NULL,
  `OperationName` varchar(50) NOT NULL,
  `OperationCode` varchar(50) NOT NULL,
  `ParentOperationId` varchar(36) NOT NULL,
  `InterceptURL` varchar(100) NOT NULL,
  PRIMARY KEY (`OperationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthOperation` */

/*Table structure for table `AuthPermission` */

DROP TABLE IF EXISTS `AuthPermission`;

CREATE TABLE `AuthPermission` (
  `PermissionId` varchar(36) NOT NULL,
  `PermissionType` int(11) NOT NULL,
  PRIMARY KEY (`PermissionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthPermission` */

/*Table structure for table `AuthPermissionMenuRelationship` */

DROP TABLE IF EXISTS `AuthPermissionMenuRelationship`;

CREATE TABLE `AuthPermissionMenuRelationship` (
  `PermissionMenuId` varchar(36) NOT NULL,
  `MenuId` varchar(36) NOT NULL,
  `PermissionId` varchar(36) NOT NULL,
  PRIMARY KEY (`PermissionMenuId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthPermissionMenuRelationship` */

/*Table structure for table `AuthPermissionOperationRelationship` */

DROP TABLE IF EXISTS `AuthPermissionOperationRelationship`;

CREATE TABLE `AuthPermissionOperationRelationship` (
  `PermissionOperation` varchar(36) NOT NULL,
  `PermissionId` varchar(36) NOT NULL,
  `OperationId` varchar(36) NOT NULL,
  PRIMARY KEY (`PermissionOperation`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthPermissionOperationRelationship` */

/*Table structure for table `AuthPermissionPageElementRelationship` */

DROP TABLE IF EXISTS `AuthPermissionPageElementRelationship`;

CREATE TABLE `AuthPermissionPageElementRelationship` (
  `PermissionPageElementId` varchar(36) NOT NULL,
  `PermissionId` varchar(36) NOT NULL,
  `PageElementId` varchar(36) NOT NULL,
  PRIMARY KEY (`PermissionPageElementId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthPermissionPageElementRelationship` */

/*Table structure for table `AuthResourceAPI` */

DROP TABLE IF EXISTS `AuthResourceAPI`;

CREATE TABLE `AuthResourceAPI` (
  `APIId` varchar(36) NOT NULL,
  `APIName` varchar(50) NOT NULL,
  `APIURL` varchar(100) NOT NULL,
  `IsEnabled` int(1) NOT NULL DEFAULT '0',
  `APIAuth` varchar(100) NOT NULL,
  PRIMARY KEY (`APIId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthResourceAPI` */

/*Table structure for table `AuthResourceMenu` */

DROP TABLE IF EXISTS `AuthResourceMenu`;

CREATE TABLE `AuthResourceMenu` (
  `MenuId` varchar(36) NOT NULL,
  `ParentMenuId` varchar(36) NOT NULL,
  `MenuName` varchar(100) NOT NULL,
  `MenuURL` varchar(100) NOT NULL,
  `IsEnabled` int(1) NOT NULL DEFAULT '0',
  `ClientType` int(1) NOT NULL DEFAULT '0',
  `OrderNo` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`MenuId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthResourceMenu` */

/*Table structure for table `AuthResourcePageElement` */

DROP TABLE IF EXISTS `AuthResourcePageElement`;

CREATE TABLE `AuthResourcePageElement` (
  `PageElement` varchar(36) NOT NULL,
  `ElementCode` varchar(100) NOT NULL,
  `ElementName` varchar(100) NOT NULL,
  PRIMARY KEY (`PageElement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthResourcePageElement` */

/*Table structure for table `AuthRole` */

DROP TABLE IF EXISTS `AuthRole`;

CREATE TABLE `AuthRole` (
  `RoleId` varchar(36) NOT NULL,
  `RoleCode` varchar(100) NOT NULL,
  `RoleName` varchar(100) NOT NULL,
  `IsEnabled` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`RoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthRole` */

/*Table structure for table `AuthRolePermissionRelationship` */

DROP TABLE IF EXISTS `AuthRolePermissionRelationship`;

CREATE TABLE `AuthRolePermissionRelationship` (
  `RolePermissionId` varchar(36) NOT NULL,
  `RoleId` varchar(36) NOT NULL,
  `Permission` varchar(36) NOT NULL,
  PRIMARY KEY (`RolePermissionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthRolePermissionRelationship` */

/*Table structure for table `AuthUser` */

DROP TABLE IF EXISTS `AuthUser`;

CREATE TABLE `AuthUser` (
  `UserId` varchar(36) NOT NULL,
  `Username` varchar(36) NOT NULL,
  `Displayname` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `AccountNonExpired` tinyint(1) NOT NULL,
  `AccountNonLocked` tinyint(1) NOT NULL,
  `CredentialsNonExpired` tinyint(1) NOT NULL,
  `IsEnabled` tinyint(1) NOT NULL DEFAULT '0',
  `Createtime` date NOT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Phone` varchar(30) DEFAULT NULL,
  `Sex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthUser` */

/*Table structure for table `AuthUserRoleRelationship` */

DROP TABLE IF EXISTS `AuthUserRoleRelationship`;

CREATE TABLE `AuthUserRoleRelationship` (
  `RoleUserId` varchar(36) NOT NULL,
  `RoleId` varchar(36) NOT NULL,
  `UserId` varchar(36) NOT NULL,
  PRIMARY KEY (`RoleUserId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `AuthUserRoleRelationship` */

/*Table structure for table `Demo` */

DROP TABLE IF EXISTS `Demo`;

CREATE TABLE `Demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=916 DEFAULT CHARSET=latin1;

/*Data for the table `Demo` */

insert  into `Demo`(`id`,`code`,`name`) values 
(2,'13','222'),
(3,'213','222'),
(915,'string1','string2');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
