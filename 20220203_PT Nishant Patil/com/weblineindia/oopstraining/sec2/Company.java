package com.weblineindia.oopstraining.sec2;

public class Company{

	
	public static void main(String[] args){
		CompanyDTO sc = new CompanyDTO();
		sc.setCompanyName("Webline India");
		sc.setCompanyCity("Ahmadabad");
		sc.setCompanyState("Gujrat");
		sc.setCompanyCountry("India");
		sc.setCompanyAddress("Ahmadabad, Gujrat");
		sc.setCompanyDept("20");
		sc.setCompanyEmployee("150");
		sc.setCompanyMaleEmployee("70");
		sc.setCompanyFemaleEmployee("60");
		sc.setCompanyJavaEmployee("30");
		sc.setCompanyPythonEmployee("20");
		sc.setCompanyPhpEmployee("10");
		sc.setCompanyDotnetEmployee("10");
		sc.setCompanyBendEmployee("50");
		sc.setCompanyFendEmployee("60");
		sc.setCompanyProjects("200");
		sc.setCompanyCEO("Atul Mehta");
		sc.setCompanyCTO("Vipul Mehta");
		sc.setCompanyFounded("1999");



		System.out.println("Company Name is "+ sc.getCompanyName());
		System.out.println("Company City is "+ sc.getCompanyCity());
		System.out.println("Company State is "+ sc.getCompanyState());
		System.out.println("Company Country is "+ sc.getCompanyCountry());
		System.out.println("Company Address is "+ sc.getCompanyAddress());
		System.out.println("Company Dept is "+ sc.getCompanyDept());
		System.out.println("Company Employee is "+ sc.getCompanyEmployee());
		System.out.println("Company Male Employee is "+ sc.getCompanyMaleEmployee());
		System.out.println("Company Female Employee is "+ sc.getCompanyFemaleEmployee());
		System.out.println("Company Java Employee is "+ sc.getCompanyJavaEmployee());
		System.out.println("Company Php Employee is "+ sc.getCompanyPhpEmployee());
		System.out.println("Company Python Employee is "+ sc.getCompanyPythonEmployee());
		System.out.println("Company Donnet Employee is "+ sc.getCompanyDotnetEmployee());
		System.out.println("Company Backend Employee is "+ sc.getCompanyBendEmployee());
		System.out.println("Company Frontend Employee is "+ sc.getCompanyFendEmployee());
		System.out.println("Company Projects are is "+ sc.getCompanyProjects());
		System.out.println("Company CEO are "+ sc.getCompanyCEO());
		System.out.println("Company CTO are "+ sc.getCompanyCTO());

	}
}
		
			