create table users (
  id varchar(255) PRIMARY KEY,
  username varchar(255) NOT NULL,
  UNIQUE KEY (username)
);