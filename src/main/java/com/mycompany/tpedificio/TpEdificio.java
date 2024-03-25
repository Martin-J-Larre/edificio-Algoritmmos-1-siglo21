package com.mycompany.tpedificio;

import java.util.Random;

/**
 *
 * @author martin
 * ******* TODO SI ES NECESARIO *********
 * LOS DOS MÉTODOS QUE PIDIERON CORREN POR DIFERENTES ARRAYS, 
 * ENTONCES DAN DIFERENTES RESULTADOS, PARA QUE DEN EL MISMO RESULTADO,
 * EL MÉTODO cantidadOficinasActivas DEBERÍA
 * LLENAR DOS ARRAYS O UNA MATRIZ CON EL CUAL EL MÉTODO encontrarPrimerOficinaActiva
 * RECORRER Y RETORNAR LA PRIMERA OFICINA ACTIVA QUE COINCIDA CON LA ITERACIÓN 
 * DEL MÉTODO cantidadOficinasActivas.
 * 
 */
public class TpEdificio {
     private static int numOficinas;
     private double superficie;
     
     public static boolean obtenerSensor(int piso, int oficina){
         
         Random random = new Random();
         
         int randomNum = random.nextInt(2);
         String data;
         boolean isActive;
         
         if (randomNum == 1) {
             data = "Active";
             isActive = true;
         } else {
             data = "No active";
             isActive = false;
         }
         
        // System.out.println("Piso:"+piso+" | "+ "Oficina:"+ oficina + " --> " + data);
        
         
         return isActive;

 } 

     public static int cantidadOficinasActivas (){
         int oficinasActivas = 0;
//         numOficinas = 0;
         for (int piso = 1; piso <= 10; piso++) {
//            numOficinas+= 9;
            if(piso == 1) continue;
             for (int oficina = 1; oficina <= 9; oficina++) {
                 if(obtenerSensor(piso, oficina))
                oficinasActivas++;
             }
         }
         return oficinasActivas;
     }
     
     public static Oficina encontrarPrimerOficinaActiva() {
         for (int piso = 1; piso <= 10; piso++) {
             if(piso == 1) continue;
             for (int oficina = 1; oficina < 9; oficina++) {
                 if(obtenerSensor(piso, oficina)) {
                     return new Oficina(piso, oficina);
                 }
                 break;
             }
         }
     
         return null;
     }
     
    public static void main(String[] args) {
        int cantidadOficias = cantidadOficinasActivas();
        Oficina primerOficinaActiva = encontrarPrimerOficinaActiva();
        System.out.println("#### 1 ####");
//        System.out.println("Cantidad Total de Oficinas: " + numOficinas);
        System.out.println("Cantidad Oficinas Activas: " + cantidadOficias);
        System.out.println("#### 2 ####");
        System.out.println("Primera Oficina Activa: " + primerOficinaActiva);
    }
}
