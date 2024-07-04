package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Gitar.bunyi();

        Motor.jumlahban();
        Mobil.jumlahban();
        Kereta.jumlahban();

        Date hari_ini = new Date();
        Date besok = DateUtils.addDays(hari_ini,1);

        System.out.println("Hari ini adalah " + hari_ini);
        System.out.println("Hari Besok adalah " + besok);
    }
}
