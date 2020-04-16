package fases;

public class Fase4 {

	public static void main(String[] args) {
		
		
		String [] cities = {"Barcelona", "Madrid", "Valencia", "Málaga", "Cadiz", "Santander"};
	
		
		char [] city1 = new char[cities[0].length()];
		char [] city2 = new char[cities[1].length()];
		char [] city3 = new char[cities[2].length()];
		char [] city4 = new char[cities[3].length()];
		char [] city5 = new char[cities[4].length()];
		char [] city6 = new char[cities[5].length()];
		 
				
		for(int i=cities[0].length()-1;i>=0; i--) {
		 city1[i]= cities[0].charAt(i);
		 System.out.print(city1[i]);
			}
		
		System.out.println("");
		
		for(int i=cities[1].length()-1;i>=0; i--) {
			 city2[i]= cities[1].charAt(i);
			 System.out.print(city2[i]);
				}
		
		System.out.println("");
		
		for(int i=cities[2].length()-1;i>=0; i--) {
			 city3[i]= cities[2].charAt(i);
			 System.out.print(city3[i]);
				}
		
		System.out.println("");
		
		for(int i=cities[3].length()-1;i>=0; i--) {
			 city4[i]= cities[3].charAt(i);
			 System.out.print(city4[i]);
				}
		
		System.out.println("");
		
		for(int i=cities[4].length()-1;i>=0; i--) {
			 city5[i]= cities[4].charAt(i);
			 System.out.print(city5[i]);
				}
		
		System.out.println("");
		
		for(int i=cities[5].length()-1;i>=0; i--) {
			 city6[i]= cities[5].charAt(i);
			 System.out.print(city6[i]);
				}
		
		System.out.println("");

		}
	}


