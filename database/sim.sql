-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 29 Janvier 2018 à 20:17
-- Version du serveur :  10.1.19-MariaDB
-- Version de PHP :  5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `sim`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE `administrateur` (
  `Id_administrateur` int(100) NOT NULL,
  `Nom_administrateur` varchar(255) NOT NULL,
  `Prenom_administrateur` varchar(255) NOT NULL,
  `Adresse_administrateur` varchar(255) NOT NULL,
  `Email_administrateur` varchar(255) NOT NULL,
  `Pass_administrateur` varchar(255) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `administrateur`
--

INSERT INTO `administrateur` (`IdAdministrateur`, `Nom_administrateur`, `Prenom_administrateur`, `Adresse_administrateur`, `Email_administrateur`, `Pass_administrateur`, `Id_administrateur`) VALUES
(1, 'Hamzaoui', 'Yassine', 'bd faculté,bloc 2,tanger', 'yassinexhamzaoui@gmail.com', '123456789'),
(2, 'Rik', 'Meryem', 'bd faculté,rue epsilon,tanger', 'rik.meryem@gmail.com', '123456789');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `Id_etudiant` int(100) NOT NULL,
  `Nom_etudiant` varchar(255) NOT NULL,
  `Prenom_etudiant` varchar(255) NOT NULL,
  `Adresse_etudiant` varchar(255) NOT NULL,
  `Email_etudiant` varchar(255) NOT NULL,
  `Pass_etudiant` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`Id_etudiant`, `Nom_etudiant`, `Prenom_etudiant`, `Adresse_etudiant`, `Email_etudiant`, `Pass_etudiant`) VALUES
(1, 'Yaqot', 'Yasine', 'bd changuite,app 15,settat', 'yasine.yaqot@gmail.com', '123456789'),
(2, 'Haji', 'Omar', 'bd jamali,rue 154,rabat', 'omar.haji@gmail.com', '123456789'),
(3, 'Naoufal', 'Elbasri', 'bd champs elisé,rue 12,bloc 5,app 145,paris', 'naoufal.elbasri@gmail.com', '123456789'),
(4, 'Elbaz', 'Ilyass', 'bd med 6,rue 1,azemmour', 'elbaz.ilyass@gmail.com', '123456789');

-- --------------------------------------------------------

--
-- Structure de la table `livre`
--

CREATE TABLE `livre` (
  `Id_livre` int(100) NOT NULL,
  `Titre_livre` varchar(255) NOT NULL,
  `Auteur_livre` varchar(255) NOT NULL,
  `Theme_livre` varchar(255) NOT NULL,
  `Langue_livre` varchar(255) NOT NULL,
  `Date_parution` date NOT NULL,
  `Nbr_page_livre` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `livre`
--

INSERT INTO `livre` (`Id_livre`, `Titre_livre`, `Auteur_livre`, `Theme_livre`, `Langue_livre`, `Date_parution`, `Nbr_page_livre`) VALUES
(1, 'Think and grow rich', 'Napoleon Hill', 'Non fiction', 'Anglais,Français', '1937-01-10', 238),
(2, 'A Court of Wings and Ruin', 'Sarah J. Maas ', 'Fantasy & Science Fiction', 'Anglais', '2017-09-01', 699),
(3, 'The Hate U Give', 'Angie Thomas', 'Fiction', 'Anglais', '2016-11-01', 464),
(4, 'Villan', 'Samantha Young', 'Romance', 'Anglais,Français', '2017-05-20', 200);

-- --------------------------------------------------------

--
-- Structure de la table `news`
--

CREATE TABLE `news` (
  `Id_news` int(100) NOT NULL,
  `Titre_news` varchar(255) NOT NULL,
  `Description_news` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

CREATE TABLE `professeur` (
  `Id_professeur` int(100) NOT NULL,
  `Nom_professeur` varchar(255) NOT NULL,
  `Prenom_professeur` varchar(255) NOT NULL,
  `Adresse_professeur` varchar(255) NOT NULL,
  `Specialite_professeur` varchar(255) NOT NULL,
  `Email_professeur` varchar(255) NOT NULL,
  `Pass_professeur` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `professeur`
--

INSERT INTO `professeur` (`Id_professeur`, `Nom_professeur`, `Prenom_professeur`, `Adresse_professeur`, `Specialite_professeur`, `Email_professeur`, `Pass_professeur`) VALUES
(1, 'Ezzahi', 'Abdelah', 'bd bencharki,rue 2,settat', 'réseau et système d''exploitation', 'abdezzati@gmail.com', '123456789'),
(2, 'Amrani', 'Chakir', 'bd med 5,rue 8,bloc 55,tanger', 'Base de données', 'c.amrani@gmail.com', '123456789'),
(3, 'Mohamed', 'Elyusfi', 'bd elfassi,rue 2,tanger', 'Langage de programmation', 'lyusfi.med@gmail.com', '123456789');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `Id_user` int(100) NOT NULL,
  `Email_user` varchar(255) NOT NULL,
  `Pass_user` varchar(255) NOT NULL,
  `Role_user` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`Id_user`, `Email_user`, `Pass_user`, `Role_user`) VALUES
(1, 'abdezzati@gmail.com', '123456789', '2'),
(2, 'c.amrani@gmail.com', '123456789', '2'),
(3, 'rik.meryem@gmail.com', '123456789', '3'),
(4, 'yassinexhamzaoui@gmail.com', '123456789', '3'),
(5, 'yasine.yaqot@gmail.com', '123456789', '1'),
(6, 'omar.haji@gmail.com', '123456789', '1'),
(7, 'naoufal.elbasri@gmail.com', '123456789', '1'),
(8, 'elyusfi.med@gmail.com', '123456789', '2'),
(9, 'elbaz.ilyass@gmail.com', '123456789', '1');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD PRIMARY KEY (`Id_administrateur`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`Id_etudiant`);

--
-- Index pour la table `livre`
--
ALTER TABLE `livre`
  ADD PRIMARY KEY (`Id_livre`);

--
-- Index pour la table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`Id_news`);

--
-- Index pour la table `professeur`
--
ALTER TABLE `professeur`
  ADD PRIMARY KEY (`Id_professeur`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Id_user`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `administrateur`
--
ALTER TABLE `administrateur`
  MODIFY `Id_administrateur` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `Id_etudiant` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `livre`
--
ALTER TABLE `livre`
  MODIFY `Id_livre` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `news`
--
ALTER TABLE `news`
  MODIFY `Id_news` int(100) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `professeur`
--
ALTER TABLE `professeur`
  MODIFY `Id_professeur` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `Id_user` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
