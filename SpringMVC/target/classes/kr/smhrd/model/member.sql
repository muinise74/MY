DROP table tmember cascade constraint;

CREATE table tmember(
	id varchar(50) not null,
	pw varchar(50) not null,
	nick varchar(50) not null,
	tel varchar(50) not null,
	address varchar (150) not null,
	primary key (id)
);

select * from tmember;
