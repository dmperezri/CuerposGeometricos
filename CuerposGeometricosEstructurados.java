import java.util.Scanner;
import static java.lang.Math.*;

public class CuerposGeometricosEstructurados {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables
        double ABmayor, ABmenor, apotema, radio, Apirad, apbase, generatriz, Rmenor1, longitud, ancho, diagonal, arista,
                aristamay, aristamen, Pbase, altura, Alateral, Atotal, Abase, volumen, Apent, lado, Rmenor2, Rmayor,
                grad, PBmenor, PBmayor, ap1, ap2, ap, nlados;
        byte opc;
        char salir;

        do {
            System.out.println("Vienvenido a Operaciones de Cuerpos Geometricos");
            System.out.println("-----------------------------------------------");
            System.out.println("MENU DE OPCIONES");
            System.out.println("--------------------------------");
            System.out.println("1. Prisma");
            System.out.println("2. Cilindro");
            System.out.println("3. Piramide cuadrangular");
            System.out.println("4. Cono");
            System.out.println("5. Esfera");
            System.out.println("6. Zona esférica");
            System.out.println("7. Casquete Esférico");
            System.out.println("8. Huso Esférico y Cuña Esférica");
            System.out.println("9. Ortaedro");
            System.out.println("10. Tetraedro");
            System.out.println("11. Hexaedro");
            System.out.println("12. Octaedro");
            System.out.println("13. Dodecaedro");
            System.out.println("14. Icosaedro");
            System.out.println("15. Tronco de Cono");
            System.out.println("16. Tronco de Pirámide");
            System.out.println("17. Salir");

            System.out.println();
            System.out.print("Ingrese la opción: ");
            opc = lector.nextByte();
            System.out.println();

            switch (opc) {
                case 1:
                    // Introduccion y validación de datos
                    do {
                        do {
                            System.out.print("Ingrese el numero de lados de la base del prisma: ");
                            nlados = lector.nextDouble();
                            if (nlados < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese los numeros de lado nuevamente: ");
                                nlados = lector.nextDouble();
                            }
                        } while (nlados < 0);
                        do {
                            System.out.print("Ingrese la longitud de lado del prisma: ");
                            lado = lector.nextDouble();
                            if (lado < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la longitud de lado nuevamente: ");
                                lado = lector.nextDouble();
                            }
                        } while (lado < 0);
                        do {
                            System.out.print("Ingrese la altura del prisma: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        // Operaciones
                        Pbase = nlados * lado;
                        apotema = lado / (2 * tan(36));
                        Abase = (Pbase * apotema) / 2;
                        Alateral = Pbase * altura;
                        Atotal = (2 * Abase);
                        volumen = Abase * altura;
                        // Salidas
                        System.out.println();
                        System.out.println("El area lateral del prisma es:" + Alateral);
                        System.out.println("El area total del prisma es:" + Atotal);
                        System.out.println("El volumen del prisma es:" + volumen);
                        System.out.println();
                    } while (lado < 0 || altura < 0 || nlados < 0);
                    break;

                case 2:
                    // Introduccion y validación de datos
                    do {
                        do {
                            System.out.print("Ingrese la altura del cilindro: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        do {
                            System.out.print("Ingrese el radio del cilindro: ");
                            radio = lector.nextDouble();
                            if (radio < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio nuevamente: ");
                                radio = lector.nextDouble();
                            }
                        } while (radio < 0);
                        // Operaciones
                        Pbase = 2 * PI * radio;
                        Abase = PI * pow(radio, 2);
                        Alateral = Pbase * altura;
                        Atotal = Alateral + (2 * Abase);
                        volumen = Abase * altura;
                        // Salidas
                        System.out.println();
                        System.out.println("El area lateral del cilindro es: " + Alateral);
                        System.out.println("El area total del cilindro es: " + Atotal);
                        System.out.println("El volumen del cilindro es: " + volumen);
                        System.out.println();
                        break;
                    } while (altura < 0 || radio < 0);
                    break;

                case 3:
                    do {
                        // introduccion y validación de datos
                        do {
                            System.out.print("Ingrese la altura de la piramide cuadrangular: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        do {
                            System.out.print("Ingrese la longitud de los lados de la piramide: ");
                            lado = lector.nextDouble();
                            if (lado < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la longitud nuevamente: ");
                                lado = lector.nextDouble();
                            }
                        } while (lado < 0);
                        // Operaciones
                        apbase = lado / 2;
                        Apirad = sqrt(pow(altura, 2) + pow(apbase, 2));
                        Pbase = 4 * lado;
                        Abase = pow(lado, 2);
                        Alateral = (Pbase * Apirad) / 2;
                        Atotal = Alateral + Abase;
                        volumen = (Abase * altura) / 3;
                        // Salidas
                        System.out.println();
                        System.out.println("El area lateral de la piramide cuadrangular es:" + Alateral);
                        System.out.println("El area total de la piramide cuadrangular es:" + Atotal);
                        System.out.println("El volumen de la piramide cuadrangular es:" + volumen);
                        System.out.println();
                        break;
                    } while (altura < 0 || lado < 0);
                    break;

                case 4:
                    // Introduccion y validacion de datos
                    do {
                        do {
                            System.out.print("Ingrese la altura del cono: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        do {
                            System.out.print("Ingrese el radio del cono: ");
                            radio = lector.nextDouble();
                            if (radio < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio nuevamente: ");
                                radio = lector.nextDouble();
                            }
                        } while (radio < 0);
                        // Operaciones
                        generatriz = sqrt(pow(altura, 2) + pow(radio, 2));
                        Pbase = 2 * PI * radio;
                        Abase = PI * pow(radio, 2);
                        Alateral = (Pbase) / 2;
                        Atotal = Alateral + Abase;
                        volumen = (Abase * altura) / 3;
                        // Salidas
                        System.out.println();
                        System.out.println("El area lateral del cono es:" + " " + Alateral);
                        System.out.println("El area total del cono es:" + " " + Atotal);
                        System.out.println("El volumen del cono es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (altura < 0 || radio < 0);
                    break;

                case 5:
                    do {
                        // Introduccion y validación de datos
                        do {
                            System.out.print("Ingrese el radio de la esfera: ");
                            radio = lector.nextDouble();
                            if (radio < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio nuevamente: ");
                                radio = lector.nextDouble();
                            }
                        } while (radio < 0);
                        // Operaciones
                        Atotal = 4 * PI * pow(radio, 2);
                        volumen = (4 * PI * pow(radio, 3)) / 3;
                        // Salidas
                        System.out.println();
                        System.out.println("El area total de la esfera es:" + " " + Atotal);
                        System.out.println("El volumen de la esfera es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (radio < 0);
                    break;

                case 6:
                    // Introduccion y validación de datos
                    do {
                        do {
                            System.out.print("Ingrese los radios menores de la zona esferica: ");
                            Rmenor1 = lector.nextDouble();
                            if (Rmenor1 < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio menor 1 nuevamente: ");
                                Rmenor1 = lector.nextDouble();
                            }
                            Rmenor2 = lector.nextDouble();
                            if (Rmenor2 < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio menor 2 nuevamente: ");
                                Rmenor2 = lector.nextDouble();
                            }
                        } while (Rmenor2 < 0 && Rmenor1 < 0);
                        do {
                            System.out.print("Ingrese el radio mayor de la zona esferica: ");
                            Rmayor = lector.nextDouble();
                            if (Rmayor < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio mayor nuevamente: ");
                                Rmayor = lector.nextDouble();
                            }
                        } while (Rmayor < 0);
                        do {
                            System.out.print("Ingrese la altura de la zona esferica: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        // Operaciones
                        Atotal = 2 * PI * Rmayor * altura;
                        volumen = (PI * altura * (pow(altura, 2) + (3 * pow(Rmenor1, 2)) + (3 * pow(Rmenor2, 2)))) / 6;
                        // Salidas
                        System.out.println();
                        System.out.println("El area total de la zona esferica es:" + " " + Atotal);
                        System.out.println("El volumen de la zona esferica es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (altura < 0 || Rmayor < 0 || Rmenor1 < 0 || Rmenor2 < 0);
                    break;

                case 7:
                    do {
                        // Introduccion y validación de datos
                        do {
                            System.out.print("Ingrese la altura del casquete esferico: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        do {
                            System.out.print("Ingrese el radio mayor del casquete esferico: ");
                            radio = lector.nextDouble();
                            if (radio < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio nuevamente: ");
                                radio = lector.nextDouble();
                            }
                        } while (radio < 0);
                        // Operaciones
                        Atotal = 2 * PI * radio * altura;
                        volumen = ((PI * pow(altura, 2)) * ((3 * radio) - altura)) / 3;
                        // Salidas
                        System.out.println();
                        System.out.println("El area total del casquete esferico es:" + " " + Atotal);
                        System.out.println("El volumen total del casquete esferico es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (radio < 0 || altura < 0);
                    break;

                case 8:
                    // Introduccion de datos
                    do {
                        do {
                            System.out.print("Ingrese el radio: ");
                            radio = lector.nextDouble();
                            if (radio < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio nuevamente: ");
                                radio = lector.nextDouble();
                            }
                        } while (radio < 0);
                        do {
                            System.out.print("Ingrese los grados: ");
                            grad = lector.nextDouble();
                            if (grad < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio nuevamente: ");
                                grad = lector.nextDouble();
                            }
                        } while (grad < 0);
                        // Operaciones
                        Atotal = (4 * PI * pow(radio, 2) * grad) / 360;
                        volumen = (4 * PI * pow(radio, 3) * grad) / (3 * 360);
                        // Salidas
                        System.out.println();
                        System.out.println("El area del huso esferico es:" + " " + Atotal);
                        System.out.println("El volumen de la cuña esferica es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (radio < 0 || grad < 0);
                    break;

                case 9:
                    do {
                        // introduccion de datos
                        do {
                            System.out.print("Ingrese la longitud del ortaedro: ");
                            longitud = lector.nextDouble();
                            if (longitud < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.println("Ingrese la longitud nuevamente: ");
                                longitud = lector.nextDouble();
                            }
                        } while (longitud < 0);
                        do {
                            System.out.print("Ingrese el ancho del ortaedro: ");
                            ancho = lector.nextDouble();
                            if (ancho < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el ancho nuevamente: ");
                                ancho = lector.nextDouble();
                            }
                        } while (ancho < 0);
                        do {
                            System.out.print("Ingrese la altura del ortaedro: ");
                            altura = lector.nextDouble();
                            if (altura < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        // Operaciones
                        Atotal = 2 * ((longitud * ancho) + (ancho * altura) + (ancho * altura));
                        volumen = (longitud * ancho * altura);
                        diagonal = sqrt(pow(longitud, 2) + pow(ancho, 2) + pow(altura, 2));
                        // Salidas
                        System.out.println();
                        System.out.println("El area total del ortaedro es:" + " " + Atotal);
                        System.out.println("El volumen del ortaedro es:" + " " + volumen);
                        System.out.println("La diagonal del ortaedro es:" + " " + diagonal);
                        System.out.println();
                        break;
                    } while (altura < 0 || longitud < 0 || ancho < 0);
                    break;

                case 10:
                    do {
                        // Introduccion de datos
                        do {
                            System.out.print("Ingrese la arista del tetaedro: ");
                            arista = lector.nextDouble();
                            if (arista > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la arista nuevamente: ");
                                arista = lector.nextDouble();
                            }
                        } while (arista < 0);
                        // operaciones
                        Atotal = pow(arista, 2) * sqrt(3);
                        volumen = (sqrt(2) / 12) * pow(arista, 3);
                        altura = arista * (sqrt(6) / 3);
                        // Salidas
                        System.out.println();
                        System.out.println("La area del tetaedro es:" + " " + Atotal);
                        System.out.println("El volumen del tetaedro es:" + " " + volumen);
                        System.out.println("La altura del tetaedro es:" + " " + altura);
                        System.out.println();
                        break;
                    } while (arista < 0);
                    break;

                case 11:
                    do {
                        // Introduccion de datos
                        do {
                            System.out.print("Ingrese la arista del hexaedro: ");
                            arista = lector.nextDouble();
                            if (arista > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la arista nuevamente: ");
                                arista = lector.nextDouble();
                            }
                        } while (arista < 0);
                        // Operaciones
                        Atotal = 6 * pow(arista, 2);
                        volumen = pow(arista, 3);
                        diagonal = arista * sqrt(3);
                        // Salidas
                        System.out.println("El area total del hexaedro es:" + " " + Atotal);
                        System.out.println("El volumen del hexaedro es:" + " " + volumen);
                        System.out.println("La diagonal del hexaedro es:" + " " + diagonal);
                        System.out.println();
                        break;
                    } while (arista < 0);
                    break;

                case 12:
                    do {
                        // Introduccion de datos
                        do {
                            System.out.print("Ingrese la arista del octaedro: ");
                            arista = lector.nextDouble();
                            if (arista > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la arista nuevamente: ");
                                arista = lector.nextDouble();
                            }
                        } while (arista < 0);
                        // Operaciones
                        Atotal = 2 * pow(arista, 2) * sqrt(3);
                        volumen = (sqrt(2) / 3) * pow(arista, 3);
                        // salidas
                        System.out.println("El area total del octaedro es:" + " " + Atotal);
                        System.out.println("El volumen del octaedro es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (arista < 0);
                    break;

                case 13:
                    do {
                        // Introduccion de datos
                        do {
                            System.out.print("Ingrese la arista del dodecaedro: ");
                            arista = lector.nextDouble();
                            if (arista > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la arista nuevamente: ");
                                arista = lector.nextDouble();
                            }
                        } while (arista < 0);
                        // Operaciones
                        apotema = arista / (2 * tan(36));
                        Atotal = 3 * pow(arista, 2) * sqrt((25 + (10 * sqrt(5))));
                        volumen = (1 / 4) * (15 + (7 * sqrt(5))) * pow(arista, 3);
                        Apent = (5 / 2) * arista * apotema;
                        // Salidas
                        System.out.println("El area total del dodecaedro es:" + " " + Atotal);
                        System.out.println("El volumen del dodecaedro es:" + " " + volumen);
                        System.out.println("El area de la base del dodecaedro es:" + " " + Apent);
                        System.out.println();
                        break;
                    } while (arista < 0);
                    break;

                case 14:
                    do {
                        // Introduccion de datos
                        do {
                            System.out.println("Ingrese la arista del icosaedro: ");
                            arista = lector.nextDouble();
                            if (arista < 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la arista nuevamente: ");
                                arista = lector.nextDouble();
                            }
                        } while (arista < 0);
                        // Operaciones
                        Atotal = 5 * pow(arista, 2) * sqrt(3);
                        volumen = (5 / 12) * (3 + sqrt(5)) * pow(arista, 3);
                        // Salidas
                        System.out.println("El area total del icosaedro es: " + " " + Atotal);
                        System.out.println("El volumen del icosaedro es: " + " " + volumen);
                        System.out.println();
                        break;
                    } while (arista < 0);
                    break;

                case 15:
                    do {
                        do {
                            System.out.println("Ingrese la altura del tronco de cono: ");
                            altura = lector.nextDouble();
                            if (altura > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        do {
                            System.out.println("Ingrese el radio menor del tronco de cono: ");
                            Rmenor1 = lector.nextDouble();
                            if (Rmenor1 > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio menor nuevamente: ");
                                Rmenor1 = lector.nextDouble();
                            }
                        } while (Rmenor1 < 0);
                        do {
                            System.out.println("Ingrese el radio mayor del tronco de cono: ");
                            Rmayor = lector.nextDouble();
                            if (Rmayor > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese el radio mayor nuevamente: ");
                                Rmayor = lector.nextDouble();
                            }
                        } while (Rmayor < 0);
                        // Operaciones
                        generatriz = sqrt(pow(altura, 2) + pow(Rmayor - 2, 2));
                        ABmayor = PI * pow(Rmayor, 2);
                        ABmenor = PI * pow(Rmenor1, 2);
                        Alateral = (PI * generatriz) * (Rmayor + Rmenor1);
                        Atotal = Alateral + ABmayor + ABmenor;
                        volumen = ((1 / 3) * PI * altura) * (pow(Rmayor, 2) + pow(Rmenor1, 2) + (Rmayor * Rmenor1));
                        // Salidas
                        System.out.println("El area lateral del tronco de cono es:" + " " + Alateral);
                        System.out.println("El area total del tronco de cono es:" + " " + Atotal);
                        System.out.println("El volumen del tronco de cono es:" + " " + volumen);
                        System.out.println();
                        break;
                    } while (altura < 0 || Rmenor1 < 0 || Rmayor < 0);
                    break;

                case 16:
                    do {
                        // Introduccion de datos
                        do {
                            System.out.println("Ingrese la altura del tronco de piramide: ");
                            altura = lector.nextDouble();
                            if (altura > 0) {
                                System.out.println("Error. Ha ingresado un numero invalido");
                                System.out.print("Ingrese la altura nuevamente: ");
                                altura = lector.nextDouble();
                            }
                        } while (altura < 0);
                        do {
                            System.out.println("Ingrese la arista menor: ");
                            aristamen = lector.nextDouble();
                            System.out.println("Ingrese la arista menor: ");
                            aristamay = lector.nextDouble();
                        } while (aristamen < 0);
                        do {
                            System.out.println("Ingrese la arista mayor: ");
                            aristamay = lector.nextDouble();
                            System.out.println("Ingrese la arista mayor: ");
                            aristamay = lector.nextDouble();
                        } while (aristamay < 0);
                        // Operaciones
                        ap1 = (aristamen / 2);
                        ap2 = (aristamay / 2);
                        ap = (ap2 - ap1);
                        PBmayor = (4 * aristamay);
                        PBmenor = (4 * aristamen);
                        ABmayor = pow(aristamen, 2);
                        ABmenor = pow(aristamay, 2);
                        apotema = sqrt(pow(altura, 2) + pow(ap, 2));
                        Alateral = (((PBmayor + PBmenor) / 2) * apotema);
                        Atotal = Alateral + ABmayor + ABmenor;
                        volumen = ((1 * altura) / 3) * (ABmayor + ABmenor + sqrt(ABmayor * ABmenor));
                        // Salidas
                        System.out.println("El area lateral del tronco de piramide es:" + " " + Alateral);
                        System.out.println("El area total del tronco de piramide es:" + " " + Atotal);
                        System.out.println("El volumen del tronco de piramide es:" + " " + volumen);
                        System.out.println();
                    } while (aristamen < 0 || aristamay < 0 || altura < 0);
                    break;

                case 17:
                    System.out.println("El programa ha finalizado");
                    System.out.println("Gracias por utlizar la aplicación. ¡¡Hasta pronto!!");
                    break;

                default:
                    do {
                        System.out.println("Opción invalida.");
                        System.out.print("Por favor ingrese una opción valida: ");
                        opc = lector.nextByte();
                        System.out.println();
                    } while (1 > opc || opc > 17);
                    break;
            }

            System.out.print("¿Deseas continau con el programa (n/s)?");
            salir = lector.next().charAt(0);
            if (salir == 'n' || salir == 'N') {
                System.out.println("El programa ha finalizado");
                System.out.println("Gracias por utlizar la aplicación. ¡¡Hasta pronto!!");
            }
            System.out.println();
        } while (salir == 's' || salir == 'S');
        lector.close();
    }
}