CREATE DATABASE eshop;

USE eshop;

CREATE TABLE customers
(
    prog_id int not null auto_increment,
    name char(32) not null,
	address char(128) not null,
    email char(128) not null,
    primary key (prog_id)
    
);

CREATE DATABASE estore;

USE estore;

CREATE TABLE order
(
    prog_id int not null auto_increment,
    name char(32) not null,
	address char(128) not null,
    email char(128) not null,
    primary key (prog_id)
    
);

insert into customers
    (name, address, email)
values
    ('fred', '201 Cobblestone Lane', 'fredflintstone@bedrock.com'),
    ('sherlock', '221B Baker Street, London', 'sherlock@consultingdetective.org'),
    ('spongebob', '124 Conch Street, Bikini Bottom', 'spongebob@yahoo.com'),
    ('jessica', '698 Candlewood Land, Cabot Cove', 'fletcher@gmail.com'),
    ('dursley', '4 Privet Drive, Little Whinging, Surrey', 'dursley@gmail.com')

    CREATE TABLE order_status
(
    order_id int not null auto_increment,
    delivery_id char(128) not null
    status enum('pending','dispatched') not null,
    status_update datetime default current_timestamp ON UPDATE current_timestamp,
    primary key (prog_id)
    
);