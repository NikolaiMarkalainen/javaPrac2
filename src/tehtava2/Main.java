/*************************************
 Tekijä: Nikolai Markalainen
 Jakson numero: AVE1017-3009 Java ohjelmointi
 Jakson tehtävänumero: Jakso 2 Tehtävät 2.1 - 2.6
 Päiväys: 28.05.2022
 *************************************/


package tehtava2;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Timer;
public class Main {

    public static void main(String[] args ){
        // 2.1
        Scanner sc = new Scanner(System.in);
        System.out.print("Syota luku 1: ");
        double a = sc.nextDouble();
        System.out.print("Syota luku 2: ");
        double b = sc.nextDouble();
        System.out.print("Syota luku 3: ");
        double c = sc.nextDouble();
        System.out.println("Lukujen erotus on: " + (a-b-c));
        System.out.println("Lukujen summa on: " + (a+b+c));
        System.out.println("Lukujen tulo on: " + (a*b*c));


        // 2.2 java.lang.Math imporatttu pi arvoa varten.
        System.out.println("Ympyran pinta-ala on: " + (Math.PI*(20^2)));

        // 2.3 aluestetaan setelit arvoineen muuttujiin.
        double vitSeteli = 5;
        double kymSeteli = 10;
        double kaksSeteli = 20;
        double viisSeteli = 50;
        double satSeteli = 100;
        double kakssSeteli = 200;
        double viissSeteli = 500;
        double yliJaama = 0;

        System.out.print("Syota eurojen maara: ");
        double kolikot = sc.nextDouble();

        if (kolikot / vitSeteli > 1.0){
            double arvo1 = kolikot/vitSeteli;
            System.out.print("Saat:");
            System.out.format("%, .0f", arvo1);
            System.out.print(" viiden euron setelia");
            System.out.println("");
            yliJaama=kolikot%vitSeteli;
            System.out.println("Ylijaama on " + yliJaama + " euroa");

            if (kolikot / kymSeteli > 1.0){
                double arvo2 = kolikot/kymSeteli;
                System.out.print("Saat:");
                System.out.format("%, .0f", arvo2);
                System.out.print(" kymmenen euron setelia");
                System.out.println("");
                yliJaama = kolikot%kymSeteli;
                System.out.println("Ylijaama on " + yliJaama + " euroa");
            }
            if(kolikot / kaksSeteli > 1.0){
                double arvo3 = kolikot/kaksSeteli;
                System.out.print("Saat:");
                System.out.format("%, .0f", arvo3);
                System.out.print(" kahdenkymmenen euron setelia");
                System.out.println("");
                yliJaama = kolikot%kaksSeteli;
                System.out.println("Ylijaama on " + yliJaama + " euroa");
            }
            if(kolikot / viisSeteli > 1.0){
                double arvo4 = kolikot/viisSeteli;
                System.out.print("Saat:");
                System.out.format("%, .0f", arvo4);
                System.out.print(" viidenkymmenen euron setelia");
                System.out.println("");
                yliJaama = kolikot%viisSeteli;
                System.out.println("Ylijaama on " + yliJaama + " euroa");
            }
            if(kolikot / satSeteli > 1.0){
                double arvo5 = kolikot/satSeteli;
                System.out.print("Saat:");
                System.out.format("%, .0f", arvo5);
                System.out.print(" kymmenen euron setelia");
                System.out.println("");
                yliJaama= kolikot%satSeteli;
                System.out.println("Ylijaama on " + yliJaama + " euroa");
            }
            if(kolikot / kakssSeteli > 1.0){
                double arvo6 = kolikot/kakssSeteli;
                System.out.print("Saat:");
                System.out.println(Math.floor(arvo6));
                System.out.format("%, .0f", arvo6);
                System.out.print(" kahdensadan euron setelia");
                System.out.println("");
                yliJaama = kolikot%kakssSeteli;
                System.out.println("Ylijaama on " + yliJaama + " euroa");
            }
            if(kolikot / viissSeteli > 1.0){
                double arvo2 = kolikot/viissSeteli;
                System.out.print("Saat:");
                System.out.format("%, .0f", arvo2);
                System.out.print(" viidensadan euron setelia");
                System.out.println("");
                yliJaama =kolikot%viissSeteli;
                System.out.println("Ylijaama on " + yliJaama + " euroa");
            }
        }

        //2.4

        System.out.println("Anna minuutit: ");
        double minuutit = sc.nextDouble();
        double tunnit = minuutit / 60;
        double minMinuutit = minuutit % 60;
        System.out.print("Minuutit muunnettuna tunneiksi on:");
        System.out.format("%, .0f", tunnit);
        System.out.print(" tuntia ja " + minMinuutit + " minuuttia");
        System.out.println("");

        //2.5

        for(int x = 0; x < 11; x++){
            System.out.print(x+ " ");
        }
        for(int x = 0; x > -11; x--){
           System.out.print(x + " ");
        }
        //2.6
        int massa = 400;
        int kuutioMetri = 1;
        int tiheys = massa/kuutioMetri;
            System.out.println("");
            System.out.println("Kappaleen tiheys on: " + tiheys + " kg/m^3");

    }

}
