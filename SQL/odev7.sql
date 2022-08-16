-- Ödev 7
-- Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

-- 1-film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
-- 2-film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
-- 3-customer tablosunda bulunan store_id değerlerine karşılık gelen müşteri sayılarını nelerdir?
-- 4-city tablosunda bulunan şehir verilerini country_id sütununa göre gruplandırdıktan sonra en fazla şehir sayısı barındıran country_id bilgisini ve şehir sayısını paylaşınız.

-- Cevap 1-)
SELECT rating FROM film
GROUP BY rating;

-- Cevap 2-)
SELECT replacement_cost,count(*) FROM film 
GROUP BY replacement_cost
HAVING count(*)>50;

-- Cevap 3-)
SELECT store_id,count(*) FROM customer 
GROUP BY store_id;

-- Cevap 4-)
SELECT country_id,count(*) FROM city
GROUP BY country_id
ORDER BY count(city) DESC
LIMIT 1;