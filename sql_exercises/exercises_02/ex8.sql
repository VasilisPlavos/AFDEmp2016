select `name`, avg(grade) from bootcamp.participates
inner join bootcamp.courses
on bootcamp.courses.CID = bootcamp.participates.PCourseID
group by PCourseID