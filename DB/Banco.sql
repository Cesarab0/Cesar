CREATE DATABASE PROVA_FINAL;


CREATE TABLE COMPANHIA (
    ID_COMPANHIA INT AUTO_INCREMENT PRIMARY KEY,
    NOME VARCHAR(255) NOT NULL,
    CNPJ VARCHAR(14) NOT NULL
);

CREATE TABLE HANGAR (
    ID_HANGAR INT AUTO_INCREMENT PRIMARY KEY,
    LOCAL VARCHAR(255) NOT NULL,
    ID_AVIAO INT
);



CREATE TABLE AVIAO (
    ID_AVIAO INT AUTO_INCREMENT PRIMARY KEY,
    MARCA  VARCHAR(255) NOT NULL,
    MODELO  VARCHAR(255) NOT NULL,
    PREFIXO  VARCHAR(3) NOT NULL,
    CAPACIDADE INT,
    ID_COMPANHIA INT
);



CREATE TABLE HELICOPTERO (
    ID_HELICOPTERO INT AUTO_INCREMENT PRIMARY KEY,
    MARCA VARCHAR(255) NOT NULL,
    MODELO VARCHAR(255) NOT NULL,
    COR VARCHAR(255),
    CAPACIDADE INT NOT NULL
);



CREATE TABLE PISTA (
    ID_PISTA INT AUTO_INCREMENT PRIMARY KEY,
    NUMERO VARCHAR(255) NOT NULL
);


CREATE TABLE JATO (
    ID_JATO INT AUTO_INCREMENT PRIMARY KEY,
    MARCA  VARCHAR(255) NOT NULL,
    MODELO  VARCHAR(255) NOT NULL,
    COR VARCHAR(255),
    VELOCIDADE INT NOT NULL
);



CREATE TABLE VOO (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NUMERO VARCHAR(8) NOT NULL,
    DATA VARCHAR(8) NOT NULL,
    HORA VARCHAR(4) NOT NULL,
    ORIGEM VARCHAR(3) NOT NULL,
    DESTINO VARCHAR(3) NOT NULL,
    PILOTO VARCHAR(255) NOT NULL,
    COPILOTO VARCHAR(255) NOT NULL,
    ID_PISTA INT,
    ID_AVIAO INT,
    ID_HELICOPTERO INT,
    ID_JATO INT
);


ALTER TABLE AVIAO
ADD FOREIGN KEY (ID_COMPANHIA) REFERENCES COMPANHIA(ID_COMPANHIA);

ALTER TABLE HANGAR
ADD FOREIGN KEY (ID_AVIAO) REFERENCES AVIAO(ID_AVIAO);

ALTER TABLE VOO
ADD FOREIGN KEY (ID_PISTA) REFERENCES PISTA(ID_PISTA);

ALTER TABLE VOO
ADD FOREIGN KEY (ID_AVIAO) REFERENCES AVIAO(ID_AVIAO);

ALTER TABLE VOO
ADD FOREIGN KEY (ID_HELICOPTERO) REFERENCES HELICOPTERO(ID_HELICOPTERO);

ALTER TABLE VOO
ADD FOREIGN KEY (ID_JATO) REFERENCES JATO(ID_JATO);



