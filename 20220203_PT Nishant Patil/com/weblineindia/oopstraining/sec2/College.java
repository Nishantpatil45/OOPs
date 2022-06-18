package com.weblineindia.oopstraining.sec2;

public class College{
	
	public static void main(String[] args)
	{
	
		CollegeDTO sc = new CollegeDTO();
		sc.setCollegeNmae("RCPIT");
		sc.setCollegeCity("Shirpur");
		sc.setCollegeState("Maharashtra");
		sc.setCollegeCountry("India");
		sc.setCollegeAddress("Shirpur,Maharashtra");
		sc.setCollegeDept("7");
		sc.setCollegeIntake("450");
		sc.setCollegeMaleIntake("225");
		sc.setCollegeFemaleIntake("225");
		sc.setCollegeCompInrake("100");
		sc.setCollegeCompMaleIntake("50");
		sc.setCollegeCompFemaleIntake("50");
		sc.setCollegeCivilIntake("80");
		sc.setCollegeCivilMaleIntake("40");
		sc.setCollegeCivilFemaleIntake("40");
		sc.setCollegeStaff("1000");
		sc.setCollegeTecnicalStaff("700");
		sc.setCollegeNonTecnicalStaff("300");
		sc.setCollegeLabs("50");
		sc.setCollegeCompLabs("20");
		sc.setCollegeCivilLabs("5");
		sc.setCollegeEleLabs("5");
		sc.setCollegeEtcLabs("5");
		sc.setCollegeMechLabs("5");
		sc.setCollegeFoundedIn("1999");
		sc.setCollegeUnivercity("DBATU,Lonere");



		System.out.println("College Name is "+ sc.getCollegeName());
		System.out.println("College City is "+ sc.getCollegeCity());
		System.out.println("College State is "+ sc.getCollegeState());
		System.out.println("College Country is "+ sc.getCollegeCountry());
		System.out.println("College Address is "+ sc.getCollegeAddress());
		System.out.println("College Dept are "+ sc.getCollegeDept());
		System.out.println("College Intake is "+ sc.getCollegeIntake());
		System.out.println("College Male Intake is "+ sc.getCollegeMaleIntake());
		System.out.println("College Female Intake is "+ sc.getCollegeFemaleIntake());
		System.out.println("College Computer Intake is "+ sc.getCollegeCompInrake());
		System.out.println("College Computer Male Intake is "+ sc.getCollegeCompMaleIntake());
		System.out.println("College Computer Female intake is "+ sc.getCollegeCompFemaleIntake());
		System.out.println("College Civil Intake is "+ sc.getCollegeCivilIntake());
		System.out.println("College civil Male Intake is "+ sc.getCollegeCivilMaleIntake());
		System.out.println("College Civil Female Intake is "+ sc.getCollegeCivilFemaleIntake());
		System.out.println("College Staff is "+ sc.getCollegeStaff());
		System.out.println("College Technical Staff is "+ sc.getCollegeTecnicalStaff());
		System.out.println("College Non Technical Staff is "+ sc.getCollegeNonTecnicalStaff());
		System.out.println("College Labs are "+ sc.getCollegeLabs());
		System.out.println("College Computer Labs are "+ sc.getCollegeCompLabs());
		System.out.println("College Civil Labs are "+ sc.getCollegeCivilLabs());
		System.out.println("College Mechanical Labs are "+ sc.getCollegeMechLabs());
		System.out.println("College Electrical Labs are "+ sc.getCollegeEleLabs());
		System.out.println("College Etc Labs are "+ sc.getCollegeEtcLabs());
		System.out.println("College Founded In  "+ sc.getCollegeFoundedIn());
		System.out.println("College Univercity is  "+ sc.getCollegeUnivercity());
	}

}
		
			