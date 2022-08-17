CREATE TABLE Grades (
  Name CHAR(20),
  ID INT UNSIGNED,
  Midterm1 INT,
  Midterm2 INT,
  Final INT
);

INSERT INTO Grades
VALUES ('David',42334,34,54,124),
('Anthony',54528,100,10,50),
('Jonathan',58754,49,58,121),
('Jonty',11000,25,30,180);

SELECT Name,ID FROM Grades
WHERE Final > (Midterm1 + Midterm2)
ORDER BY LEFT(NAME, 3), id ASC;
