package fai.projeto06;

public class Main {

	
		public static void main(String[] args) {
			Main app= new Main();
			app.Carro();

	}
		private void Carro() {
			
			String[]carros= {"civic","gol","palio","uno"};
			  for (String string:carros) {
				  
				  
			  }
			  carros[1] ="L200";
			  for (String string:carros) {
				  System.out.println(string);
			  }
		    carros[3] = "gol";
		       for (String string:carros) {
			  System.out.println(string);
		     }	  
				  
	  }


}
