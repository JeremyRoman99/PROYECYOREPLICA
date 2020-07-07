
package vista;


public class principal {
    public static void potencia(){
        System.out.println("***POTENCIA AL CUADRADO***");
        System.out.print("ingrese numero: ");
         int numero = leer.entero();
        for (int i=0;i<=numero ;i++){         
         }        
         System.out.println("el numero" + numero +  " elevado al cuadrado es:" + (int)Math.pow(numero,2));
    }
    public static void potencia2(){
      System.out.println("***DOS ELEVADOR AL NUMERO***");
      System.out.println("ingrese numero:");
        int numero = leer.entero();
        for (int i=0;i<=numero ;i++){         
         }        
         System.out.println("el numero 2 elevado al" + numero + "es:" + (int)Math.pow(2,numero));
    }
    public static void capicua(){
        System.out.println("*** SI UN NUMERO ES CAPICUA ***");
        System.out.print("Numero: ");
        int numero = leer.entero();
        int numeroi;
        int falta;
        int resto;
        
        while(numero<=0);
  falta=numero;
  numeroi=0;
  resto=0;
   resto=falta%10;
   falta=falta/10;
   numeroi=numeroi*10+resto;
   
   while(falta!=0)
{
 resto=falta%10;
 numeroi=numeroi*10+resto;
 falta=falta/10;
}     
        if (numeroi==numero) {
            System.out.println("\nEl numero es capicua\n");
       
        } else{
            System.out.println("\nEl numero no es capicua\n");
        }
    }
    public static void primo(){
        System.out.print("Ingrese un número: ");
        int numero, c=0;
        numero = leer.entero();
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                c++;
            }
        }
        if( c==2 ){
            System.out.println("El número "+numero+" es primo");
        }
        else{
            System.out.println("El número "+numero+" no es primo");
        } 
    }
    public static void error(){
     System.out.println("error opcion incorrecta");   
    }
    public static void salir(){
      System.out.println("gracias por visitarnos");  
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 POTENCIA AL CUADRADO");
        System.out.println("2 2 LA POTENCIA ..");
        System.out.println("3 CAPICUA");
        System.out.println("4 PRIMO");
        System.out.println("5 SALIR");
        System.out.println("INGRESE OPCION 1 A 5:");
    }
    public static void inicio(){
       int opcion;
do{
menu();
opcion = leer.entero();
switch(opcion){
case 1: potencia();
break;
case 2: potencia2();
break;
case 3: capicua();
break;
case 4: primo();
break;
case 5: salir();
break;
default:error();
}
    }while(opcion!=5);
 }

    public static void main(String[] args) {
        inicio();
    }
    
    
    
    
}
