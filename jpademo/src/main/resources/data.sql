create table person (
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)

);

insert into person (id,name,location,birth_Date) values(1001,'Madan','Gurgaon',sysdate());
insert into person (id,name,location,birth_Date) values(1002,'Raj','Banglore',sysdate());
insert into person (id,name,location,birth_Date) values(1003,'Mike','Moscow',sysdate());
insert into person (id,name,location,birth_Date) values(1004,'Krish','Delhi',sysdate());