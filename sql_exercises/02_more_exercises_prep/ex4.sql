select * from bootcamp.students
inner join bootcamp.participates
on bootcamp.students.StID = bootcamp.participates.PCourseID
where grade > 5