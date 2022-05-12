--main-changelog.sql

--changeset quintanar:CREATE_TABLE_size
CREATE TABLE `size`(
    id_size INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(5) NOT NULL,
    `´size´` VARCHAR(50) NOT NULL
);


--changeset quintanar:CREATE_TABLE_type
CREATE TABLE type(
    id_type  INT AUTO_INCREMENT PRIMARY KEY,
    type VARCHAR(50) NOT NULL
);


--changeset quintanar:CREATE_TABLE_sub_type
CREATE TABLE sub_type(
    id_sub_type INT AUTO_INCREMENT PRIMARY KEY,
    sub_type VARCHAR(50) NOT NULL
);


--changeset quintanar:CREATE_TABLE_sub_type
CREATE TABLE `group`(
    id_group INT AUTO_INCREMENT PRIMARY KEY,
    id_parent_product INT NOT NULL,
    id_child_product INT NOT NULL
);


--changeset quintanar:CREATE_TABLE_sub_type
CREATE TABLE price(
    id_price INT AUTO_INCREMENT PRIMARY KEY,
    short_name VARCHAR(50) NOT NULL,
    regular VARCHAR(10) NOT NULL,
    offer VARCHAR(10) NOT NULL,
    wholesale VARCHAR(10),
    half_wholesale VARCHAR(10)
);

--changeset quintanar:CREATE_TABLE_product
CREATE TABLE product(
    id_product INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    code VARCHAR(100) NOT NULL,
    description VARCHAR(255) NOT NULL,
    id_size INT NOT NULL,
    id_type INT NOT NULL,
    id_sub_type INT,
    id_price INT NOT NULL,
    id_group INT,
    FOREIGN KEY (id_size) REFERENCES `size`(id_size),
    FOREIGN KEY (id_type) REFERENCES type(id_type),
    FOREIGN KEY (id_sub_type) REFERENCES sub_type(id_sub_type),
    FOREIGN KEY (id_price) REFERENCES price(id_price),
    FOREIGN KEY (id_group) REFERENCES `group`(id_group)
);


--changeset quintanar:INSERT_CAT
INSERT INTO perroamor_products_db.`size`
(code, `´size´`)
VALUES('XS', 'Extra Chica');
INSERT INTO perroamor_products_db.`size`
(code, `´size´`)
VALUES('S', 'Chica');
INSERT INTO perroamor_products_db.`size`
(code, `´size´`)
VALUES('M', 'Mediana');
INSERT INTO perroamor_products_db.`size`
(code, `´size´`)
VALUES('L', 'Grande');
INSERT INTO perroamor_products_db.`size`
(code, `´size´`)
VALUES('XL', 'Extra Grande');


--changeset quintanar:INSERT_CAT_type
INSERT INTO type(type) VALUES ("Collar");
INSERT INTO type(type) VALUES ("Correa");
INSERT INTO type(type) VALUES ("Pechera");
INSERT INTO type(type) VALUES ("Combo");
INSERT INTO type(type) VALUES ("Kits");
INSERT INTO type(type) VALUES ("Accesorios");


--changeset quintanar:INSERT_CAT_sub_type
INSERT INTO sub_type(sub_type) VALUES ("Pechera + Correa");
INSERT INTO sub_type(sub_type) VALUES ("Collar + Correa");
INSERT INTO sub_type(sub_type) VALUES ("Kit Todo Mio");
INSERT INTO sub_type(sub_type) VALUES ("Kit Quiero Todo");
INSERT INTO sub_type(sub_type) VALUES ("Bolsitas");
INSERT INTO sub_type(sub_type) VALUES ("Mochila");
INSERT INTO sub_type(sub_type) VALUES ("Extención");


--changeset quintanar:INSERT_CAT_price
INSERT INTO price (regular, short_name, offer, wholesale, half_wholesale) VALUES ("219.00", "alebrije", "200.00", "200.00", "200.00");
INSERT INTO price (regular, short_name, offer, wholesale, half_wholesale) VALUES ("249.00", "deja vu", "200.00", "200.00", "200.00");
INSERT INTO price (regular, short_name, offer, wholesale, half_wholesale) VALUES ("209.00", "lacito", "200.00", "200.00", "200.00");
INSERT INTO price (regular, short_name, offer, wholesale, half_wholesale) VALUES ("149.00", "vida mia", "200.00", "200.00", "200.00");
INSERT INTO price (regular, short_name, offer, wholesale, half_wholesale) VALUES ("199.00", "brillo mio", "200.00", "200.00", "200.00");
INSERT INTO price (regular, short_name, offer, wholesale, half_wholesale) VALUES ("169.00", "vanny", "200.00", "200.00", "200.00");