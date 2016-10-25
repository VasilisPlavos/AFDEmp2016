insert into bootcamp.participates (grade, PCourseID, PStudentID)
values	(10, 1, 1),
		(10, 2, 2),
        (10, 2, 3),
        (10, 2, 4),
        (10, 1, 5),
        (6, 1, 6),
        (7, 1 ,8)
        

select * from bootcamp.students
where StID in (select PStudentID from bootcamp.participates)