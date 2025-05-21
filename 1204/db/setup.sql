CREATE TABLE Movie
(
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    genre VARCHAR(100),
    isAvailable BOOLEAN NOT NULL DEFAULT 0
);


INSERT INTO Movie (id, title, genre) VALUES
(1, 'The Shawshank Redemption', 'Drama'),
(2, 'The Godfather', 'Crime'),
(3, 'The Dark Knight', 'Action'),
(4, 'Pulp Fiction', 'Crime'),
(5, 'Forrest Gump', 'Drama'),
(6, 'Inception', 'Sci-Fi'),
(7, 'The Matrix', 'Sci-Fi'),
(8, 'Fight Club', 'Drama'),
(9, 'Gladiator', 'Action'),
(10, 'Titanic', 'Romance');



