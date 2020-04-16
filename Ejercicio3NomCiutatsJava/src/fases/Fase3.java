package fases;

public class Fase3 {

	public static void main(String[] args) {
		
		String [] cities = {"Barcelona", "Madrid", "Valencia", "Málaga", "Cadiz", "Santander"};
		String [] citiesModify = new String[cities.length];
	
		
		
		for(int i=0; i<cities.length; i++) {
		cities[i] = cities[i].toUpperCase();
	
		for(int j=0; j<cities[i].length();j++) {
			
			String replaceChar =cities[i].replace('A', '4');
			citiesModify[i] = replaceChar;
			
			}
		System.out.print(citiesModify[i]+ " ");
		}
		
		
		
	
		}
	
	}



