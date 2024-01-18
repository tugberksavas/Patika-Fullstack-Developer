SELECT first_name FROM actor
UNION
SELECT first_name FROM customer;

SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;

-- Tüm verileri sıralama (tekrar edenleri gösterme)
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;

-- Kesişen verileri sıralama
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer;

-- İlk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralama
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;