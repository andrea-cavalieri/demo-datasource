CREATE TABLE IF NOT EXISTS  PERSONS (
    id bigint not null auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    age int not null,
    primary key (id)
);