-- -----------------------------------------------------
-- Table `message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `message` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `message` VARCHAR(500) NULL,
  `date` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Data for table `sample_db`.`message`
-- -----------------------------------------------------
START TRANSACTION;
INSERT INTO `message` (`id`, `name`, `message`, `date`) VALUES (DEFAULT, 'Sally', 'Just stopping by...', '2018-01-13');
INSERT INTO `message` (`id`, `name`, `message`, `date`) VALUES (DEFAULT, 'James', 'Only you can be yourself.', '2018-01-19');
INSERT INTO `message` (`id`, `name`, `message`, `date`) VALUES (DEFAULT, 'William', 'Tomorrow is the day after today.', '2018-01-30');
INSERT INTO `message` (`id`, `name`, `message`, `date`) VALUES (DEFAULT, 'Maria', 'Be the person that you are for at least one day.', '2018-02-15');
INSERT INTO `message` (`id`, `name`, `message`, `date`) VALUES (DEFAULT, 'John', 'It always seems impossible; occasionally it is.', '2018-03-01');

COMMIT;