package Exo.Base.Methodes;

public class ExoCelciusFarhenheit {

    public static void main(String[] args) {

        /*
            Réaliser deux fonctions de conversion de degré :
            - Celcius -> Fahrenheit
            - Fahrenheit -> Celcius
         */

        float celcius = 15.6f;
        float farhenheit = 60.08f;

        System.out.println( celciusToFarhenheit(celcius) ); // output : 60.08 - OK
        System.out.println( fahrenheitToCelcius(farhenheit) ); // output : 15.600001 - KO

    }

    public static float celciusToFarhenheit( float temperature ) {
        return (temperature * 9 / 5) + 32;
    }

    public static float fahrenheitToCelcius( float temperature ) {
        return (temperature - 32) * 5 / 9;
    }

}
