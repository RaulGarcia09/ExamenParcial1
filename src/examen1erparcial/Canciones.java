
package examen1erparcial;

import java.util.Scanner;

public class Canciones extends Musica {
    
    Scanner s = new Scanner(System.in);
    
     @Override
    public  void canciones(int cancion){
        
        System.out.println("\nElige uno de estos exitos para reproducir \n1=Back in Black \n2=Sweet Child O Mine \n3=I Was Made for Lovin’ You"); // Aqui elige el nombre de la cancion 
        cancion=s.nextInt();
        
        //Dependiendo la cancion que eligio le daremos los datos que traiga
        if(cancion==1){
        System.out.println("\nArtista: AC/DC");
        System.out.println("\nÁlbum: Back in Black");
        System.out.println("\nEl año en que salio es 1980");        
        System.out.println("\nGeneros: Hard rock, Heavy Metal");
    }
    
    if(cancion==2){
        System.out.println("\nArtista: Guns n Roses");
        System.out.println("\nÁlbum: Appetite for Destruction");
        System.out.println("\nEl año en que salio es 1987");  
        System.out.println("\nGéneros: Hard rock, Glam metal, Rock");
    }

    if(cancion==3){
        System.out.println("\nArtista: Kiss");
        System.out.println("\nÁlbum: Dynasty");
        System.out.println("\nEl año en que salio es 1979");
        System.out.println("\nGéneros: Música disco, Hard rock, Rock");
        
    }
    
    
    }
    
     @Override
      public  void canciones(double cancion){
        
        System.out.println("\nElige uno de estos exitos para reproducir \n1=Safari \n2=4 babys \n3=Safaera"); // Aqui elige el nombre de la cancion 
        cancion=s.nextDouble();
        
        //Dependiendo la cancion que eligio le daremos los datos que traiga
        if(cancion==1){
        System.out.println("\nArtista: J Balvin");
        System.out.println("\nÁlbum: Energía");
        System.out.println("\nEl año en que salio es 2015");
        System.out.println("\nGéneros: Urbano latino, Pop");
    }
    
    if(cancion==2){
        System.out.println("\nArtista: Maluma");
        System.out.println("\nÁlbum: 4 Babys");
        System.out.println("\nEl año en que salio es 2016");  
        System.out.println("\nGéneros: Trap latino, Urbano latino, Hip hop latino");
    }

    if(cancion==3){
        System.out.println("\nArtistas: Bad Bunny, Jowell & Randy, Ñengo Flow");
        System.out.println("\nÁlbum: YHLQMDLG");
        System.out.println("\nEl año en que salio es 2020"); 
        System.out.println("\nGénero: Urbano latino");
    }
    
    
    } 
      
      
      
      
       @Override
      public void canciones(float cancion){
        
        System.out.println("\nElige uno de estos exitos para reproducir \n1=Esta vida me encanta \n2=Dragon Ball Rap \n3=Without me"); // Aqui elige el nombre de la cancion 
        cancion=s.nextFloat();
        
        //Dependiendo la cancion que eligio le daremos los datos que traiga
        if(cancion==1){
        System.out.println("\nArtista: C-Kan");
        System.out.println("\nÁlbum: Voy por el sueño de muchos");
        System.out.println("\nEl año en que salio es 2012");        
        System.out.println("\nGénero: Hip-hop/rap");        
    }
    
    if(cancion==2){
        System.out.println("\nArtista: Porta");
        System.out.println("\nÁlbum: En boca de tantos");
        System.out.println("\nEl año en que salio es 2016");        
        System.out.println("\nGénero: Hip-hop/rap");        
    }

    if(cancion==3){
        System.out.println("\nArtista: Eminem");
        System.out.println("\nÁlbum: The Eminem Show");
        System.out.println("\nEl año en que salio es 2017");        
        System.out.println("\nGénero: Hip-hop/rap");        
    }
    
    
    } 
    
    
    
    
    
    
    
    
    
    
    
}
