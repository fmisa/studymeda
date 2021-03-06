SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `studymedia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `studymedia` ;

-- -----------------------------------------------------
-- Table `studymedia`.`Category`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`Category` (
  `CategoryID` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(64) NULL ,
  `description` TEXT NULL ,
  PRIMARY KEY (`CategoryID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`Resource`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`Resource` (
  `ResourceID` INT NOT NULL AUTO_INCREMENT ,
  `Category_CategoryID` INT NOT NULL ,
  `name` VARCHAR(64) NOT NULL ,
  `description` TEXT NULL ,
  PRIMARY KEY (`ResourceID`, `Category_CategoryID`) ,
  INDEX `fk_Resource_Category_idx` (`Category_CategoryID` ASC) ,
  CONSTRAINT `fk_Resource_Category`
    FOREIGN KEY (`Category_CategoryID` )
    REFERENCES `studymedia`.`Category` (`CategoryID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`Type`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`Type` (
  `TypeID` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(64) NULL ,
  `description` TEXT NULL ,
  PRIMARY KEY (`TypeID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`SubType`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`SubType` (
  `SubTypeID` INT NOT NULL AUTO_INCREMENT ,
  `Type_TypeID` INT NOT NULL ,
  `name` VARCHAR(64) NOT NULL ,
  `description` TEXT NULL ,
  PRIMARY KEY (`SubTypeID`, `Type_TypeID`) ,
  INDEX `fk_SubType_Type1_idx` (`Type_TypeID` ASC) ,
  CONSTRAINT `fk_SubType_Type1`
    FOREIGN KEY (`Type_TypeID` )
    REFERENCES `studymedia`.`Type` (`TypeID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`Material`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`Material` (
  `MaterialID` INT NOT NULL AUTO_INCREMENT ,
  `Resource_ResourceID` INT NOT NULL ,
  `Type_TypeID` INT NOT NULL ,
  `SubType_SubTypeID` INT NOT NULL ,
  `url` VARCHAR(2000) NOT NULL ,
  `name` VARCHAR(64) NOT NULL ,
  `description` TEXT NULL ,
  PRIMARY KEY (`MaterialID`, `Resource_ResourceID`, `Type_TypeID`, `SubType_SubTypeID`) ,
  INDEX `fk_Material_Resource1_idx` (`Resource_ResourceID` ASC) ,
  INDEX `fk_Material_Type1_idx` (`Type_TypeID` ASC) ,
  INDEX `fk_Material_SubType1_idx` (`SubType_SubTypeID` ASC) ,
  CONSTRAINT `fk_Material_Resource1`
    FOREIGN KEY (`Resource_ResourceID` )
    REFERENCES `studymedia`.`Resource` (`ResourceID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Material_Type1`
    FOREIGN KEY (`Type_TypeID` )
    REFERENCES `studymedia`.`Type` (`TypeID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Material_SubType1`
    FOREIGN KEY (`SubType_SubTypeID` )
    REFERENCES `studymedia`.`SubType` (`SubTypeID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`User`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`User` (
  `UserID` INT NOT NULL AUTO_INCREMENT ,
  `role` VARCHAR(32) NULL ,
  `login` VARCHAR(256) NOT NULL ,
  `password` VARCHAR(8) NOT NULL ,
  `firstName` VARCHAR(32) NULL ,
  `lastName` VARCHAR(32) NULL ,
  `eMails` VARCHAR(256) NOT NULL ,
  `country` VARCHAR(64) NULL ,
  `state` VARCHAR(64) NULL ,
  `city` VARCHAR(64) NULL ,
  `address` VARCHAR(256) NULL ,
  `code` VARCHAR(16) NULL ,
  `phones` VARCHAR(16) NULL ,
  PRIMARY KEY (`UserID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`ResourceSupport`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`ResourceSupport` (
  `User_UserID` INT NOT NULL ,
  `Resource_ResourceID` INT NOT NULL ,
  `date` DATETIME NOT NULL ,
  `donation` DECIMAL(13,4) NULL ,
  PRIMARY KEY (`User_UserID`, `Resource_ResourceID`, `date`) ,
  INDEX `fk_ResourceSupport_User1_idx` (`User_UserID` ASC) ,
  INDEX `fk_ResourceSupport_Resource1_idx` (`Resource_ResourceID` ASC) ,
  CONSTRAINT `fk_ResourceSupport_User1`
    FOREIGN KEY (`User_UserID` )
    REFERENCES `studymedia`.`User` (`UserID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ResourceSupport_Resource1`
    FOREIGN KEY (`Resource_ResourceID` )
    REFERENCES `studymedia`.`Resource` (`ResourceID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`MaterialActivity`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`MaterialActivity` (
  `User_UserID` INT NOT NULL ,
  `Material_MaterialID` INT NOT NULL ,
  `date` DATETIME NOT NULL ,
  PRIMARY KEY (`User_UserID`, `Material_MaterialID`, `date`) ,
  INDEX `fk_MaterialActivity_Material1_idx` (`Material_MaterialID` ASC) ,
  CONSTRAINT `fk_MaterialActivity_User1`
    FOREIGN KEY (`User_UserID` )
    REFERENCES `studymedia`.`User` (`UserID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MaterialActivity_Material1`
    FOREIGN KEY (`Material_MaterialID` )
    REFERENCES `studymedia`.`Material` (`MaterialID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`Comments`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`Comments` (
  `MaterialActivity_User_UserID` INT NOT NULL ,
  `MaterialActivity_Material_MaterialID` INT NOT NULL ,
  `MaterialActivity_date` DATETIME NOT NULL ,
  `comments` TEXT NULL ,
  PRIMARY KEY (`MaterialActivity_User_UserID`, `MaterialActivity_Material_MaterialID`, `MaterialActivity_date`) ,
  CONSTRAINT `fk_Comments_MaterialActivity1`
    FOREIGN KEY (`MaterialActivity_User_UserID` , `MaterialActivity_Material_MaterialID` , `MaterialActivity_date` )
    REFERENCES `studymedia`.`MaterialActivity` (`User_UserID` , `Material_MaterialID` , `date` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `studymedia`.`Certification`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `studymedia`.`Certification` (
  `User_UserID` INT NOT NULL ,
  `Resource_ResourceID` INT NOT NULL ,
  `date` DATETIME NOT NULL ,
  `grade` INT NULL ,
  `qualifier` VARCHAR(32) NULL ,
  PRIMARY KEY (`User_UserID`, `Resource_ResourceID`) ,
  INDEX `fk_Certification_Resource1_idx` (`Resource_ResourceID` ASC) ,
  CONSTRAINT `fk_Certification_User1`
    FOREIGN KEY (`User_UserID` )
    REFERENCES `studymedia`.`User` (`UserID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Certification_Resource1`
    FOREIGN KEY (`Resource_ResourceID` )
    REFERENCES `studymedia`.`Resource` (`ResourceID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
