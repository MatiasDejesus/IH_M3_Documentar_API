USE YUGIOH;
show tables;

select * from cartas;

INSERT INTO cartas (nombre_carta, tipo_carta, ataque_carta, defensa_carta, imagen_url) VALUES
('Dragón Blanco de Ojos Azules', 'Dragón', 3000, 2500, '/images/dragon_blanco.jpg'),
('Mago Oscuro', 'Lanzador de Conjuros', 2500, 2100, '/images/mago_oscuro.jpg'),
('Exodia el Prohibido', 'Encantador', 1000, 1000, '/images/exodia.jpg');


select * from personaje;

