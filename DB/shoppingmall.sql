create database if not exists shoppingmall;
use shoppingmall;
create table if not exists member(
	mr_id varchar(15) primary key,  
    pme_w varchar(20) not null,
    me_name varchar(20) not null,
    me_birth date not null,
    me_authority varchar(6) not null default 'MEMBER'
    
);

create table if not exists product(
		pr_Num int auto_increment primary key,
        pr_title varchar(50) not null, 
        pr_contents longtext  not null,
        pr_amount int not null default 0,
        
        
);
create table if not exists category (
	
);
create table if not exists board (

);

create table if not exists pGroup (

);
create table if not exists purchase(

);
create table if not exists inquire(

);
