package org.example.info_basketball_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

// TODO: GSANTOS -- Por el momento se excluyo la conexion a base de datos para,
//  pero esto debe ser configurado más a delante.
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class InfoBasketballApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoBasketballApiApplication.class, args);
    }

}
