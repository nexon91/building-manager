-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Lug 10, 2020 alle 07:48
-- Versione del server: 10.4.13-MariaDB
-- Versione PHP: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `building_managament`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `department` varchar(255) NOT NULL,
  `born` date NOT NULL,
  `on_holiday` bit(1) NOT NULL,
  `role` bit(1) NOT NULL,
  `date_employed` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `employee`
--

INSERT INTO `employee` (`id`, `first_name`, `last_name`, `username`, `password`, `email`, `department`, `born`, `on_holiday`, `role`, `date_employed`) VALUES
(1, '', '', '', '', '', '', '0000-00-00', b'0', b'0', '0000-00-00'),
(2, '', '', '', '', '', '', '0000-00-00', b'0', b'0', '0000-00-00'),
(3, '', '', '', '', '', '', '0000-00-00', b'0', b'0', '0000-00-00'),
(4, '', '', '', '', '', '', '0000-00-00', b'1', b'0', '0000-00-00'),
(5, 'a', 'a', 'a', 'a', 'a@x.x', 'a', '0000-00-00', b'0', b'0', '0000-00-00'),
(6, 'Emily', 'Rut', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'1', '2008-02-14'),
(7, 'Emma', 'Brooklyn', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'1', b'0', '2008-01-10'),
(8, 'Emily', 'Rut', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-02-14'),
(9, 'Emma', 'Brooklyn', 'emy', 'emy', 'emy@emy.com', 'Manager', '2020-06-01', b'0', b'0', '2008-01-10'),
(10, 'Emily', 'Rut', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-02-14'),
(11, 'Emma', 'Brooklyn', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-01-10'),
(12, 'Emily', 'Rut', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-02-14'),
(13, 'Emma', 'Brooklyn', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-01-10'),
(14, 'Emily', 'Rut', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-02-14'),
(15, 'Emma', 'Brooklyn', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-01-10'),
(16, 'Emily', 'Rut', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-02-14'),
(17, 'Emma', 'Brooklyn', 'emy', 'emy', 'emy@emy.com', 'Manager', '0000-00-00', b'0', b'0', '2008-01-10'),
(22, 'tracy', 'tracy', 'tracy', '$2a$10$gIPHu6f/TxV9ESr9doCbG.11tLQIrp0CyNjGqp8WWTePj4BNqi0NS', 't@v.d', 'Operaio', '0000-00-00', b'0', b'0', '2020-06-01'),
(25, 'q', 'q', 'q', '$2a$10$8Il59F6b3jMIfEWnBpke7.zOnmnyx8KlwfEfIwdOAfL3GYrtIV1DK', 'q@q.c', 'q', '0000-00-00', b'0', b'0', '0000-00-00'),
(26, 'Mark', 'Twain', 'mark', 'mark', 'mark@mail.com', 'Manager', '1970-04-09', b'0', b'0', '2020-05-12'),
(27, 'Leonardo', 'Da Vinci', 'leo', '$2a$10$Q8VYwm50R1gF89nG5jFG0ODHpQWHPL0AAagLLZyWRkYpKVTYpkB2G', 'leo@gmail.com', 'Manager', '1963-01-11', b'0', b'1', '2020-06-02'),
(28, 'Andy', 'Stoke', 'andy', 'andy', 'andy@gmail.comm', 'Cleaning Worker ', '1972-09-23', b'0', b'0', '2020-06-03'),
(29, 'a', 'a', 'nesa', '$2a$10$ew3VDV3peuO36ve1Z/wjUeVttooQM9psqiWj.aN4Cg1zubtTA4CrS', 'a@x.x', 'a', '0000-00-00', b'0', b'0', '0000-00-00'),
(30, 'A', 'B', 'c', '$2a$10$aiLcOlw8rWnIfrw.y4RbVOCEw7Sxupj883THP1cmXxT.K4R/4fG7u', 'mail@s.c', 'a', '0000-00-00', b'0', b'1', '0000-00-00'),
(31, 'M', 'N', 'O', '$2a$10$mU2rhxrf0QGfgtLQ9272c.evuUUPbcEq/79votAJr2AjxN0pKzQay', 'q@c.c', 'q', '0000-00-00', b'0', b'0', '0000-00-00');

-- --------------------------------------------------------

--
-- Struttura della tabella `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(68);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
