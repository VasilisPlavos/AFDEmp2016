select lecturer, sum(duration) from bootcamp.courses
where duration > 2
group by lecturer
