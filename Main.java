package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	System.out.println("1 - roots of quadratic; 2- Extremes;");
    int choose = userInput.nextInt(); 
    Quadratic qdrtc = new Quadratic();   
    switch(choose){
    case 1: qdrtc.quadraticRoots();
    break;
    case 2: qdrtc.quadraticExtremes();
    break;
    
    }
        
        
}
}

