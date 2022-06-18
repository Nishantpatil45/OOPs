package com.weblineindia.oopstraining.sec3;

public class CityImplimentation {

    public static void main(String[] args) {
        CityDTO sc = new CityDTO();
		sc.setCityName("Shirpur");
		sc.setCityState("Mahrashtra");
		sc.setCityPopulation("15840");
		sc.setCityMalePopulation("5800");
		sc.setCityFemalePopulation("5100");
		sc.setCityChildPopulation("1100");
		sc.setCityMaleChildPopulation("580");
		sc.setCityFemaleChildPopulation("510");
		sc.setCityArea("5904sq/km");
		sc.setCityDistrict("Dhule");
		sc.setCityFamousDestination("Recreation Garden");
		sc.setCityFamousFood("Wada Pav");
		sc.setCityTemple("Balaji Mandir");
		sc.setCityMosque("cityMosque");
		sc.setCityWaterBody("Arunawati river");
		sc.setCityFamousPerson("ABC");
		sc.setCityFamousArea("PQR");
		sc.setCityFamousRestrorant("FZ Cafe");
		sc.setCitySchools("RCPIT,Shirpur");
		sc.setCityHospitals("Indira Gandhi Hospital");
		sc.setCityMovieTheater("ABC Cinema");
		sc.setCityMall("XYZ Mall");
		sc.setCityMayorName("Mr.PQR");
		sc.setCityMLAName("Mr.ABC");
		sc.setCityMPName("Ms.XYZ");
		
		CityMain ahmedabad = new CityMain();
		ahmedabad .getCityInformation();
		ahmedabad .getCityFamousFor();
		
        
    }
    
}
