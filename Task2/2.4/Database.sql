create schema profitsoft;
use profitsoft;



create table course
(
id int auto_increment not null,
course_title varchar(45) not null,
primary key(id)
);
create table teacher
(
id int auto_increment not null,
first_name varchar(25) not null,
last_name varchar(25) not null,
email varchar(55) not null,
id_course int not null default -1,
primary key(id),
foreign key(id_course) references course(id)
);

create table gr
(
id int auto_increment not null,
name varchar(25) not null,
primary key(id)

);
create table student
(
id int auto_increment not null,
first_name varchar(25) not null,
last_name varchar(25) not null,
id_group int default 0,
primary key (id),
foreign key(id_group) references gr(id)
);

create table marks 
(
id int auto_increment not null,
student_id int default -1,
course_id int,

Lecture int,
Practica int,
Exam int,
primary key(id),
foreign key(student_id) references student(id),
foreign key(course_id) references course(id)

);
insert 
course(course_title)
 values
 ('Biology'),('Programming'),('History');


insert 
teacher(first_name,last_name,email,id_course) 
values
('Alexander','Voloshyn','voloshin17@gmail.com','1'),
('Julia','Petrova','juliapetr5@gmail.com','2'),
('Alex','Cheguevez','alexche56@gmail.com','3');


insert 
gr(name) 
values('Kit-27v'),('Kit-23v');



insert
 student(first_name,last_name,id_group) 
values
('Gushin','Danil','1'),
('Belka','Maksim','1'),
('Vanyarcha','Eugen','2');


insert 
marks(student_id,course_id,Lecture,Practica,Exam) 
values
('1','1','5','5','5'),
('1','3','5','5','5'),
('2','1','5','5','2'),
('3','1','5','5','5'),
('1','2','5','5','5'),
('2','2','4','5','5'),
('3','2','5','5','4');


/*Написать запрос для выборки всех преподавателей на курсах которых учатся больше 2000 студентов
но я написал больше двух  чтобы показать работу
*/
select course.course_title, teacher.first_name,teacher.last_name from marks, course ,teacher
where 
teacher.id_course=course.id
AND
 (select count(marks.id) from marks where course.course_title='Programming' AND  marks.course_id=2)>2
 OR
 (select count(marks.id) from marks where course.course_title='Biology' AND  marks.course_id=1)>2
 OR
 (select count(marks.id) from marks where course.course_title='History' AND  marks.course_id=3)>2
group by course_title;



/*Написать запрос для выборки студентов у которых по курсу 'Programming' оценка > 4.  Отсортировать их по имени.*/
select marks.student_id ,student.first_name,student.last_name  from marks,student  
where marks.student_id=student.id 
AND  marks.course_id=2 
AND  ((marks.Exam+marks.Lecture+marks.Practica)/3) > 4 
order by student.first_name ;

/*Написать запрос, который выведет список отличников, сгруппированных по группам.*/
select marks.student_id,marks.course_id,student.id_group,student.first_name,student.last_name  from marks,student 
where marks.student_id=student.id 
AND ((marks.Exam+marks.Lecture+marks.Practica)/3) = 5
group by student.id_group ; 



