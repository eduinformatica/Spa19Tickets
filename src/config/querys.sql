--CREATE DATABASE IF NOT EXISTS aiep_ene;

CREATE TABLE IF NOT EXISTS estado(
    idestado SERIAL PRIMARY KEY, 
    est_nombre VARCHAR(20) NOT NULL
);
CREATE TABLE IF NOT EXISTS perfil(
    idperfil SERIAL PRIMARY KEY, 
    per_nombre VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS prioridad(
    idprioridad SERIAL PRIMARY KEY, 
    pri_nombre VARCHAR(20) NOT NULL
);
CREATE TABLE IF NOT EXISTS tipo_requerimiento(
    idtipo_requerimiento SERIAL PRIMARY KEY,
    tip_req_nombre VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS usuario(
    idusuario SERIAL PRIMARY KEY,
    usu_rut VARCHAR(20) NOT NULL UNIQUE,
    usu_nombre VARCHAR(30) NOT NULL,
    usu_apaterno VARCHAR(30) NOT NULL,
    usu_amaterno VARCHAR(30) NOT NULL,
    usu_clave VARCHAR(255) NOT NULL,
    per_idperfil INT NOT NULL,
    CONSTRAINT fk_per_idperfil FOREIGN KEY(per_idperfil) REFERENCES perfil(idperfil)
);

CREATE TABLE IF NOT EXISTS requerimiento(
    idrequemiento SERIAL PRIMARY KEY,
    req_fecha_requerimiento DATE NOT NULL,
    req_descripcion VARCHAR(5000) NOT NULL,
    req_fecha_plazo DATE NOT NULL,
    pri_idprioridad INT NOT NULL,
    usu_asignado INT NOT NULL,
    usu_asignante INT NOT NULL,
    est_idestado INT NOT NULL,
    tip_req_idtipo_requerimiento INTEGER NOT NULL,
    CONSTRAINT fk_pri_idprioridad FOREIGN KEY(pri_idprioridad) REFERENCES prioridad(idprioridad),
    CONSTRAINT fk_usu_asignado FOREIGN KEY(usu_asignado) REFERENCES usuario(idusuario),
    CONSTRAINT fk_usu_asignante FOREIGN KEY(usu_asignante) REFERENCES usuario(idusuario),
    CONSTRAINT fk_est_idestado FOREIGN KEY(est_idestado) REFERENCES estado(idestado),
    CONSTRAINT fk_tip_req_idtipo_requerimiento FOREIGN KEY(tip_req_idtipo_requerimiento) 
    REFERENCES tipo_requerimiento(idtipo_requerimiento)
);

--SELECT * FROM information_schema.columns
--WHERE table_name = 'usuario';

--INSERT INTO perfil(per_nombre) VALUES('administrador'),('usuario');

--INSERT INTO prioridad(pri_nombre) VALUES('Alta'),('Media'),('Baja');

--INSERT INTO tipo_requerimiento(tip_req_nombre) VALUES('Base de datos'),('Sistemas'),('Servidores'),('Contabilidad'),('Redes');

--INSERT INTO usuario(usu_rut, usu_nombre, usu_apaterno, usu_amaterno, usu_clave, per_idperfil)
--	VALUES ('222222222','informatica','prueba','prueba',md5('test'), 1);
--INSERT INTO usuario(usu_rut, usu_nombre, usu_apaterno, usu_amaterno, usu_clave, per_idperfil)
--	VALUES ('111111111','prueba','prueba','prueba',md5('test'), 2);
