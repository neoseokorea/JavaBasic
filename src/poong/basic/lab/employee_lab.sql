create table employeeLab (

    empno        int         auto_increment,
    fname       varchar(20) not null,
    lname       varchar(20) not null,
    email       varchar(30) not null,
    phone       varchar(20) not null,
    hdate       varchar(10) not null,
    jobid       varchar(10) not null,
    sal        int          default 0,
    comm       double       default 0,
    mgird       varchar(10) not null,
    deptid       varchar(10) not null,
    primary key (empno)

);


insert into employee_lab (name, kor, eng, mat, tot, mean, grd)
values ('가리비', 98, 97, 87, 23, 85.5,'수');

select sjno, name, kor, eng, mat, mid(regdate,1,10)
from employee_lab
order by sjno;

select * from employee_lab where sjno = 1;

update employee_lab
    set name = '파이썬', kor = 99, eng = 99, mat = 99
    where sjno = 1;

delete from employee_lab where sjno = 1;