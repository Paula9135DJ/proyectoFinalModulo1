import java.util.Scanner;

public class App {

    static String nombre = "N/A", estado = "N/A";
    static double nota1 = -1, nota2 = -1, nota3 = -1;
    static double promedio = 0;


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarmenu();
            opcion = leerentero(sc, "Seleccione una opcion: ");

            switch (opcion) {
                case 1:
                //TODO: Registar datos de un estudiante
                registrarEstudiante(sc);

                break;

                case 2:
                //TODO: Mostrar datos de un estudiante
                mostrarEstudiante();

                break;

                case 3:
                //TODO: Calcular promedio de notas
                calcularPromedio();

                break;

                case 4:
                //TODO: Mostrar resumen completo
                mostrarEstudiante();
                


                break;

                case 5:
                //TODO:Limpiar datos del estudiante


                break;


                case 0:
                System.err.println("Cerrando programa....");
                break;



            
                
            }

        } while(opcion != 0);

        sc.close();


    }

    static void mostrarmenu(){

        System.out.println("xxx");
        System.out.println("xxx");
        System.out.println("2.xxx");
        System.out.println("3. Calcular promedio de notas");
        System.out.println("4.xx");
        System.out.println("5.");
        System.out.println("0. xx");

    }

    public static int leerentero(Scanner sc, String mensaje){
        int numero;
        System.out.print(mensaje);
        numero = sc.nextInt();
        return numero;


    }


    static void registrarEstudiante(Scanner sc){
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.next();
        nota1 = leerNota(sc, mensaje, nombre)

        System.out.println("Datos del estudiante registrados correctamente.");
    }


    static double leerNota(Scanner sc, String mensaje){
        double nota;
        while (true) {
            System.out.println(mensaje);
            System.out.println(mensaje);
            String linea = sc.nextLine().replace(",",".");
            nota = Double.parseDouble(linea);
            
        }
        
        return nota;
        
    }


    static void mostrarEstudiante(){
        if(nombre.equals("N/A")){
            System.out.println("No hay datos de estudiante registrados.");            
        }else{
            System.out.println("Noombre del estudiante" +  npmbre);
            System.out.println("Nota1: " + nota1);
            System.out.println("Nota2: "+ nota2);
            System.out.println("Nota3: "+ nota3);
        }
    }


    static void calcularPromedio(){
        if(nombre.equals("N/A")){
            System.out.println("No hay datos del estudiante registrado");
        }else{
            promedio = (nota1 + nota2 + nota3) /3;
        }
    }

    static void setEstado(){
        estado = (promedio >=60) ? "Aprobado" : "Reprobado";
    }



}


