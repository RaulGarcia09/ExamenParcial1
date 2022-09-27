
package examen1erparcial;

import java.util.Scanner;

public class Reggaeton extends Musica {
    
 Scanner s = new Scanner(System.in);
    
    @Override
      public  void canciones(double cancion){
        
        System.out.println("Elige uno de estos exitos para reproducir \n1=Safari \n2=4 babys \n3=Safaera"); // Aqui elige el nombre de la cancion 
        cancion=s.nextDouble();
        
        if(cancion==1){
        System.out.println("El cantante es JBalvin\n");
        System.out.println("El año en que salio es 2015\n");        
    }
    
    if(cancion==2){
        System.out.println("El cantante es Maluma\n");
        System.out.println("El año en que salio es 2016\n");        
    }

    if(cancion==3){
        System.out.println("El cantante Bad Bunny\n");
        System.out.println("El año en que salio es 2017\n");        
    }
    
    
    } 
    
}