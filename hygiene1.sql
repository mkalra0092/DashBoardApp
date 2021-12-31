drop database hygiene1;
create database hygiene1;
use hygiene1;
show tables;
-- aqidate
-- branch
-- customer
-- parameter
-- parameter_threshold

desc branch;
select * from branch;
insert into branch values(1,"Noida"),(default,"Pune"),(default,"Chennai");

desc customer;
select * from customer;
insert into customer value(101,"Jones",1),(default,"Rohan",3);

desc parameter;
select * from parameter;
truncate table parameter;

insert into parameter values(default,0,45,0,0,20,0);
insert into parameter values(default,800,75,100,50,26,1000);
insert into parameter values(default,450,53,70,32,23,750);

desc parameter_threshold;
select * from parameter_threshold;
insert into parameter_threshold values(1,1,2);

desc aqidate;
select * from aqidate;
insert into aqidate values(1,'2020-09-12',101,3,1);

