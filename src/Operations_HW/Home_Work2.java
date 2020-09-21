package Operations_HW;

public class Home_Work2 {
    public static void main(String[] args) {

        // 1. Fahrenheit to Celcius . todays Fahrenheit temperature is 58

        // C = (F - 32) * 5/9

        double fahrTemp;
        fahrTemp = 58;

        double conFahrToCel = (fahrTemp - 32) * 5/9.0;
        System.out.println("The conversion of " + fahrTemp + " degree fahrenheit temparature is equal to " + conFahrToCel + " degree celcius.");


        // 2. Fahrenheit to Kelvin

        // K = 5/9 * ( F - 32) + 273

        fahrTemp = 58;

        double conFahrToKelvin = 5/9.0 * (fahrTemp - 32) + 273;
        System.out.println("The conversion of " +fahrTemp + " degree fahrenheit temparature is equal to "+ conFahrToKelvin + " degree kelvin.");




        // 3. Kelvin to Celcius

        // C = K - 273

        double kelvinTemp;
        kelvinTemp = 287.44444444444446;

        double conKelToCelcius = kelvinTemp - 273;
        System.out.println("The conversion of " + kelvinTemp + " degree kelvin temparature is equal to "+ conKelToCelcius + " degree celcius.");


        // 4. kelvin to fahrenheit

        // F = 9/5.0 * (k - 273) + 32:

        kelvinTemp = 287.44444444444446;

        double conKelToFahr = 9/5.0 * (kelvinTemp - 273) + 32;
        System.out.println("The conversion of " + kelvinTemp + " degree kelvin temparature is equal to "+ conKelToFahr + " degree fahrenheit.");


        // 5. Celcius to Fahrenheit

        // F = 9/5.0 * ( C ) + 32

        double celciusTemp;
        celciusTemp = 14.444444444444457;

        double conCelToFahr = 9/5.0 * (celciusTemp) + 32;
        System.out.println("The conversion of " + celciusTemp + " degree celcius temparature is equal to "+ conCelToFahr+ " degree fahrenheit.");


        // 6. Celcius to Kelvin

        // K = C + 273

        celciusTemp = 14.444444444444457;
        double conCelToKelvin = celciusTemp + 273;

        System.out.println("The conversion of " + celciusTemp + " degree celcius temparature is equal to "+ conCelToKelvin+ " degree kelvin.");

        // 7. Check a number is even

        int number;
        number = 50;

        boolean isEven = number % 2 == 0;
        System.out.println("The number " + number + " is even number: " + isEven);



        // 8. Check  a number is odd

        boolean isOdd = number % 2 != 0;
        System.out.println("The number " + number + " is odd number: " + isOdd);

    }
}
