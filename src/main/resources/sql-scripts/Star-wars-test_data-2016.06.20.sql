-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.6.25-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for star-wars
CREATE DATABASE IF NOT EXISTS `star-wars` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `star-wars`;


-- Dumping structure for table star-wars.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(75) COLLATE utf8_bin NOT NULL,
  `password` char(32) COLLATE utf8_bin NOT NULL,
  `firstName` varchar(75) COLLATE utf8_bin DEFAULT NULL,
  `lastName` varchar(75) COLLATE utf8_bin DEFAULT NULL,
  `role` varchar(15) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- Dumping data for table star-wars.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `firstName`, `lastName`, `role`) VALUES
	(1, 'vicZ@mail.com', '1234', NULL, NULL, 'ROLE_OPERATOR'),
	(2, 'roman@mail.com', '1qaz', 'Roman', 'Zolotar', 'ROLE_OPERATOR'),
	(3, 'svikv84@gmail.com', 's', NULL, NULL, 'ROLE_OPERATOR'),
	(4, 'anton@mail.com', 'qw', 'Anton', 'Mykytiuk', 'ROLE_OPERATOR'),
	(5, 'manager@mail.com', '1234', NULL, NULL, 'ROLE_MANAGER');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;