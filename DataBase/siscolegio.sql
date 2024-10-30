-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2012 at 09:06 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `siscolegio`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `Idalumno` int(10) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Fechanacimiento` varchar(10) NOT NULL,
  `Sexo` varchar(20) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Grado` varchar(1) NOT NULL,
  `Seccion` varchar(1) NOT NULL,
  PRIMARY KEY (`Idalumno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alumno`
--

INSERT INTO `alumno` (`Idalumno`, `Apellidos`, `Nombres`, `Fechanacimiento`, `Sexo`, `Direccion`, `Telefono`, `Email`, `Password`, `Grado`, `Seccion`) VALUES
(3, 'Mundaca Manay', 'Jose Hugo', 'Tue May 12', 'Masculino', 'Jose Galvez 1368', '996354121', 'carlos_Ad_6@hotmail.com', '123456', '5', 'F'),
(6, 'Diaz Mendoza', 'Luis Alberto', 'Thu Dec 15', 'Masculino', 'Jose Galvez 1368', '973436105', 'pad2@hotmail.com', 'luisito', '5', 'F'),
(5, 'Flores Sanchez', 'Noemi Stefany', 'Fri Jan 07', 'Masculino', '28 Octubre', '123456789', 'Noemi123@hotmail.com', '123456', '1', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `curso`
--

CREATE TABLE IF NOT EXISTS `curso` (
  `Idcurso` int(10) NOT NULL,
  `Nombrecurso` varchar(50) NOT NULL,
  `Idprofesor` varchar(10) NOT NULL,
  PRIMARY KEY (`Idcurso`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `curso`
--

INSERT INTO `curso` (`Idcurso`, `Nombrecurso`, `Idprofesor`) VALUES
(1, 'Matematica2', '2'),
(7, 'LIteratura2', '23'),
(11, 'Comunicacion II', '3'),
(9, 'aaaaa', '1'),
(10, 'Estadistica II', '3');

-- --------------------------------------------------------

--
-- Table structure for table `notas`
--

CREATE TABLE IF NOT EXISTS `notas` (
  `Idnota` int(10) NOT NULL,
  `Idcurso` int(10) NOT NULL,
  `Idalumno` int(10) NOT NULL,
  `Unidad` varchar(20) NOT NULL,
  `Promedio` int(10) NOT NULL,
  PRIMARY KEY (`Idnota`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notas`
--

INSERT INTO `notas` (`Idnota`, `Idcurso`, `Idalumno`, `Unidad`, `Promedio`) VALUES
(3, 2, 3, '1', 17),
(6, 5, 2, '2', 19),
(7, 2, 8, '2', 14),
(20, 1, 6, '1', 5),
(10, 1, 3, '1', 17),
(13, 1, 3, '4', 17),
(14, 1, 3, '1', 20),
(15, 7, 4, '4', 18),
(19, 1, 3, '2', 20),
(17, 2, 3, '1', 17),
(18, 2, 4, '1', 13),
(21, 10, 5, '1', 7),
(22, 1, 5, '1', 20),
(23, 11, 5, '4', 6),
(24, 10, 5, '1', 20),
(25, 11, 6, '3', 15),
(26, 1, 6, '1', 17),
(27, 11, 5, '2', 18);

-- --------------------------------------------------------

--
-- Table structure for table `profesor`
--

CREATE TABLE IF NOT EXISTS `profesor` (
  `Idprofesor` int(10) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `Dni` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profesor`
--

INSERT INTO `profesor` (`Idprofesor`, `Apellidos`, `Nombres`, `Dni`, `Direccion`, `Telefono`, `Email`, `Password`) VALUES
(3, 'Torres Fernandez', 'Jenrry', '88456321', 'Los Pinos # 458', '019856321', 'jenrry147@hotmail.com', 'gastelo'),
(2, 'Díaz Perez', 'Jose', '47859632', 'Los Rosales # 1340', '987563214', 'checarlitos', 'checarlitos');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
