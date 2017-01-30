create table contacts (
	id identity,
	firstName varchar(30) not null,
	lastName varchar(50) not null,
	phoneNumber varchar(13),
	emailAddress varchar(30)
);

insert into contacts values (1,'test','test','test','test',);

create table PlayerPriceChanges(
id varchar(30),
name varchar(30),
club varchar(30),
playerPosition varchar(30),
status varchar(30),
percentageowned varchar(30),
price varchar(30),
changes varchar(30),
delta varchar(30),
target varchar(30)
)  ;


insert into PlayerPriceChanges values ('10','Holgate', 'Everton' ,  'D',	'A',	'6.4',	'£4.1m',	'0',	'251' ,'98.9');
insert into PlayerPriceChanges values ('9','Jakupovic', 'Hull' ,   'G',	'A',	'20.4',	'£3.9m',	'0',	'332' ,'98.5'     );
insert into PlayerPriceChanges values ('8','Antonio', 'West Ham',	'M',	'A',	'12.1',	'£6.9m',	'0',	'906' ,'95.9' );
insert into PlayerPriceChanges values ('7','Crouch', 'Stoke' ,     'F',	'A',	'4.3',	'£4.8m',	'0',	'1082' ,'95.1'    );
insert into PlayerPriceChanges values ('6','Pieters', 'Stoke' ,    'D',	'A',	'6.7',	'£4.5m',	'0',	'1110' ,'95.0'    );
insert into PlayerPriceChanges values ('5','Phillips', 'West Brom',	'M',	'A',	'21.7',	'£5.9m',	'0',	'1193' ,'94.7');
insert into PlayerPriceChanges values ('4','Cahill', 'Chelsea',    'D',	'A',	'13.5',	'£6.4m',	'0',	'1202' ,'94.6'    );
insert into PlayerPriceChanges values ('3','Ward', 'Burnley' ,     'D',	'A',	'1.3',	'£4.4m',	'0',	'1214' ,'94.6'    );
insert into PlayerPriceChanges values ('2','Llorente', 'Swansea',  'F',	'A',	'4',	'£6.1m',	'0',	'2566' ,'88.5'    );
insert into PlayerPriceChanges values ('1','Love', 'Sunderland',   'D',	'A',	'5',	'£4.0m',	'0',	'2795' ,'87.5'    );