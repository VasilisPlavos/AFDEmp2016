select category.name, count(film.film_id), avg(film.replacement_cost) - avg(film.rental_rate) as DIF, film_category.category_id
from film
inner join film_category
on film.film_id = film_category.film_id
inner join category
on film_category.category_id = category.category_id
group by film_category.category_id
having DIF > 17 		/*	otan exo brosta to count to average ktl vazo having kai oxi where*/
order by DIF