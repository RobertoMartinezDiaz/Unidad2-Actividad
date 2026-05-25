void main() {
    //Dias del mes

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingresa el número del mes (1-12): ");
    int mes = teclado.nextInt();

    // Estructura switch para determinar los días
    switch (mes) {
        case 1: // Enero
        case 3: // Marzo
        case 5: // Mayo
        case 7: // Julio
        case 8: // Agosto
        case 10: // Octubre
        case 12: // Diciembre
            System.out.println("El mes " + mes + " tiene 31 días.");
            break;

        case 4: // Abril
        case 6: // Junio
        case 9: // Septiembre
        case 11: // Noviembre
            System.out.println("El mes " + mes + " tiene 30 días.");
            break;

        case 2: // Febrero
            System.out.println("El mes " + mes + " tiene 28 días.");
            break;

        default:
            System.out.println("Error: El número ingresado no corresponde a un mes válido.");
            break;
    }
}