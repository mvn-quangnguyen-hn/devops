CREATE TABLE users (
  first_name CHAR(20),
  second_name CHAR(20),
  attribute CHAR(100)
);

INSERT INTO users
VALUES ('Mikel','Cover','%Mikel_Cover%'),
('Vicenta','Kravitz','0%Vicenta_Kravitz%'),
('Tosha','Cover','02V01aJ767GF7L186|pIfBROfQ5406Q02YcpG42LDF4Bv26'),
('Shayne','Dahlquist','OROV331K8Q7ypBi4Az3B6Nm0jCqUk%Shayne_Dahlquist%46E300u7t7'),
('Carrol','Llanes','2mDIb1SdJne5wfH1AI32BE92r7j1d60PJ263b2vyPn3zxQ2P7sVOM26J11UT6WONp'),
('Lizabeth','Cover','d1gM87SONEHp386jXOkOaDc7w8bx448q7D82ff2Z4YT43iLyZ39xYbEDXMk'),
('Mack','Chace','fAnU49nMrmGu30862717ne3qqqSPJDnq6dwW607lahNB5DinTR2Rkp549G7'),
('Vicenta','Marchese','kUJ3N67vLB07mQL9Ai7p18cXGzjdT32r8283ZQi'),
('Mikel','Kravitz','PBX86iw1led8790arE6sdSLdt%Mikel_Kravitz%W73XOY9YaOgi060r2x12D2EmD7'),
('Deirdre','Chace','PBX86iw1led87Z90arE6sdSLdtDeirdrelChaceW73XOY9YaOgi060r2x12D2EmD7'),
('Josphine','Arzate','PWWD95BCKVYn5YD7iHLMa3Hjp9tH%josphine_arzate%d2hNHNd3RpqfUREN47'),
('Deirdre','Chace','ryCE5FlyS8q54A5036luzVS91j6C7P76E9X0058htzgthuX24LG%DEirdre_Chace%'),
('Julietta','Beer','Tn35g5h51u7ltW946J');

SELECT * FROM users
WHERE BINARY attribute LIKE CONCAT('%', first_name, '\_', second_name, '%')
ORDER BY attribute ASC;