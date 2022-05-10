import java.util.Scanner;

/**
 * EjercicioCondMult
 */
public class EjercicioCondMult {
public static void profesor() {
    System.out.println("la funcion del docernte es enseñar");
    
}
    public static void estudiante() {
        System.out.println( " la funcion del estudiante es aprender ");
        
    }
    public void maquinaPC() {
        System.out.println( "la funcion de la PC es procesar informacion ");

        
    }
    public void proyector() {
        System.out.println(" proyector una imagen ,informacio"); 
    }
    public static void main(String[] args) {
       EjercicioCondMult objx=new EjercicioCondMult();
       Scanner lt=new Scanner(System.in);
    System.out.println("ingrese el algoritmo que desea probar\nl=profesor"+
    "\n2=estudiante\n3=maquina\n4=proyector");
    int opcMet=lt.nextInt();
       switch(opcMet) {
           case 1:{profesor(); } break;
           case 2: estudiante ();break;
           case 3:objx.maquinaPC();break;
           case 4:objx.proyector();break;
           default: System.err.println("opcion no existe");break;
    }  
}
}