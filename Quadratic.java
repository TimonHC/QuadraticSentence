package ex2;

import java.util.Scanner;

public class Quadratic {
Scanner userInput = new Scanner(System.in);
double x, y, a, b, c, vertex, discriminant, d, rootx1, rootx2, xmin, xmax, ymin, ymax, minroot, maxroot;{

}

double vertex(double b, double a){
	vertex = (-b)/(2*a);
	return(vertex);
}
double yExtremumCoordinates(double x) {
	y=a*(Math.pow(x, 2))+b*x+c;
	return(y);
}

void quadraticRoots() {
	System.out.print("Enter a: ");
    a = userInput.nextDouble();    
    System.out.print("Enter b: ");
    b = userInput.nextDouble();
    System.out.print("Enter c: ");
    c = userInput.nextDouble();
    
    discriminant = (b * b) - (4.0 * a * c);
    d = Math.sqrt(discriminant);
    System.out.println("The discriminant is: ");
    System.out.println(discriminant);
    if (discriminant >= 0)
    {
        if (a == 0)
        {
            System.out.println("Undefined solution.");
            System.out.println("Not a quadratic equation with a = 0.");
        }
        else
        {
            System.out.println("The solutions are: ");
            rootx1 = +(-b + d)/(2.0 * a);
            rootx2 = +(-b - d)/(2.0 * a);
            System.out.println("x1: " + rootx1);
            System.out.println("x2: " + rootx2);
        }
    }
    else 
    {
        System.out.println("No real solutions as the discriminant is negative. The roots are imaginary.");
    }  	
    
    minroot = rootx1;
    if (rootx1 > rootx2) {
    	minroot = rootx2;
    	maxroot = rootx1;
    }
    System.out.println("minRoot: " + minroot + "\n" + "maxRoot: " + maxroot);
}

void quadraticExtremes() {
	System.out.print("Enter a: ");
    a = userInput.nextDouble();    
    System.out.print("Enter b: ");
    b = userInput.nextDouble();
    System.out.print("Enter c: ");
    c = userInput.nextDouble();
    
    if (a!=0) {
    	if (a>0) {
    		xmin = vertex(b,a);
    		System.out.println("min(x, y): " + "(" + vertex + (";") + yExtremumCoordinates(vertex)+ (")"));
    		System.out.println("Decreases on interval from (-inf;" + vertex + ") U " + "(" + vertex+ ";+inf)");
    	} else {
    		xmax = vertex(b,a);
    	System.out.println("max (x,y): " + "(" + vertex + (";") + yExtremumCoordinates(vertex)+ (")"));
    	System.out.println("Increases on interval from (-inf;" + vertex + ") U " + "(" + vertex+ ";+inf)");
    	}
    	
    }else {
    	System.out.println("Isnt a quadratic sentence (a=0)");
    }       
}
}


