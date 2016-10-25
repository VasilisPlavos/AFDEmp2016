select category.name, film.title
from film
inner join film_category
on film.film_id = film_category.film_id
inner join category
on film_category.category_id = category.category_id
order by film.title asc