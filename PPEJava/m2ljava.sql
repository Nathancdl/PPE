-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 03 Février 2017 à 12:07
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `m2ljava`
--

-- --------------------------------------------------------

--
-- Structure de la table `appartenir`
--

CREATE TABLE IF NOT EXISTS `appartenir` (
  `id_user` int(11) NOT NULL DEFAULT '0',
  `id_equipe` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_user`,`id_equipe`),
  KEY `id_equipe` (`id_equipe`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `candidat`
--

CREATE TABLE IF NOT EXISTS `candidat` (
  `id_candid` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id_candid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `competition`
--

CREATE TABLE IF NOT EXISTS `competition` (
  `id_compet` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(128) DEFAULT NULL,
  `date_d` datetime DEFAULT NULL,
  `duree` int(11) DEFAULT NULL,
  `enEquipe` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_compet`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `participer`
--

CREATE TABLE IF NOT EXISTS `participer` (
  `ca_id` int(11) NOT NULL DEFAULT '0',
  `co_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ca_id`,`co_id`),
  KEY `co_id` (`co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id_u` int(11) NOT NULL,
  `niveau` int(11) DEFAULT '0',
  `mail` varchar(128) DEFAULT NULL,
  `prenom` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id_u`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `appartenir`
--
ALTER TABLE `appartenir`
  ADD CONSTRAINT `appartenir_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `candidat` (`id_candid`),
  ADD CONSTRAINT `appartenir_ibfk_2` FOREIGN KEY (`id_equipe`) REFERENCES `candidat` (`id_candid`);

--
-- Contraintes pour la table `participer`
--
ALTER TABLE `participer`
  ADD CONSTRAINT `participer_ibfk_1` FOREIGN KEY (`ca_id`) REFERENCES `candidat` (`id_candid`),
  ADD CONSTRAINT `participer_ibfk_2` FOREIGN KEY (`co_id`) REFERENCES `competition` (`id_compet`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
