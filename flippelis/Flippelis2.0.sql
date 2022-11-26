-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: Flippelis
-- Source Schemata: Flippelis
-- Created: Tue Dec 28 13:57:40 2021
-- Workbench Version: 8.0.27
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema Flippelis
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `Flippelis` ;
CREATE SCHEMA IF NOT EXISTS `Flippelis` ;

-- ----------------------------------------------------------------------------
-- Table Flippelis.USERACCOUNT
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`USERACCOUNT` (
  `Email` VARCHAR(60) CHARACTER SET 'utf8mb4' NOT NULL,
  `UserType` SMALLINT NULL DEFAULT 0,
  `UserName` VARCHAR(20) CHARACTER SET 'utf8mb4' NOT NULL,
  `Pswd` VARCHAR(24) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`UserName`));

-- ----------------------------------------------------------------------------
-- Table Flippelis.LVIEWED
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`LVIEWED` (
  `UserName` VARCHAR(20) CHARACTER SET 'utf8mb4' NOT NULL,
  `ProdID` INT NOT NULL,
  PRIMARY KEY (`UserName`, `ProdID`),
  CONSTRAINT `FK_HISTORY_UsrName`
    FOREIGN KEY (`UserName`)
    REFERENCES `Flippelis`.`USERACCOUNT` (`UserName`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `FK_HISTORY_ProdID`
    FOREIGN KEY (`ProdID`)
    REFERENCES `Flippelis`.`PRODUCT` (`ProdID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.LFAVS
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`LFAVS` (
  `UserName` VARCHAR(20) CHARACTER SET 'utf8mb4' NOT NULL,
  `ProdID` INT NOT NULL,
  PRIMARY KEY (`UserName`, `ProdID`),
  CONSTRAINT `FK_LFAVS_UsrName`
    FOREIGN KEY (`UserName`)
    REFERENCES `Flippelis`.`USERACCOUNT` (`UserName`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `FK_LFAVS_ProdID`
    FOREIGN KEY (`ProdID`)
    REFERENCES `Flippelis`.`PRODUCT` (`ProdID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.WISHLIST
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`WISHLIST` (
  `UserName` VARCHAR(20) CHARACTER SET 'utf8mb4' NOT NULL,
  `ProdID` INT NOT NULL,
  PRIMARY KEY (`UserName`, `ProdID`),
  CONSTRAINT `FK_WISHLIST_UsrName`
    FOREIGN KEY (`UserName`)
    REFERENCES `Flippelis`.`USERACCOUNT` (`UserName`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `FK_WISHLIST_ProdID`
    FOREIGN KEY (`ProdID`)
    REFERENCES `Flippelis`.`PRODUCT` (`ProdID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.PRODUCT
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`PRODUCT` (
  `ProdID` INT NOT NULL,
  `Title` VARCHAR(75) CHARACTER SET 'utf8mb4' NOT NULL,
  `Rate` SMALLINT NULL DEFAULT 0,
  `ReleaseDate` DATE NULL,
  `Characters` VARCHAR(70) CHARACTER SET 'utf8mb4' NULL,
  `Synopsis` VARCHAR(500) CHARACTER SET 'utf8mb4' NULL,
  `Genre` VARCHAR(20) NOT NULL,
  `Prizes` VARCHAR(100) CHARACTER SET 'utf8mb4' NULL,
  `Collect` DECIMAL(19,0) NULL,
  `Trailer` VARCHAR(70) NULL,
  `Image` VARCHAR(500) NOT NULL,
  `FDub` VARCHAR(70) NULL,
  `Platf` VARCHAR(50) NULL,
  `Compositor` VARCHAR(40) CHARACTER SET 'utf8mb4' NULL,
  `BSO` VARCHAR(100) NULL,
  `Director` VARCHAR(40) CHARACTER SET 'utf8mb4' NOT NULL,
  `Producer` VARCHAR(30) CHARACTER SET 'utf8mb4' NULL,
  PRIMARY KEY (`ProdID`),
  UNIQUE INDEX `UK_PRODUCT_Title` (`Title` ASC) VISIBLE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.REVIEWS
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`REVIEWS` (
  `UserName` VARCHAR(20) CHARACTER SET 'utf8mb4' NOT NULL,
  `ProdID` INT NOT NULL,
  `Comment` VARCHAR(500) NULL,
  `Rate` SMALLINT NOT NULL,
  `ReviewRate` SMALLINT NULL DEFAULT 0,
  PRIMARY KEY (`UserName`, `ProdID`),
  CONSTRAINT `FK_REVIEWS_UsrName`
    FOREIGN KEY (`UserName`)
    REFERENCES `Flippelis`.`USERACCOUNT` (`UserName`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE,
  CONSTRAINT `FK_REVIEWS_ProdID`
    FOREIGN KEY (`ProdID`)
    REFERENCES `Flippelis`.`PRODUCT` (`ProdID`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.SERIES
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`SERIES` (
  `ProdID` INT NOT NULL,
  `TotalEpisodes` SMALLINT UNSIGNED NOT NULL,
  `TotalSeasons` TINYINT UNSIGNED NOT NULL,
  `EpDuration` TINYINT UNSIGNED NULL,
  PRIMARY KEY (`ProdID`),
  CONSTRAINT `FK_SERIES_ProdID`
    FOREIGN KEY (`ProdID`)
    REFERENCES `Flippelis`.`PRODUCT` (`ProdID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.MOVIES
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`MOVIES` (
  `ProdID` INT NOT NULL,
  `Franchise` VARCHAR(50) NULL,
  `Duration` TINYINT UNSIGNED NOT NULL,
  PRIMARY KEY (`ProdID`),
  CONSTRAINT `FK_MOVIES_ProdID`
    FOREIGN KEY (`ProdID`)
    REFERENCES `Flippelis`.`PRODUCT` (`ProdID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- ----------------------------------------------------------------------------
-- Table Flippelis.sysdiagrams
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `Flippelis`.`sysdiagrams` (
  `name` VARCHAR(160) NOT NULL,
  `principal_id` INT NOT NULL,
  `diagram_id` INT NOT NULL,
  `version` INT NULL,
  `definition` LONGBLOB NULL,
  PRIMARY KEY (`diagram_id`),
  UNIQUE INDEX `UK_principal_name` (`principal_id` ASC, `name` ASC) VISIBLE);
SET FOREIGN_KEY_CHECKS = 1;

USE FLIPPELIS;

INSERT INTO USERACCOUNT (UserName, Pswd, Email, UserType) VALUES ('Tintin', '1234', 'tintin@correo.com', 2);

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (123456789, 'Indiana Jones', '1981-10-05', 'https://www.sensacine.com/peliculas/pelicula-121/reparto/', 'El aventurero arquéologo estadounidense Indiana Jones es contactado por el Gobierno de los Estados Unidos para que ubique la legendaria Arca de la Alianza antes de lo que lo logre la Alemania Nazi, ya que el mítico artefacto podría otorgarle un poder ilimitado para conquistar el mundo.', 'Aventura', '2', 5000, 'https://www.youtube.com/watch?v=PFhSIQO7fw0', 'https://sm.ign.com/ign_es/movie/i/indiana-jo/indiana-jones-y-el-arca-perdida_4rgr.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=535', 'HBO', 'Compositor John Williams', 'Raiders of the Lost Ark', 'Steven Spielberg', 'Paramount');
INSERT INTO MOVIES (ProdID, Duration, Franchise)
VALUES (123456789, 115, 'Indiana Jones');

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (123456781, 'Flipper', '1996-06-20', 'https://www.sensacine.com/peliculas/pelicula-14991/reparto/', 'Chico y su delfín tratan de detener a villano que contamina el océano con deshechos tóxicos. Basada en la serie de TV.', 'Aventura/Infantil', 'Ninguno', 20000000, 'https://www.youtube.com/watch?v=YQRbTNN-jNE', 'https://www.dcine.org/sites/default/files/carteles/flipper-pelicula-1996-cartel-estadounidense.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=1430', 'Netflix', 'Compositor Joel McNeely', 'Un temazo la verdad', 'Alan Shapiro', 'The Bubble Factory');
INSERT INTO MOVIES (ProdID, Duration, Franchise)
VALUES (123456781, 95, 'Flipper');

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (123456782, 'La Familia Addams', '2003-08-14', 'https://www.sensacine.com/peliculas/pelicula-26230/reparto/', 'La familia Addams se ve amenazada cuando una madre y su hijo, con ayuda de un abogado sin escrúpulos, conspiran para hacerse con la fortuna familiar.', 'Comedia/Infantil', '5', 191502426, 'https://www.youtube.com/watch?v=v1HFHkPNShI', 'https://pics.filmaffinity.com/La_familia_Addams-987196331-large.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=56667', 'Netflix', 'Compositor Marc Shaiman', 'Musiquita fúnebre', 'Barry Sonnenfeld', 'Paramount');
INSERT INTO MOVIES (ProdID, Duration, Franchise)
VALUES (123456782, 101, 'La Familia Addams');

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (123456783, 'La maldición de la Perla Negra', '1992-04-10', 'https://www.sensacine.com/peliculas/pelicula-46117/reparto/', 'El capitán Barbossa le roba el barco al pirata Jack Sparrow y secuestra a Elizabeth, amiga de Will Turner. Barbossa y su tripulación son víctimas de un conjuro que los condena a vivir eternamente y a transformarse cada noche en esqueletos vivientes.', 'Aventura', '6', 654000000, 'https://www.youtube.com/watch?v=naQr0uTrH_s', 'https://pics.filmaffinity.com/pirates_of_the_caribbean_the_curse_of_the_black_pearl-627724446-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=4602', 'Disney Plus', 'Compositor Klaus Badelt', 'Para pan pan Para pan pan...', 'Gore Verbinski', 'Walt Disney Pictures');
INSERT INTO MOVIES (ProdID, Duration, Franchise)
VALUES (123456783, 143, 'Piratas del Caribe');

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (123456784, 'Star Wars: El retorno del jedi', '1983-05-25', 'https://www.sensacine.com/peliculas/pelicula-25803/reparto/', 'Seis meses después de que Han Solo fuera capturado y congelado en carbonita en la Ciudad de las Nubes, el Imperio Galáctico está construyendo una nueva Estrella de la Muerte. Mientras tanto, el joven Luke lucha para alcanzar la maestría jedi.', 'Ciencia ficción', '2', 475000000, 'https://www.youtube.com/watch?v=yhuKapE-Bio', 'https://pics.filmaffinity.com/star_wars_episode_vi_return_of_the_jedi-351307626-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=1165', 'Disney Plus', 'Compositor John Williams', 'Mitiquisima bro, te la sabes de memoria', 'Richard Marquand', 'Lucasfilm');
INSERT INTO MOVIES (ProdID, Duration, Franchise)
VALUES (123456784, 133, 'Star Wars');


INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (223456789, 'Juego de tronos', '2011-04-17', 'https://www.sensacine.com/series/serie-7157/temporada-14376/reparto/', 'Juego de tronos es la historia de la lucha por un trono, el trono de hierro, forjado con las espadas de los enemigos vencidos. Siete son los reinos de Poniente y muchas las casas que se disputarán la corona: los herederos, los exiliados, los despojados y los actuales regentes.', 'Aventuras', '70', 700000000, 'https://www.youtube.com/watch?v=KPLWWIOCOOQ', 'https://pics.filmaffinity.com/game_of_thrones_tv_series-293142110-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=22606', 'HBO', 'Compositor Ramin Djawadi', 'Epic music starts', 'David Benioff', 'Coproducción EE.UU-Reino Unido');
INSERT INTO SERIES (ProdID, TotalSeasons, TotalEpisodes, EpDuration)
VALUES (223456789, 8, 73, 45);

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (323456789, 'Los Simpson', '1989-12-17', 'https://www.sensacine.com/series/serie-290/temporada-38450/reparto/', 'La comedia de dibujos animados se centra en una familia que vive en la ciudad de Springfield. La cabeza de la familia Simpson es Homero, quien no es un hombre de familia típico, obrero de una planta nuclear, él hace lo mejor para poder liderar a su familia, pero frecuentemente se da cuenta que son ellos los que lo mandan. La familia se compone de la matriarca amorosa, Marge, de cabello azul, el hijo agitador Bart, la hija aplicada Lisa y la bebé Maggie.', 'Comedia', '54', 536000000, 'https://www.youtube.com/watch?v=_jgYEYERYFQ', 'https://pics.filmaffinity.com/the_simpsons_tv_series-146294444-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=32', 'Disney Plus', 'Compositor Alf Clausen', 'The Simpsons theme', 'Matt Groening', 'Gracie Films');
INSERT INTO SERIES (ProdID, TotalSeasons, TotalEpisodes, EpDuration)
VALUES (323456789, 33, 717, 22);

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (423456789, 'The Big Bang Theory', '2007-09-24', 'https://www.sensacine.com/series/serie-3247/temporada-5641/reparto/', 'Leonard y Sheldon son dos cerebros privilegiados que pueden ser capaces de decirle a todo el mundo más de lo que quiere saber sobre la física cuántica, pero que no tienen ni la menor idea de cómo relacionarse socialmente, sobre todo cuando se trata de mujeres. Sin embargo, la llegada de una nueva vecina llamada Penny al edificio altera la vida sentimental de Leonard y las obsesiones de Sheldon.', 'Comedia', '33', 1500000000, 'https://www.youtube.com/watch?v=_uQXxvZ3afQ', 'https://pics.filmaffinity.com/the_big_bang_theory_tv_series-289210943-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=14297', 'Amazon Prime Video', 'Compositor Barenaked Ladies', 'Our whole universe was in a hot, dense state...', 'Chuck Lorre', 'Warner Bros');
INSERT INTO SERIES (ProdID, TotalSeasons, TotalEpisodes, EpDuration)
VALUES (423456789, 6, 60, 20);

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (523456789, 'Como conoci a vuestra madre', '2005-09-19', 'https://www.sensacine.com/series/serie-446/temporada-1067/reparto/', 'Ted les cuenta a sus dos hijos cómo conoció a su madre y cómo fue su vida hasta que, por fin, encontró el amor verdadero. Contó para ello con la ayuda de su amigo Barney, un joven algo extravagante, adicto a los somníferos y muy hábil para conocer mujeres. Cuando Ted conoce a Robin, una impresionante joven canadiense que acaba de mudarse a Nueva York, está completamente seguro de que es amor a primera vista.', 'Comedia', '12', 100000000, 'https://www.youtube.com/watch?v=aJtVL2_fA5w', 'https://pics.filmaffinity.com/how_i_met_your_mother_tv_series-740256945-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=10807', 'Disney Plus', 'Compositor John Swihart', 'Our whole universe... A no esta no era', 'Carter Bays', 'CBS Productions');
INSERT INTO SERIES (ProdID, TotalSeasons, TotalEpisodes, EpDuration)
VALUES (523456789, 9, 208, 20);

INSERT INTO PRODUCT (ProdID, Title, ReleaseDate, Characters, Synopsis, Genre, Prizes, Collect, Trailer, Image, FDub, Platf, Compositor, BSO, Director, Producer)
VALUES (623456789, 'Arcane', '2021-11-06', 'https://www.sensacine.com/series/serie-29127/temporada-42820/reparto/', 'Con las dispares ciudades de Piltover y Zaun como telón de fondo, dos hermanas luchan en bandos opuestos de una guerra entre tecnologías mágicas y creencias enfrentadas.', 'Animación', '1', 400000000, 'https://www.youtube.com/watch?v=0qSarZpylxs', 'https://pics.filmaffinity.com/arcane_league_of_legends_tv_series-624235408-mmed.jpg' ,'https://www.eldoblaje.com/datos/FichaPelicula.asp?id=64818', 'Netflix', 'Compositor Alexander Temple', 'Oh,the misery Everybody wants to be my enemy', 'Rito Games', 'Fortiche');
INSERT INTO SERIES (ProdID, TotalSeasons, TotalEpisodes, EpDuration)
VALUES (623456789, 1, 9, 40);
