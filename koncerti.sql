-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2022 at 05:48 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koncerti`
--

-- --------------------------------------------------------

--
-- Table structure for table `hale`
--

CREATE TABLE `hale` (
  `sifra_hale` varchar(10) NOT NULL,
  `naziv_hale` varchar(20) NOT NULL,
  `adresa_hale` varchar(30) NOT NULL,
  `grad` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hale`
--

INSERT INTO `hale` (`sifra_hale`, `naziv_hale`, `adresa_hale`, `grad`) VALUES
('H1', 'hala1', 'adresa1', 'Beograd'),
('H2', 'hala2', 'adresa2', 'Beograd'),
('H3', 'hala3', 'adresa3', 'Nis'),
('H4', 'hala4', 'adresa4', 'Kragujevac');

-- --------------------------------------------------------

--
-- Table structure for table `izvodjaci`
--

CREATE TABLE `izvodjaci` (
  `sifra_izvodjaca` varchar(10) NOT NULL,
  `ime_izvodjaca` varchar(30) NOT NULL,
  `zanr_muzike` varchar(15) NOT NULL,
  `vrsta_izvodjaca` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `izvodjaci`
--

INSERT INTO `izvodjaci` (`sifra_izvodjaca`, `ime_izvodjaca`, `zanr_muzike`, `vrsta_izvodjaca`) VALUES
('I1', 'izvodjac1', 'pop', 'strani'),
('I2', 'izvodjac2', 'narodna', 'domaci'),
('I3', 'izvodjac3', 'pop', 'domaci'),
('I4', 'izvodjac4', 'rok', 'domaci'),
('I5', 'izvodjac5', 'rok', 'strani'),
('I6', 'izvodjac6', 'rok', 'domaci');

-- --------------------------------------------------------

--
-- Table structure for table `karte`
--

CREATE TABLE `karte` (
  `oznaka_karte` varchar(10) NOT NULL,
  `vrsta_karte` set('VIP','standardna','','') NOT NULL,
  `pozicija_mesta` set('levo krilo','desno krilo','centar','') NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karte`
--

INSERT INTO `karte` (`oznaka_karte`, `vrsta_karte`, `pozicija_mesta`) VALUES
('VL', 'VIP', 'levo krilo'),
('VD', 'VIP', 'desno krilo'),
('VC', 'VIP', 'centar'),
('SL', 'standardna', 'levo krilo'),
('SD', 'standardna', 'desno krilo'),
('SC', 'standardna', 'centar');

-- --------------------------------------------------------

--
-- Table structure for table `karte_koncerti`
--

CREATE TABLE `karte_koncerti` (
  `sifra_koncerta` varchar(10) NOT NULL,
  `oznaka_karte` varchar(10) NOT NULL,
  `broj_karata` int(10) NOT NULL,
  `cena_karte` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karte_koncerti`
--

INSERT INTO `karte_koncerti` (`sifra_koncerta`, `oznaka_karte`, `broj_karata`, `cena_karte`) VALUES
('K1', 'SC', 98, 2000),
('K1', 'VC', 20, 3000),
('K1', 'SL', 145, 1500),
('K1', 'VL', 30, 2500),
('K1', 'SD', 100, 1500),
('K1', 'VD', 30, 2500),
('K2', 'SC', 200, 2000),
('K2', 'VC', 50, 3000),
('K3', 'SC', 500, 2500),
('K4', 'SC', 90, 4000),
('K4', 'VC', 50, 6000),
('K6', 'SC', 150, 3000),
('K6', 'SL', 50, 2500),
('K6', 'SD', 50, 2500),
('K12', 'SC', 200, 2000),
('K49', 'SC', 50, 1000),
('K49', 'VC', 50, 2000),
('K7', 'SC', 150, 2300);

-- --------------------------------------------------------

--
-- Table structure for table `koncerti`
--

CREATE TABLE `koncerti` (
  `sifra_koncerta` varchar(10) NOT NULL,
  `sifra_izvodjaca` varchar(10) NOT NULL,
  `sifra_hale` varchar(10) NOT NULL,
  `datum_koncerta` date NOT NULL,
  `vreme_koncerta` time NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `koncerti`
--

INSERT INTO `koncerti` (`sifra_koncerta`, `sifra_izvodjaca`, `sifra_hale`, `datum_koncerta`, `vreme_koncerta`) VALUES
('K2', 'I4', 'H3', '2023-01-12', '21:00:00'),
('K3', 'I4', 'H1', '2023-01-13', '21:00:00'),
('K7', 'I2', 'H1', '2022-06-09', '20:00:00'),
('K6', 'I5', 'H4', '2023-01-06', '20:00:00'),
('K4', 'I5', 'H2', '2023-01-01', '21:00:00'),
('K5', 'I1', 'H4', '2022-11-27', '20:00:00'),
('K1', 'I3', 'H2', '2022-12-16', '22:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `prodate_karte`
--

CREATE TABLE `prodate_karte` (
  `sifra_karte` int(11) NOT NULL,
  `sifra_koncerta` varchar(10) NOT NULL,
  `oznaka_karte` varchar(10) NOT NULL,
  `broj_prodatih_karata` int(10) NOT NULL,
  `datum_prodaje` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prodate_karte`
--

INSERT INTO `prodate_karte` (`sifra_karte`, `sifra_koncerta`, `oznaka_karte`, `broj_prodatih_karata`, `datum_prodaje`) VALUES
(10, 'K4', 'SC', 10, '2022-12-18 04:40:46');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hale`
--
ALTER TABLE `hale`
  ADD PRIMARY KEY (`sifra_hale`);

--
-- Indexes for table `izvodjaci`
--
ALTER TABLE `izvodjaci`
  ADD PRIMARY KEY (`sifra_izvodjaca`);

--
-- Indexes for table `karte`
--
ALTER TABLE `karte`
  ADD PRIMARY KEY (`oznaka_karte`);

--
-- Indexes for table `koncerti`
--
ALTER TABLE `koncerti`
  ADD PRIMARY KEY (`sifra_koncerta`);

--
-- Indexes for table `prodate_karte`
--
ALTER TABLE `prodate_karte`
  ADD PRIMARY KEY (`sifra_karte`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `prodate_karte`
--
ALTER TABLE `prodate_karte`
  MODIFY `sifra_karte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
