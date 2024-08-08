CREATE TABLE IF NOT EXISTS team (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    country VARCHAR(255)
    );

CREATE TABLE IF NOT EXISTS player (
    id SERIAL PRIMARY KEY,
    fullname VARCHAR(255) NOT NULL,
    age INT,
    position VARCHAR(100),
    team_id INT,
    FOREIGN KEY (team_id) REFERENCES team(id)
    );
