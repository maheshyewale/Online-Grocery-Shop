-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2021 at 03:27 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `groseryshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `User name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`User name`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `buy`
--

CREATE TABLE `buy` (
  `Grosery Name` varchar(50) NOT NULL,
  `Town/City` varchar(50) NOT NULL,
  `Area/Colony` varchar(50) NOT NULL,
  `Landmark` varchar(50) NOT NULL,
  `Mobile Number` varchar(50) NOT NULL,
  `Messages` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buy`
--

INSERT INTO `buy` (`Grosery Name`, `Town/City`, `Area/Colony`, `Landmark`, `Mobile Number`, `Messages`) VALUES
('mushroom', 'talegoav', 'ganga colony', 'near be bus   stand', '7058255021', 'your order was delivered'),
('butter', 'chakan', 'station station', 'near be hanuman madir', '8767942298', 'your order was delivered');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `Customer Name` varchar(50) NOT NULL,
  `Mobile Number` varchar(50) NOT NULL,
  `Email Address` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Message` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`Customer Name`, `Mobile Number`, `Email Address`, `Address`, `Message`) VALUES
('gaurav khomane', '7058255021', 'khomanegaurav444@gmail.com', 'pune', 'good services'),
('vaishanavi salunke', '8767942298', 'vaishanavissalunke123@gmail.com', 'chakan', 'good service nice work');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Customer Name` varchar(50) NOT NULL,
  `Mobile Number` varchar(50) NOT NULL,
  `Pincode` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Customer Name`, `Mobile Number`, `Pincode`, `Address`, `Password`) VALUES
('gaurav', '7058255021', '410038', 'pune', '123'),
('vaishnavi salunke', '8767942298', '111045', 'shivaji nagar', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
