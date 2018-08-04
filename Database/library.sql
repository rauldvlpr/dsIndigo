CREATE DATABASE `library` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `library`;

CREATE TABLE `library`.`books` (
  `idbooks` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `page` INT NULL,
  `author` VARCHAR(100) NULL,
  `editorial` VARCHAR(100) NULL,
  PRIMARY KEY (`idbooks`));