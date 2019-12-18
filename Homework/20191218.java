1、设计一张商品表，包含以下字段：商品名称、商品价格、商品库存、商品描述

create table commodity
(
	commodityname varchar(10),
	price double(4,3),
	inventory smallint,
	describe varchar(30)
);

2、设计一张老师表，包含以下字段：姓名、年龄、身高、体重、性别、学历、生日、身份证号
create table teacher
(
	name varchar(5),
	age int,
	height double(3,2),
	weight double(3,2),
	birthday int,
	sex varchar(3),
	education varchar(7),
	IDnumber int
);


3、设计一张图书表，包含以下字段：图书名称，图书作者、图书价格、图书分类
create table book
(
	bookname varchar(20),
	author varchar(10),
	bookprice double(5,3),
	bookclassification varchar(10)
);

1、在以上创建的商品表中（上次作业）插入一条数据：名称为“学生书包”、价格18.91、库存101、描述为空
insert into commodity values ('学生书包',18.91,101,null);

2、修改所有库存大于30的商品记录，将价格增加50块
update commodity set price =+ 50 where inventory >30;

3、删除商品表中，价格大于60，或者是库存小于200的记录
delete from commodity where price > 60 or inventory < 200;

4、在图书表中新增一条记录：Java核心技术、作者“Cay S. Horstman”，价格56.43，分类为“计算机技术”
insert into book values('Java核心技术','Cay s.Horstman',56.43,'计算机技术');

5、修改“Java核心技术”的图书信息，将价格修改为61
update book set  price = 61 where bookname is 'Java核心技术';

1、student学生表中，字段有姓名name，年龄age，要求查询姓张，并且年龄在18到25岁之间的学生
select name,age from student where name = '张%' and (age between 18 and 25);

2、查询article文章表中，发表日期create_date在2019年1月1日上午10点30分至2019年11月10日下午4点2分的文章
select * from acticle where create_date between 2019010110.30 and 2019111004.02;

3、查询article文章表中，文章标题title为空，或者满足发表日期create_date在2019年1月1日之后
select * from article where title is null or create_date > 2019010100.00;

4、查询book图书表中，作者author列不为空，或者满足条件：价格price在50元以上且出版日期publish_date在2019年之后的图书信息
select * from book where author is not null or (price > 50 and publish_date >2019000000.00);

5、查询用户user表中，满足以下条件的用户数据：
ID在1至200或300至500，且账号accout列不为空
充值金额amount在1000以上
select * from user where accout is not null and amount > 1000 and ID limit ((1,200) or (300,500));
















