create table board (
    bdno        int         auto_increment,
    title       varchar(50) not null,
    userid      varchar(20) not null,
    regdate     datetime default current_timestamp,
    views       int         default 0,
    thumbup     int         default 0,
    contents    varchar(1000) not null,
    primary key (bdno)
);

insert into sungjuk (name, kor, eng, mat, tot, mean, grd)
values ('가리비', 98, 97, 87, 23, 85.5,'수');

select sjno, name, kor, eng, mat, mid(regdate,1,10)
from sungjuk
order by sjno;

select * from sungjuk where sjno = 1;

update sungjuk
    set name = '파이썬', kor = 99, eng = 99, mat = 99
    where sjno = 1;