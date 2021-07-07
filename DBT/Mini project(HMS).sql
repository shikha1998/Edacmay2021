create database hms;
use hms;

#Employee 
create table employee(empid int primary key, empname varchar(25), gender char(1), 
					  id_proof varchar(25), mobile_no bigint, deptno int);
insert into employee values(901, 'TIGER', 'M', '901TT', 9087654578, 1),(902, 'MARY', 'F', '902MM', 8255457890, 2),
				(903, 'JOHHNY', 'M', '903JJ', 9087254578, 3), (904, 'GEORGE', 'M', '904GG', 9087652078, 4),
                (905, 'DUKE', 'M', '905DD', 9087654596, 5),(906, 'ZOYA', 'F', '906ZZ', 9087600596, 3);
select * from employee;
  
#Customer
create table customer(id_proof int primary key, custname varchar(25), 
					  gender char(1), mobile_no bigint, address varchar(25), room_no int);
insert into customer values(111, 'SCOTT', 'M', 9876543210, 'UK', 102),
			(121, 'JOHN', 'M', 9800432101, 'US', 103),(441, 'JENNY', 'F', 8876523210, 'IND', 105),
            (333, 'SARA', 'F', 7896543210, 'NZ', 000);
select * from customer;

#Room
create table room(room_no int primary key, status varchar(20), type varchar(20),
				  availability char(2));
insert into room values(101, 'CLN', 'AC', 'AV'), (102, 'NCLN', 'AC', 'NA'),(103, 'NCLN', 'Non-AC', 'NA'),
						(104, 'CLN', 'AC', 'AV'), (105, 'NCLN', 'Non-AC', 'NA');
select * from room;
 
#Department
create table department(deptno int primary key, dept_name varchar(20), salary float(8,2));
insert into department values(1, 'MGR', 30000.00),(2, 'RCPT', 15000.00),(3, 'RSRV', 10000.00),
							 (4, 'CHEF',12000.00),(5, 'WTR', 8000.00) ;
select * from department;

#Room price
create table room_price(type varchar(20), price float(8,2));
insert into room_price values('AC', 6000.00),('Non-Ac', 3000);
select * from room_price;

desc employee;
desc department;
desc room;
desc customer;
desc room_price;
select * from customer;
select * from room;
use hms;

#employee details
select empid,empname,gender,id_proof,mobile_no,employee.deptno,dept_name,salary 
from employee,department where employee.deptno=department.deptno;

#department salary details
select dept_name,deptno,sum(salary) from department group by deptno;

#available rooms
select room_no,status,room_price.type,price from room,room_price 
where availability='AV' and room.type=room_price.type order by room_no;

# not available rooms
select room_no,status,room_price.type,price from room,room_price
 where availability='NA' and room.type=room_price.type order by room_no;

#guest list
select customer.room_no as 'Room No',
custname as 'Name',room.type
from customer,room,room_price where check_Status='in'
and customer.room_no=room.room_no and room.type=room_price.type ;

#check out list
select room.room_no as 'Room No',custname,id_proof,gender,mobile_no,address,
room.type,price as 'Bill'
from customer,room,room_price where check_Status='out'
and customer.room_no=room.room_no and room.type=room_price.type ;

select * from customer;

delimiter //
create procedure details(id int)
begin
select * from customer where id_proof =id;
end; //
delimiter ;

delimiter //
create function totalBill(id int)
returns float
deterministic
begin
declare Total float;
select (price+price*0.18)  into Total from customer,room,room_price
 where customer.room_no=room.room_no and room.type=room_price.type and customer.id_proof= id;
 return Total;
end; //
delimiter ;

select custname, totalBill(111) as Bill from customer where id_proof='111';

call details(111);
