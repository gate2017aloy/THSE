-- DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              first_name VARCHAR(250) NOT NULL,
                              last_name VARCHAR(250) NOT NULL,
                              role VARCHAR(250) DEFAULT NULL
);

INSERT INTO Users (first_name, last_name, role) VALUES
('Aliko', 'Dangote', ''),
('Bill', 'Gates', ''),
('Folrunsho', 'Alakija', 'admin');


-- DROP TABLE IF EXISTS Priorities;

CREATE TABLE Priorities (
                       priority VARCHAR2 PRIMARY KEY
);

INSERT INTO Priorities (priority) VALUES
('Connection'),
('Relationships'),
('Career'),
('Wealth');


-- DROP TABLE IF EXISTS UsersPriorityData;

-- CREATE TABLE UsersPriorityData (
--                         id INT PRIMARY KEY,
--                         info json NOT NULL,
--                         CONSTRAINT fk
--                             FOREIGN KEY(id)
--                                 REFERENCES Users(id)
-- );

CREATE TABLE UsersPriorityData (
                                   id INT PRIMARY KEY,
                                   info json NOT NULL,
                                   CONSTRAINT fk
                                       FOREIGN KEY(id)
                                           REFERENCES Users(id)
);

INSERT INTO UsersPriorityData (id,info)
VALUES(1,'{ "customer": "John Doe", "items": {"product": "Beer","qty": 6}}');




