-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 29, 2019 at 06:48 AM
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
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`c_id`, `c_added`, `c_name`, `course_status`) VALUES
(1, '2019-07-23', 'DAC', 'ACTIVE'),
(2, '2019-07-16', 'DITISS', 'ACTIVE'),
(3, '2019-02-19', 'DESD', 'ACTIVE'),
(4, '2019-06-21', 'VLSI', 'ACTIVE'),
(5, '2019-05-15', 'DBDA', 'ACTIVE');

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

--
-- Dumping data for table `courses_students_map`
--

INSERT INTO `courses_students_map` (`course_id`, `student_id`) VALUES
(1, 5),
(2, 4),
(3, 3),
(4, 2),
(5, 1);

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
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course_admins`
--

INSERT INTO `course_admins` (`ca_id`, `ca_added`, `ca_contact`, `ca_email`, `ca_first_name`, `ca_last_name`, `ca_status`, `ca_password`) VALUES
(1, '2019-07-22', '789184693', 'ashutoshvaish6397@gmail.com', 'Ashutosh', 'Vaish', 'INACTIVE', NULL),
(2, '2019-07-22', '789184693', 'swati@gmail.com', 'Swati', 'Swalukhe', 'INACTIVE', NULL),
(3, '2019-06-05', '9829557085', 'pandey@gmail.com', 'Sushil', 'Pandey', 'ACTIVE', NULL),
(4, '2019-03-05', '9460939666', 'actscdac@gmail.com', 'Shashwat', 'Singh', 'ACTIVE', NULL),
(5, '2019-04-18', '9414257080', 'shipraagr@gmail.com', 'Shipra', 'Agrawal', 'ACTIVE', NULL);

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

--
-- Dumping data for table `course_admins_courses_map`
--

INSERT INTO `course_admins_courses_map` (`course_id`, `course_admin_id`) VALUES
(1, 5),
(2, 4),
(3, 3),
(4, 2),
(5, 1);

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
  `course_id_c_id` int(11) DEFAULT NULL,
  `m_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `FKj1wprcmua0qaa3699a0anv5e1` (`course_id_c_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mentors`
--

INSERT INTO `mentors` (`m_id`, `m_added`, `m_contact`, `m_email`, `m_first_name`, `m_last_name`, `m_status`, `course_id_c_id`, `m_password`) VALUES
(1, '2019-06-04', '8233333191', 'mentoracts@gmail.com', 'Jitesh', 'Bafna', 'ACTIVE', 1, 'dac'),
(2, '2019-07-02', '07442406553', 'negirox@gmail.com', 'Mukesh', 'Negi', 'ACTIVE', 2, 'dac'),
(3, '2019-02-06', '7443295838', 'shrinivas@gmail.com', 'Doppa', 'Shrinivas', 'ACTIVE', 3, 'dac'),
(4, '2019-02-05', '7877298666', 'prfulkholte@gmail.com', 'Praful', 'Kholte', 'INACTIVE', 4, 'dac'),
(5, '2019-04-10', '9414552782', 'sanjay@gmail.com', 'Sanjay', 'Jain', 'ACTIVE', 5, 'dac');

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
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phases`
--

INSERT INTO `phases` (`ph_id`, `ph_added`, `ph_name`, `ph_status`) VALUES
(1, '2019-07-02', 'ONHOLD', 'ACTIVE'),
(2, '2019-07-10', 'ONHOLD', 'INACTIVE'),
(3, '2019-07-16', 'VERIFIED', 'ACTIVE'),
(4, '2019-07-14', 'VERIFIED', 'INACTIVE');

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
  KEY `FKs51834p592hfn38jqyc0je5lo` (`p_mentor`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `projects`
--

INSERT INTO `projects` (`p_id`, `p_created`, `p_description`, `p_duration`, `p_hwrequirement`, `p_platform`, `p_swrequirement`, `p_technology`, `p_title`, `p_mentor`) VALUES
(1, '2019-07-02', '', '2019-07-10', 'i5_16gb_ RAM', 'WINDOWS', 'STS', 'JAVA', 'PMRS', 1),
(2, '2019-07-04', '', '2019-07-02', 'i5_16gb_RAM', 'LINUX', 'WAMP', 'PHP', 'Plagiarism', 2),
(3, '2019-07-22', '', '2019-07-17', 'i5_16gb_RAM', 'IOS', 'VISUAL STUDIO CODE', 'ANGULAR JS', 'Hostel Management', 5),
(4, '2019-07-03', '', '2019-07-09', 'i5_16gb_RAM', 'WINDOWS', 'VISUAL STUDIO 2015', '.NET', 'Online Railway Tracking', 3),
(5, '2019-07-04', '', '2019-07-09', 'i5_16gb_RAM', 'LINUX', '', 'PYTHON', 'Online Medical Store', 4);

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
  `phase_id` int(11) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `project_projectphase_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`pph_id`),
  KEY `FK2d8v6omfswgbu56kwkf5cccay` (`phase_id`),
  KEY `FKaete97c6firfe27ai9aaddvd` (`project_id`),
  KEY `FK7otbvs1fxp547qk9ltb209jp2` (`project_projectphase_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `project_phases`
--

INSERT INTO `project_phases` (`pph_id`, `pph_document_path`, `pph_end`, `pph_start`, `phase_id`, `project_id`, `project_projectphase_id`) VALUES
(1, NULL, '2019-07-31 00:00:00', '2019-07-01 00:00:00', 1, 1, NULL),
(2, NULL, '2019-07-01 00:00:00', '2019-07-31 00:00:00', 2, 2, NULL),
(3, NULL, '2019-07-31 00:00:00', '2019-07-01 00:00:00', 3, 3, NULL),
(4, NULL, '2019-07-31 00:00:00', '2019-07-01 00:00:00', 4, 4, NULL),
(5, NULL, '2019-07-31 00:00:00', '2019-07-01 00:00:00', 1, 5, NULL);

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
  `s_projectid` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `s_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `UK_j456ws654tvxp41mkn39t68i4` (`s_contact`),
  UNIQUE KEY `UK_mvo4ur8a7ua5cc4xr9n7mdnaw` (`s_email`),
  UNIQUE KEY `UK_68o9q4grmp8ukieanuh4vaccj` (`s_prn`),
  KEY `FKgnkp18bpppq4vow51ts6k7om3` (`student_id`),
  KEY `FKe015dyx6prfl0riju1wru9vux` (`s_projectid`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`s_id`, `s_added`, `s_prn`, `s_contact`, `s_email`, `s_first_name`, `s_last_name`, `s_status`, `s_projectid`, `student_id`, `s_password`) VALUES
(1, '2019-04-03', '190240120060', '9460939666', 'mittalgaurav@gmail.com', 'Gaurav', 'Mittal', 'ACTIVE', 1, 1, 'dac'),
(2, '2019-06-13', '190240120061', '9999999999', 'raman@gmail.com', 'Raman', 'Chopra', 'ACTIVE', 2, 2, 'dac'),
(3, '2019-07-09', '190240120062', '8956325478', 'arunendra@gmail.com', 'Arunendra', 'Kumar', 'ACTIVE', 3, 3, 'dac'),
(4, '2019-06-05', '190240120069', '8962547896', 'adi@gmail.com', 'Aditya', 'Naman', 'ACTIVE', 4, 4, 'dac'),
(5, '2019-07-07', '190240120089', '3256987415', 'ashutosh@gmail.com', 'Ashutosh', 'Vaish', 'ACTIVE', 5, 5, 'dac');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
