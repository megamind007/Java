-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2017 at 05:20 AM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `topupit`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `idcategory` int(11) NOT NULL,
  `cat_name` varchar(45) NOT NULL,
  PRIMARY KEY (`idcategory`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`idcategory`, `cat_name`) VALUES
(1, 'public'),
(2, 'private');

-- --------------------------------------------------------

--
-- Table structure for table `uni_admission`
--

DROP TABLE IF EXISTS `uni_admission`;
CREATE TABLE IF NOT EXISTS `uni_admission` (
  `uni_id` int(11) NOT NULL AUTO_INCREMENT,
  `uni_name` varchar(45) NOT NULL,
  `ssc_gpa` float NOT NULL,
  `hsc_gpa` float NOT NULL,
  `category_idcategory` int(11) NOT NULL,
  `uni_det_uni_det_id` int(11) NOT NULL,
  PRIMARY KEY (`uni_id`,`category_idcategory`),
  KEY `fk_uni_admission_category_idx` (`category_idcategory`),
  KEY `fk_uni_admission_uni_det1_idx` (`uni_det_uni_det_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uni_admission`
--

INSERT INTO `uni_admission` (`uni_id`, `uni_name`, `ssc_gpa`, `hsc_gpa`, `category_idcategory`, `uni_det_uni_det_id`) VALUES
(1, 'BUET', 4, 5, 1, 1),
(2, 'BRAC University', 3.5, 3.5, 2, 2),
(3, 'North South University', 3.5, 3.5, 2, 3),
(4, 'AIUB', 2.75, 2.75, 2, 4),
(5, 'Dhaka University', 4, 4, 1, 5),
(6, 'Rajshahi University', 4, 4, 1, 6);

-- --------------------------------------------------------

--
-- Table structure for table `uni_det`
--

DROP TABLE IF EXISTS `uni_det`;
CREATE TABLE IF NOT EXISTS `uni_det` (
  `uni_det_id` int(11) NOT NULL,
  `hostel` varchar(45) NOT NULL,
  `cost` int(10) NOT NULL,
  `other` varchar(255) NOT NULL,
  `uni_link` varchar(45) NOT NULL,
  PRIMARY KEY (`uni_det_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uni_det`
--

INSERT INTO `uni_det` (`uni_det_id`, `hostel`, `cost`, `other`, `uni_link`) VALUES
(1, 'yes', 0, 'QS ranking 2 in Asia', 'www.buet.ac.bd'),
(2, 'female', 1200000, 'QS ranking 1 among all private university in Bangladesh', 'www.bracu.ac.bd'),
(3, 'No', 1000000, 'test', 'www.northsouth.edu'),
(4, 'No', 800000, 'test', 'www.aiub.edu'),
(5, 'yes', 0, 'test', 'www.du.ac.bd'),
(6, 'yes', 0, 'test', 'www.ru.ac.bd');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `uni_admission`
--
ALTER TABLE `uni_admission`
  ADD CONSTRAINT `fk_uni_admission_category` FOREIGN KEY (`category_idcategory`) REFERENCES `category` (`idcategory`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_uni_admission_uni_det1` FOREIGN KEY (`uni_det_uni_det_id`) REFERENCES `uni_det` (`uni_det_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
