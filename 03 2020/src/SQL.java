需求：
注册三个用户
想知道哪个用户是最新注册的，id最大的用户
周荣老师发表了《排序》文章，内容自己随便写
其他用户也各自发表了一些文章，内容自己随便写
按发表时间（ID）列出所有文章的标题
在一个的基础上，只显示第二页（每页3篇文章）


CREATE TABLE users (
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(255) NOT NULL UNIQUE,
nickname VARCHAR(255) NOT NULL,
password VARCHAR(64) NOT NULL
);
CREATE TABLE articles (
id INT PRIMARY KEY AUTO_INCREMENT,
user_id INT NOT NULL,
title VARCHAR(255) NOT NULL,
content TEXT NOT NULL
);
CREATE TABLE comments (
id INT PRIMARY KEY AUTO_INCREMENT,
user_id INT NOT NULL,
article_id INT NOT NULL,
content VARCHAR(200) NOT NULL
);
CREATE TABLE like_relations (
user_id INT NOT NULL,
article_id INT NOT NULL,
PRIMARY KEY (user_id, article_id)
);

注册三个用户
INSERT INTO users(username,nickname,password) VALUES
('chenpeixin','老陈',123)
('zhourong','周老师',445)
('xiaodingdang','小叮当',998)

想知道哪个用户是最新注册的，id最大的用户
select id from users order by id desc limit 1;
SELECT id(max) FROM users;

周荣老师发表了《排序》文章，内容自己随便写
INSERT INTO articles(user_id,title) VALUES ('zhourong','排序')

其他用户也各自发表了一些文章，内容自己随便写


按发表时间（id）列出所有文章的标题
SELECT title FROM articles ORDER BY id DESC;

在一个的基础上，只显示第二页（每页3篇文章）
SELECT content FROM articles ORDER BY id LIMIT 3 OFFSET 3；







