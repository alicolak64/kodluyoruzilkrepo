-- Ödev 11
-- Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.



-- 1-actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
-- 2-actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
-- 3-actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
-- 4-İlk 3 sorguyu tekrar eden veriler için de yapalım.

-- Cevap 1-)
SELECT first_name FROM actor 
UNION
Select first_name FROM customer;

-- Cevap 2-)
SELECT first_name V actor
INTERSECT
SELECT first_name FROM customer;

-- Cevap 3-)
Select first_name FROM actor
EXCEPT 
SELECT first_name FROM customer;

-- Cevap 4-)
SELECT first_name FROM actor 
UNION ALL 
SELECT first_name FROM customer;

SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer;

SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;