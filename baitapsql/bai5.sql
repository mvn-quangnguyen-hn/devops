CREATE TABLE Suspect (
  id INT NOT NULL AUTO_INCREMENT,
  name CHAR(10),
  surname CHAR(10),
  height INT,
  weight INT,
  PRIMARY KEY (id)
);

INSERT INTO Suspect (name,surname,height,weight)
VALUES ('John','Doe',165,60),
('Bill','Green',170,67),
('Baelfire','Grehn',172,70),
('Bill','Gretan',165,55),
('Brendon','Grewn',150,50),
('bill','Green',169,50);

SELECT id,name,surname FROM Suspect
WHERE height <= 170 AND name LIKE 'B%' AND surname LIKE 'Gre_n';
