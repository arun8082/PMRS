-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 28, 2019 at 12:58 PM
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
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
CREATE TABLE IF NOT EXISTS `courses` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_added` date DEFAULT NULL,
  `c_name` varchar(100) DEFAULT NULL,
  `course_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_id`),
  UNIQUE KEY `UK_tgw826h05dlboeo2dus5214ro` (`c_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `courses_students_map`
--

DROP TABLE IF EXISTS `courses_students_map`;
CREATE TABLE IF NOT EXISTS `courses_students_map` (
  `course_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  KEY `FKlot1a7v471qv4n1emlbvh90eu` (`student_id`),
  KEY `FKf1u32ylab4mgntvbby8xevqdp` (`course_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course_admins`
--

DROP TABLE IF EXISTS `course_admins`;
CREATE TABLE IF NOT EXISTS `course_admins` (
  `ca_id` int(11) NOT NULL AUTO_INCREMENT,
  `ca_added` date DEFAULT NULL,
  `ca_contact` varchar(255) DEFAULT NULL,
  `ca_email` varchar(255) DEFAULT NULL,
  `ca_first_name` varchar(255) DEFAULT NULL,
  `ca_last_name` varchar(255) DEFAULT NULL,
  `ca_status` varchar(255) DEFAULT NULL,
  `ca_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ca_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_admins`
--

INSERT INTO `course_admins` (`ca_id`, `ca_added`, `ca_contact`, `ca_email`, `ca_first_name`, `ca_last_name`, `ca_status`, `ca_password`) VALUES
(1, NULL, '98887', 'email1@mail.com', 'fname1', 'lname1', 'INACTIVE', 'Pass12'),
(2, '2019-07-27', '98887', 'email2@mail.com', 'fname2', 'lname2', 'ACTIVE', 'Pass12');

-- --------------------------------------------------------

--
-- Table structure for table `course_admins_courses_map`
--

DROP TABLE IF EXISTS `course_admins_courses_map`;
CREATE TABLE IF NOT EXISTS `course_admins_courses_map` (
  `course_id` int(11) NOT NULL,
  `course_admin_id` int(11) NOT NULL,
  KEY `FKtrtp3lmqpgu7erh0toyewyx5i` (`course_admin_id`),
  KEY `FKe9v953t40vr3vije6ekrxylsu` (`course_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mentors`
--

DROP TABLE IF EXISTS `mentors`;
CREATE TABLE IF NOT EXISTS `mentors` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_added` date DEFAULT NULL,
  `m_contact` varchar(255) DEFAULT NULL,
  `m_email` varchar(255) DEFAULT NULL,
  `m_first_name` varchar(255) DEFAULT NULL,
  `m_last_name` varchar(255) DEFAULT NULL,
  `m_status` varchar(255) DEFAULT NULL,
  `m_password` varchar(255) DEFAULT NULL,
  `course_id_c_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `FKj1wprcmua0qaa3699a0anv5e1` (`course_id_c_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `phases`
--

DROP TABLE IF EXISTS `phases`;
CREATE TABLE IF NOT EXISTS `phases` (
  `ph_id` int(11) NOT NULL AUTO_INCREMENT,
  `ph_added` date DEFAULT NULL,
  `ph_name` varchar(255) DEFAULT NULL,
  `ph_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ph_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `projects`
--

DROP TABLE IF EXISTS `projects`;
CREATE TABLE IF NOT EXISTS `projects` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_created` date DEFAULT NULL,
  `p_description` varchar(255) NOT NULL,
  `p_duration` date DEFAULT NULL,
  `p_hwrequirement` varchar(255) NOT NULL,
  `p_platform` varchar(255) NOT NULL,
  `p_swrequirement` varchar(255) NOT NULL,
  `p_technology` varchar(255) NOT NULL,
  `p_title` varchar(255) NOT NULL,
  `p_mentor` int(11) DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  UNIQUE KEY `UK_gmhx9xiniu3xweftqbhntafmv` (`p_title`),
  KEY `FKs51834p592hfn38jqyc0je5lo` (`p_mentor`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `projects`
--

INSERT INTO `projects` (`p_id`, `p_created`, `p_description`, `p_duration`, `p_hwrequirement`, `p_platform`, `p_swrequirement`, `p_technology`, `p_title`, `p_mentor`) VALUES
(1, '2019-07-26', 'desc 1', '1970-01-13', 'hw 1', 'plat 1', 'sw 1', 'tech 1', 'title 1', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `project_phases`
--

DROP TABLE IF EXISTS `project_phases`;
CREATE TABLE IF NOT EXISTS `project_phases` (
  `pph_id` int(11) NOT NULL AUTO_INCREMENT,
  `pph_document_path` varchar(255) DEFAULT NULL,
  `pph_end` datetime DEFAULT NULL,
  `pph_start` datetime DEFAULT NULL,
  `pph_status` varchar(255) NOT NULL,
  `phase_id` int(11) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `project_projectphase_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pph_id`),
  KEY `FK2d8v6omfswgbu56kwkf5cccay` (`phase_id`),
  KEY `FKaete97c6firfe27ai9aaddvd` (`project_id`),
  KEY `FK7otbvs1fxp547qk9ltb209jp2` (`project_projectphase_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
