package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JurassicParkTest {


    private JurassicPark jurassicPark;

    @BeforeEach
    void init(){
        jurassicPark = new JurassicPark();

    }


    @Test
    void test_check() {
        assertEquals(List.of("Hypsilophodontida", "Maiasaurus", "Velociraptor"), jurassicPark.checkOverpopulation());
    }


}