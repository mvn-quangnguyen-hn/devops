CREATE TABLE users (
  id INT,
  username CHAR(20),
  role CHAR(20),
  email CHAR(40)
);

INSERT INTO users
VALUES (6,'fasalytch','premium','much.premium@role.com'),
(13,'luckygirl','regular','fun@meh.com'),
(16,'todayhumor','guru','today@humor.com'),
(23,'Felix','admin','felix@codefights.com'),
(52,'admin666','AdmiN','iamtheadmin@admin.admin'),
(87,'solver100500','regular','email@notbot.com');

SELECT email FROM users
WHERE role != 'admin' AND role != 'premium'
ORDER BY email ASC;
