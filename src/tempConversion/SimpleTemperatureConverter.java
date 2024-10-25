package tempConversion;

public class SimpleTemperatureConverter implements TemperatureConverter {


	@Override
	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;	
	}

	@Override
	public double celsiusToKelvin(double celsius) {
		return celsius + 273.15 ;
	}

	@Override
	public double fahrenheitToCelcius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}

	@Override
	public double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit -32) * 5/9 + 273.15;
	}

	@Override
	public double kelvinToCelcius(double kelvin) {
		return kelvin - 273.15;
	}

	@Override
	public double kelvinToFahrenheit(double kelvin) {
		return (kelvin - 273.15) * 9/5 + 32;
	}

}
