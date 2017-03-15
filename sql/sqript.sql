-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema matchpredictiondb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema matchpredictiondb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `matchpredictiondb` DEFAULT CHARACTER SET utf8 ;
USE `matchpredictiondb` ;

-- -----------------------------------------------------
-- Table `matchpredictiondb`.`league`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `matchpredictiondb`.`league` (
  `league_id` INT NOT NULL AUTO_INCREMENT,
  `league_name` VARCHAR(45) NOT NULL,
  `bet_click_league_id` MEDIUMTEXT NOT NULL,
  PRIMARY KEY (`league_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `matchpredictiondb`.`types_of_bet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `matchpredictiondb`.`types_of_bet` (
  `types_of_bet_id` INT NOT NULL AUTO_INCREMENT,
  `types_of_bet_name` VARCHAR(45) NOT NULL,
  `types_of_bet_code` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`types_of_bet_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `matchpredictiondb`.`types_of_bets_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `matchpredictiondb`.`types_of_bets_item` (
  `types_of_bets_item_id` INT NOT NULL AUTO_INCREMENT,
  `types_of_bets_item_name` VARCHAR(45) NOT NULL,
  `types_of_bets_id` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`types_of_bets_item_id`),
  INDEX `fk_types_of_bets_item_types_of_bet_idx` (`types_of_bets_id` ASC),
  CONSTRAINT `fk_types_of_bets_item_types_of_bet`
    FOREIGN KEY (`types_of_bets_id`)
    REFERENCES `matchpredictiondb`.`types_of_bet` (`types_of_bet_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `matchpredictiondb`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `matchpredictiondb`.`team` (
  `team_id` INT NOT NULL AUTO_INCREMENT,
  `team_name` VARCHAR(45) NULL,
  `league_id` INT NOT NULL,
  PRIMARY KEY (`team_id`),
  INDEX `fk_team_league1_idx` (`league_id` ASC),
  CONSTRAINT `fk_team_league1`
    FOREIGN KEY (`league_id`)
    REFERENCES `matchpredictiondb`.`league` (`league_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `matchpredictiondb`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `matchpredictiondb`.`game` (
  `game_id` INT NOT NULL,
  `team_id_home` INT NOT NULL,
  `team_id_guest` INT NOT NULL,
  `game_time` DATETIME NULL,
  `result_home_halftime` INT NULL,
  `result_guest_halftime` INT NULL,
  `result_home_end` INT NULL,
  `result_guest_end` INT NULL,
  `check` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`game_id`, `team_id_home`),
  INDEX `fk_game_team1_idx` (`team_id_home` ASC),
  INDEX `fk_game_team2_idx` (`team_id_guest` ASC),
  CONSTRAINT `fk_game_team1`
    FOREIGN KEY (`team_id_home`)
    REFERENCES `matchpredictiondb`.`team` (`team_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_game_team2`
    FOREIGN KEY (`team_id_guest`)
    REFERENCES `matchpredictiondb`.`team` (`team_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `matchpredictiondb`.`game_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `matchpredictiondb`.`game_item` (
  `game_item_id` INT NOT NULL AUTO_INCREMENT,
  `date` DATETIME NULL,
  `game_id` INT NULL,
  `types_of_items_id` INT NULL,
  `quota` FLOAT NULL DEFAULT 0,
  PRIMARY KEY (`game_item_id`),
  INDEX `fk_game_item_types_of_bets_item1_idx` (`types_of_items_id` ASC),
  INDEX `fk_game_item_game1_idx` (`game_id` ASC),
  CONSTRAINT `fk_game_item_types_of_bets_item1`
    FOREIGN KEY (`types_of_items_id`)
    REFERENCES `matchpredictiondb`.`types_of_bets_item` (`types_of_bets_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_game_item_game1`
    FOREIGN KEY (`game_id`)
    REFERENCES `matchpredictiondb`.`game` (`game_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
