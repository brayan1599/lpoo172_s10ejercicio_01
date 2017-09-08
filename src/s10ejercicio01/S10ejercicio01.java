
package s10ejercicio01;

import java.util.Scanner;

public class S10ejercicio01 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        //double impuesto=0;
        System.out.println("ESTADOS CIVILES");
        System.out.println(" ");
        System.out.println("1-soltero(a)");
        System.out.println("2-casado(a) conviviente o viudo(a)");
        System.out.println("3-casado(a) o seperado(a)");
        System.out.println("4-guardian");
        System.out.println(" ");
        
        System.out.println("INGRESE ESTADO CIVIL: ");
        int estado=input.nextInt();
        System.out.println("INGRESE SALRIO ANUAL: ");
        double ingreso=input.nextDouble();
        double impuesto=0;
        if(estado==1){       //soltero
           
        if(ingreso<= 8350){                        //ingreso anual menor a $8350           
                 impuesto=ingreso*0.10;
             
            }
         else  if(ingreso<=33950){                 //ingreso anual menor a $33950
            
                 impuesto= 8350*0.10
                       +(ingreso-8350)*0.15;
            
         } 
         else  if(ingreso<=82250){                 //ingreso anual menor a $82250
               
                 impuesto= 8350*0.10
                          +(33950-8350)*0.15
                           +(ingreso-33950)*0.25;
            
         } 
         else  if(ingreso<=171550){                //ingreso anual menor a $171550
               
                  impuesto=8350*0.10
                           +(ingreso-8350)*0.15
                           +(82250-33950)*0.25
                           +(ingreso-82250)*0.28;
             
         } 
         else  if(ingreso<=372950){                  //ingreso anual menor a $372950
              
                  impuesto=8350*0.10
                           +(ingreso-8350)*0.15
                           +(82250-33950)*0.25
                           +(171550-82250)*0.28
                           +(ingreso-171550)*0.33;             
             
         } 
         else{
             
                  impuesto= 8350*0.10                                    //ingrese
                            +(ingreso-8350)*0.15
                            +(82250-33950)*0.25
                            +(171550-82250)*0.28
                            +(372950-171550)*0.33
                            +(ingreso-372950)*0.35;
                      
         }
            
        }
        else if(estado==2){  //casado o viudo
             
            if(ingreso<= 16700){                        //ingreso anual menor a $16700           
                 impuesto=ingreso*0.10;
             
            }
         else  if(ingreso<=67900){                 //ingreso anual menor a $67900
            
                 impuesto= 16700*0.10
                       +(ingreso-16700)*0.15;
            
         } 
         else  if(ingreso<=137050){                 //ingreso anual menor a $137050
               
                 impuesto= 16700*0.10
                          +(67900-16700)*0.15
                           +(ingreso-67900)*0.25;
            
         } 
         else  if(ingreso<=208850){                //ingreso anual menor a $208850
               
                  impuesto=16700*0.10
                           +(ingreso-16700)*0.15
                           +(137050-67900)*0.25
                           +(ingreso-137050)*0.28;
             
         } 
         else  if(ingreso<=372950){                  //ingreso anual menor a $372950
              
                  impuesto=16700*0.10
                           +(ingreso-16700)*0.15
                           +(137050-67900)*0.25
                           +(208850-137050)*0.28
                           +(ingreso-208850)*0.33;             
             
         } 
         else{
             
                  impuesto= 16700*0.10                                    //ingrese
                            +(ingreso-16700)*0.15
                            +(137050-67900)*0.25
                            +(208850-137050)*0.28
                            +(372950-208850)*0.33
                            +(ingreso-372950)*0.35;
                      
         }
            
            
        }
        else if(estado==3){  //casado (separado)
            
            if(ingreso<= 8350){                        //ingreso anual menor a $8350           
                 impuesto=ingreso*0.10;
             
            }
         else  if(ingreso<=33950){                 //ingreso anual menor a $33950
            
                 impuesto= 8350*0.10
                       +(ingreso-8350)*0.15;
            
         } 
         else  if(ingreso<=68525){                 //ingreso anual menor a $68525
               
                 impuesto= 8350*0.10
                          +(33950-8350)*0.15
                           +(ingreso-33950)*0.25;
            
         } 
         else  if(ingreso<=104425){                //ingreso anual menor a $104425
               
                  impuesto=8350*0.10
                           +(ingreso-8350)*0.15
                           +(68525-33950)*0.25
                           +(ingreso-68525)*0.28;
             
         } 
         else  if(ingreso<=186475){                  //ingreso anual menor a $186475
              
                  impuesto=8350*0.10
                           +(ingreso-8350)*0.15
                           +(68525-33950)*0.25
                           +(104425-68525)*0.28
                           +(ingreso-104425)*0.33;             
             
         } 
         else{
             
                  impuesto= 8350*0.10                                    //ingrese
                            +(ingreso-8350)*0.15
                            +(68525-33950)*0.25
                            +(104425-68525)*0.28
                            +(186475-104425)*0.33
                            +(ingreso-186475)*0.35;
                      
         }
            
            
        }
        else if(estado==4){  //guardian
            
            if(ingreso<= 11950){                        //ingreso anual menor a $11950           
                 impuesto=ingreso*0.10;
             
            }
         else  if(ingreso<=45500){                 //ingreso anual menor a $45500
            
                 impuesto= 11950*0.10
                       +(ingreso-11950)*0.15;
            
         } 
         else  if(ingreso<=117450){                 //ingreso anual menor a $117450
               
                 impuesto= 11950*0.10
                         
                          +(45500-11950)*0.15
                           +(ingreso-45500)*0.25;
            
         } 
         else  if(ingreso<=190200){                //ingreso anual menor a $190200
               
                  impuesto=11950*0.10
                           +(ingreso-11950)*0.15
                           +(117450-45500)*0.25
                           +(ingreso-117450)*0.28;
             
         } 
         else  if(ingreso<=372950){                  //ingreso anual menor a $372950
              
                  impuesto=11950*0.10
                           +(ingreso-11950)*0.15
                           +(117450-45500)*0.25
                           +(190200-117450)*0.28
                           +(ingreso-190200)*0.33;             
             
         } 
         else{
             
                  impuesto= 11950*0.10                                    //ingrese
                            +(ingreso-11950)*0.15
                            +(117450-45500)*0.25
                            +(190200-117450)*0.28
                            +(372950-190200)*0.33
                            +(ingreso-372950)*0.35;
                      
         }
        }
        
        
        System.out.println("EL IMPUESTO CALCULADO ES: " +impuesto);
        
    }
    
}
