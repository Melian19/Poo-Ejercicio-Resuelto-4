import java.util.Scanner;
public class PooEj4 {
    public static void main(String[] args) {
        int edJuan, edAlber, edAna, edMama; //Definir tipo de dato de las edades
        System.out.println("Ingrese la edad de Juan:");
        Scanner entrada = new Scanner(System.in);

        edJuan = entrada.nextInt(); //Edad de Juan
        edAlber = 2*edJuan/3; //Edad de Alberto
        edAna = 4*edJuan/3; //Edad de Ana
        edMama = edJuan+edAlber+edAna; //Edad de mama
         //Salida de los datos
        System.out.println("La edad de Juan es "+edJuan);
        System.out.println("La edad de Alberto es "+edAlber);
        System.out.println("La edad de Ana es "+edAna);
        System.out.println("La edad de mama es "+edMama);
    }
}