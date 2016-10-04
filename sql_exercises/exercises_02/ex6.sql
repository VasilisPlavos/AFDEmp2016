select FName, LName, avg(grade) from bootcamp.participates
inner join bootcamp.students
on bootcamp.students.StID = bootcamp.participates.PStudentID
group by PStudentID