-- Ödev 8

-- 1-test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
-- 2-Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
-- 3-Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
-- 4-Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

-- Cevap 1-)
CREATE TABLE employee(
id int PRIMARY KEY,
name VARCHAR(50) NOT NULL,
birthday DATE NOT NULL,
email VARCHAR(100) NULL    
);

-- Cevap 2-)
INSERT INTO employee (id, name, birthday, email) VALUES (1, 'Roxana Sturney', '1977-01-26', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (2, 'Budd Whelband', '1992-04-08', 'bwhelband1@tripod.com');
INSERT INTO employee (id, name, birthday, email) VALUES (3, 'Nariko Creber', '1987-12-15', 'ncreber2@cam.ac.uk');
INSERT INTO employee (id, name, birthday, email) VALUES (4, 'Fina Heselwood', '1990-03-04', 'fheselwood3@wsj.com');
INSERT INTO employee (id, name, birthday, email) VALUES (5, 'Ring Shawe', '1958-07-23', 'rshawe4@joomla.org');
INSERT INTO employee (id, name, birthday, email) VALUES (6, 'Conrade Faich', '1986-02-13', 'cfaich5@plala.or.jp');
INSERT INTO employee (id, name, birthday, email) VALUES (7, 'Amos Woodyear', '1988-02-24', 'awoodyear6@myspace.com');
INSERT INTO employee (id, name, birthday, email) VALUES (8, 'Clerissa Harburtson', '2002-01-24', 'charburtson7@soundcloud.com');
INSERT INTO employee (id, name, birthday, email) VALUES (9, 'Coletta Dannohl', '2010-01-05', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (10, 'Kaine Hazeldine', '2000-12-14', 'khazeldine9@nps.gov');
INSERT INTO employee (id, name, birthday, email) VALUES (11, 'Flinn Baugh', '2008-01-31', 'fbaugha@cbsnews.com');
INSERT INTO employee (id, name, birthday, email) VALUES (12, 'Lindsy Grovier', '1960-10-14', 'lgrovierb@dropbox.com');
INSERT INTO employee (id, name, birthday, email) VALUES (13, 'Paulie Mudge', '2021-05-05', 'pmudgec@wordpress.com');
INSERT INTO employee (id, name, birthday, email) VALUES (14, 'Arch Gorusso', '1972-03-31', 'agorussod@imageshack.us');
INSERT INTO employee (id, name, birthday, email) VALUES (15, 'Joelly Baudi', '1989-10-26', 'jbaudie@java.com');
INSERT INTO employee (id, name, birthday, email) VALUES (16, 'Olvan Pearcehouse', '1966-01-06', 'opearcehousef@thetimes.co.uk');
INSERT INTO employee (id, name, birthday, email) VALUES (17, 'Ilka Sear', '1984-03-30', 'isearg@free.fr');
INSERT INTO employee (id, name, birthday, email) VALUES (18, 'Yorker Pheasey', '1957-12-13', 'ypheaseyh@ucoz.ru');
INSERT INTO employee (id, name, birthday, email) VALUES (19, 'Etty Fayerman', '1957-11-30', 'efayermani@fda.gov');
INSERT INTO employee (id, name, birthday, email) VALUES (20, 'Mame Pieper', '2020-11-25', 'mpieperj@marriott.com');
INSERT INTO employee (id, name, birthday, email) VALUES (21, 'Robinet Deek', '1957-03-01', 'rdeekk@diigo.com');
INSERT INTO employee (id, name, birthday, email) VALUES (22, 'Jacynth Borman', '1996-12-21', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (23, 'Vicki Kitley', '2006-08-20', 'vkitleym@bing.com');
INSERT INTO employee (id, name, birthday, email) VALUES (24, 'Rochette Dinley', '2018-07-27', 'rdinleyn@friendfeed.com');
INSERT INTO employee (id, name, birthday, email) VALUES (25, 'Berta Prew', '2021-03-16', 'bprewo@nationalgeographic.com');
INSERT INTO employee (id, name, birthday, email) VALUES (26, 'Bryon Pristnor', '1996-11-11', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (27, 'Sherline Bartlett', '1970-12-04', 'sbartlettq@jalbum.net');
INSERT INTO employee (id, name, birthday, email) VALUES (28, 'Gino Chowne', '2009-03-01', 'gchowner@yolasite.com');
INSERT INTO employee (id, name, birthday, email) VALUES (29, 'Bondy Teggart', '2005-04-02', 'bteggarts@google.it');
INSERT INTO employee (id, name, birthday, email) VALUES (30, 'Adrea Cunnow', '1967-11-20', 'acunnowt@google.com.au');
INSERT INTO employee (id, name, birthday, email) VALUES (31, 'Melony Hurrion', '1998-03-17', 'mhurrionu@mozilla.org');
INSERT INTO employee (id, name, birthday, email) VALUES (32, 'Em Sentance', '2013-06-27', 'esentancev@flickr.com');
INSERT INTO employee (id, name, birthday, email) VALUES (33, 'Mathian Hurdedge', '2002-09-26', 'mhurdedgew@booking.com');
INSERT INTO employee (id, name, birthday, email) VALUES (34, 'Kyle Haslehurst', '1993-11-02', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (35, 'Ransell Dunne', '1959-03-10', 'rdunney@google.ca');
INSERT INTO employee (id, name, birthday, email) VALUES (36, 'Dido Spittal', '1981-06-26', 'dspittalz@elegantthemes.com');
INSERT INTO employee (id, name, birthday, email) VALUES (37, 'Roarke Trumpeter', '2013-01-31', 'rtrumpeter10@whitehouse.gov');
INSERT INTO employee (id, name, birthday, email) VALUES (38, 'Catie MacAndreis', '1981-07-28', 'cmacandreis11@barnesandnoble.com');
INSERT INTO employee (id, name, birthday, email) VALUES (39, 'Jillene Tolussi', '2021-03-31', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (40, 'Bryon Grishanin', '2017-11-07', 'bgrishanin13@4shared.com');
INSERT INTO employee (id, name, birthday, email) VALUES (41, 'Fraser Mecchi', '1960-03-26', NULL);
INSERT INTO employee (id, name, birthday, email) VALUES (42, 'Myra Govett', '2011-02-05', 'mgovett15@sitemeter.com');
INSERT INTO employee (id, name, birthday, email) VALUES (43, 'Osgood Elcum', '2001-05-18', 'oelcum16@xing.com');
INSERT INTO employee (id, name, birthday, email) VALUES (44, 'Mitch Lawlan', '1972-02-10', 'mlawlan17@odnoklassniki.ru');
INSERT INTO employee (id, name, birthday, email) VALUES (45, 'Portie Warwicker', '2005-11-07', 'pwarwicker18@moonfruit.com');
INSERT INTO employee (id, name, birthday, email) VALUES (46, 'Zelig Pedel', '1966-03-06', 'zpedel19@java.com');
INSERT INTO employee (id, name, birthday, email) VALUES (47, 'Benedick Furman', '1961-12-18', 'bfurman1a@google.com');
INSERT INTO employee (id, name, birthday, email) VALUES (48, 'Ara Nealy', '1956-09-22', 'anealy1b@imageshack.us');
INSERT INTO employee (id, name, birthday, email) VALUES (49, 'Burgess Romand', '1994-10-29', 'bromand1c@ftc.gov');
INSERT INTO employee (id, name, birthday, email) VALUES (50, 'Ebonee Dudek', '1967-12-27', 'edudek1d@arstechnica.com');

-- Cevap 3-)
  -- 1.güncelleme 
UPDATE employee
SET name = 'PATİKA'
WHERE id=8;
-- Güncellemeyi görüntüleyelim
SELECT * FROM employee;

  -- 2.güncelleme
UPDATE employee
SET birthday = '1919-05-19'
WHERE id=19;
SELECT * FROM employee;
-- Güncellemeyi görüntüleyelim
SELECT * FROM employee;

  -- 3.güncelleme
UPDATE employee
SET name = 'Ali Colak'
WHERE name='PATİKA';
-- Güncellemeyi görüntüleyelim
SELECT * FROM employee;

  -- 4.güncelleme
UPDATE employee
SET email = 'alicolak@gmail.com'
WHERE id<25;
-- Güncellemeyi görüntüleyelim
SELECT * FROM employee;

  -- 5.güncelleme
update employee
set name='Ali Colak'
WHERE email LIKE 'k%';
-- Güncellemeyi görüntüleyelim
SELECT * FROM employee;

-- Cevap 4-)
  -- 1.silme işlemi
DELETE FROM employee 
WHERE name='Ali Colak';
-- Silme işleminden sonraki tabloyu görüntüleyelim
SELECT * FROM employee;

  --2.silme işlemi
DELETE FROM employee 
WHERE email LIKE '%u';
-- Silme işleminden sonraki tabloyu görüntüleyelim
SELECT * FROM employee;

  -- 3.silme işlemi
DELETE FROM employee 
WHERE name LIKE 'K%';
-- Silme işleminden sonraki tabloyu görüntüleyelim
SELECT * FROM employee;

  -- 4.silme işlemi
DELETE from employee 
WHERE id in(1,2,8,18,40);
-- Silme işleminden sonraki tabloyu görüntüleyelim
SELECT * FROM employee;

  -- 5.silme işlemi
DELETE FROM employee 
WHERE id BETWEEN 10 AND 20;
-- Silme işleminden sonraki tabloyu görüntüleyelim
SELECT * FROM employee;