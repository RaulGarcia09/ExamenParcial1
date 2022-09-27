
package examen1erparcial;

import java.util.Scanner;


public class Rock extends Musica{
    
    Scanner s = new Scanner(System.in);
    
   @Override
    public  void canciones(int cancion){
        
        System.out.println("Elige uno de estos exitos para reproducir \n1=Back in Black \n2=Sweet Child O Mine \n3=I was made for lovin"); // Aqui elige el nombre de la cancion 
        cancion=s.nextInt();
        
        if(cancion==1){
        System.out.println("El grupo es AC/DC\n");
        System.out.println("El año en que salio es 1995\n");        
    }
    
    if(cancion==2){
        System.out.println("El grupo Guns n Roses\n");
        System.out.println("El año en que salio es 1978\n");        
    }

    if(cancion==3){
        System.out.println("El grupo es Kiss\n");
        System.out.println("El año en que salio es 1985\n");        
    }
    
    
    }

   
    
}
