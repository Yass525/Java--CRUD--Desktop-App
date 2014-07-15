-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2014 at 11:59 AM
-- Server version: 5.5.24
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `warmup`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `uname` varchar(45) NOT NULL DEFAULT '',
  `pass` varchar(45) NOT NULL DEFAULT '',
  `type` varchar(45) NOT NULL DEFAULT '',
  `status` varchar(45) NOT NULL DEFAULT '',
  `fname` varchar(45) NOT NULL DEFAULT '',
  `lname` varchar(45) NOT NULL DEFAULT '',
  `mname` varchar(45) NOT NULL DEFAULT '',
  `gender` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `uname`, `pass`, `type`, `status`, `fname`, `lname`, `mname`, `gender`) VALUES
(1, 'admin', 'admin', 'Administrator', 'Active', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `personel`
--

CREATE TABLE IF NOT EXISTS `personel` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fname` varchar(45) NOT NULL DEFAULT '',
  `mname` varchar(45) NOT NULL DEFAULT '',
  `lname` varchar(45) NOT NULL DEFAULT '',
  `gender` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
