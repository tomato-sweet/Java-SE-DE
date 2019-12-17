//进入环境
mysql -u root -p

/*
数据库的五个基本操作
使用数据库 use java_14_db;
展示 show databases;
创建 create database dbname;     create database if not exists java_14_db;
删除 drop database java_14_db;
查表是否在数据库中 select database();
*/

/*
表的操作
创建一个表
create table student
(
	name varchar(20),  [fieldname type]
	sn int,
	mysql int,
	english double(5,2),
	java double(5,2)
);
描述表  desc student;
查看是否存在 show tables;
插入
insert into student values('lily',20191215,100,95.32,59.99);
insert into student values('maomao',19990708,5458.15,56,874);
删除 drop table student;   drop table if exists student;
展示 select * from student;
*/

//练习部分
insert into student values('jiujiu',15264,1515,12,35);
select * from student;
create table student
(
	name varchar(20),
	sn int,
	mysql int,
	english double(5,2),
	java smallint
);
insert into student(name,sn,java) values ('lily',20191211,25);
insert into student(name,mysql,java) values 
('kao',234,234),
('lola',90,80);
select mysql+english+java from student;
select mysql+english+java as total_score from student;
select distinct mysql+english from student;

select name,java from student order by java;
select name,java from student order by java desc;
select* from student order by mysql desc;
select* from student order by mysql;
select* from student order by java+mysql+english;
SELECT name, english+java+mysql as total_score FROM student ORDER BY total_score DESC;
select * from student where mysql = 100 and english >= 60;
select* from student where english is null;
select* from student where name like '_i%';
select* from student limit 1,3;
SELECT NAME,SN,MYSQL+JAVA+ENGLISH AS TOTAL_SCORE FROM STUDENT ORDER BY TOTAL_SCORE DESC;
select name,sn,mysql+java+english as total_score from student order by total_score desc;
select name as t1 from student;

insert into student(name,sn,mysql,java,english) values
('ququ',00001,100,60,90),
('mam',00002,65,90,30),
('cici',00003,30,100,110);

select* from student where english<=90 and java>=60;
select* from student where english<=80 and english>=60;
select* from student where name like '%y';

update student set name='czx',sn = 99999
where mysql<90 and mysql > 60;

update student set mysql = 75 where mysql is null;
update student set english = 75 where english is null;
update student set java = 75 where java is null;
update student set sn=45454 where sn is null;
update student set name = 'mabaozi' where name is null;

select* from student where english >=75 and sn =45454;
update student set english=+10 where english<=60;
update student set java=java%5 where java>40;
update student set java=java+50 where java>40;
update student set mysql=mysql+30 order by mysql limit 3;
update student set java = java + 40 order by java limit 6;
update student set java = java + 12 order by java limit 3,5;

select* from student where java in (40,45);
select* from student where sn in (45454) and mysql in (90);







































