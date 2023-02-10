package com.session1.ex4.what_is_optional;

import java.util.Optional;
import java.util.function.Supplier;

class City{
	private String cityName;
	private String mlaName;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getMlaName() {
		return mlaName;
	}
	public void setMlaName(String mlaName) {
		this.mlaName = mlaName;
	}
	public City(String cityName, String mlaName) {
		super();
		this.cityName = cityName;
		this.mlaName = mlaName;
	}
	public City() {}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", mlaName=" + mlaName + "]";
	}

}
class CityNotFoundEx extends RuntimeException{
	
}

//Ravi
class CityService{
	public Optional<City> getCityByName(String cityName) {
		//
		City city=new City("banglore BTM", "Mr giri");
		
		return Optional.ofNullable(city);
	}
}


class NameNotFoundEx extends RuntimeException{
	
}
//Raj

public class DemoOptional2 {

	public static void main(String[] args) {
		
		Optional<String> opSt=Optional.ofNullable(null);
		
		
//		Supplier<Exception> supplier=()->new NameNotFoundEx();
		
	
		Supplier<Exception> supplier=NameNotFoundEx::new;
		
		
		
		System.out.println(opSt.orElseThrow(NameNotFoundEx::new));
		
		
		
		
		
		
//		
//		CityService cityService=new CityService();
//		Optional<City> cityOp=cityService.getCityByName("banglore");
//		
//		String mlaName=cityOp.map(c->c.getMlaName()).orElse("MLA name not found");
//		System.out.println(mlaName);
		
	}
}



















