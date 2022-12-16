-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema spacioteens_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema spacioteens_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `spacioteens_db` DEFAULT CHARACTER SET utf8 ;
USE `spacioteens_db` ;

-- -----------------------------------------------------
-- Table `spacioteens_db`.`Perfil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spacioteens_db`.`Perfil` (
  `idPerfil` INT NOT NULL AUTO_INCREMENT,
  `Domicilio` VARCHAR(45) NULL,
  `CP` VARCHAR(5) NULL,
  `Telefono` VARCHAR(10) NULL,
  PRIMARY KEY (`idPerfil`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spacioteens_db`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spaciotcontactanosusuariousuariocontactanoscontactanoseens_db`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `NombreUsuario` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Contrasenia` VARCHAR(45) NOT NULL,
  `Perfil_idPerfil` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Perfil_idx` (`Perfil_idPerfil` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Perfil`
    FOREIGN KEY (`Perfil_idPerfil`)
    REFERENCES `spacioteens_db`.`Perfil` (`idPerfil`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spacioteens_db`.`Orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spacioteens_db`.`Orden` (
  `idOrden` INT NOT NULL AUTO_INCREMENT,
  `Precio` DOUBLE NOT NULL,
  `Cantidad` VARCHAR(45) NOT NULL,
  `Fecha_creacion` DATETIME NOT NULL,
  `idProductos` INT NOT NULL,
  `Perfil_idPerfil` INT NOT NULL,
  PRIMARY KEY (`idOrden`, `Perfil_idPerfil`),
  INDEX `idProductos_idx` (`idProductos` ASC) VISIBLE,
  INDEX `fk_Orden_Perfil1_idx` (`Perfil_idPerfil` ASC) VISIBLE,
  CONSTRAINT `idProductos`
    FOREIGN KEY (`idProductos`)
    REFERENCES `spacioteens_db`.`Producto` (`idProducto`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Orden_Perfil1`
    FOREIGN KEY (`Perfil_idPerfil`)
    REFERENCES `spacioteens_db`.`Perfil` (`idPerfil`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spacioteens_db`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spacioteens_db`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `NombreProducto` VARCHAR(45) NOT NULL,
  `Precio` DOUBLE NOT NULL,
  `Descripcion` VARCHAR(45) NOT NULL,
  `Imagen` VARCHAR(45) NOT NULL,
  `Stock` VARCHAR(45) NOT NULL,
  `Categoria` VARCHAR(45) NOT NULL,
  `Categoria_idCategoria` INT NOT NULL,
  PRIMARY KEY (`idProducto`, `Categoria_idCategoria`),
  CONSTRAINT `fk_Producto_Orden1`
    FOREIGN KEY (`idProducto`)
    REFERENCES `spacioteens_db`.`Orden` (`idProductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spacioteens_db`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spacioteens_db`.`Pago` (
  `idPago` INT NOT NULL AUTO_INCREMENT,
  `Referencia` VARCHAR(45) NOT NULL,
  `FechaCompra` DATETIME NOT NULL,
  `MontoTotal` DOUBLE NOT NULL,
  `MetodoPago` VARCHAR(45) NOT NULL,
  `Orden_idOrden` INT NOT NULL,
  PRIMARY KEY (`idPago`, `Orden_idOrden`),
  INDEX `fk_Pago_Orden1_idx` (`Orden_idOrden` ASC) VISIBLE,
  CONSTRAINT `fk_Pago_Orden1`
    FOREIGN KEY (`Orden_idOrden`)
    REFERENCES `spacioteens_db`.`Orden` (`idOrden`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `spacioteens_db`.`Contactanos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `spacioteens_db`.`Contactanos` (
  `idContactanos` INT NOT NULL AUTO_INCREMENT,
  `Asunto` VARCHAR(45) NOT NULL,
  `Mensaje` VARCHAR(255) NOT NULL,
  `Perfil_idPerfil` INT NOT NULL,
  PRIMARY KEY (`idContactanos`, `Perfil_idPerfil`),
  INDEX `fk_Contactanos_Perfil1_idx` (`Perfil_idPerfil` ASC) VISIBLE,
  CONSTRAINT `fk_Contactanos_Perfil1`
    FOREIGN KEY (`Perfil_idPerfil`)
    REFERENCES `spacioteens_db`.`Perfil` (`idPerfil`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
