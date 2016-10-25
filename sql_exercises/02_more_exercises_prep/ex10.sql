select FName, LName, max(grade) from bootcamp.participates
inner join bootcamp.students
on bootcamp.students.StID = bootcamp.participates.PStudentID
group by PStudentID;
where grade > 6 and `name` = "SQL"