select * from  country where continent = 'Asia' and region = 'Middle East'

insert into city(Name,CountryCode,District,Population) values('Düzce','TUR','Düzce',50000)

SET SQL_SAFE_UPDATES = 0;
update city set Population = 60000 where name = 'Düzce'
delete from city where id = 4080