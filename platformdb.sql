
CREATE DATABASE platformdb;

USE platformdb;

CREATE TABLE Platform (
	IDPlatform INT AUTO_INCREMENT PRIMARY KEY,
    NamePlatform VARCHAR(255),
    PricePerMonth DOUBLE
);

CREATE TABLE Category (
	IDCategory INT AUTO_INCREMENT PRIMARY KEY,
    NameCategory VARCHAR(255)
);

CREATE TABLE Series (
	IDSeries INT AUTO_INCREMENT PRIMARY KEY,
    NameSeries VARCHAR(255),
    NumberOfSeasons INT,

    IDCategory INT,
    IDPlatform INT,
    
    FOREIGN KEY (IDCategory) REFERENCES Category(IDCategory),
    FOREIGN KEY (IDPlatform) REFERENCES Platform(IDPlatform)
);

INSERT INTO Platform (NamePlatform, PricePerMonth) 
	VALUES ("Netflix", 12.99);

INSERT INTO Platform (NamePlatform, PricePerMonth) 
	VALUES ("HBO GO", 10.99);

INSERT INTO Platform (NamePlatform, PricePerMonth) 
	VALUES ("Disney +", 15.99);


SELECT * FROM Platform;

INSERT INTO Category (NameCategory)
	VALUES ("Drama");

INSERT INTO Category (NameCategory)
	VALUES ("Comedy");

INSERT INTO Category (NameCategory)
	VALUES ("Documentary");

SELECT * FROM Category;

SELECT * FROM Series;


SELECT * FROM Series s
	INNER JOIN Category c
    ON s.IDCategory = c.IDCategory
    WHERE NameCategory = "Drama";


SELECT * FROM Series;
