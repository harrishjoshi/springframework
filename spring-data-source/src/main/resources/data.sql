create table student
(
    id         int          not null auto_increment,
    name       varchar(255) not null,
    address    varchar(255),
    birth_date timestamp,
    primary key (id)
);

INSERT INTO STUDENT (NAME, ADDRESS, BIRTH_DATE)
VALUES ('Harish Joshi', 'MNR', CURRENT_TIMESTAMP);
INSERT INTO STUDENT (NAME, ADDRESS, BIRTH_DATE)
VALUES ('John Doe', 'USA', CURRENT_TIMESTAMP);
INSERT INTO STUDENT (NAME, ADDRESS, BIRTH_DATE)
VALUES ('Joshi Harish', 'KTM', CURRENT_TIMESTAMP);