1-test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

-- CREATE TABLE employee ( 
id SERIAL PRIMARY KEY, 
name VARCHAR(50) NOT NULL,
birthday DATE NOT NULL, 
email VARCHAR(100) );  

2- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
--https://www.mockaroo.com/ sitesinden hazir alindi
-- insert into employee (name, email, birthday) values ('Tawnya', 'tbleckly0@arizona.edu', null);
insert into employee (name, email, birthday) values ('Bennett', 'bnutkins1@xrea.com', '1961-06-12');
insert into employee (name, email, birthday) values ('Katinka', 'kcorrie2@time.com', '1968-12-19');
insert into employee (name, email, birthday) values ('Camel', 'ccarrell3@networkadvertising.org', '2004-03-13');
insert into employee (name, email, birthday) values ('Laurel', null, '1922-03-25');
insert into employee (name, email, birthday) values ('Beulah', 'bormes5@chicagotribune.com', null);
insert into employee (name, email, birthday) values ('Geoffry', 'gfarlam6@sbwire.com', '1977-10-23');
insert into employee (name, email, birthday) values ('Steffi', 'sdenzilow7@zdnet.com', '1936-09-14');
insert into employee (name, email, birthday) values ('Deva', 'dbenda8@plala.or.jp', '1940-04-25');
insert into employee (name, email, birthday) values ('Gerik', 'gklawi9@home.pl', '1916-06-29');
insert into employee (name, email, birthday) values ('Cash', 'cbolmanna@quantcast.com', '2011-05-18');
insert into employee (name, email, birthday) values ('Trixi', 'tstudeartb@wp.com', '1921-04-01');
insert into employee (name, email, birthday) values ('Alister', 'abriertonc@alexa.com', '1997-12-07');
insert into employee (name, email, birthday) values ('Brita', null, '1976-02-01');
insert into employee (name, email, birthday) values ('Adorne', 'aclitheroee@github.io', '2015-06-29');
insert into employee (name, email, birthday) values ('Margie', 'meldonf@stumbleupon.com', '1978-06-12');
insert into employee (name, email, birthday) values ('Tommy', 'tfransonig@wordpress.org', '1913-03-17');
insert into employee (name, email, birthday) values ('Ailey', 'atommish@thetimes.co.uk', '1913-01-22');
insert into employee (name, email, birthday) values ('Livvyy', 'lticei@skyrock.com', '1951-08-01');
insert into employee (name, email, birthday) values ('Les', 'lgittosej@barnesandnoble.com', '1922-11-06');
insert into employee (name, email, birthday) values ('Portie', null, '1992-08-20');
insert into employee (name, email, birthday) values ('Isidro', 'icunnahl@hatena.ne.jp', '1968-05-02');
insert into employee (name, email, birthday) values ('Elroy', 'ehannym@diigo.com', '1976-03-06');
insert into employee (name, email, birthday) values ('Claudio', 'cduffern@washingtonpost.com', '2008-06-18');
insert into employee (name, email, birthday) values ('Niel', null, '2011-05-16');
insert into employee (name, email, birthday) values ('Lynn', null, '1988-03-16');
insert into employee (name, email, birthday) values ('Norrie', 'nskerrittq@ed.gov', '1974-04-05');
insert into employee (name, email, birthday) values ('Desmond', null, '1954-04-25');
insert into employee (name, email, birthday) values ('Tillie', 'tpines@illinois.edu', '1959-03-24');
insert into employee (name, email, birthday) values ('Melanie', 'mhustlert@seattletimes.com', '2004-09-03');
insert into employee (name, email, birthday) values ('Corabella', 'chebborneu@sphinn.com', '2002-07-06');
insert into employee (name, email, birthday) values ('Ofilia', 'ohylandsv@webs.com', '2001-01-20');
insert into employee (name, email, birthday) values ('April', 'aspilemanw@privacy.gov.au', null);
insert into employee (name, email, birthday) values ('Cindee', 'csimeolix@ebay.com', null);
insert into employee (name, email, birthday) values ('Humfrey', 'hiacovaccioy@goo.gl', '2024-03-22');
insert into employee (name, email, birthday) values ('Reggie', 'rcaenz@netlog.com', null);
insert into employee (name, email, birthday) values ('Nicolas', 'ndebruijn10@qq.com', '1921-12-10');
insert into employee (name, email, birthday) values ('Kathrine', 'ktuberfield11@google.ca', '1957-09-17');
insert into employee (name, email, birthday) values ('Judon', null, '1918-12-18');
insert into employee (name, email, birthday) values ('Pavel', 'paloshkin13@china.com.cn', '1903-10-05');
insert into employee (name, email, birthday) values ('Freda', 'frasor14@unicef.org', '1977-12-27');
insert into employee (name, email, birthday) values ('Vivienne', 'vferencz15@tamu.edu', '1973-10-05');
insert into employee (name, email, birthday) values ('Dillie', null, '1986-05-09');
insert into employee (name, email, birthday) values ('Grantley', 'gbeggin17@bloglovin.com', '1987-10-27');
insert into employee (name, email, birthday) values ('Matteo', 'mfullager18@ca.gov', '1937-09-16');
insert into employee (name, email, birthday) values ('Salim', 'saugar19@chronoengine.com', '1972-10-24');
insert into employee (name, email, birthday) values ('Auberon', 'avamplers1a@lycos.com', null);
insert into employee (name, email, birthday) values ('Brice', 'bsymondson1b@irs.gov', '1945-03-09');
insert into employee (name, email, birthday) values ('Dean', 'dridler1c@1und1.de', '2024-04-12');
insert into employee (name, email, birthday) values ('Vita', null, '1925-07-18');

3-Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

-- UPDATE employee 
SET name = "Bera",
email = "berayilmazbm@gmail.com",
birthday = "1999-08-04",

4-Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

-- DELETE FROM emplooyee
WHERE name = ?,email = ? , birthday = ?
WHERE id BETWEEN 1 AND 5