-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 28, 2019 at 12:56 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pmrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_added` date DEFAULT NULL,
  `s_prn` varchar(255) DEFAULT NULL,
  `s_contact` varchar(12) NOT NULL,
  `s_email` varchar(100) NOT NULL,
  `s_first_name` varchar(150) NOT NULL,
  `s_last_name` varchar(150) NOT NULL,
  `s_status` varchar(255) NOT NULL,
  `s_password` varchar(255) DEFAULT NULL,
  `s_projectid` int(11) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `UK_mvo4ur8a7ua5cc4xr9n7mdnaw` (`s_email`),
  UNIQUE KEY `UK_68o9q4grmp8ukieanuh4vaccj` (`s_prn`),
  KEY `FKe015dyx6prfl0riju1wru9vux` (`s_projectid`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`s_id`, `s_added`, `s_prn`, `s_contact`, `s_email`, `s_first_name`, `s_last_name`, `s_status`, `s_password`, `s_projectid`) VALUES
(3, '2019-07-01', 'wef', 'dfe', 'email1@mail.com', 'dsfd', 'dsf', 'INACTIVE', 'Pass12', NULL),
(4, '2019-07-01', 'y7uyi', 'kkjhk', 'email2@mail.com', '[]l.', 'ads', 'ACTIVE', 'Pass12', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
