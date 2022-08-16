-- Ödev 12
-- Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.



-- 1-film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
-- 2-film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
-- 3-film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
-- 4-payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

-- Cevap 1-)
SELECT count(*) FROM film 
WHERE length>any 
(SELECT avg(length) FROM film);

-- Cevap 2-)
SELECT count(*) FROM film
WHERE rental_rate=
(Select max(rental_rate) FROM film);

-- Cevap 3-)
SELECT * FROM film
WHERE rental_rate=(SELECT min(rental_rate) FROM film) AND 
replacement_cost=(SELECT min(replacement_cost) FROM film);

-- Cevap 4-)
SELECT c.customer_id, c.first_name, COUNT(*) FROM payment p
INNER JOIN customer c ON p.customer_id = c.customer_id
GROUP BY c.customer_id
ORDER BY COUNT(*) DESC;