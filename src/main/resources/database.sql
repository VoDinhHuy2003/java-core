DROP DATABASE IF exists lesson_10;
create database lesson_10;
use lesson_10;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id INT PRIMARY KEY AUTO_INCREMENT,
    full_name varchar(50) not null,
    email varchar(50) unique key not null,
    password VARCHAR(50) not null default '123456',
    role enum('EMPLOYEE', 'ADMIN') not null default 'EMPLOYEE',
    pro_skill varchar(50),
    exp_in_year int
);

insert into users 	(full_name			, email					, password	, 	role		, 	pro_skill	, exp_in_year)
values 				('Võ Đình Huy'		, 'vodinhhuy@gmail.com'	, '12345678', 	'EMPLOYEE'	, 	NULL		, NULL),
					('Nguyễn Văn Khoa'	, 'khoa.nv@gmail.com'	, '12345678', 	'ADMIN'		, 	'Java'		, 5);

DROP PROCEDURE IF EXISTS find_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_by_email_and_password (
	IN in_email varchar(50),
    IN in_password varchar(50)
)
BEGIN
	SELECT *
    FROM users
    WHERE email = in_email and password = in_password;
END $$
DELIMITER ;
