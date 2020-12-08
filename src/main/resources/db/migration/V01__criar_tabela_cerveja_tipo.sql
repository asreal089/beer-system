CREATE TABLE cerveja_tipo (
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(50) NOT NULL,
    temperatura_max TINYINT NOT NULL, 
    temperatura_min TINYINT NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Weissbier', -1, 3);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Pilsens', -2, 4);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Weizenbier', -4, 6);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Red ale', -5, 5);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('India pale ale', -6, 7);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('IPA', -7, 10);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Dunkel', -8, 2);
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Imperial Stouts', -10, 13 );
INSERT INTO cerveja_tipo (tipo,temperatura_max, temperatura_min) VALUES ('Brown ale', 0, 14 );
