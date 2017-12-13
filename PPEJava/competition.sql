-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 13 déc. 2017 à 16:16
-- Version du serveur :  5.7.19
-- Version de PHP :  5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `competition`
--

-- --------------------------------------------------------

--
-- Structure de la table `appartenir`
--

DROP TABLE IF EXISTS `appartenir`;
CREATE TABLE IF NOT EXISTS `appartenir` (
  `id_personne` int(11) NOT NULL,
  `id_equipe` int(11) NOT NULL,
  KEY `id_equipe` (`id_equipe`),
  KEY `id_personne` (`id_personne`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `candidat`
--

DROP TABLE IF EXISTS `candidat`;
CREATE TABLE IF NOT EXISTS `candidat` (
  `id_candidat` int(11) NOT NULL AUTO_INCREMENT,
  `nom_candidat` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id_candidat`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `candidat`
--

INSERT INTO `candidat` (`id_candidat`, `nom_candidat`) VALUES
(1, 'nathan'),
(77, 'te'),
(78, 'theo');

-- --------------------------------------------------------

--
-- Structure de la table `competition`
--

DROP TABLE IF EXISTS `competition`;
CREATE TABLE IF NOT EXISTS `competition` (
  `id_competition` int(11) NOT NULL AUTO_INCREMENT,
  `nom_competition` varchar(128) DEFAULT NULL,
  `date_debut` datetime DEFAULT NULL,
  `date_fin` datetime DEFAULT NULL,
  `enEquipe` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id_competition`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `competition`
--

INSERT INTO `competition` (`id_competition`, `nom_competition`, `date_debut`, `date_fin`, `enEquipe`) VALUES
(1, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(2, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(3, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(4, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(5, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(6, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(7, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(8, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(9, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(10, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(11, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(12, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(13, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(14, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(15, 'CompetEquipeTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 1),
(16, 'CompetSoloTest', '2018-03-19 00:00:00', '2018-03-29 00:00:00', 0),
(17, 'ping pong', '2018-01-01 00:00:00', NULL, 0),
(18, 'ping pong', '2018-01-01 00:00:00', NULL, 0);

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

DROP TABLE IF EXISTS `equipe`;
CREATE TABLE IF NOT EXISTS `equipe` (
  `id_equipe` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(128) NOT NULL,
  KEY `id_equipe` (`id_equipe`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `inscrire`
--

DROP TABLE IF EXISTS `inscrire`;
CREATE TABLE IF NOT EXISTS `inscrire` (
  `id_candidat` int(11) NOT NULL,
  `id_competition` int(11) NOT NULL,
  KEY `id_candidat` (`id_candidat`),
  KEY `id_competition` (`id_competition`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `id_personne` int(11) NOT NULL AUTO_INCREMENT,
  `mail` varchar(128) DEFAULT NULL,
  `prenom` varchar(128) DEFAULT NULL,
  `nom` varchar(128) NOT NULL DEFAULT 'default',
  PRIMARY KEY (`id_personne`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`id_personne`, `mail`, `prenom`, `nom`) VALUES
(1, 'dylantest@test.fr', 'dylan', 'dish'),
(77, 'te', 'te', 'te'),
(78, 'the@jizf.fr', 'goncalves', 'theo');

-- --------------------------------------------------------

--
-- Structure de la table `tocompetition`
--

DROP TABLE IF EXISTS `tocompetition`;
CREATE TABLE IF NOT EXISTS `tocompetition` (
  `id_candidat` int(11) NOT NULL,
  `id_competition` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `tocompetition`
--

INSERT INTO `tocompetition` (`id_candidat`, `id_competition`) VALUES
(0, 18);

-- --------------------------------------------------------

--
-- Structure de la table `toequipe`
--

DROP TABLE IF EXISTS `toequipe`;
CREATE TABLE IF NOT EXISTS `toequipe` (
  `id_personne` int(11) NOT NULL,
  `id_equipe` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `appartenir`
--
ALTER TABLE `appartenir`
  ADD CONSTRAINT `appartenir_ibfk_1` FOREIGN KEY (`id_personne`) REFERENCES `candidat` (`id_candidat`),
  ADD CONSTRAINT `appartenir_ibfk_2` FOREIGN KEY (`id_equipe`) REFERENCES `candidat` (`id_candidat`);

--
-- Contraintes pour la table `equipe`
--
ALTER TABLE `equipe`
  ADD CONSTRAINT `equipe_ibfk_1` FOREIGN KEY (`id_equipe`) REFERENCES `candidat` (`id_candidat`);

--
-- Contraintes pour la table `inscrire`
--
ALTER TABLE `inscrire`
  ADD CONSTRAINT `inscrire_ibfk_1` FOREIGN KEY (`id_candidat`) REFERENCES `candidat` (`id_candidat`),
  ADD CONSTRAINT `inscrire_ibfk_2` FOREIGN KEY (`id_competition`) REFERENCES `competition` (`id_competition`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
