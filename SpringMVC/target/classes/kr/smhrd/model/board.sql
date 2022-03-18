DROP table tboard cascade constraint;

CREATE table tboard(
	idx int not null auto_increment,
	title VARCHAR(100) not null,
	contents VARCHAR(1000) not null,
	writter VARCHAR(50),
	count int not null default 0,
	indate datetime not null default now(),
	primary key(idx)
);

select * from tboard;

insert into tboard(title,contents,writter) values('title','contents','writter');
insert into tboard(title,contents,writter) values('프로젝트','빨리 끝났으면 좋겠다.','문도연');
insert into tboard(title,contents,writter) values('암호화','구현해보고 싶다','문도연');
insert into tboard(title,contents,writter) values('게시판','실습하고 있습니다.','문도연');
insert into tboard(title,contents,writter) values('찬호형','선 좀 그만 그어요.','문도연');
