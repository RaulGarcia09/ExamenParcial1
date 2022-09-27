
package examen1erparcial;

import java.util.Scanner;


public class Rap extends Musica {
    Scanner s = new Scanner(System.in);
    String cantante;
    int año=0;
    
    @Override
      public void canciones(float cancion){
        
        System.out.println("Elige uno de estos exitos para reproducir \n1=Esta vida me encanta \n2=Dragon Ball Rap \n3=Without me"); // Aqui elige el nombre de la cancion 
        cancion=s.nextFloat();
        
        if(cancion==1){
        System.out.println("El cantante es C Kan\n");
        System.out.println("El año en que salio es 2015\n");        
    }
    
    if(cancion==2){
        System.out.println("El cantante es Porta\n");
        System.out.println("El año en que salio es 2016\n");        
    }

    if(cancion==3){
        System.out.println("El cantante Eminem\n");
        System.out.println("El año en que salio es 2017\n");        
    }
    
    
    } 
}
