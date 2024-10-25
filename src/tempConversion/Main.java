package tempConversion;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		SimpleTemperatureConverter converter = new SimpleTemperatureConverter();
		
		 System.out.println("Sıcaklık Dönüştürücü Uygulaması");
		 System.out.println("Dönüştürmek istediğiniz sıcaklık değerini girin:");
	     double value = scanner.nextDouble();
	     
	     System.out.println("Bu değerin hangi birime dönüştürmek istersiniz?");
	     System.out.println("1. Celsius to Fahrenheit");
	     System.out.println("2. Celsius to Kelvin");
	     System.out.println("3. Fahrenheit to Celsius");
	     System.out.println("4. Fahrenheit to Kelvin");
	     System.out.println("5. Kelvin to Celsius");
	     System.out.println("6. Kelvin to Fahrenheit");
		
	     int choice = scanner.nextInt();
	     
	     double result = 0;
	     String fromUnit = "";
	     String toUnit = "";
	     
	     switch(choice){
	    	 case 1:
	    		 result = converter.celsiusToFahrenheit(value);
	    		 fromUnit = "°C";
	             toUnit = "°F";
	             break;
	    	 case 2:
	    		 result = converter.celsiusToKelvin(value);
	    		 fromUnit = "°C";
	             toUnit = "K";
	             break;
	    	 case 3:
	    		 result = converter.fahrenheitToCelcius(value);
	             fromUnit = "°F";
	             toUnit = "°C";
	             break;
	    	 case 4:
	    		 result = converter.fahrenheitToKelvin(value);
	    		 fromUnit = "°F";
	    		 toUnit = "K";
	    	 case 5:
	    		 result = converter.kelvinToCelcius(value);
	    		 fromUnit = "K";
	             toUnit = "°C";
	             break;
	    	 case 6:
	    		 result = converter.kelvinToFahrenheit(value);
	             fromUnit = "K";
	             toUnit = "°F";
	             break;
	    	 default:
	             System.out.println("Geçersiz seçim.");
	             scanner.close();
	             return;
	     }
	     
	     System.out.printf("%.2f %s = %.2f %s\n", value, fromUnit, result, toUnit);
	        scanner.close();
		
	}

}
