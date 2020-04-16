package fases;

	import java.util.*;

	public class Fase1 {

		private static Scanner input;	
	
		public static void main(String[] args) {
			
			String city1 = "";
			String city2 = "";
			String city3 = "";
			String city4 = "";
			String city5 = "";
			String city6 = "";
			
			
			input = new Scanner(System.in);
					
			System.out.println("Escribe la ciudad 1");
			city1 = input.nextLine();
		
			System.out.println("Escribe la ciudad 2");
			city2 = input.nextLine();
			
			System.out.println("Escribe la ciudad 3");
			city3 = input.nextLine();
			
			System.out.println("Escribe la ciudad 4");
			city4 = input.nextLine();
			
			System.out.println("Escribe la ciudad 5");
			city5 = input.nextLine();
			
			System.out.println("Escribe la ciudad 6");
			city6 = input.nextLine();
			
			
			System.out.print(city1+"\n"+city2+"\n"+city3+"\n"+city4+"\n"+city5+"\n"+city6);
			
			//FASE 2 
			
			System.out.println("\n"+"Impresión del array ordenado"+"\n");
			
			String[] cities = {city1, city2, city3, city4, city5, city6};
			
			   Arrays.sort(cities);

		        //Mostramos el array ya ordenado
		        for (String city : cities) {
		            System.out.print(city + " ");
		        }
		        
		        
		        //FASE 3
		        
		        System.out.println ("\n"+"Fase 3 , Array modificado"+"\n");
		        
		        

		}

	}

