SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS philanthropics (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 type VARCHAR,
 latitude FLOAT,
 longitude FLOAT,
 charities VARCHAR,
 annualContribution FLOAT
);

CREATE TABLE IF NOT EXISTS socialenterprises (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 type VARCHAR,
 latitude FLOAT,
 longitude FLOAT
);

