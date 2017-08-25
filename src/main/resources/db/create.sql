SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS philanthropics (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 type VARCHAR,
 latitude DOUBLE,
 longitude DOUBLE,
 charities VARCHAR,
 annualContribution DOUBLE
);

CREATE TABLE IF NOT EXISTS socialenterprises (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 type VARCHAR,
 latitude DOUBLE,
 longitude DOUBLE
);

