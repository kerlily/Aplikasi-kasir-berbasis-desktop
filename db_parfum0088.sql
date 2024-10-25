-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2024 at 03:06 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_parfum0088`
--

-- --------------------------------------------------------

--
-- Table structure for table `ms_barang`
--

CREATE TABLE `ms_barang` (
  `kode` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `satuan` char(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `harga_satuan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ms_barang`
--

INSERT INTO `ms_barang` (`kode`, `nama`, `satuan`, `harga_satuan`) VALUES
('001', 'dior sauvage', 'vanila', 200000),
('004', 'pucelle', 'kuning', 400000),
('005', 'pucelle', 'biru', 400000),
('006', 'pucelle', 'hitam', 400000),
('023', 'Dior sauvage', 'brust attack', 10000);

-- --------------------------------------------------------

--
-- Table structure for table `ms_pelanggan`
--

CREATE TABLE `ms_pelanggan` (
  `kode` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama` char(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `alamat` text CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `telepon` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ms_pelanggan`
--

INSERT INTO `ms_pelanggan` (`kode`, `nama`, `alamat`, `telepon`) VALUES
('01', 'noi', 'gowa', '02215164654'),
('02', 'lili', 'batang', '084328233');

-- --------------------------------------------------------

--
-- Table structure for table `ms_pengguna`
--

CREATE TABLE `ms_pengguna` (
  `username` char(20) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ms_pengguna`
--

INSERT INTO `ms_pengguna` (`username`, `password`) VALUES
('admin', '202cb962ac59075b964b07152d234b70');

-- --------------------------------------------------------

--
-- Table structure for table `tr_penjualan`
--

CREATE TABLE `tr_penjualan` (
  `nomor` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `tanggal` date NOT NULL,
  `total` int(11) NOT NULL,
  `pelanggan` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tr_penjualan`
--

INSERT INTO `tr_penjualan` (`nomor`, `tanggal`, `total`, `pelanggan`) VALUES
('1', '2024-01-28', 800000, '01'),
('2', '2024-01-28', 20000, '02');

-- --------------------------------------------------------

--
-- Table structure for table `tr_penjualan_detail`
--

CREATE TABLE `tr_penjualan_detail` (
  `id` int(11) NOT NULL,
  `kuantiti` int(11) NOT NULL,
  `harga_satuan` int(11) NOT NULL,
  `barang` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `penjualan` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tr_penjualan_detail`
--

INSERT INTO `tr_penjualan_detail` (`id`, `kuantiti`, `harga_satuan`, `barang`, `penjualan`) VALUES
(7, 1, 400000, '004', '1'),
(8, 1, 400000, '005', '1'),
(9, 2, 10000, '023', '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ms_barang`
--
ALTER TABLE `ms_barang`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `ms_pelanggan`
--
ALTER TABLE `ms_pelanggan`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `ms_pengguna`
--
ALTER TABLE `ms_pengguna`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tr_penjualan`
--
ALTER TABLE `tr_penjualan`
  ADD PRIMARY KEY (`nomor`);

--
-- Indexes for table `tr_penjualan_detail`
--
ALTER TABLE `tr_penjualan_detail`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tr_penjualan_detail`
--
ALTER TABLE `tr_penjualan_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
