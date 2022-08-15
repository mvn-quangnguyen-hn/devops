INSERT INTO full_year (newspayper,subscriber)
VALUES ('The Paragon Herald','Crissy Sepe'),
('The Daily Reporter','Tonie Moreton'),
('Morningtide Daily','Erwin Chitty'),
('Daily Breakfast','Tonie Moreton'),
('Independent Weekly','Lavelle Phu');

CREATE TABLE half_year (
  id INT NOT NULL AUTO_INCREMENT,
  newspayper CHAR(50),
  subscriber CHAR(50),
  PRIMARY KEY (id)
);

INSERT INTO half_year (newspayper,subscriber)
VALUES ('The Daily Reporter','Lavelle Phu'),
('Daily Breakfast','Tonie Moreton'),
('The Paragon Herald','Lia Cover'),
('The Community Gazette','Lavelle Phu'),
('Nova Daily','Lia Cover'),
('Nova Daily','Joya Buss');

WITH uni AS (
	SELECT * FROM full_year
	UNION ALL
	SELECT * FROM half_year
)

SELECT subscriber FROM uni
WHERE newspayper LIKE '%Daily%'
GROUP BY subscriber
ORDER BY subscriber ASC;