select * from bootcamp.students
inner join bootcamp.participates
on bootcamp.students.StID = bootcamp.participates.PStudentID
inner join bootcamp.courses
on bootcamp.courses.CID = bootcamp.participates.PCourseID
where `name` = "SQL"