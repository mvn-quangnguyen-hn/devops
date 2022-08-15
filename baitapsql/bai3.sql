INSERT INTO users (name,score) 
VALUES ('gongy',3001),
('urandom',2401),
('eduardische',2477),
('Gassa',2999),
('bcc32',2658),
('Alex_2oo8',6000),
('mirosuaf',2479),
('Sparik',2399),
('thomas_holmes',2478),
('cthaeghya',2400);

SELECT name FROM users
ORDER BY score DESC
LIMIT 3,5;