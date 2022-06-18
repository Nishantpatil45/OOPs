package com.weblineindia.oopstraining.sec2;

public class City {

	public void getCityInformation(CityDTO cityDTO) {
		System.out.println("City Name is - " + cityDTO.getCityName());
		System.out.println("City Population is - " + cityDTO.getCityPopulation());
		System.out.println("City Male Population is - " + cityDTO.getCityMalePopulation());
		System.out.println("City Female Population is " + cityDTO.getCityFemalePopulation());
		System.out.println("City Child Population is " + cityDTO.getCityChildPopulation());
		System.out.println("City Male Child population is " + cityDTO.getCityMaleChildPopulation());
		System.out.println("City Female Child Population is " + cityDTO.getCityFemaleChildPopulation());
		System.out.println("City Area is " + cityDTO.getCityArea());
		System.out.println("City District is " + cityDTO.getCityDistrict());
		System.out.println("City MLA Name is " + cityDTO.getCityMLAName());
		System.out.println("City MP Name is " + cityDTO.getCityMPName());
	}

	public void getCityFamousFor(CityDTO cityDTO) {
		System.out.println("City Famous Restrorant is " + cityDTO.getCityFamousRestrorant());
		System.out.println("City Famous Food is " + cityDTO.getCityFamousFood());
		System.out.println("City Temple  " + cityDTO.getCityTemple());
		System.out.println("City Mosque " + cityDTO.getCityMosque());
		System.out.println("City Rivers Name is " + cityDTO.getCityWaterBody());
		System.out.println("City Famous Person is  " + cityDTO.getCityFamousPerson());
		System.out.println("City Famous Destination is " + cityDTO.getCityFamousDestination());
		System.out.println("City Famous Area is " + cityDTO.getCityFamousArea());
		System.out.println("City Movie Theater is " + cityDTO.getCityMovieTheater());
		System.out.println("City Mall is " + cityDTO.getCityMall());

	}

	public static void main(String[] args) {
		CityDTO sc = new CityDTO();
		sc.setCityName("Shirpur");
		sc.setCityState("Mahrashtra");
		sc.setCityPopulation("15840");
		sc.setCityMalePopulation("5800");
		sc.setCityFemalePopulation("5100");
		sc.setCityChildPopulation("1100");
		sc.setCityMaleChildPopulation("580");
		sc.setCityFemaleChildPopulation("520");
		sc.setCityArea("5904sq/km");
		sc.setCityDistrict("Dhule");
		sc.setCityFamousFor("Uniqueness");
		sc.setCityFamousDestination("Recreation Garden");
		sc.setCityFamousFood("Wada Pav");
		sc.setCityTemple("Balaji Mandir");
		sc.setCityMosque("cityMosque");
		sc.setCityWaterBody("Arunawati river");
		sc.setCityFamousPerson("ABC");
		sc.setCityFamousArea("PQR");
		sc.setCityFamousRestrorant("FZ Cafe");
		sc.setCitySchools("RCPIT");
		sc.setCityHospitals("Indira Gandhi Hospital");
		sc.setCityMovieTheater("ABC Cinema");
		sc.setCityMall("XYZ Mall");
		sc.setCityMayorName("Mr.PQR");
		sc.setCityMLAName("Mr.ABC");
		sc.setCityMPName("Ms.XYZ");
		sc.setCityInformation("");

		City ab = new City();
		ab.getCityInformation(sc);
		ab.getCityFamousFor(sc);

	}

}
