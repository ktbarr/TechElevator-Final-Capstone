BEGIN TRANSACTION;

-- drop tables
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS invite;
DROP TABLE IF EXISTS invite_restaurant;
DROP TABLE IF EXISTS restaurant_vote;

-- drop sequences
DROP SEQUENCE IF EXISTS seq_user_id;
DROP SEQUENCE IF EXISTS seq_invite_id;
DROP SEQUENCE IF EXISTS seq_inviterestaurant_id;

--create sequences manually - so that you can set the value after inserting seed data
CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE SEQUENCE seq_invite_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE SEQUENCE seq_invite_restaurant_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


-- create tables
CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id') NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE invite (
	invite_id int DEFAULT nextval('seq_invite_id') NOT NULL PRIMARY KEY,
	user_id INTEGER NOT NULL,
	invite_name varchar (50) NOT NULL,
	invite_date DATE NOT NULL
);

CREATE TABLE invite_restaurant (
	invite_restaurant_id serial NOT NULL PRIMARY KEY,
	invite_id int DEFAULT nextval ('seq_invite_restaurant_id') NOT NULL,
	restaurant_name varchar (50) NOT NULL
);

CREATE TABLE restaurant_vote (
	invite_restaurant_id serial NOT NULL PRIMARY KEY,
	vote_up INTEGER NOT NULL DEFAULT 0,
	vote_down INTEGER NOT NULL DEFAULT 0 
);

ALTER TABLE invite_restaurant
ADD CONSTRAINT fk_invite_id
FOREIGN KEY (invite_id)
REFERENCES invite (invite_id);

-- ALTER TABLE restaurant_vote
-- ADD CONSTRAINT fk_restaurant_name
-- FOREIGN KEY (restaurant_name)
-- REFERENCES invite_restaurant (restaurant_name);


COMMIT TRANSACTION;