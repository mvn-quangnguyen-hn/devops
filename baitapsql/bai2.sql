CREATE TABLE Products (
  id INT NOT NULL AUTO_INCREMENT,
  name CHAR(20),
  price INT,
  quantity INT,
  PRIMARY KEY (id)
);

INSERT INTO Products (name,price,quantity)
VALUES ('Tomato',10,4),
('Cucumber',8,5),
('Red Pepper',20,2),
('Feta',40,1);

SELECT name FROM Products
ORDER BY price * quantity DESC, name ASC
LIMIT 1;
