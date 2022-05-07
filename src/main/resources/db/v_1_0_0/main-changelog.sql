--main-changelog.sql

--changeset quintanar:CREATE_TABLE_size
CREATE TABLE `size`(
    id_size INT AUTO_INCREMENT PRIMARY KEY,
    ´size´ VARCHAR(5) NOT NULL
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
    regular VARCHAR(5) NOT NULL,
    wholesale VARCHAR(5),
    half_wholesale VARCHAR(5)
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