-- auto-generated definition
create table i_class
(
    id   int auto_increment
        primary key,
    name varchar(8) null
);

-- auto-generated definition
create table i_student
(
    id       int auto_increment
        primary key,
    class_id int        null,
    name     varchar(8) null,
    age      int        null
);

