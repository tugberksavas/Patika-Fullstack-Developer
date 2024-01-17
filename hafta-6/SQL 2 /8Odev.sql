
-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

CREATE TABLE employee (
                          id INTEGER PRIMARY KEY,
                          name VARCHAR(50) NOT NULL,
                          birthday DATE,
                          email VARCHAR(100)
);

insert into employee (id, name, birthday, email) values (1, 'Anny', '2023-07-27', 'avanderson0@google.es');
insert into employee (id, name, birthday, email) values (2, 'Lyell', '2023-09-06', 'llansdown1@goodreads.com');
insert into employee (id, name, birthday, email) values (3, 'Gabbi', '2023-03-25', 'goxenbury2@archive.org');
insert into employee (id, name, birthday, email) values (4, 'Jamal', '2023-03-29', 'jhardwicke3@ucoz.com');
insert into employee (id, name, birthday, email) values (5, 'Sada', '2023-09-18', 'sgray4@businessinsider.com');
insert into employee (id, name, birthday, email) values (6, 'Alexandra', '2023-03-03', 'astansby5@gnu.org');
insert into employee (id, name, birthday, email) values (7, 'Kai', '2023-07-12', 'kpollock6@weibo.com');
insert into employee (id, name, birthday, email) values (8, 'Manfred', '2023-09-14', 'mclemmett7@wikispaces.com');
insert into employee (id, name, birthday, email) values (9, 'Brad', '2023-03-22', 'btesoe8@wiley.com');
insert into employee (id, name, birthday, email) values (10, 'Florian', '2023-06-29', 'felgee9@home.pl');
insert into employee (id, name, birthday, email) values (11, 'Waylin', '2023-04-03', 'wtilliarda@alexa.com');
insert into employee (id, name, birthday, email) values (12, 'Kamilah', '2023-11-25', 'kbasnettb@cloudflare.com');
insert into employee (id, name, birthday, email) values (13, 'Regina', '2023-01-25', 'rfiggec@wordpress.com');
insert into employee (id, name, birthday, email) values (14, 'Grissel', '2023-11-03', 'gborgnold@nasa.gov');
insert into employee (id, name, birthday, email) values (15, 'Cyrillus', '2023-08-14', 'cwesone@ca.gov');
insert into employee (id, name, birthday, email) values (16, 'Darnell', '2023-10-08', 'dgowerf@harvard.edu');
insert into employee (id, name, birthday, email) values (17, 'Richy', '2023-12-20', 'rsaggsg@mozilla.org');
insert into employee (id, name, birthday, email) values (18, 'Brana', '2023-10-19', 'bdeabillh@google.com');
insert into employee (id, name, birthday, email) values (19, 'Jobina', '2023-09-07', 'jthiesi@networkadvertising.org');
insert into employee (id, name, birthday, email) values (20, 'Marina', '2023-11-11', 'mtansillj@so-net.ne.jp');
insert into employee (id, name, birthday, email) values (21, 'Hobard', '2023-10-21', 'hrainardk@biblegateway.com');
insert into employee (id, name, birthday, email) values (22, 'Yvette', '2023-06-22', 'ysneydl@mediafire.com');
insert into employee (id, name, birthday, email) values (23, 'Sherry', '2023-07-03', 'smedmorem@alexa.com');
insert into employee (id, name, birthday, email) values (24, 'Danya', '2023-08-04', 'dmcguirkn@hatena.ne.jp');
insert into employee (id, name, birthday, email) values (25, 'Harrison', '2023-09-03', 'hmounfieldo@pen.io');
insert into employee (id, name, birthday, email) values (26, 'Maxine', '2023-02-16', 'msturmp@apache.org');
insert into employee (id, name, birthday, email) values (27, 'Neville', '2023-05-10', 'ntwohigq@dailymotion.com');
insert into employee (id, name, birthday, email) values (28, 'Kain', '2023-06-12', 'kblaymiresr@privacy.gov.au');
insert into employee (id, name, birthday, email) values (29, 'Scott', '2023-09-29', 'sbossinghams@redcross.org');
insert into employee (id, name, birthday, email) values (30, 'Joline', '2023-03-17', 'jrippingalet@yelp.com');
insert into employee (id, name, birthday, email) values (31, 'Sanford', '2023-08-07', 'scheateru@seesaa.net');
insert into employee (id, name, birthday, email) values (32, 'Glad', '2023-09-14', 'gkunklerv@independent.co.uk');
insert into employee (id, name, birthday, email) values (33, 'Hieronymus', '2023-09-28', 'hghidiniw@who.int');
insert into employee (id, name, birthday, email) values (34, 'Corliss', '2023-12-11', 'cpettigrewx@sohu.com');
insert into employee (id, name, birthday, email) values (35, 'Brenden', '2023-09-11', 'bhixleyy@walmart.com');
insert into employee (id, name, birthday, email) values (36, 'Roddie', '2024-01-03', 'rbucklerz@nymag.com');
insert into employee (id, name, birthday, email) values (37, 'Hadlee', '2023-05-25', 'hsisse10@sohu.com');
insert into employee (id, name, birthday, email) values (38, 'Gery', '2023-01-29', 'gsheard11@wikia.com');
insert into employee (id, name, birthday, email) values (39, 'Cara', '2023-05-31', 'ccurrey12@nifty.com');
insert into employee (id, name, birthday, email) values (40, 'Fredia', '2023-02-13', 'fpyne13@twitter.com');
insert into employee (id, name, birthday, email) values (41, 'Crystie', '2023-01-18', 'cjossum14@unblog.fr');
insert into employee (id, name, birthday, email) values (42, 'Malchy', '2023-07-06', 'mrowett15@de.vu');
insert into employee (id, name, birthday, email) values (43, 'Jobie', '2023-05-15', 'jwharmby16@paypal.com');
insert into employee (id, name, birthday, email) values (44, 'Egor', '2023-03-28', 'eodo17@toplist.cz');
insert into employee (id, name, birthday, email) values (45, 'Reeva', '2023-05-10', 'rlerven18@php.net');
insert into employee (id, name, birthday, email) values (46, 'Filia', '2023-09-11', 'flassey19@e-recht24.de');
insert into employee (id, name, birthday, email) values (47, 'Rockwell', '2023-01-19', 'rchadbourne1a@google.pl');
insert into employee (id, name, birthday, email) values (48, 'Ermanno', '2023-07-21', 'edaltrey1b@hao123.com');
insert into employee (id, name, birthday, email) values (49, 'Goldarina', '2023-11-18', 'gpickover1c@accuweather.com');
insert into employee (id, name, birthday, email) values (50, 'Cammy', '2023-04-22', 'cmulvany1d@typepad.com');

--1
UPDATE employee
SET name = 'Robert',
    birthday = '1992-11-10'
WHERE id = 6 ;
--2
UPDATE employee
SET birthday = '1985-06-15',
    email = 'neville@daily.com'
WHERE name = 'Neville';
--3
UPDATE employee
SET email = 'oliver.new@example.com'
WHERE id = 40;
--4
UPDATE employee
SET name = 'Harrison',
    birthday = '1990-01-01'
WHERE email = 'cwesone@ca.gov';
--5
UPDATE employee
SET id = 51
WHERE birthday = '1990-01-01';

--------------------
--1
DELETE FROM employee
WHERE id = 51;
--2
DELETE FROM employee
WHERE name = 'Peterson';
--3
DELETE FROM employee
WHERE birthday = '1991-02-02';
--4
DELETE FROM employee
WHERE email = 'djıasfjef@com.tr';
--5
DELETE FROM employee
WHERE id < 5;